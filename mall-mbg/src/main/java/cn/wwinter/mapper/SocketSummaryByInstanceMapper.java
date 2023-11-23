package cn.wwinter.mapper;

import cn.wwinter.model.SocketSummaryByInstance;
import cn.wwinter.model.SocketSummaryByInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocketSummaryByInstanceMapper {
    int countByExample(SocketSummaryByInstanceExample example);

    int deleteByExample(SocketSummaryByInstanceExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(SocketSummaryByInstance record);

    int insertSelective(SocketSummaryByInstance record);

    List<SocketSummaryByInstance> selectByExample(SocketSummaryByInstanceExample example);

    SocketSummaryByInstance selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") SocketSummaryByInstance record, @Param("example") SocketSummaryByInstanceExample example);

    int updateByExample(@Param("record") SocketSummaryByInstance record, @Param("example") SocketSummaryByInstanceExample example);

    int updateByPrimaryKeySelective(SocketSummaryByInstance record);

    int updateByPrimaryKey(SocketSummaryByInstance record);
}