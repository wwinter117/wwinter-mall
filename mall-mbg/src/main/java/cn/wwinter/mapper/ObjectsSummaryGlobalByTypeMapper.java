package cn.wwinter.mapper;

import cn.wwinter.model.ObjectsSummaryGlobalByType;
import cn.wwinter.model.ObjectsSummaryGlobalByTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectsSummaryGlobalByTypeMapper {
    int countByExample(ObjectsSummaryGlobalByTypeExample example);

    int deleteByExample(ObjectsSummaryGlobalByTypeExample example);

    int insert(ObjectsSummaryGlobalByType record);

    int insertSelective(ObjectsSummaryGlobalByType record);

    List<ObjectsSummaryGlobalByType> selectByExample(ObjectsSummaryGlobalByTypeExample example);

    int updateByExampleSelective(@Param("record") ObjectsSummaryGlobalByType record, @Param("example") ObjectsSummaryGlobalByTypeExample example);

    int updateByExample(@Param("record") ObjectsSummaryGlobalByType record, @Param("example") ObjectsSummaryGlobalByTypeExample example);
}