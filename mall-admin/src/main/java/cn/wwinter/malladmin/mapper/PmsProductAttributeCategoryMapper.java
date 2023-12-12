package cn.wwinter.malladmin.mapper;

import cn.wwinter.malladmin.model.domain.PmsProductAttributeCategory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2023/12/3
 * @Author: zhangdd
 */
@Mapper
public interface PmsProductAttributeCategoryMapper extends CommonMapper<PmsProductAttributeCategory> {
    @Override
    int insertList(@Param("list") List<PmsProductAttributeCategory> list);
}
