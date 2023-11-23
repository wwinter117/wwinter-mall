package cn.wwinter.mapper;

import cn.wwinter.model.VariablesByThread;
import cn.wwinter.model.VariablesByThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VariablesByThreadMapper {
    int countByExample(VariablesByThreadExample example);

    int deleteByExample(VariablesByThreadExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("variableName") String variableName);

    int insert(VariablesByThread record);

    int insertSelective(VariablesByThread record);

    List<VariablesByThread> selectByExample(VariablesByThreadExample example);

    VariablesByThread selectByPrimaryKey(@Param("threadId") Long threadId, @Param("variableName") String variableName);

    int updateByExampleSelective(@Param("record") VariablesByThread record, @Param("example") VariablesByThreadExample example);

    int updateByExample(@Param("record") VariablesByThread record, @Param("example") VariablesByThreadExample example);

    int updateByPrimaryKeySelective(VariablesByThread record);

    int updateByPrimaryKey(VariablesByThread record);
}