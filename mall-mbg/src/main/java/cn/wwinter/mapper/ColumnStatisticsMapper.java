package cn.wwinter.mapper;

import cn.wwinter.model.ColumnStatistics;
import cn.wwinter.model.ColumnStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnStatisticsMapper {
    int countByExample(ColumnStatisticsExample example);

    int deleteByExample(ColumnStatisticsExample example);

    int insert(ColumnStatistics record);

    int insertSelective(ColumnStatistics record);

    List<ColumnStatistics> selectByExampleWithBLOBs(ColumnStatisticsExample example);

    List<ColumnStatistics> selectByExample(ColumnStatisticsExample example);

    int updateByExampleSelective(@Param("record") ColumnStatistics record, @Param("example") ColumnStatisticsExample example);

    int updateByExampleWithBLOBs(@Param("record") ColumnStatistics record, @Param("example") ColumnStatisticsExample example);

    int updateByExample(@Param("record") ColumnStatistics record, @Param("example") ColumnStatisticsExample example);
}