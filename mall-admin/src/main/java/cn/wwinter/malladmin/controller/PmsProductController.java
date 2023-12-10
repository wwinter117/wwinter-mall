package cn.wwinter.malladmin.controller;

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.product.PmsProductCombinationDto;
import cn.wwinter.malladmin.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@RestController
@RequestMapping("product")
@AllArgsConstructor
public class PmsProductController {
    private final ProductService productService;

    @PostMapping("create")
    public CommonResponse create(@Validated @RequestBody PmsProductCombinationDto pmsProductCombinationDto, BindingResult bindingResult) {
        return productService.create(pmsProductCombinationDto);
    }
}
