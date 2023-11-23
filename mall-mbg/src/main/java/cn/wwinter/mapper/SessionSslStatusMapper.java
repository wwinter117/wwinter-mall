package cn.wwinter.mapper;

import cn.wwinter.model.SessionSslStatus;
import cn.wwinter.model.SessionSslStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionSslStatusMapper {
    int countByExample(SessionSslStatusExample example);

    int deleteByExample(SessionSslStatusExample example);

    int insert(SessionSslStatus record);

    int insertSelective(SessionSslStatus record);

    List<SessionSslStatus> selectByExample(SessionSslStatusExample example);

    int updateByExampleSelective(@Param("record") SessionSslStatus record, @Param("example") SessionSslStatusExample example);

    int updateByExample(@Param("record") SessionSslStatus record, @Param("example") SessionSslStatusExample example);
}