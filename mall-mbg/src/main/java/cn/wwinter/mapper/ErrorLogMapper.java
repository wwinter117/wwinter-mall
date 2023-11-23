package cn.wwinter.mapper;

import cn.wwinter.model.ErrorLog;
import cn.wwinter.model.ErrorLogExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErrorLogMapper {
    int countByExample(ErrorLogExample example);

    int deleteByExample(ErrorLogExample example);

    int deleteByPrimaryKey(Date logged);

    int insert(ErrorLog record);

    int insertSelective(ErrorLog record);

    List<ErrorLog> selectByExampleWithBLOBs(ErrorLogExample example);

    List<ErrorLog> selectByExample(ErrorLogExample example);

    ErrorLog selectByPrimaryKey(Date logged);

    int updateByExampleSelective(@Param("record") ErrorLog record, @Param("example") ErrorLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ErrorLog record, @Param("example") ErrorLogExample example);

    int updateByExample(@Param("record") ErrorLog record, @Param("example") ErrorLogExample example);

    int updateByPrimaryKeySelective(ErrorLog record);

    int updateByPrimaryKeyWithBLOBs(ErrorLog record);

    int updateByPrimaryKey(ErrorLog record);
}