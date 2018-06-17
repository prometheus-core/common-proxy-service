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
Generic both FORWARD and REVERSE proxy in pure Java.

The whole system is in the moment implemented as state of art microservice architecture meaning I follow following core patterns:
- Event sourcing
- Sagas
- CQRS

## Features:
- Support FTP, FTPS, SFTP (Socks5), HTTP and HTTPS protocols
- Exposes both REST (Open API 3.0 standard) and Websocket endpoints secured with OAuth2 as Management API
- Proxy user authorization
- Ip address white and black listing
- Man in the middle attack capabilities on custom levels
- More to be added....early stage
- Management UI (low priority)
## Use Cases

Proxy everything.


[travis-home]: https://travis-ci.org/
[travis-msgpack-tools]: https://travis-ci.org/prometheus-core/common-proxy-service

[branch-master]: https://github.com/prometheus-core/common-proxy-service/tree/master

<!-- we use some deprecated HTML attributes here to get these stupid badges to line up properly -->
<!--
| Branch        |  [CI Build][travis-home]           | Coverage           |
| ------------- |:-------------:|:-------------:|
| [master] [branch-master]     | [![Build Status](https://travis-ci.org/prometheus-core/common-proxy-service.svg?branch=master)](https://travis-ci.org/prometheus-core/common-proxy-service) |  |
-->

## Start server

Run with

```
mvn package exec:exec
``

## Test

By default, all endpoints are protected by OAuth jwt token verifier. It can be turned off with config change through for development.


In order to access the server, there is a long lived token below issued by my
oauth2 server [light-oauth2](https://github.com/networknt/light-oauth2)

```
Bearer eyJraWQiOiIxMDAiLCJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJ1cm46Y29tOm5ldHdvcmtudDpvYXV0aDI6djEiLCJhdWQiOiJ1cm46Y29tLm5ldHdvcmtudCIsImV4cCI6MTc5MDAzNTcwOSwianRpIjoiSTJnSmdBSHN6NzJEV2JWdUFMdUU2QSIsImlhdCI6MTQ3NDY3NTcwOSwibmJmIjoxNDc0Njc1NTg5LCJ2ZXJzaW9uIjoiMS4wIiwidXNlcl9pZCI6InN0ZXZlIiwidXNlcl90eXBlIjoiRU1QTE9ZRUUiLCJjbGllbnRfaWQiOiJmN2Q0MjM0OC1jNjQ3LTRlZmItYTUyZC00YzU3ODc0MjFlNzIiLCJzY29wZSI6WyJ3cml0ZTpwZXRzIiwicmVhZDpwZXRzIl19.mue6eh70kGS3Nt2BCYz7ViqwO7lh_4JSFwcHYdJMY6VfgKTHhsIGKq2uEDt3zwT56JFAePwAxENMGUTGvgceVneQzyfQsJeVGbqw55E9IfM_uSM-YcHwTfR7eSLExN4pbqzVDI353sSOvXxA98ZtJlUZKgXNE1Ngun3XFORCRIB_eH8B0FY_nT_D1Dq2WJrR-re-fbR6_va95vwoUdCofLRa4IpDfXXx19ZlAtfiVO44nw6CS8O87eGfAm7rCMZIzkWlCOFWjNHnCeRsh7CVdEH34LF-B48beiG5lM7h4N12-EME8_VDefgMjZ8eqs1ICvJMxdIut58oYbdnkwTjkA
```

Postman is the best tool to test REST APIs

Add "Authorization" header with value as above token and a dummy message will return from the generated stub.

