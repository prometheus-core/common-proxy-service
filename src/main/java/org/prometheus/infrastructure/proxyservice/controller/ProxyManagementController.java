package org.prometheus.infrastructure.proxyservice.controller;

import org.apache.logging.log4j.LogManager;
import org.prometheus.infrastructure.proxyservice.config.Socks5ProxyProperties;
import org.prometheus.infrastructure.proxyservice.service.ProxyManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProxyManagementController {

    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(ProxyManagementController.class);

    @Autowired
    ProxyManagementService proxyManagementService;


    //@Autowired
    //ProxyManagementService userService; //Service which will do all data retrieval/manipulation work


    @RequestMapping(value = "/startSocks5Proxy",method = RequestMethod.GET)
    public void startSocks5Proxy() {
        proxyManagementService.startSocks5ProxyServer();
    }


    @RequestMapping(value = "/stopSocks5Proxy", method = RequestMethod.DELETE)
    public void stopSocks5Proxy() {
       proxyManagementService.stopSocks5ProxyServer();

    }

    @RequestMapping(value = "/socks5ProxyConfiguration", method = RequestMethod.GET)
    public Socks5ProxyProperties socks5ProxyConfiguration() {
        return proxyManagementService.getSocks5ProxyProperties();
    }

}
