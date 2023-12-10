package cn.wwinter.malladmin.mapper;

import cn.wwinter.malladmin.model.entity.product.PmsProductFullReduction;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@Mapper
public interface PmsProductFullReductionMapper extends CommonMapper<PmsProductFullReduction> {
    @Override
    int insertList(@Param("list") List<PmsProductFullReduction> list);

}
