package cn.wwinter.mapper;

import cn.wwinter.model.ProcsPriv;
import cn.wwinter.model.ProcsPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcsPrivMapper {
    int countByExample(ProcsPrivExample example);

    int deleteByExample(ProcsPrivExample example);

    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("db") String db, @Param("routineName") String routineName, @Param("routineType") String routineType);

    int insert(ProcsPriv record);

    int insertSelective(ProcsPriv record);

    List<ProcsPriv> selectByExample(ProcsPrivExample example);

    ProcsPriv selectByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("db") String db, @Param("routineName") String routineName, @Param("routineType") String routineType);

    int updateByExampleSelective(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);

    int updateByExample(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);

    int updateByPrimaryKeySelective(ProcsPriv record);

    int updateByPrimaryKey(ProcsPriv record);
}