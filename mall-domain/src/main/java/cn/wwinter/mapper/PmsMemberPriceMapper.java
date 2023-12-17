package cn.wwinter.mapper;

import cn.wwinter.entity.PmsMemberPrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@Mapper
public interface PmsMemberPriceMapper extends CommonMapper<PmsMemberPrice> {
    int insertList(@Param("list") List<PmsMemberPrice> list);
}
