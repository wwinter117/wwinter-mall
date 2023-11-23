package cn.wwinter.mapper;

import cn.wwinter.model.StatusByUser;
import cn.wwinter.model.StatusByUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusByUserMapper {
    int countByExample(StatusByUserExample example);

    int deleteByExample(StatusByUserExample example);

    int insert(StatusByUser record);

    int insertSelective(StatusByUser record);

    List<StatusByUser> selectByExample(StatusByUserExample example);

    int updateByExampleSelective(@Param("record") StatusByUser record, @Param("example") StatusByUserExample example);

    int updateByExample(@Param("record") StatusByUser record, @Param("example") StatusByUserExample example);
}