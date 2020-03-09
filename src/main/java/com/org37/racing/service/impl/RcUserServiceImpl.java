package com.org37.racing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.org37.racing.entity.RcUser;
import com.org37.racing.mapper.RcUserMapper;
import com.org37.racing.service.IRcUserService;
import com.org37.racing.util.Algorithm;
import com.org37.racing.util.Result;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 车手 服务实现类
 * </p>
 *
 * @author 37
 * @since 2020-01-21
 */
@Service
public class RcUserServiceImpl extends ServiceImpl<RcUserMapper, RcUser> implements IRcUserService {
    public Result userList() {
        QueryWrapper<RcUser> qw_list = new QueryWrapper<>();
        qw_list.orderByDesc("update_time");
        List<RcUser> rcUsers = list(qw_list);
        if (rcUsers != null) {
            return Result.success(rcUsers);
        } else {
            return Result.fail(null);
        }

    }
    public Result userGet(String id) {
        System.out.println(id);
        Map<String, String> map = new HashMap<>();
        map.put("id", id);
        try {
            RcUser rcUser = getById(id);
            if (rcUser != null) {
                return Result.success(rcUser);
            } else {
                return Result.fail(map);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Result.fail(e.getCause().getMessage(), map);
        }
    }

    public Result userAdd(RcUser rcUser) {
        System.out.println(rcUser);
        try {
            String uuid = Algorithm.getUUID();
            rcUser.setId(uuid);
            QueryWrapper<RcUser> qw_loginName = new QueryWrapper<>();
            qw_loginName.eq("login_name", rcUser.getLoginName());
            RcUser rcUser_loginName = getOne(qw_loginName);
            if (rcUser_loginName != null) {
                return Result.fail("重复的用户名", rcUser_loginName);
            }
            if (save(rcUser)) {
                return Result.success(getById(uuid));
            } else {
                return Result.fail(rcUser);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Result.fail(e.getCause().getMessage(), rcUser);
        }
    }

    public Result userUpdate(RcUser rcUser) {
        System.out.println(rcUser);
        try {
            if (rcUser.getId() == null) {
                return Result.fail("ID为空", rcUser);
            }
            String id = rcUser.getId();
            if (getById(id) == null) {
                return Result.fail("ID不存在", rcUser);
            }
            if (updateById(rcUser)) {
                return Result.success(getById(id));
            } else {
                return Result.fail(rcUser);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Result.fail(e.getCause().getMessage(), rcUser);
        }
    }

    public Result userDelete(@PathVariable String id) {
        System.out.println(id);
        Map<String, String> map = new HashMap<>();
        map.put("id", id);
        try {
            if (getById(id) == null) {
                return Result.fail(map);
            }
            if (removeById(id)) {
                return Result.success(map);
            } else {
                return Result.fail(map);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Result.fail(e.getCause().getMessage(), map);
        }
    }
}
