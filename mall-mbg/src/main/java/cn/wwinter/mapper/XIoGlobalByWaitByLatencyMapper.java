package cn.wwinter.mapper;

import cn.wwinter.model.XIoGlobalByWaitByLatency;
import cn.wwinter.model.XIoGlobalByWaitByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoGlobalByWaitByLatencyMapper {
    int countByExample(XIoGlobalByWaitByLatencyExample example);

    int deleteByExample(XIoGlobalByWaitByLatencyExample example);

    int insert(XIoGlobalByWaitByLatency record);

    int insertSelective(XIoGlobalByWaitByLatency record);

    List<XIoGlobalByWaitByLatency> selectByExample(XIoGlobalByWaitByLatencyExample example);

    int updateByExampleSelective(@Param("record") XIoGlobalByWaitByLatency record, @Param("example") XIoGlobalByWaitByLatencyExample example);

    int updateByExample(@Param("record") XIoGlobalByWaitByLatency record, @Param("example") XIoGlobalByWaitByLatencyExample example);
}