package com.frgp.racing.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * <p>
 * 车手
 * </p>
 *
 * @author 37
 * @since 2020-01-22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class RcUser extends RcBase {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id = "";

    /**
     * 登录名、账号
     */
    private String loginName;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 密码
     */
    private String password;

    /**
     * 登录Token
     */
    private String token;

    /**
     * 登录超时时间
     */
    private Integer tokenExpireAt;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 分数
     */
    private BigDecimal score = new BigDecimal(0);


}
