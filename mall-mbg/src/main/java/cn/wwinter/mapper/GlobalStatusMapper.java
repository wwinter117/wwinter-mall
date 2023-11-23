package cn.wwinter.mapper;

import cn.wwinter.model.GlobalStatus;
import cn.wwinter.model.GlobalStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GlobalStatusMapper {
    int countByExample(GlobalStatusExample example);

    int deleteByExample(GlobalStatusExample example);

    int deleteByPrimaryKey(String variableName);

    int insert(GlobalStatus record);

    int insertSelective(GlobalStatus record);

    List<GlobalStatus> selectByExample(GlobalStatusExample example);

    GlobalStatus selectByPrimaryKey(String variableName);

    int updateByExampleSelective(@Param("record") GlobalStatus record, @Param("example") GlobalStatusExample example);

    int updateByExample(@Param("record") GlobalStatus record, @Param("example") GlobalStatusExample example);

    int updateByPrimaryKeySelective(GlobalStatus record);

    int updateByPrimaryKey(GlobalStatus record);
}