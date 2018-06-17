package org.prometheus.infrastructure.proxyservice.config;


import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import sockslib.server.manager.User;
import sun.net.SocksProxy;

import java.util.ArrayList;
import java.util.List;

// Lombok boiler-plate
@Data
@ToString
// Spring property readings
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "socks5Proxy")
public class Socks5ProxyConfig {

    String host;
    int port;
    boolean authorization;
    int maxConnections;
    int bufferSize;
    int connectionTimeout;
    boolean sslEncryption;


    //List<SessionFilter> socks5ProxySessionFilters = new ArrayList<>();
    List<User> socks5ProxyUsers = new ArrayList<>();
    //SocksProxy socks5Proxy = null;
    //SSLConfiguration socks5ProxySslConfiguration = null;
}
