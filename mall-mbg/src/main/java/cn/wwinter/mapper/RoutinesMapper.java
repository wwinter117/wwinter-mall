package cn.wwinter.mapper;

import cn.wwinter.model.Routines;
import cn.wwinter.model.RoutinesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoutinesMapper {
    int countByExample(RoutinesExample example);

    int deleteByExample(RoutinesExample example);

    int insert(Routines record);

    int insertSelective(Routines record);

    List<Routines> selectByExampleWithBLOBs(RoutinesExample example);

    List<Routines> selectByExample(RoutinesExample example);

    int updateByExampleSelective(@Param("record") Routines record, @Param("example") RoutinesExample example);

    int updateByExampleWithBLOBs(@Param("record") Routines record, @Param("example") RoutinesExample example);

    int updateByExample(@Param("record") Routines record, @Param("example") RoutinesExample example);
}