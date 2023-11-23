package cn.wwinter.mapper;

import cn.wwinter.model.InnodbTableStats;
import cn.wwinter.model.InnodbTableStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTableStatsMapper {
    int countByExample(InnodbTableStatsExample example);

    int deleteByExample(InnodbTableStatsExample example);

    int deleteByPrimaryKey(@Param("databaseName") String databaseName, @Param("tableName") String tableName);

    int insert(InnodbTableStats record);

    int insertSelective(InnodbTableStats record);

    List<InnodbTableStats> selectByExample(InnodbTableStatsExample example);

    InnodbTableStats selectByPrimaryKey(@Param("databaseName") String databaseName, @Param("tableName") String tableName);

    int updateByExampleSelective(@Param("record") InnodbTableStats record, @Param("example") InnodbTableStatsExample example);

    int updateByExample(@Param("record") InnodbTableStats record, @Param("example") InnodbTableStatsExample example);

    int updateByPrimaryKeySelective(InnodbTableStats record);

    int updateByPrimaryKey(InnodbTableStats record);
}