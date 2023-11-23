package cn.wwinter.mapper;

import cn.wwinter.model.SetupMetrics;
import cn.wwinter.model.SetupMetricsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupMetricsMapper {
    int countByExample(SetupMetricsExample example);

    int deleteByExample(SetupMetricsExample example);

    int deleteByPrimaryKey(String name);

    int insert(SetupMetrics record);

    int insertSelective(SetupMetrics record);

    List<SetupMetrics> selectByExample(SetupMetricsExample example);

    SetupMetrics selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") SetupMetrics record, @Param("example") SetupMetricsExample example);

    int updateByExample(@Param("record") SetupMetrics record, @Param("example") SetupMetricsExample example);

    int updateByPrimaryKeySelective(SetupMetrics record);

    int updateByPrimaryKey(SetupMetrics record);
}