package cn.wwinter.mapper;

import cn.wwinter.model.UserAttributes;
import cn.wwinter.model.UserAttributesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAttributesMapper {
    int countByExample(UserAttributesExample example);

    int deleteByExample(UserAttributesExample example);

    int insert(UserAttributes record);

    int insertSelective(UserAttributes record);

    List<UserAttributes> selectByExampleWithBLOBs(UserAttributesExample example);

    List<UserAttributes> selectByExample(UserAttributesExample example);

    int updateByExampleSelective(@Param("record") UserAttributes record, @Param("example") UserAttributesExample example);

    int updateByExampleWithBLOBs(@Param("record") UserAttributes record, @Param("example") UserAttributesExample example);

    int updateByExample(@Param("record") UserAttributes record, @Param("example") UserAttributesExample example);
}