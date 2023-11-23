package cn.wwinter.mapper;

import cn.wwinter.model.SetupThreads;
import cn.wwinter.model.SetupThreadsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupThreadsMapper {
    int countByExample(SetupThreadsExample example);

    int deleteByExample(SetupThreadsExample example);

    int deleteByPrimaryKey(String name);

    int insert(SetupThreads record);

    int insertSelective(SetupThreads record);

    List<SetupThreads> selectByExampleWithBLOBs(SetupThreadsExample example);

    List<SetupThreads> selectByExample(SetupThreadsExample example);

    SetupThreads selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") SetupThreads record, @Param("example") SetupThreadsExample example);

    int updateByExampleWithBLOBs(@Param("record") SetupThreads record, @Param("example") SetupThreadsExample example);

    int updateByExample(@Param("record") SetupThreads record, @Param("example") SetupThreadsExample example);

    int updateByPrimaryKeySelective(SetupThreads record);

    int updateByPrimaryKeyWithBLOBs(SetupThreads record);

    int updateByPrimaryKey(SetupThreads record);
}