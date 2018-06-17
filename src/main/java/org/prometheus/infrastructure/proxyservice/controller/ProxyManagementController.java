package org.prometheus.infrastructure.proxyservice.controller;

import org.prometheus.infrastructure.proxyservice.service.ProxyManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sockslib.server.SocksProxyServer;
import sockslib.server.SocksServerBuilder;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class ProxyManagementController {

    public static final Logger logger = LoggerFactory.getLogger(ProxyManagementController.class);

    SocksProxyServer proxyServer;

    //@Autowired
    //ProxyManagementService userService; //Service which will do all data retrieval/manipulation work


    @RequestMapping("/startSocks5Proxy")
    public void startSocks5Proxy() {
        proxyServer = SocksServerBuilder.buildAnonymousSocks5Server();
        try {
            proxyServer.start();// Creat a SOCKS5 server bind at port 1080
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/stopSocks5Proxy")
    public void stopSocks5Proxy() {
        proxyServer = SocksServerBuilder.buildAnonymousSocks5Server();
        proxyServer.shutdown();

    }

}
