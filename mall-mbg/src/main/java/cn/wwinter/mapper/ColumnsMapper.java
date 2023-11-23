package cn.wwinter.mapper;

import cn.wwinter.model.Columns;
import cn.wwinter.model.ColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnsMapper {
    int countByExample(ColumnsExample example);

    int deleteByExample(ColumnsExample example);

    int insert(Columns record);

    int insertSelective(Columns record);

    List<Columns> selectByExampleWithBLOBs(ColumnsExample example);

    List<Columns> selectByExample(ColumnsExample example);

    int updateByExampleSelective(@Param("record") Columns record, @Param("example") ColumnsExample example);

    int updateByExampleWithBLOBs(@Param("record") Columns record, @Param("example") ColumnsExample example);

    int updateByExample(@Param("record") Columns record, @Param("example") ColumnsExample example);
}