package cn.wwinter.mapper;

import cn.wwinter.model.XWaitsByUserByLatency;
import cn.wwinter.model.XWaitsByUserByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitsByUserByLatencyMapper {
    int countByExample(XWaitsByUserByLatencyExample example);

    int deleteByExample(XWaitsByUserByLatencyExample example);

    int insert(XWaitsByUserByLatency record);

    int insertSelective(XWaitsByUserByLatency record);

    List<XWaitsByUserByLatency> selectByExample(XWaitsByUserByLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitsByUserByLatency record, @Param("example") XWaitsByUserByLatencyExample example);

    int updateByExample(@Param("record") XWaitsByUserByLatency record, @Param("example") XWaitsByUserByLatencyExample example);
}