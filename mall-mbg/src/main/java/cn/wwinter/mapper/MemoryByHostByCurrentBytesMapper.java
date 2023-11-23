package cn.wwinter.mapper;

import cn.wwinter.model.MemoryByHostByCurrentBytes;
import cn.wwinter.model.MemoryByHostByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryByHostByCurrentBytesMapper {
    int countByExample(MemoryByHostByCurrentBytesExample example);

    int deleteByExample(MemoryByHostByCurrentBytesExample example);

    int insert(MemoryByHostByCurrentBytes record);

    int insertSelective(MemoryByHostByCurrentBytes record);

    List<MemoryByHostByCurrentBytes> selectByExample(MemoryByHostByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryByHostByCurrentBytes record, @Param("example") MemoryByHostByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryByHostByCurrentBytes record, @Param("example") MemoryByHostByCurrentBytesExample example);
}