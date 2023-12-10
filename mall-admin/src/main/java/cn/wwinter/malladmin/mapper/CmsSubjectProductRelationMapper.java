package cn.wwinter.malladmin.mapper;

import cn.wwinter.malladmin.model.entity.product.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2023/12/3
 * @Author: zhangdd
 */
@Mapper
public interface CmsSubjectProductRelationMapper extends CommonMapper<CmsSubjectProductRelation> {
    @Override
    int insertList(@Param("list") List<CmsSubjectProductRelation> list);
}
