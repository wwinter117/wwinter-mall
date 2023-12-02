package cn.wwinter.malladmin.controller;/**
 * ClassName: ProductController
 * Package: cn.wwinter.malladmin.controller
 * Description:
 * Datetime: 2023/12/2
 * Author: zhangdd
 */

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.PmsProductDto;
import cn.wwinter.malladmin.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
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
public class ProductController {
    private final ProductService productService;

    @PostMapping("create")
    public Object create(@RequestBody PmsProductDto pmsProductDto, BindingResult bindingResult) {
        int count = productService.create(pmsProductDto);
        if (count > 0) {
            return CommonResponse.success(pmsProductDto);
        } else {
            return CommonResponse.failed("创建失败");
        }
    }
}
