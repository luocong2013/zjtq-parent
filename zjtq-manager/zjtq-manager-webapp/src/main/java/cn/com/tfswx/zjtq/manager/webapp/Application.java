package cn.com.tfswx.zjtq.manager.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luoc
 * @version V1.0
 * @package cn.com.tfswx.zjtq.manager.webapp
 * @description: 程序入口
 * @date 2017/12/4 21:04
 */
@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
