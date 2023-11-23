package cn.wwinter.mapper;

import cn.wwinter.model.XMemoryGlobalByCurrentBytes;
import cn.wwinter.model.XMemoryGlobalByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryGlobalByCurrentBytesMapper {
    int countByExample(XMemoryGlobalByCurrentBytesExample example);

    int deleteByExample(XMemoryGlobalByCurrentBytesExample example);

    int insert(XMemoryGlobalByCurrentBytes record);

    int insertSelective(XMemoryGlobalByCurrentBytes record);

    List<XMemoryGlobalByCurrentBytes> selectByExample(XMemoryGlobalByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") XMemoryGlobalByCurrentBytes record, @Param("example") XMemoryGlobalByCurrentBytesExample example);

    int updateByExample(@Param("record") XMemoryGlobalByCurrentBytes record, @Param("example") XMemoryGlobalByCurrentBytesExample example);
}