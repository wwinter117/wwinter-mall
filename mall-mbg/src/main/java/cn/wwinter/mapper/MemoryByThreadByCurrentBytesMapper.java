package cn.wwinter.mapper;

import cn.wwinter.model.MemoryByThreadByCurrentBytes;
import cn.wwinter.model.MemoryByThreadByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryByThreadByCurrentBytesMapper {
    int countByExample(MemoryByThreadByCurrentBytesExample example);

    int deleteByExample(MemoryByThreadByCurrentBytesExample example);

    int insert(MemoryByThreadByCurrentBytes record);

    int insertSelective(MemoryByThreadByCurrentBytes record);

    List<MemoryByThreadByCurrentBytes> selectByExample(MemoryByThreadByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryByThreadByCurrentBytes record, @Param("example") MemoryByThreadByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryByThreadByCurrentBytes record, @Param("example") MemoryByThreadByCurrentBytesExample example);
}