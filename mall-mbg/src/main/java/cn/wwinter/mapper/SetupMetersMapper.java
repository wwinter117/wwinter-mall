package cn.wwinter.mapper;

import cn.wwinter.model.SetupMeters;
import cn.wwinter.model.SetupMetersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupMetersMapper {
    int countByExample(SetupMetersExample example);

    int deleteByExample(SetupMetersExample example);

    int deleteByPrimaryKey(String name);

    int insert(SetupMeters record);

    int insertSelective(SetupMeters record);

    List<SetupMeters> selectByExample(SetupMetersExample example);

    SetupMeters selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") SetupMeters record, @Param("example") SetupMetersExample example);

    int updateByExample(@Param("record") SetupMeters record, @Param("example") SetupMetersExample example);

    int updateByPrimaryKeySelective(SetupMeters record);

    int updateByPrimaryKey(SetupMeters record);
}