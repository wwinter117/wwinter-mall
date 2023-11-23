package cn.wwinter.mapper;

import cn.wwinter.model.UserDefinedFunctions;
import cn.wwinter.model.UserDefinedFunctionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDefinedFunctionsMapper {
    int countByExample(UserDefinedFunctionsExample example);

    int deleteByExample(UserDefinedFunctionsExample example);

    int deleteByPrimaryKey(String udfName);

    int insert(UserDefinedFunctions record);

    int insertSelective(UserDefinedFunctions record);

    List<UserDefinedFunctions> selectByExample(UserDefinedFunctionsExample example);

    UserDefinedFunctions selectByPrimaryKey(String udfName);

    int updateByExampleSelective(@Param("record") UserDefinedFunctions record, @Param("example") UserDefinedFunctionsExample example);

    int updateByExample(@Param("record") UserDefinedFunctions record, @Param("example") UserDefinedFunctionsExample example);

    int updateByPrimaryKeySelective(UserDefinedFunctions record);

    int updateByPrimaryKey(UserDefinedFunctions record);
}