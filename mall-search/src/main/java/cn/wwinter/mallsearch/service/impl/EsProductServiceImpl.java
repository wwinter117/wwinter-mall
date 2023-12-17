package cn.wwinter.mallsearch.service.impl;

import cn.wwinter.entity.PmsProduct;
import cn.wwinter.mallsearch.domain.EsProduct;
import cn.wwinter.mallsearch.mapper.ESBookMapper;
import cn.wwinter.mallsearch.mapper.ESProductMapper;
import cn.wwinter.mallsearch.service.EsProductService;
import cn.wwinter.mallsearch.service.action.PmsProductSqlAction;
import cn.wwinter.mallsearch.service.assembler.PmsProductAssembler;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/16
 * @Author: zhangdd
 */
@Service
@AllArgsConstructor
public class EsProductServiceImpl implements EsProductService {
    private final ESProductMapper esProductMapper;
    private final ESBookMapper esBookMapper;
    private final PmsProductSqlAction pmsProductSqlAction;
    private final PmsProductAssembler pmsProductAssembler;

    @Override
    public Object importAll() {
        List<PmsProduct> list = pmsProductSqlAction.getList();
        List<EsProduct> esProductList = pmsProductAssembler.PmsProductListToESList(list);
        return esProductMapper.saveAll(esProductList);
    }

    @Override
    public Object getAllBooks() {
        return esBookMapper.findAll();
    }

}
