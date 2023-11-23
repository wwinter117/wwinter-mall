package cn.wwinter.mapper;

import cn.wwinter.model.XMemoryByUserByCurrentBytes;
import cn.wwinter.model.XMemoryByUserByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryByUserByCurrentBytesMapper {
    int countByExample(XMemoryByUserByCurrentBytesExample example);

    int deleteByExample(XMemoryByUserByCurrentBytesExample example);

    int insert(XMemoryByUserByCurrentBytes record);

    int insertSelective(XMemoryByUserByCurrentBytes record);

    List<XMemoryByUserByCurrentBytes> selectByExample(XMemoryByUserByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") XMemoryByUserByCurrentBytes record, @Param("example") XMemoryByUserByCurrentBytesExample example);

    int updateByExample(@Param("record") XMemoryByUserByCurrentBytes record, @Param("example") XMemoryByUserByCurrentBytesExample example);
}