package cn.wwinter.mapper;

import cn.wwinter.entity.PmsProductFullReduction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
