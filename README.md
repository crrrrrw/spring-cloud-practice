## 目录结构
```
.
├── center
│   ├── center-config-server(配置中心)
│   └── center-eureka-server(eureka服务注册中心)
│
├── config-repo(配置中心仓库)
│
├── gateway
│    └── gateway-zuul(Zuul服务网关)
│       
├── monitor
│   ├── hystrix-turbine(Hystrix控制台,基于turbine)
│   └── monitor-hystrix-dashboard(Hystrix控制台)
│       
└── services
    ├── consumer-feign(服务消费者，集成feign)
    ├── consumer-feign-hystrix(服务消费者，集成feign、hystrix)
    ├── consumer-ribbon(服务消费者，集成ribbon)
    ├── consumer-ribbon-hystrix(服务消费者，集成ribbon、hystrix)
    ├── user-api(用户服务api)
    └── user-service(用户服务提供者)

```
	
## 服务与端口号
 服务名称 | 端口号
 --- | ---
 center-eureka-server | 9000
 center-config-server | 9001
 gateway-zuul | 9102
 hystrix-turbine | 9101
 monitor-hystrix-dashboard | 9100
 consumer-feign | 9012
 consumer-feign-hystrix | 9014
 consumer-ribbon | 9011
 consumer-ribbon-hystrix | 9013
 user-service | 9010

## 部署
### 1.添加hosts
```
127.0.0.1 center.eureka.server
127.0.0.1 center.config.server
```
### 2.启动顺序
依次启动：
```java
1.center-eureka-server -> 2.center-config-server -> 
3.gateway-zuul -> 4.monitor-hystrix-dashboard -> 
5.user-service -> 6. consumer-*
```
