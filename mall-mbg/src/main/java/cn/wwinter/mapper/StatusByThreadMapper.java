package cn.wwinter.mapper;

import cn.wwinter.model.StatusByThread;
import cn.wwinter.model.StatusByThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusByThreadMapper {
    int countByExample(StatusByThreadExample example);

    int deleteByExample(StatusByThreadExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("variableName") String variableName);

    int insert(StatusByThread record);

    int insertSelective(StatusByThread record);

    List<StatusByThread> selectByExample(StatusByThreadExample example);

    StatusByThread selectByPrimaryKey(@Param("threadId") Long threadId, @Param("variableName") String variableName);

    int updateByExampleSelective(@Param("record") StatusByThread record, @Param("example") StatusByThreadExample example);

    int updateByExample(@Param("record") StatusByThread record, @Param("example") StatusByThreadExample example);

    int updateByPrimaryKeySelective(StatusByThread record);

    int updateByPrimaryKey(StatusByThread record);
}