package cn.wwinter.mapper;

import cn.wwinter.model.TlsChannelStatus;
import cn.wwinter.model.TlsChannelStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TlsChannelStatusMapper {
    int countByExample(TlsChannelStatusExample example);

    int deleteByExample(TlsChannelStatusExample example);

    int insert(TlsChannelStatus record);

    int insertSelective(TlsChannelStatus record);

    List<TlsChannelStatus> selectByExample(TlsChannelStatusExample example);

    int updateByExampleSelective(@Param("record") TlsChannelStatus record, @Param("example") TlsChannelStatusExample example);

    int updateByExample(@Param("record") TlsChannelStatus record, @Param("example") TlsChannelStatusExample example);
}