package cn.wwinter.mapper;

import cn.wwinter.model.IoGlobalByWaitByLatency;
import cn.wwinter.model.IoGlobalByWaitByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByWaitByLatencyMapper {
    int countByExample(IoGlobalByWaitByLatencyExample example);

    int deleteByExample(IoGlobalByWaitByLatencyExample example);

    int insert(IoGlobalByWaitByLatency record);

    int insertSelective(IoGlobalByWaitByLatency record);

    List<IoGlobalByWaitByLatency> selectByExample(IoGlobalByWaitByLatencyExample example);

    int updateByExampleSelective(@Param("record") IoGlobalByWaitByLatency record, @Param("example") IoGlobalByWaitByLatencyExample example);

    int updateByExample(@Param("record") IoGlobalByWaitByLatency record, @Param("example") IoGlobalByWaitByLatencyExample example);
}