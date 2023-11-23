package cn.wwinter.mapper;

import cn.wwinter.model.WaitsGlobalByLatency;
import cn.wwinter.model.WaitsGlobalByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitsGlobalByLatencyMapper {
    int countByExample(WaitsGlobalByLatencyExample example);

    int deleteByExample(WaitsGlobalByLatencyExample example);

    int insert(WaitsGlobalByLatency record);

    int insertSelective(WaitsGlobalByLatency record);

    List<WaitsGlobalByLatency> selectByExample(WaitsGlobalByLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitsGlobalByLatency record, @Param("example") WaitsGlobalByLatencyExample example);

    int updateByExample(@Param("record") WaitsGlobalByLatency record, @Param("example") WaitsGlobalByLatencyExample example);
}