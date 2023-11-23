package cn.wwinter.mapper;

import cn.wwinter.model.XWaitsByHostByLatency;
import cn.wwinter.model.XWaitsByHostByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitsByHostByLatencyMapper {
    int countByExample(XWaitsByHostByLatencyExample example);

    int deleteByExample(XWaitsByHostByLatencyExample example);

    int insert(XWaitsByHostByLatency record);

    int insertSelective(XWaitsByHostByLatency record);

    List<XWaitsByHostByLatency> selectByExample(XWaitsByHostByLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitsByHostByLatency record, @Param("example") XWaitsByHostByLatencyExample example);

    int updateByExample(@Param("record") XWaitsByHostByLatency record, @Param("example") XWaitsByHostByLatencyExample example);
}