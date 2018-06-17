package org.prometheus.infrastructure.proxyservice.service;

import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.littleshoot.proxy.HttpProxyServer;
import org.littleshoot.proxy.impl.DefaultHttpProxyServer;
import org.prometheus.infrastructure.proxyservice.config.Socks5ProxyConfig;
import org.prometheus.infrastructure.proxyservice.controller.ProxyManagementController;
import org.springframework.beans.factory.annotation.Autowired;
import sockslib.server.SocksProxyServer;
import sockslib.server.SocksServerBuilder;

import java.io.IOException;
import java.net.InetAddress;


public class ProxyManagementService {

    public static final Logger logger = LogManager.getLogger(ProxyManagementService.class);

    @Autowired
    private Socks5ProxyConfig socks5ProxyConfig;

    private SocksProxyServer socks5ProxyServer;
    HttpProxyServer httpProxyServer;


    void init(){

    }
    public void startSocks5ProxyServer(){
        socks5ProxyServer = SocksServerBuilder
                .buildAnonymousSocks5Server();

        try {
            socks5ProxyServer.setBindAddr(InetAddress.getByName(socks5ProxyConfig.getHost()));
            socks5ProxyServer.setBindPort(socks5ProxyConfig.getPort());
            socks5ProxyServer.setBufferSize(socks5ProxyConfig.getBufferSize());
            socks5ProxyServer.setTimeout(socks5ProxyConfig.getConnectionTimeout());

            socks5ProxyServer.start();// Creat a SOCKS5 server bind at port 1080
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void stopSocks5ProxyServer(){
        socks5ProxyServer = SocksServerBuilder.buildAnonymousSocks5Server();
        socks5ProxyServer.shutdown();
    }


    public void startHttpProxyServer(){
        httpProxyServer =
                DefaultHttpProxyServer.bootstrap()
                        .withPort(8080)
                        .start();
    }
    public void stopHttpProxyServer(){
        httpProxyServer.stop();
    }


}
