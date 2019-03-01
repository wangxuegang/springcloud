package springcloud.helloworld.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/** 启动 */
@SpringBootApplication
/** 服务提供方 */
@EnableEurekaClient
/** Controller注解 */
@RestController
/**
 * 
 * @类描述：服务提供方实例
 * @项目名称：springcloud.helloworld.eureka.client
 * @包名： springcloud.helloworld.eureka.client
 * @类名称：EurekaClientApplication
 * @创建人：wangxuegang
 * @创建时间：2018年12月19日上午10:44:58
 * @mail 15510235102@163.com
 * @version v1.0
 */
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
	
	/** 服务提供方端口号 （在application.properties中取值）*/
	@Value("${server.port}")
	String port;
	
	/** 请求格式：localhost:port/ */
	@RequestMapping("/")
	public String home() {
		return "hello world from port " + port;
	}

}