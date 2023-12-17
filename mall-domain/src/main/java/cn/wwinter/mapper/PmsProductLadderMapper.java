package cn.wwinter.mapper;

import cn.wwinter.entity.PmsProductLadder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2023/12/2
 * @Author: zhangdd
 */
@Mapper
public interface PmsProductLadderMapper extends CommonMapper<PmsProductLadder> {
    @Override
    int insertList(@Param("list") List<PmsProductLadder> list);
}
