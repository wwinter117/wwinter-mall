package cn.wwinter.mapper;

import cn.wwinter.model.Db;
import cn.wwinter.model.DbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbMapper {
    int countByExample(DbExample example);

    int deleteByExample(DbExample example);

    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("db") String db);

    int insert(Db record);

    int insertSelective(Db record);

    List<Db> selectByExample(DbExample example);

    Db selectByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("db") String db);

    int updateByExampleSelective(@Param("record") Db record, @Param("example") DbExample example);

    int updateByExample(@Param("record") Db record, @Param("example") DbExample example);

    int updateByPrimaryKeySelective(Db record);

    int updateByPrimaryKey(Db record);
}