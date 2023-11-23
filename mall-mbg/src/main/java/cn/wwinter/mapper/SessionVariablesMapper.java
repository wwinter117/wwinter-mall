package cn.wwinter.mapper;

import cn.wwinter.model.SessionVariables;
import cn.wwinter.model.SessionVariablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionVariablesMapper {
    int countByExample(SessionVariablesExample example);

    int deleteByExample(SessionVariablesExample example);

    int deleteByPrimaryKey(String variableName);

    int insert(SessionVariables record);

    int insertSelective(SessionVariables record);

    List<SessionVariables> selectByExample(SessionVariablesExample example);

    SessionVariables selectByPrimaryKey(String variableName);

    int updateByExampleSelective(@Param("record") SessionVariables record, @Param("example") SessionVariablesExample example);

    int updateByExample(@Param("record") SessionVariables record, @Param("example") SessionVariablesExample example);

    int updateByPrimaryKeySelective(SessionVariables record);

    int updateByPrimaryKey(SessionVariables record);
}