package cn.wwinter.malladmin.mapper;
import cn.wwinter.malladmin.model.entity.product.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

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
