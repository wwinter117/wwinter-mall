package cn.wwinter.mapper;

import cn.wwinter.model.XMemoryByThreadByCurrentBytes;
import cn.wwinter.model.XMemoryByThreadByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryByThreadByCurrentBytesMapper {
    int countByExample(XMemoryByThreadByCurrentBytesExample example);

    int deleteByExample(XMemoryByThreadByCurrentBytesExample example);

    int insert(XMemoryByThreadByCurrentBytes record);

    int insertSelective(XMemoryByThreadByCurrentBytes record);

    List<XMemoryByThreadByCurrentBytes> selectByExample(XMemoryByThreadByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") XMemoryByThreadByCurrentBytes record, @Param("example") XMemoryByThreadByCurrentBytesExample example);

    int updateByExample(@Param("record") XMemoryByThreadByCurrentBytes record, @Param("example") XMemoryByThreadByCurrentBytesExample example);
}