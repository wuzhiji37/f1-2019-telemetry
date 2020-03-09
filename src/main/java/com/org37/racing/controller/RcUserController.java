package com.org37.racing.controller;


import com.org37.racing.entity.RcUser;
import com.org37.racing.service.impl.RcUserServiceImpl;
import com.org37.racing.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 车手 前端控制器
 * </p>
 *
 * @author 37
 * @since 2020-01-21
 */
@RestController
@RequestMapping("/rc-user")
public class RcUserController {
    @Autowired
    private RcUserServiceImpl rcUserService;

    @GetMapping(value = {"/list"})
    public Result list() {
        return rcUserService.userList();
    }

    @GetMapping(value = {"/{id}"})
    public Result get(@PathVariable String id) {
        return rcUserService.userGet(id);
    }

    @PutMapping(value = {""})
    public Result add(@RequestBody RcUser rcUser) {
        return rcUserService.userAdd(rcUser);
    }

    @PostMapping(value = {""})
    public Result update(@RequestBody RcUser rcUser) {
        return rcUserService.userUpdate(rcUser);
    }

    @DeleteMapping(value = {"/{id}"})
    public Result delete(@PathVariable String id) {
        return rcUserService.userDelete(id);
    }
}
