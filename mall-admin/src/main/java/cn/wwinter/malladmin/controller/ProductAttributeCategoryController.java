package cn.wwinter.malladmin.controller;

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.CommonResult;
import cn.wwinter.malladmin.service.ProductAttributeCategoryService;
import io.swagger.annotations.Api;
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
@Api(tags = "ProductAttributeCategoryController")
public class ProductAttributeCategoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductAttributeCategoryController.class);

    private final ProductAttributeCategoryService productAttributeCategoryService;

    @ApiOperation("添加商品属性分类")
    @PostMapping("/create")
    public Object create(String name) {
        int count = productAttributeCategoryService.create(name);
        if (count > 0) {
            LOGGER.debug("添加成功: name={}", name);
            return CommonResponse.success(name);
        } else {
            LOGGER.debug("添加失败: name={}", name);
            return CommonResponse.failed("添加失败");
        }
    }

    @ApiOperation("分页获取所有商品属性分类")
    @GetMapping("/list")
    public Object getList(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize) {
        return CommonResponse.success(productAttributeCategoryService.getList(pageNum, pageSize));
    }


}
