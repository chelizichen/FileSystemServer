package cn.org.xinke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;

import cn.org.xinke.framework.SgridConf;
import org.springframework.context.annotation.Bean;

/**
 * @description 主程入口
 * @author cinco
 * @date 2019-1-21
 */
@SpringBootApplication
public class FmsApplication {

    @Autowired
    private SgridConf config;

    public static void main(String[] args) {
        SpringApplication.run(FmsApplication.class, args);
    }

    @Bean
    public TomcatServletWebServerFactory servletContainer() {
        return new TomcatServletWebServerFactory(config.server.port);
    }

    public void run(String... args) throws Exception {
        System.out.println("Server: " + config);
        System.out.println("Server: " + config.server.port);
    }
}

