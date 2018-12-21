package springcloud.helloworld.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** 注册中心注解 */
@EnableEurekaServer
/** 在配置其他服务 */
@EnableConfigServer
/** 启动注解 */
@SpringBootApplication
/**
 * 
 * @类描述：配置服务启动类
 * @项目名称：springcloud.helloworld.config.server
 * @包名： springcloud.helloworld.config.server
 * @类名称：ConfigServerApplication
 * @创建人：wangxuegang
 * @创建时间：2018年12月19日上午11:08:31
 * @mail 15510235102@163.com
 * @version v1.0
 */
public class ConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}