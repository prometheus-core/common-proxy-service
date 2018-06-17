package org.prometheus.infrastructure.proxyservice.config;

import ch.qos.logback.core.net.ssl.SSLConfiguration;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import sockslib.server.manager.User;
import sun.net.SocksProxy;

import java.util.ArrayList;
import java.util.List;

@Data
@ConfigurationProperties(prefix = "socks5proxy")
public class Socks5ProxyConfig {

    String host;
    int port;
    boolean authorization;
    int maxConnections;
    int bufferSize;
    int connectionTimeout;


    //List<SessionFilter> socks5ProxySessionFilters = new ArrayList<>();
    List<User> socks5ProxyUsers = new ArrayList<>();
    //SocksProxy socks5Proxy = null;
    //SSLConfiguration socks5ProxySslConfiguration = null;
}
