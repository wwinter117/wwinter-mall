package cn.wwinter.mapper;

import cn.wwinter.model.SlowLog;
import cn.wwinter.model.SlowLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SlowLogMapper {
    int countByExample(SlowLogExample example);

    int deleteByExample(SlowLogExample example);

    int insert(SlowLog record);

    int insertSelective(SlowLog record);

    List<SlowLog> selectByExampleWithBLOBs(SlowLogExample example);

    List<SlowLog> selectByExample(SlowLogExample example);

    int updateByExampleSelective(@Param("record") SlowLog record, @Param("example") SlowLogExample example);

    int updateByExampleWithBLOBs(@Param("record") SlowLog record, @Param("example") SlowLogExample example);

    int updateByExample(@Param("record") SlowLog record, @Param("example") SlowLogExample example);
}