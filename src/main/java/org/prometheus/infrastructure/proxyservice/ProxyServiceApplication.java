package org.prometheus.infrastructure.proxyservice;


import org.prometheus.infrastructure.proxyservice.config.Socks5ProxyConfig;
import org.prometheus.infrastructure.proxyservice.controller.ProxyManagementController;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@EnableAdminServer
@SpringBootApplication
@Configuration
@EnableAutoConfiguration

public class ProxyServiceApplication {

	public static final Logger logger = LogManager.getLogger(ProxyManagementController.class);


	@Autowired
	private Socks5ProxyConfig socks5ProxyConfig;

	public static void main(String[] args) {

		SpringApplication.run(ProxyServiceApplication.class, args);
	}

	/*
	@Bean
	public UndertowEmbeddedServletContainerFactory embeddedServletContainerFactory() {
		UndertowEmbeddedServletContainerFactory factory =
				new UndertowEmbeddedServletContainerFactory();

		factory.addBuilderCustomizers(new UndertowBuilderCustomizer() {
			@Override
			public void customize(io.undertow.Undertow.Builder builder) {
				builder.addHttpListener(8080, "0.0.0.0");
			}
		});

		return factory;
	}
	*/

}
