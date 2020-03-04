package com.how2j.springcloud;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        int port = 8761;
        if(!NetUtil.isUsableLocalPort(port)){
            System.err.printf("端口：%d，占用！", port);
            System.exit(1);
        }

        new SpringApplicationBuilder(EurekaServerApplication.class).properties("server.port="+port).run(args);
    }
}
