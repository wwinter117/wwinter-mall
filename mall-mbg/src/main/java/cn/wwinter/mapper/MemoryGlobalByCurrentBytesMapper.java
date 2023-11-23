package cn.wwinter.mapper;

import cn.wwinter.model.MemoryGlobalByCurrentBytes;
import cn.wwinter.model.MemoryGlobalByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryGlobalByCurrentBytesMapper {
    int countByExample(MemoryGlobalByCurrentBytesExample example);

    int deleteByExample(MemoryGlobalByCurrentBytesExample example);

    int insert(MemoryGlobalByCurrentBytes record);

    int insertSelective(MemoryGlobalByCurrentBytes record);

    List<MemoryGlobalByCurrentBytes> selectByExample(MemoryGlobalByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryGlobalByCurrentBytes record, @Param("example") MemoryGlobalByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryGlobalByCurrentBytes record, @Param("example") MemoryGlobalByCurrentBytesExample example);
}