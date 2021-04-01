package cn.com.xincan.xincanframework.k8s.server.client;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        value = "${service.feign.k8s-provider.name}",
        path = "provider",
        url = "${service.feign.k8s-provider.url:}"
)
public interface ProviderClient {

    @GetMapping("/info")
    JSONObject info();

}
