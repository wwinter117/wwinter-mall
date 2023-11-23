package cn.wwinter.mapper;

import cn.wwinter.model.XIoGlobalByWaitByBytes;
import cn.wwinter.model.XIoGlobalByWaitByBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoGlobalByWaitByBytesMapper {
    int countByExample(XIoGlobalByWaitByBytesExample example);

    int deleteByExample(XIoGlobalByWaitByBytesExample example);

    int insert(XIoGlobalByWaitByBytes record);

    int insertSelective(XIoGlobalByWaitByBytes record);

    List<XIoGlobalByWaitByBytes> selectByExample(XIoGlobalByWaitByBytesExample example);

    int updateByExampleSelective(@Param("record") XIoGlobalByWaitByBytes record, @Param("example") XIoGlobalByWaitByBytesExample example);

    int updateByExample(@Param("record") XIoGlobalByWaitByBytes record, @Param("example") XIoGlobalByWaitByBytesExample example);
}