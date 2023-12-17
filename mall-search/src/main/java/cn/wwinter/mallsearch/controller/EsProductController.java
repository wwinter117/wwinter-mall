package cn.wwinter.mallsearch.controller;

import cn.wwinter.mallsearch.service.EsProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Date: 2023/12/16
 * @Author: zhangdd
 */
@RestController
@RequestMapping("search/product")
@AllArgsConstructor
public class EsProductController {

    private final EsProductService esProductService;

    @PostMapping("importAll")
    public Object importAll() {
        return esProductService.importAll();
    }

    @GetMapping("getAllBooks")
    public Object getAllBooks() {
        return esProductService.getAllBooks();
    }
}
