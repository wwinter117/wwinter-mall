package cn.wwinter.mapper;

import cn.wwinter.model.InnodbTables;
import cn.wwinter.model.InnodbTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTablesMapper {
    int countByExample(InnodbTablesExample example);

    int deleteByExample(InnodbTablesExample example);

    int insert(InnodbTables record);

    int insertSelective(InnodbTables record);

    List<InnodbTables> selectByExample(InnodbTablesExample example);

    int updateByExampleSelective(@Param("record") InnodbTables record, @Param("example") InnodbTablesExample example);

    int updateByExample(@Param("record") InnodbTables record, @Param("example") InnodbTablesExample example);
}