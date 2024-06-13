package com.groupwork.meditation.controller;


import com.groupwork.meditation.entity.Userachieve;
import com.groupwork.meditation.entity.Userachieve;
import com.groupwork.meditation.result.Result;
import com.groupwork.meditation.service.IUserachieveService;
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
@RequestMapping("/userachieve")
public class UserachieveController {

    @Autowired
    private IUserachieveService userachieveService;

    @GetMapping("/list")
    @ApiOperation("查询当前登录用户的所有Userachieve")
    public Result<List<Userachieve>> list() {

        return Result.success(userachieveService.list());
    }

    @PostMapping
    @ApiOperation("新增Userachieve")
    public Result save(@RequestBody Userachieve userachieve) {
        return Result.success(userachieveService.save(userachieve));
    }

    @GetMapping("/{userId}")
    @ApiOperation("根据userId查询Userachieve")
    public Result<Userachieve> getById(@PathVariable Long userId) {
        return Result.success(userachieveService.getById(userId));
    }

    @PutMapping
    @ApiOperation("根据userId修改Userachieve")
    public Result update(@RequestBody Userachieve userachieve) {
        return Result.success(userachieveService.updateById(userachieve));
    }
    
    @DeleteMapping
    @ApiOperation("根据userId删除Userachieve")
    public Result deleteById(Long userId) {
        return Result.success(userachieveService.removeById(userId));
    }

}
