package com.how2j.springcloud;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ProductServiceHystrixDashboardApplication {

    public static void main(String[] args) {
        int port = 8020;
        if (!NetUtil.isUsableLocalPort(port)) {
            System.out.printf("端口：%d 占用，无法启动！", port);
            System.exit(1);
        }

        new SpringApplicationBuilder(ProductServiceHystrixDashboardApplication.class).properties("server.port=" + port).run(args);
    }
}
