package cn.wwinter.mapper;

import cn.wwinter.entity.CmsPreferenceAreaProductRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2023/12/3
 * @Author: zhangdd
 */
@Mapper
public interface CmsPreferenceAreaProductRelationMapper extends CommonMapper<CmsPreferenceAreaProductRelation> {
    @Override
    int insertList(@Param("list") List<CmsPreferenceAreaProductRelation> list);
}
