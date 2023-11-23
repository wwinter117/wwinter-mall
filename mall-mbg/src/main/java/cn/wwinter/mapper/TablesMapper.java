package cn.wwinter.mapper;

import cn.wwinter.model.Tables;
import cn.wwinter.model.TablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablesMapper {
    int countByExample(TablesExample example);

    int deleteByExample(TablesExample example);

    int insert(Tables record);

    int insertSelective(Tables record);

    List<Tables> selectByExampleWithBLOBs(TablesExample example);

    List<Tables> selectByExample(TablesExample example);

    int updateByExampleSelective(@Param("record") Tables record, @Param("example") TablesExample example);

    int updateByExampleWithBLOBs(@Param("record") Tables record, @Param("example") TablesExample example);

    int updateByExample(@Param("record") Tables record, @Param("example") TablesExample example);
}