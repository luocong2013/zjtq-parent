package cn.com.tfswx.zjtq.manager.model;

import java.io.Serializable;

/**
 * @author luoc
 * @version V0.0.1
 * @package cn.com.tfswx.zjtq.manager.model
 * @description: User实体
 * @date 2017/12/4 21:02
 */
public class User implements Serializable {
    private String username;
    private String password;
    private String idcard;

    public User(String username, String password, String idcard) {
        this.username = username;
        this.password = password;
        this.idcard = idcard;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
}
