package com.wangjiangfei.config;

import com.wangjiangfei.JxcApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

/**
 * @author 郑伟
 * @date 2020/3/25 10:18
 */
@Configuration
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JxcApplication.class);
    }
}

