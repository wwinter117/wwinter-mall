package cnn.wwinter.malladmin.controller;

import cnn.wwinter.malladmin.model.dto.CommonResult;
import cnn.wwinter.malladmin.service.ProductAttributeCategoryService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: ProductAttributeCategoryController
 * Package: cnn.wwinter.malladmin.controller
 * Description:
 * Datetime: 2023/11/29
 * Author: zhangdd
 */
@RestController
@RequestMapping("/ProductAttributeCategory")
@AllArgsConstructor
public class ProductAttributeCategoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductAttributeCategoryController.class);

    private final ProductAttributeCategoryService productAttributeCategoryService;

    @ApiOperation("添加商品属性分类")
    @PostMapping("/create")
    public Object create(String name) {
        int count = productAttributeCategoryService.create(name);
        CommonResult commonResult;
        if (count > 0) {
            LOGGER.debug("添加成功: name={}", name);
            commonResult = new CommonResult().success(name);
        } else {
            LOGGER.debug("添加失败: name={}", name);
            commonResult = new CommonResult().failed();
        }
        return commonResult;
    }

    @ApiOperation("分页获取所有商品属性分类")
    @GetMapping("/list")
    public Object listProductAttributeCategory(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize) {
        return new CommonResult().success(productAttributeCategoryService.listProductAttributeCategory(pageNum, pageSize));
    }
}
