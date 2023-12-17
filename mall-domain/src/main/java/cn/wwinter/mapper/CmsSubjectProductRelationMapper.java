package cn.wwinter.mapper;

import cn.wwinter.entity.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
