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
}
