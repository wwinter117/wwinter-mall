package cn.wwinter.mallsearch.service.assembler;

import cn.wwinter.entity.PmsProduct;
import cn.wwinter.mallsearch.domain.EsProduct;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2023/12/16
 * @Author: zhangdd
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PmsProductAssembler {

    List<EsProduct> PmsProductListToESList(List<PmsProduct> list);

    EsProduct PmsProductToEs(PmsProduct product);

}
