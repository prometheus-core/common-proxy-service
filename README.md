![Logo](https://github.com/prometheus-core/common-proxy-service/blob/master/docs/_images/prometheus-core-logo.png)


# Common Proxy Service - this is reused readme and neet to be customized

[![license](https://img.shields.io/github/license/prometheus-core/common-proxy-service.svg?style=plastic)](https://github.com/prometheus-core/common-proxy-service)
[![Travis](https://img.shields.io/travis/prometheus-core/common-proxy-service.svg?style=plastic)](https://travis-ci.org/prometheus-core/common-proxy-service/branches)
[![Github All Releases](https://img.shields.io/github/downloads/prometheus-core/common-proxy-service/total.svg?style=plastic)](https://github.com/prometheus-core/common-proxy-service)
[![GitHub issues](https://img.shields.io/github/issues/prometheus-core/common-proxy-service.svg?style=plastic)](https://github.com/prometheus-core/common-proxy-service)

[![Codacy grade](https://img.shields.io/codacy/grade/e7dc9ed202da4839aa73a8f4f5c65b38.svg?style=plastic)](https://app.codacy.com/app/archenroot/common-proxy-service)
[![Codacy coverage](https://img.shields.io/codacy/coverage/e7dc9ed202da4839aa73a8f4f5c65b38.svg?style=plastic)](https://app.codacy.com/app/archenroot/common-proxy-service)
[![codecov](https://codecov.io/gh/prometheus-core/common-proxy-service/branch/master/graph/badge.svg?style=plastic)](https://codecov.io/gh/prometheus-core/common-proxy-service)

[![David](https://img.shields.io/david/prometheus-core/common-proxy-service.svg?style=plastic)](https://github.com/prometheus-core/common-proxy-service)
[![David](https://img.shields.io/david/dev/prometheus-core/common-proxy-service.svg?style=plastic)](https://github.com/prometheus-core/common-proxy-service)
[![David](https://img.shields.io/david/optional/prometheus-core/common-proxy-service.svg?style=plastic)](https://github.com/prometheus-core/common-proxy-service)
[![David](https://img.shields.io/david/peer/prometheus-core/common-proxy-service.svg?style=plastic)](https://github.com/prometheus-core/common-proxy-service)

| Branch        |  [CI Build][travis-home]           |
| ------------- |:-------------:|
| [master] [branch-master]     | [![Build Status](https://travis-ci.org/prometheus-core/common-proxy-service.svg?branch=master)](https://travis-ci.org/prometheus-core/common-proxy-service) |

[travis-home]: https://travis-ci.org/
[travis-msgpack-tools]: https://travis-ci.org/prometheus-core/common-proxy-service

[branch-master]: https://github.com/prometheus-core/common-proxy-service/tree/master

## Description
Generic SpringBoot based subsystem to provide both FORWARD and REVERSE proxy for multiple protocols including HTTP, HTTPS, SOCKS5 AND SOCKS5 over SSL. It can in general run all proxies at once, in future even multiple proxies of same protocol (can be useful for security reasons and audit).Its functionality make it easy to integrate into microservice architecture as integral part.
Later will support auditing by using Event sourcing and CQRS patterns and web UI. 

Due to integration of <b>Swagger UI and SpringBoot Admin</b> interfaces service is built on 1.5.14 version of SpringBoot. Once these dependencies gets more stable, I will upgrade to 2.x.


## Features

### Socks5 Proxy

- [x] Bacis Socks5 proxy server
- [ ] IP/host white-listing
- [ ] IP/host black-listing
- [ ] SSL wrapper around proxy
- [ ] Authorization

### Http Proxy
- [x] Bacis Http proxy server
- [ ] IP/host white-listing
- [ ] IP/host black-listing
- [ ] SSL wrapper around proxy
- [ ] Authorization


## Configuration
Following is sample configuration file with current options available:
```
name: Common Proxy Service
environment: dev

spring:
  profiles: dev
  boot:
      admin:
        client:
          url: "http://localhost:8080/admin/"

management:
  security:
    enabled: false

#management.endpoints.web.exposure.include: "*"
---
socks5Proxy:
  host: localhost
  port: 29001
  maxConnections: 30
  bufferSize: 1048576
  connectionTimeout: 60000
  sslEncryption: false
  restrictions:
      whiteList:
        - 1.1.1.1
        - 2.2.2.2
      blackList:
        - 1.2.3.4
        - 5.6.7.8
  authorization:
    enabled: false
    users:
    - name: user1
      password: demo
    - name: user2
      password: demo
```

## Start application

Run with following command from root directory:

```
mvn clean spring-boot:run
```

## Access Swagger UI
Trought swagger UI you can control proxy daemons within SpringBoot.

http://localhost:8080/swagger-ui.html
## Test

By default, all endpoints are protected by OAuth jwt token verifier(not yet in place). It can be turned off with config change through for development.

Add "Authorization" header with value as above token and a dummy message will return from the generated stub.

