package cn.wwinter.mapper;

import cn.wwinter.model.IoGlobalByFileByBytes;
import cn.wwinter.model.IoGlobalByFileByBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByFileByBytesMapper {
    int countByExample(IoGlobalByFileByBytesExample example);

    int deleteByExample(IoGlobalByFileByBytesExample example);

    int insert(IoGlobalByFileByBytes record);

    int insertSelective(IoGlobalByFileByBytes record);

    List<IoGlobalByFileByBytes> selectByExample(IoGlobalByFileByBytesExample example);

    int updateByExampleSelective(@Param("record") IoGlobalByFileByBytes record, @Param("example") IoGlobalByFileByBytesExample example);

    int updateByExample(@Param("record") IoGlobalByFileByBytes record, @Param("example") IoGlobalByFileByBytesExample example);
}