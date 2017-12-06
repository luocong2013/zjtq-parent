package cn.com.tfswx.zjtq.manager.webapp.controller;

import cn.com.tfswx.zjtq.common.utils.DateUtil;
import cn.com.tfswx.zjtq.manager.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author luoc
 * @version V1.0
 * @package cn.com.tfswx.zjtq.manager.webapp.controller
 * @description: User控制器
 * @date 2017/12/4 21:04
 */
@RestController
@RequestMapping("userController")
public class UserController {

    @RequestMapping(value = "/hello/{username}")
    public String hello(@PathVariable("username") String username) {
        return "Hello！" + username + "，现在时间是：" + DateUtil.getDateTimeFormat(new Date());
    }

    @RequestMapping(value = "user")
    public User getUser() {
        User user = new User("张三", "123","122211");
        return user;
    }
}
