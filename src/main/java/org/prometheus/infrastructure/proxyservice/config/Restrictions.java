package org.prometheus.infrastructure.proxyservice.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.InetAddress;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@ConfigurationProperties(prefix = "socks5Proxy.restrictions")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Restrictions {

    List<String> whiteList;
    List<String> blackList;

}
