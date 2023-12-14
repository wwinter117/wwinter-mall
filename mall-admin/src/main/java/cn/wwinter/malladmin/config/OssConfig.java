package cn.wwinter.malladmin.config;

import com.aliyun.oss.OSSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Date: 2023/12/14
 * @Author: zhangdd
 */
@Configuration
@RequestMapping("/aliyun/oss")
public class OssConfig {
    @Value("${aliyun.oss.endpoint}")
    private String ALIYUN_OSS_ENDPOINT;
    @Value("${aliyun.oss.accessKeyId}")
    private String ALIYUN_OSS_ACCESS_KEY_ID;
    @Value("${aliyun.oss.accessKeySecret}")
    private String ALIYUN_OSS_ACCESS_KEY_SECRET;

    @Bean
    public OSSClient ossClient() {
        return new OSSClient(ALIYUN_OSS_ENDPOINT,ALIYUN_OSS_ACCESS_KEY_ID,ALIYUN_OSS_ACCESS_KEY_SECRET);
    }

}
