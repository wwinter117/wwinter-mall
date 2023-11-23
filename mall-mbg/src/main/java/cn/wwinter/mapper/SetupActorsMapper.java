package cn.wwinter.mapper;

import cn.wwinter.model.SetupActors;
import cn.wwinter.model.SetupActorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupActorsMapper {
    int countByExample(SetupActorsExample example);

    int deleteByExample(SetupActorsExample example);

    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("role") String role);

    int insert(SetupActors record);

    int insertSelective(SetupActors record);

    List<SetupActors> selectByExample(SetupActorsExample example);

    SetupActors selectByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("role") String role);

    int updateByExampleSelective(@Param("record") SetupActors record, @Param("example") SetupActorsExample example);

    int updateByExample(@Param("record") SetupActors record, @Param("example") SetupActorsExample example);

    int updateByPrimaryKeySelective(SetupActors record);

    int updateByPrimaryKey(SetupActors record);
}