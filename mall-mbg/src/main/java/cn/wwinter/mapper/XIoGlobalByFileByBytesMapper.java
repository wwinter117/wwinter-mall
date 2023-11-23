package cn.wwinter.mapper;

import cn.wwinter.model.XIoGlobalByFileByBytes;
import cn.wwinter.model.XIoGlobalByFileByBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoGlobalByFileByBytesMapper {
    int countByExample(XIoGlobalByFileByBytesExample example);

    int deleteByExample(XIoGlobalByFileByBytesExample example);

    int insert(XIoGlobalByFileByBytes record);

    int insertSelective(XIoGlobalByFileByBytes record);

    List<XIoGlobalByFileByBytes> selectByExample(XIoGlobalByFileByBytesExample example);

    int updateByExampleSelective(@Param("record") XIoGlobalByFileByBytes record, @Param("example") XIoGlobalByFileByBytesExample example);

    int updateByExample(@Param("record") XIoGlobalByFileByBytes record, @Param("example") XIoGlobalByFileByBytesExample example);
}