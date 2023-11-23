package cn.wwinter.mapper;

import cn.wwinter.model.PersistedVariables;
import cn.wwinter.model.PersistedVariablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersistedVariablesMapper {
    int countByExample(PersistedVariablesExample example);

    int deleteByExample(PersistedVariablesExample example);

    int deleteByPrimaryKey(String variableName);

    int insert(PersistedVariables record);

    int insertSelective(PersistedVariables record);

    List<PersistedVariables> selectByExample(PersistedVariablesExample example);

    PersistedVariables selectByPrimaryKey(String variableName);

    int updateByExampleSelective(@Param("record") PersistedVariables record, @Param("example") PersistedVariablesExample example);

    int updateByExample(@Param("record") PersistedVariables record, @Param("example") PersistedVariablesExample example);

    int updateByPrimaryKeySelective(PersistedVariables record);

    int updateByPrimaryKey(PersistedVariables record);
}