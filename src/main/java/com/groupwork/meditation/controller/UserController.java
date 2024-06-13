package com.groupwork.meditation.controller;


import com.groupwork.meditation.entity.User;
import com.groupwork.meditation.entity.Userbuy;
import com.groupwork.meditation.result.Result;
import com.groupwork.meditation.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author author
 * @since 2024-03-27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/list")
    @ApiOperation("查询当前登录用户的所有Userbuy")
    public Result<List<User>> list() {

        return Result.success(userService.list());
    }

    @PostMapping
    @ApiOperation("新增Userbuy")
    public Result save(@RequestBody User user) {
        return Result.success(userService.save(user));
    }

    @GetMapping("/{userId}")
    @ApiOperation("根据userId查询Userbuy")
    public Result<User> getById(@PathVariable Long userId) {
        return Result.success(userService.getById(userId));
    }

    @PutMapping
    @ApiOperation("根据userId修改Userbuy")
    public Result update(@RequestBody User user) {
        return Result.success(userService.updateById(user));
    }

    @DeleteMapping
    @ApiOperation("根据userId删除Userbuy")
    public Result deleteById(Long userId) {
        return Result.success(userService.removeById(userId));
    }

}
