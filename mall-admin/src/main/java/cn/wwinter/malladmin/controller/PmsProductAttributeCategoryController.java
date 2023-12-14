package cn.wwinter.malladmin.controller;

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.service.PmsProductAttributeCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: PmsProductAttributeCategoryController
 * Package: cnn.wwinter.malladmin.controller
 * Description:
 * Datetime: 2023/11/29
 * Author: zhangdd
 */
@RestController
@RequestMapping("/productAttributeCategory")
@AllArgsConstructor
@Api(tags = "PmsProductAttributeCategoryController")
public class PmsProductAttributeCategoryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsProductAttributeCategoryController.class);

    private final PmsProductAttributeCategoryService pmsProductAttributeCategoryService;

    @ApiOperation("添加商品属性分类")
    @PostMapping("/create")
    public CommonResponse create(String name) {
        return pmsProductAttributeCategoryService.create(name);
    }

    @ApiOperation("分页获取所有商品属性分类")
    @GetMapping("/list")
    public CommonResponse getList(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize) {
        return pmsProductAttributeCategoryService.getList(pageNum, pageSize);
    }


}
