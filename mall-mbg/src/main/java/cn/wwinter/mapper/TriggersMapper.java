package cn.wwinter.mapper;

import cn.wwinter.model.Triggers;
import cn.wwinter.model.TriggersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriggersMapper {
    int countByExample(TriggersExample example);

    int deleteByExample(TriggersExample example);

    int insert(Triggers record);

    int insertSelective(Triggers record);

    List<Triggers> selectByExampleWithBLOBs(TriggersExample example);

    List<Triggers> selectByExample(TriggersExample example);

    int updateByExampleSelective(@Param("record") Triggers record, @Param("example") TriggersExample example);

    int updateByExampleWithBLOBs(@Param("record") Triggers record, @Param("example") TriggersExample example);

    int updateByExample(@Param("record") Triggers record, @Param("example") TriggersExample example);
}