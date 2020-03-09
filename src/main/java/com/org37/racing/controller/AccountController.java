package com.org37.racing.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.org37.racing.entity.RcUser;
import com.org37.racing.entity.account.Register;
import com.org37.racing.service.impl.RcUserServiceImpl;
import com.org37.racing.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    RcUserServiceImpl rcUserService;

    @RequestMapping(value = {"/register"}, method = RequestMethod.POST)
    Result Register(@RequestBody Register register) {
        String login_name = register.getLogin_name();
        String password = register.getPassword();
        if (login_name.isEmpty()) {
            return Result.fail("no name");
        }
        if (password.isEmpty()) {
            return Result.fail("no password");
        }
        QueryWrapper<RcUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("login_name", login_name);
        if (rcUserService.getOne(queryWrapper) != null) {
            return Result.fail("have user");
        }
        RcUser rcUserNew = new RcUser();
        rcUserNew.setLoginName(login_name);
        rcUserNew.setPassword(password);
        return rcUserService.userAdd(rcUserNew);
    }
}
