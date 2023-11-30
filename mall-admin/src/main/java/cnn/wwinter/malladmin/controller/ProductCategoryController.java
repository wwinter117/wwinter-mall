package cnn.wwinter.malladmin.controller;

import cnn.wwinter.malladmin.model.dto.CommonResult;
import cnn.wwinter.malladmin.model.dto.PmsProductCategoryDto;
import cnn.wwinter.malladmin.service.ProductCategoryService;
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
public class ProductCategoryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductCategoryController.class);
    private final ProductCategoryService productCategoryService;

    @ApiOperation("根据编号查询产品分类信息")
    @GetMapping("/{id}")
    public Object getItem(@PathVariable(value = "id") Long id) {
        return new CommonResult().success(productCategoryService.getItem(id));
    }

    @ApiOperation("分页获取产品分类")
    @GetMapping("/list/{parentId}")
    public Object getList(@PathVariable Long parentId,
                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                          @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        return new CommonResult().pageSuccess(productCategoryService.getList(parentId, pageNum, pageSize));
    }

    @ApiOperation("获取全部产品分类信息")
    @GetMapping("/listAll")
    public Object getList() {
        return new CommonResult().success(productCategoryService.getList());
    }

    @ApiOperation("添加产品分类")
    @PostMapping("/create")
    public Object create(@Validated @RequestBody PmsProductCategoryDto pmsProductCategoryDto, BindingResult result) {
        if (result.hasErrors()) {
            return new CommonResult().validateFailed(result.getFieldError().getDefaultMessage());
        }
        CommonResult commonResult;
        int count = productCategoryService.create(pmsProductCategoryDto);
        if (count == 1) {
            commonResult = new CommonResult().success(pmsProductCategoryDto);
            LOGGER.debug("添加成功: {}", pmsProductCategoryDto);
        } else {
            commonResult = new CommonResult().failed();
            LOGGER.debug("添加失败: {}", pmsProductCategoryDto);
        }
        return commonResult;
    }

    @ApiOperation("更新产品分类")
    @PostMapping("/update/{id}")
    public Object update(@PathVariable("id") Long id, @Validated @RequestBody PmsProductCategoryDto pmsProductCategoryDto, BindingResult result) {
        if (result.hasErrors()) {
            return new CommonResult().validateFailed(result.getFieldError().getDefaultMessage());
        }
        CommonResult commonResult;
        int count = productCategoryService.update(id, pmsProductCategoryDto);
        if (count == 1) {
            commonResult = new CommonResult().success(pmsProductCategoryDto);
            LOGGER.debug("更新成功: {}", pmsProductCategoryDto);
        } else {
            commonResult = new CommonResult().failed();
            LOGGER.debug("更新失败: {}", pmsProductCategoryDto);
        }
        return commonResult;
    }

    @ApiOperation("删除产品分类")
    @PostMapping("/delete/{id}")
    public Object delete(@PathVariable("id") Long id) {
        int count = productCategoryService.delete(id);
        CommonResult commonResult;
        if (count == 1) {
            commonResult = new CommonResult().success(null);
            LOGGER.debug("删除成功: id={}", id);
        } else {
            commonResult = new CommonResult().failed();
            LOGGER.debug("删除成功: id={}", id);
        }
        return commonResult;
    }

}
