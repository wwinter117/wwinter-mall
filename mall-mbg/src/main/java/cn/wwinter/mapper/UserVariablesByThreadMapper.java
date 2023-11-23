package cn.wwinter.mapper;

import cn.wwinter.model.UserVariablesByThread;
import cn.wwinter.model.UserVariablesByThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserVariablesByThreadMapper {
    int countByExample(UserVariablesByThreadExample example);

    int deleteByExample(UserVariablesByThreadExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("variableName") String variableName);

    int insert(UserVariablesByThread record);

    int insertSelective(UserVariablesByThread record);

    List<UserVariablesByThread> selectByExampleWithBLOBs(UserVariablesByThreadExample example);

    List<UserVariablesByThread> selectByExample(UserVariablesByThreadExample example);

    UserVariablesByThread selectByPrimaryKey(@Param("threadId") Long threadId, @Param("variableName") String variableName);

    int updateByExampleSelective(@Param("record") UserVariablesByThread record, @Param("example") UserVariablesByThreadExample example);

    int updateByExampleWithBLOBs(@Param("record") UserVariablesByThread record, @Param("example") UserVariablesByThreadExample example);

    int updateByExample(@Param("record") UserVariablesByThread record, @Param("example") UserVariablesByThreadExample example);

    int updateByPrimaryKeySelective(UserVariablesByThread record);

    int updateByPrimaryKeyWithBLOBs(UserVariablesByThread record);
}