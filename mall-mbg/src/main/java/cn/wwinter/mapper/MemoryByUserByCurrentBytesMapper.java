package cn.wwinter.mapper;

import cn.wwinter.model.MemoryByUserByCurrentBytes;
import cn.wwinter.model.MemoryByUserByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryByUserByCurrentBytesMapper {
    int countByExample(MemoryByUserByCurrentBytesExample example);

    int deleteByExample(MemoryByUserByCurrentBytesExample example);

    int insert(MemoryByUserByCurrentBytes record);

    int insertSelective(MemoryByUserByCurrentBytes record);

    List<MemoryByUserByCurrentBytes> selectByExample(MemoryByUserByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryByUserByCurrentBytes record, @Param("example") MemoryByUserByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryByUserByCurrentBytes record, @Param("example") MemoryByUserByCurrentBytesExample example);
}