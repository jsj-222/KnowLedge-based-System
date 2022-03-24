package com.my.konwlege;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

//项目调用但是和第三方不相关
//@ComponentScan("com.my.konwlege","com.test")
@SpringBootApplication
public class KonwledgeBasedSystemApplication {
    private static final Logger LOG = LoggerFactory.getLogger(KonwledgeBasedSystemApplication.class);
    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(KonwledgeBasedSystemApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }



}
