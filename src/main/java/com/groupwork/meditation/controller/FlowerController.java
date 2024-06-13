package com.groupwork.meditation.controller;


import com.groupwork.meditation.entity.Flower;
import com.groupwork.meditation.entity.Flower;
import com.groupwork.meditation.result.Result;
import com.groupwork.meditation.service.IFlowerService;
import com.groupwork.meditation.service.IFlowerService;
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
@RequestMapping("/flower")
public class FlowerController {

    @Autowired
    private IFlowerService iFlowerService;

    /**
     * 查询当前登录用户的所有flower
     *
     * @return
     */
    @GetMapping("/list")
    @ApiOperation("查询当前登录用户的所有flower")
    public Result<List<Flower>> list() {

        return Result.success(iFlowerService.list());
    }

    /**
     * 新增flower
     *
     * @param flower
     * @return
     */
    @PostMapping
    @ApiOperation("新增flower")
    public Result save(@RequestBody Flower flower) {
        return Result.success(iFlowerService.save(flower));
    }

    @GetMapping("/{id}")
    @ApiOperation("根据id查询flower")
    public Result<Flower> getById(@PathVariable Long id) {
        return Result.success(iFlowerService.getById(id));
    }

    /**
     * 根据id修改flower
     *
     * @param flower
     * @return
     */
    @PutMapping
    @ApiOperation("根据id修改flower")
    public Result update(@RequestBody Flower flower) {
        return Result.success(iFlowerService.updateById(flower));
    }

    /**
     * 根据id删除flower
     *
     * @param id
     * @return
     */
    @DeleteMapping
    @ApiOperation("根据id删除flower")
    public Result deleteById(Long id) {
        return Result.success(iFlowerService.removeById(id));
    }

}
