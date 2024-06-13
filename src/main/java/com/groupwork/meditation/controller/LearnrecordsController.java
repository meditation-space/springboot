package com.groupwork.meditation.controller;


import com.groupwork.meditation.entity.Learnrecords;
import com.groupwork.meditation.result.Result;
import com.groupwork.meditation.service.ILearnrecordsService;
import com.groupwork.meditation.service.ILearnrecordsService;
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
@RequestMapping("/learnrecords")
public class LearnrecordsController {

    @Autowired
    private ILearnrecordsService ilearnrecordsService;

    /**
     * 查询当前登录用户的所有learnrecords
     *
     * @return
     */
    @GetMapping("/list")
    @ApiOperation("查询当前登录用户的所有learnrecords")
    public Result<List<Learnrecords>> list() {

        return Result.success(ilearnrecordsService.list());
    }

    /**
     * 新增learnrecords
     *
     * @param learnrecords
     * @return
     */
    @PostMapping
    @ApiOperation("新增learnrecords")
    public Result save(@RequestBody Learnrecords learnrecords) {
        return Result.success(ilearnrecordsService.save(learnrecords));
    }

    @GetMapping("/{userId}")
    @ApiOperation("根据userId查询learnrecords")
    public Result<Learnrecords> getById(@PathVariable Long userId) {
        return Result.success(ilearnrecordsService.getById(userId));
    }

    /**
     * 根据userId修改learnrecords
     *
     * @param learnrecords
     * @return
     */
    @PutMapping
    @ApiOperation("根据userId修改learnrecords")
    public Result update(@RequestBody Learnrecords learnrecords) {
        return Result.success(ilearnrecordsService.updateById(learnrecords));
    }

    /**
     * 根据userId删除learnrecords
     *
     * @param userId
     * @return
     */
    @DeleteMapping
    @ApiOperation("根据userId删除learnrecords")
    public Result deleteById(Long userId) {
        return Result.success(ilearnrecordsService.removeById(userId));
    }
    
}
