package cn.wwinter.mapper;

import cn.wwinter.model.Threads;
import cn.wwinter.model.ThreadsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThreadsMapper {
    int countByExample(ThreadsExample example);

    int deleteByExample(ThreadsExample example);

    int deleteByPrimaryKey(Long threadId);

    int insert(Threads record);

    int insertSelective(Threads record);

    List<Threads> selectByExampleWithBLOBs(ThreadsExample example);

    List<Threads> selectByExample(ThreadsExample example);

    Threads selectByPrimaryKey(Long threadId);

    int updateByExampleSelective(@Param("record") Threads record, @Param("example") ThreadsExample example);

    int updateByExampleWithBLOBs(@Param("record") Threads record, @Param("example") ThreadsExample example);

    int updateByExample(@Param("record") Threads record, @Param("example") ThreadsExample example);

    int updateByPrimaryKeySelective(Threads record);

    int updateByPrimaryKeyWithBLOBs(Threads record);

    int updateByPrimaryKey(Threads record);
}