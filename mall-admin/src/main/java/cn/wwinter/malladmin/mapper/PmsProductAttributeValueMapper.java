package cn.wwinter.malladmin.mapper;

import cn.wwinter.malladmin.model.entity.product.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2023/12/2
 * @Author: zhangdd
 */
@Mapper
public interface PmsProductAttributeValueMapper extends CommonMapper<PmsProductAttributeValue> {
    @Override
    int insertList(@Param("list") List<PmsProductAttributeValue> list);
}
