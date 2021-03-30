package cn.com.xincan.xincanframework.k8s.server.entity;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * copyright (C), 2021, 北京同创永益科技发展有限公司
 *
 * @author JiangXincan
 * @version 0.0.1
 * @program xincan-k8s-consumer
 * @description 计算机实体类
 * @create 2021/3/4 17:18
 * <author>                <time>                  <version>                   <description>
 * Jiangxincan         2021/3/4 17:18             0.0.1                        计算机实体类
 */
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Consumer {

    private String hostName;

    private String hostAddress;

    private JSONObject provider;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime currentTime;

    @Override
    public String toString() {
        return "Consumer{" +
                "hostName='" + hostName + '\'' +
                ", hostAddress='" + hostAddress + '\'' +
                ", provider=" + provider.toJSONString() +
                ", currentTime=" + currentTime +
                '}';
    }
}
