package cn.com.xincan.xincanframework.k8s.server.client;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "${service.feign.xincan-k8s-provider}")
public interface ProviderClient {

    @GetMapping("/provider/info")
    JSONObject info();

}
