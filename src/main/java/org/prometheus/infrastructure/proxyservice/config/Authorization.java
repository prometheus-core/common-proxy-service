package org.prometheus.infrastructure.proxyservice.config;

import lombok.Data;

import java.util.List;

@Data
public class Authorization {

    boolean enabled;

    List<User> users;
}
