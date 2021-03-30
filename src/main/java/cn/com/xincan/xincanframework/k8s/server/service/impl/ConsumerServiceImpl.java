package cn.com.xincan.xincanframework.k8s.server.service.impl;

import cn.com.xincan.xincanframework.k8s.server.client.ProviderClient;
import cn.com.xincan.xincanframework.k8s.server.entity.Consumer;
import cn.com.xincan.xincanframework.k8s.server.service.ConsumerService;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

@Slf4j
@Service
public class ConsumerServiceImpl implements ConsumerService {

    final ProviderClient providerClient;

    public ConsumerServiceImpl(ProviderClient providerClient) {
        this.providerClient = providerClient;
    }

    @Override
    public Consumer info() {
        log.info("进入调用");
        JSONObject provider = this.providerClient.info();
        try {
            InetAddress addr = InetAddress.getLocalHost();
            return Consumer.builder()
                    .hostName(addr.getHostName())
                    .hostAddress(addr.getHostAddress())
                    .provider(provider)
                    .currentTime(LocalDateTime.now())
                    .build();

        } catch (UnknownHostException e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
        return null;
    }

}
