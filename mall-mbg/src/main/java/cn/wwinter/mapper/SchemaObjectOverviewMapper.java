package cn.wwinter.mapper;

import cn.wwinter.model.SchemaObjectOverview;
import cn.wwinter.model.SchemaObjectOverviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaObjectOverviewMapper {
    int countByExample(SchemaObjectOverviewExample example);

    int deleteByExample(SchemaObjectOverviewExample example);

    int insert(SchemaObjectOverview record);

    int insertSelective(SchemaObjectOverview record);

    List<SchemaObjectOverview> selectByExample(SchemaObjectOverviewExample example);

    int updateByExampleSelective(@Param("record") SchemaObjectOverview record, @Param("example") SchemaObjectOverviewExample example);

    int updateByExample(@Param("record") SchemaObjectOverview record, @Param("example") SchemaObjectOverviewExample example);
}