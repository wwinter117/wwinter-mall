package cn.wwinter.malladmin.controller;

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.PmsProductCategoryDto;
import cn.wwinter.malladmin.service.PmsProductCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: PmsProductCategoryController
 * Package: cnn.wwinter.malladmin.controller
 * Description:
 * Datetime: 2023/11/28
 * Author: zhangdd
 */
@RestController
@RequestMapping("productCategory")
@AllArgsConstructor
@Api(tags = "PmsProductCategoryController")
public class PmsProductCategoryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PmsProductCategoryController.class);
    private final PmsProductCategoryService pmsProductCategoryService;

    @ApiOperation("根据编号查询产品分类信息")
    @GetMapping("/{id}")
    public CommonResponse getItem(@PathVariable(value = "id") Long id) {
        return pmsProductCategoryService.getItem(id);
    }

    @ApiOperation("分页获取产品分类")
    @GetMapping("/list/{parentId}")
    public CommonResponse getList(@PathVariable Long parentId,
                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                  @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        return pmsProductCategoryService.getList(parentId, pageNum, pageSize);
    }

    @ApiOperation("获取全部产品分类信息")
    @GetMapping("/listAll")
    public CommonResponse getList() {
        return pmsProductCategoryService.getList();
    }

    @ApiOperation("添加产品分类")
    @PostMapping("/create")
    public CommonResponse create(@Validated @RequestBody PmsProductCategoryDto pmsProductCategoryDto, BindingResult result) {
        return pmsProductCategoryService.create(pmsProductCategoryDto);
    }

    @ApiOperation("更新产品分类")
    @PostMapping("/update/{id}")
    public CommonResponse update(@PathVariable("id") Long id, @Validated @RequestBody PmsProductCategoryDto pmsProductCategoryDto, BindingResult result) {
        return pmsProductCategoryService.update(id, pmsProductCategoryDto);
    }

    @ApiOperation("删除产品分类")
    @PostMapping("/delete/{id}")
    public CommonResponse delete(@PathVariable("id") Long id) {
        return pmsProductCategoryService.delete(id);
    }

}
