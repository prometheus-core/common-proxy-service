package org.prometheus.infrastructure.proxyservice.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@ConfigurationProperties(prefix = "socks5Proxy.authorization")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Authorization {
    @JsonProperty("enabled")
    boolean enabled;
    public boolean getEnabled(){
        return enabled;
    }

    List<org.prometheus.infrastructure.proxyservice.config.User> users;


}
