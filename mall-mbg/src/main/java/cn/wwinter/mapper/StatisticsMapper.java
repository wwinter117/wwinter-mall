package cn.wwinter.mapper;

import cn.wwinter.model.Statistics;
import cn.wwinter.model.StatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatisticsMapper {
    int countByExample(StatisticsExample example);

    int deleteByExample(StatisticsExample example);

    int insert(Statistics record);

    int insertSelective(Statistics record);

    List<Statistics> selectByExampleWithBLOBs(StatisticsExample example);

    List<Statistics> selectByExample(StatisticsExample example);

    int updateByExampleSelective(@Param("record") Statistics record, @Param("example") StatisticsExample example);

    int updateByExampleWithBLOBs(@Param("record") Statistics record, @Param("example") StatisticsExample example);

    int updateByExample(@Param("record") Statistics record, @Param("example") StatisticsExample example);
}