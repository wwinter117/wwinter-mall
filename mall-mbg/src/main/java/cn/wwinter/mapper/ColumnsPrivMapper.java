package cn.wwinter.mapper;

import cn.wwinter.model.ColumnsPriv;
import cn.wwinter.model.ColumnsPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnsPrivMapper {
    int countByExample(ColumnsPrivExample example);

    int deleteByExample(ColumnsPrivExample example);

    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("db") String db, @Param("tableName") String tableName, @Param("columnName") String columnName);

    int insert(ColumnsPriv record);

    int insertSelective(ColumnsPriv record);

    List<ColumnsPriv> selectByExample(ColumnsPrivExample example);

    ColumnsPriv selectByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("db") String db, @Param("tableName") String tableName, @Param("columnName") String columnName);

    int updateByExampleSelective(@Param("record") ColumnsPriv record, @Param("example") ColumnsPrivExample example);

    int updateByExample(@Param("record") ColumnsPriv record, @Param("example") ColumnsPrivExample example);

    int updateByPrimaryKeySelective(ColumnsPriv record);

    int updateByPrimaryKey(ColumnsPriv record);
}