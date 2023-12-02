package cn.wwinter.malladmin.controller;

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.CommonResult;
import cn.wwinter.malladmin.model.dto.PmsProductCategoryDto;
import cn.wwinter.malladmin.service.ProductCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: ProductCategoryController
 * Package: cnn.wwinter.malladmin.controller
 * Description:
 * Datetime: 2023/11/28
 * Author: zhangdd
 */
@RestController
@RequestMapping("productCategory")
@AllArgsConstructor
@Api(tags = "ProductCategoryController", description = "商品分类管理")
public class ProductCategoryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductCategoryController.class);
    private final ProductCategoryService productCategoryService;

    @ApiOperation("根据编号查询产品分类信息")
    @GetMapping("/{id}")
    public Object getItem(@PathVariable(value = "id") Long id) {
        return CommonResponse.success(productCategoryService.getItem(id));
    }

    @ApiOperation("分页获取产品分类")
    @GetMapping("/list/{parentId}")
    public Object getList(@PathVariable Long parentId,
                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                          @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        return CommonResponse.pageSuccess(productCategoryService.getList(parentId, pageNum, pageSize));
    }

    @ApiOperation("获取全部产品分类信息")
    @GetMapping("/listAll")
    public Object getList() {
        return CommonResponse.success(productCategoryService.getList());
    }

    @ApiOperation("添加产品分类")
    @PostMapping("/create")
    public Object create(@Validated @RequestBody PmsProductCategoryDto pmsProductCategoryDto, BindingResult result) {
        int count = productCategoryService.create(pmsProductCategoryDto);
        if (count == 1) {
            LOGGER.debug("添加成功: {}", pmsProductCategoryDto);
            return CommonResponse.success(pmsProductCategoryDto);
        } else {
            LOGGER.debug("添加失败: {}", pmsProductCategoryDto);
            return CommonResponse.failed("添加失败");
        }
    }

    @ApiOperation("更新产品分类")
    @PostMapping("/update/{id}")
    public Object update(@PathVariable("id") Long id, @Validated @RequestBody PmsProductCategoryDto pmsProductCategoryDto, BindingResult result) {
        int count = productCategoryService.update(id, pmsProductCategoryDto);
        if (count == 1) {
            LOGGER.debug("更新成功: {}", pmsProductCategoryDto);
            return CommonResponse.success(pmsProductCategoryDto);
        } else {
            LOGGER.debug("更新失败: {}", pmsProductCategoryDto);
            return CommonResponse.failed("更新失败");
        }
    }

    @ApiOperation("删除产品分类")
    @PostMapping("/delete/{id}")
    public Object delete(@PathVariable("id") Long id) {
        int count = productCategoryService.delete(id);
        if (count == 1) {
            LOGGER.debug("删除成功: id={}", id);
            return CommonResponse.success(id);
        } else {
            LOGGER.debug("删除失败: id={}", id);
            return CommonResponse.failed("删除失败");
        }
    }

}
