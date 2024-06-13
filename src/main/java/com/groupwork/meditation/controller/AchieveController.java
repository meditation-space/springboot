package com.groupwork.meditation.controller;


import com.groupwork.meditation.entity.Achieve;
import com.groupwork.meditation.result.Result;
import com.groupwork.meditation.service.IAchieveService;
import com.groupwork.meditation.service.impl.AchieveServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author author
 * @since 2024-03-27
 */
@RestController
@RequestMapping("/achieve")
public class AchieveController {

    @Autowired
    private IAchieveService iAchieveService;

    /**
     * 查询当前登录用户的所有achieve
     *
     * @return
     */
    @GetMapping("/list")
    @ApiOperation("查询当前登录用户的所有achieve")
    public Result<List<Achieve>> list() {
        return Result.success(iAchieveService.list());
    }

    /**
     * 新增achieve
     *
     * @param achieve
     * @return
     */
    @PostMapping
    @ApiOperation("新增achieve")
    public Result save(@RequestBody Achieve achieve) {
        return Result.success(iAchieveService.save(achieve));
    }

    @GetMapping("/{id}")
    @ApiOperation("根据id查询achieve")
    public Result<Achieve> getById(@PathVariable Long id) {
        return Result.success(iAchieveService.getById(id));
    }

    /**
     * 根据id修改achieve
     *
     * @param achieve
     * @return
     */
    @PutMapping
    @ApiOperation("根据id修改achieve")
    public Result update(@RequestBody Achieve achieve) {
        return Result.success(iAchieveService.updateById(achieve));
    }

    /**
     * 根据id删除achieve
     *
     * @param id
     * @return
     */
    @DeleteMapping
    @ApiOperation("根据id删除achieve")
    public Result deleteById(Long id) {
        return Result.success(iAchieveService.removeById(id));
    }
}
