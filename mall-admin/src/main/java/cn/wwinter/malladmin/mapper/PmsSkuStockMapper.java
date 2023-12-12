package cn.wwinter.malladmin.mapper;

import cn.wwinter.malladmin.model.domain.PmsSkuStock;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2023/12/3
 * @Author: zhangdd
 */
@Mapper
public interface PmsSkuStockMapper extends CommonMapper<PmsSkuStock> {
    @Override
    int insertList(@Param("list") List<PmsSkuStock> list);
}
