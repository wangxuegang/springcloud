package springcloud.helloworld.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/** 服务注册 */
@EnableEurekaServer
/** 启动 */
@SpringBootApplication
/**
 * 
 * @类描述：EurekaServer实例
 * @项目名称：springcloud.helloworld.eureka.server
 * @包名： springcloud.helloworld.eureka.server
 * @类名称：EurekaServerApplication
 * @创建人：wangxuegang
 * @创建时间：2018年12月19日上午9:47:23
 * @mail 15510235102@163.com
 * @version v1.0
 */
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}