package springcloud.helloworld.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 启动注解 */
@SpringBootApplication
/** Controller注解 */
@RestController
/** Git远程配置更新注解 */
@RefreshScope
/**
 * 
 * @类描述：ConfigClient服务提供方启动类
 * @项目名称：Springcloud.helloworld.config.client
 * @包名： springcloud.helloworld.config.client
 * @类名称：ConfigClientApplication
 * @创建人：wangxuegang
 * @创建时间：2018年12月19日上午11:25:42
 * @mail 15510235102@163.com
 * @version v1.0
 */
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	
	/** 将Git远程配置文件值赋变量 */
	@Value("${hello}")
	String hello;
	
	/** 请求：localhost:8881/hello */
	@RequestMapping(value = "/hello")
	public String hello() {
		return hello;
	}
}