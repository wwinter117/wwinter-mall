package cn.wwinter.mapper;

import cn.wwinter.model.SetupInstruments;
import cn.wwinter.model.SetupInstrumentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupInstrumentsMapper {
    int countByExample(SetupInstrumentsExample example);

    int deleteByExample(SetupInstrumentsExample example);

    int deleteByPrimaryKey(String name);

    int insert(SetupInstruments record);

    int insertSelective(SetupInstruments record);

    List<SetupInstruments> selectByExampleWithBLOBs(SetupInstrumentsExample example);

    List<SetupInstruments> selectByExample(SetupInstrumentsExample example);

    SetupInstruments selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") SetupInstruments record, @Param("example") SetupInstrumentsExample example);

    int updateByExampleWithBLOBs(@Param("record") SetupInstruments record, @Param("example") SetupInstrumentsExample example);

    int updateByExample(@Param("record") SetupInstruments record, @Param("example") SetupInstrumentsExample example);

    int updateByPrimaryKeySelective(SetupInstruments record);

    int updateByPrimaryKeyWithBLOBs(SetupInstruments record);

    int updateByPrimaryKey(SetupInstruments record);
}