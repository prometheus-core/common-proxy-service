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

## Description
Generic SpringBoot based subsystem to provide both FORWARD and REVERSE proxy for multiple protocols including HTTP, HTTPS, SOCKS5 AND SOCKS5 over SSL. Its functionality make it easy to integrate into microservice architecture as integral part.
Later will support auditing by using Event sourcing and CQRS patterns and web UI.


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

[travis-home]: https://travis-ci.org/
[travis-msgpack-tools]: https://travis-ci.org/prometheus-core/common-proxy-service

[branch-master]: https://github.com/prometheus-core/common-proxy-service/tree/master

<!-- we use some deprecated HTML attributes here to get these stupid badges to line up properly -->
<!--
| Branch        |  [CI Build][travis-home]           | Coverage           |
| ------------- |:-------------:|:-------------:|
| [master] [branch-master]     | [![Build Status](https://travis-ci.org/prometheus-core/common-proxy-service.svg?branch=master)](https://travis-ci.org/prometheus-core/common-proxy-service) |  |
-->

## Start application

Run with following command from root directory:

```
mvn clean spring-boot:run


## Test

By default, all endpoints are protected by OAuth jwt token verifier. It can be turned off with config change through for development.

Add "Authorization" header with value as above token and a dummy message will return from the generated stub.

