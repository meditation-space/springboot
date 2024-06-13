package com.groupwork.meditation.controller;


import com.groupwork.meditation.entity.User;
import com.groupwork.meditation.entity.Userculture;
import com.groupwork.meditation.result.Result;
import com.groupwork.meditation.service.IUsercultureService;
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
@RequestMapping("/userculture")
public class UsercultureController {
    
    @Autowired
    private IUsercultureService usercultureService;

    @GetMapping("/list")
    @ApiOperation("查询当前登录用户的所有Userbuy")
    public Result<List<Userculture>> list() {

        return Result.success(usercultureService.list());
    }

    @PostMapping
    @ApiOperation("新增Userbuy")
    public Result save(@RequestBody Userculture userculture) {
        return Result.success(usercultureService.save(userculture));
    }

    @GetMapping("/{userId}")
    @ApiOperation("根据userId查询Userbuy")
    public Result<Userculture> getById(@PathVariable Long userId) {
        return Result.success(usercultureService.getById(userId));
    }

    @PutMapping
    @ApiOperation("根据userId修改Userbuy")
    public Result update(@RequestBody Userculture userculture) {
        return Result.success(usercultureService.updateById(userculture));
    }

    @DeleteMapping
    @ApiOperation("根据userId删除Userbuy")
    public Result deleteById(Long userId) {
        return Result.success(usercultureService.removeById(userId));
    }

}
