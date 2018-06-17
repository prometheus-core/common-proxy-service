package org.prometheus.infrastructure.proxyservice.config;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
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
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "socks5Proxy")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
//@NoArgsConstructor
//@AllArgsConstructor
public class Socks5ProxyProperties implements java.io.Serializable, Cloneable{


    String host;


    int port;

    int maxConnections;

    int bufferSize;

    int connectionTimeout;

    boolean sslEncryption;

   /* @JsonProperty("sslEncryption")

    public boolean getSslEncryption(){
        return sslEncryption;
    }
    */

    Restrictions restrictions;
    Authorization authorization;



    //List<SessionFilter> socks5ProxySessionFilters = new ArrayList<>();
    //List<User> socks5ProxyUsers = new ArrayList<>();
    //SocksProxy socks5Proxy = null;
    //SSLConfiguration socks5ProxySslConfiguration = null;

    public Socks5ProxyProperties copy(Socks5ProxyProperties source) throws Exception{
        Socks5ProxyProperties copy = new Socks5ProxyProperties();
        copy.host = source.host;
        copy.port = source.port;
        copy.maxConnections = source.maxConnections;
        copy.bufferSize = source.bufferSize;
        copy.connectionTimeout = source.connectionTimeout;
        copy.sslEncryption = source.sslEncryption;
        copy.restrictions = source.restrictions;
        copy.authorization = source.authorization;

        return copy;
    }

}
