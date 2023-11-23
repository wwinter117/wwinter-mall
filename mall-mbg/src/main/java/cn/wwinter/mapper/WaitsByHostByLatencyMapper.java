package cn.wwinter.mapper;

import cn.wwinter.model.WaitsByHostByLatency;
import cn.wwinter.model.WaitsByHostByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitsByHostByLatencyMapper {
    int countByExample(WaitsByHostByLatencyExample example);

    int deleteByExample(WaitsByHostByLatencyExample example);

    int insert(WaitsByHostByLatency record);

    int insertSelective(WaitsByHostByLatency record);

    List<WaitsByHostByLatency> selectByExample(WaitsByHostByLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitsByHostByLatency record, @Param("example") WaitsByHostByLatencyExample example);

    int updateByExample(@Param("record") WaitsByHostByLatency record, @Param("example") WaitsByHostByLatencyExample example);
}