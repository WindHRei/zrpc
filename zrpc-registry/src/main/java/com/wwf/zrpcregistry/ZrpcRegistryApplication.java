package com.wwf.zrpcregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合主流的注册中心，方便我们服务进行注册和发现
 */
@SpringBootApplication
public class ZrpcRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZrpcRegistryApplication.class, args);
    }

}
