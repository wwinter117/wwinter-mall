package cn.wwinter.mapper;

import cn.wwinter.model.ViewRoutineUsage;
import cn.wwinter.model.ViewRoutineUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewRoutineUsageMapper {
    int countByExample(ViewRoutineUsageExample example);

    int deleteByExample(ViewRoutineUsageExample example);

    int insert(ViewRoutineUsage record);

    int insertSelective(ViewRoutineUsage record);

    List<ViewRoutineUsage> selectByExample(ViewRoutineUsageExample example);

    int updateByExampleSelective(@Param("record") ViewRoutineUsage record, @Param("example") ViewRoutineUsageExample example);

    int updateByExample(@Param("record") ViewRoutineUsage record, @Param("example") ViewRoutineUsageExample example);
}