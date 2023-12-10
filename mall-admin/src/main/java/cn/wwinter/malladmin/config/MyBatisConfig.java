package cn.wwinter.malladmin.config;

import cn.wwinter.malladmin.util.SnowFlakeUtils;
import com.baomidou.mybatisplus.core.incrementer.IKeyGenerator;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.baomidou.mybatisplus.extension.incrementer.H2KeyGenerator;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @Description:
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@Configuration
@Slf4j
public class MyBatisConfig {
    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

//    @Bean
//    public IKeyGenerator keyGenerator() {
//        return new H2KeyGenerator();
//    }

    @Bean
    public IdentifierGenerator idGenerator() {
        return new CustomIdGenerator();
    }

    /**
     * 主键生成器
     */
    private static class CustomIdGenerator implements IdentifierGenerator {
        @Override
        public Long nextId(Object entity) {
            //可以将当前传入的class全类名来作为bizKey,或者提取参数来生成bizKey进行分布式Id调用生成.
            String bizKey = entity.getClass().getName();
            log.info("bizKey: {}", bizKey);
            SnowFlakeUtils snowFlakeUtils = new SnowFlakeUtils(2, 3);
            long id = snowFlakeUtils.nextId();
            log.info("为{}生成主键->{}", bizKey, id);
            return id;
        }
    }
}
