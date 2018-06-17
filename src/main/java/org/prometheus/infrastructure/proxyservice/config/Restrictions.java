package org.prometheus.infrastructure.proxyservice.config;

import lombok.Data;

import java.net.InetAddress;
import java.util.List;

@Data
public class Restrictions {

    List<InetAddress> whiteList;
    List<InetAddress> blackList;

}
