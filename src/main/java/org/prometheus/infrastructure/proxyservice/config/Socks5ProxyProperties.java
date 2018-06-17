package org.prometheus.infrastructure.proxyservice.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import sockslib.server.manager.User;
import sun.net.SocksProxy;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

// Lombok boiler-plate
@Data
@ToString
// Spring property readings
@Configuration
@ConfigurationProperties(prefix = "socks5Proxy")
public class Socks5ProxyProperties {


    String host;

    int port;

    int maxConnections;

    int bufferSize;

    int connectionTimeout;

    boolean sslEncryption;

    //Restrictions restrictions;
    //Authorization authorization;


    //List<SessionFilter> socks5ProxySessionFilters = new ArrayList<>();
    //List<User> socks5ProxyUsers = new ArrayList<>();
    //SocksProxy socks5Proxy = null;
    //SSLConfiguration socks5ProxySslConfiguration = null;
    @Data
    //@ConfigurationProperties(prefix = "socks5Proxy.restrictions")
    public class Restrictions {

        List<InetAddress> whiteList;
        List<InetAddress> blackList;

    }

    @Data
    //@ConfigurationProperties(prefix = "socks5Proxy.authorization")
    public class Authorization {

        boolean enabled;

        List<org.prometheus.infrastructure.proxyservice.config.User> users;

        @Data
        public class User {
            String name;
            String password;
        }
    }





}
