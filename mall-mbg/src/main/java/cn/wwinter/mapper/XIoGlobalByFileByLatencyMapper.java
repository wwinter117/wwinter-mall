package cn.wwinter.mapper;

import cn.wwinter.model.XIoGlobalByFileByLatency;
import cn.wwinter.model.XIoGlobalByFileByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoGlobalByFileByLatencyMapper {
    int countByExample(XIoGlobalByFileByLatencyExample example);

    int deleteByExample(XIoGlobalByFileByLatencyExample example);

    int insert(XIoGlobalByFileByLatency record);

    int insertSelective(XIoGlobalByFileByLatency record);

    List<XIoGlobalByFileByLatency> selectByExample(XIoGlobalByFileByLatencyExample example);

    int updateByExampleSelective(@Param("record") XIoGlobalByFileByLatency record, @Param("example") XIoGlobalByFileByLatencyExample example);

    int updateByExample(@Param("record") XIoGlobalByFileByLatency record, @Param("example") XIoGlobalByFileByLatencyExample example);
}