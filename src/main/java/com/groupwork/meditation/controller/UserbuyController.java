package com.groupwork.meditation.controller;


import com.groupwork.meditation.entity.Learnrecords;
import com.groupwork.meditation.entity.Userbuy;
import com.groupwork.meditation.entity.Userbuy;
import com.groupwork.meditation.result.Result;
import com.groupwork.meditation.service.IUserbuyService;
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
@RequestMapping("/userbuy")
public class UserbuyController {
    
    @Autowired
    private IUserbuyService userbuyService;

    @GetMapping("/list")
    @ApiOperation("查询当前登录用户的所有Userbuy")
    public Result<List<Userbuy>> list() {

        return Result.success(userbuyService.list());
    }

    @PostMapping
    @ApiOperation("新增Userbuy")
    public Result save(@RequestBody Userbuy userbuy) {
        return Result.success(userbuyService.save(userbuy));
    }

    @GetMapping("/{userId}")
    @ApiOperation("根据userId查询Userbuy")
    public Result<Userbuy> getById(@PathVariable Long userId) {
        return Result.success(userbuyService.getById(userId));
    }

    @PutMapping
    @ApiOperation("根据userId修改Userbuy")
    public Result update(@RequestBody Userbuy userbuy) {
        return Result.success(userbuyService.updateById(userbuy));
    }

    @DeleteMapping
    @ApiOperation("根据userId删除Userbuy")
    public Result deleteById(Long userId) {
        return Result.success(userbuyService.removeById(userId));
    }


}
