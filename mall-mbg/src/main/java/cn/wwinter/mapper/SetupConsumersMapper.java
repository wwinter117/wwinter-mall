package cn.wwinter.mapper;

import cn.wwinter.model.SetupConsumers;
import cn.wwinter.model.SetupConsumersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupConsumersMapper {
    int countByExample(SetupConsumersExample example);

    int deleteByExample(SetupConsumersExample example);

    int deleteByPrimaryKey(String name);

    int insert(SetupConsumers record);

    int insertSelective(SetupConsumers record);

    List<SetupConsumers> selectByExample(SetupConsumersExample example);

    SetupConsumers selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") SetupConsumers record, @Param("example") SetupConsumersExample example);

    int updateByExample(@Param("record") SetupConsumers record, @Param("example") SetupConsumersExample example);

    int updateByPrimaryKeySelective(SetupConsumers record);

    int updateByPrimaryKey(SetupConsumers record);
}