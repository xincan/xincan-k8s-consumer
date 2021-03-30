package cn.com.xincan.xincanframework.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class XincanK8SConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(XincanK8SConsumerApplication.class, args);
    }

}
