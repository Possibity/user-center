package com.lyf.usercenter.model.domain.request;

import lombok.Data;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * Description:
 * 用户注册请求体
 *
 * @Author 黎云锋
 * @Create 2025/1/10 22:18
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = 8948205233603619299L;//防止序列化过程中出现一些冲突
    private String userAccount;
    private String userPassword;
}
