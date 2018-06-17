package org.prometheus.infrastructure.proxyservice;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.prometheus.infrastructure.proxyservice.config.Socks5ProxyProperties;
import org.prometheus.infrastructure.proxyservice.service.ProxyManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@EnableAdminServer
//@EnableConfigurationProperties(Socks5ProxyProperties.class)
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
		//("org.prometheus.infrastructure.proxyservice.service","org.prometheus.infrastructure.proxyservice.config")
@EnableAutoConfiguration
@SpringBootApplication
public class ProxyServiceApplication {

	public static final Logger logger = LogManager.getLogger(ProxyServiceApplication.class);



	@Autowired
	private ProxyManagementService proxyManagementService;

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
