package org.prometheus.infrastructure.proxyservice.controller;

import org.apache.logging.log4j.LogManager;
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

    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(ProxyManagementController.class);

    private final ProxyManagementService proxyManagementService = new ProxyManagementService();


    //@Autowired
    //ProxyManagementService userService; //Service which will do all data retrieval/manipulation work


    @RequestMapping("/startSocks5Proxy")
    public void startSocks5Proxy() {
        proxyManagementService.startSocks5ProxyServer();
    }

    @RequestMapping("/stopSocks5Proxy")
    public void stopSocks5Proxy() {
        proxyManagementService.stopSocks5ProxyServer();

    }

}
