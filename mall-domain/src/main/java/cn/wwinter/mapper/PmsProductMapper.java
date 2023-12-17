package cn.wwinter.mapper;

import cn.wwinter.entity.PmsProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2023/12/2
 * @Author: zhangdd
 */
@Mapper
public interface PmsProductMapper extends CommonMapper<PmsProduct> {
    @Override
    int insertList(@Param("list") List<PmsProduct> list);

    int insertPmsProduct(@Param("product") PmsProduct product);

}