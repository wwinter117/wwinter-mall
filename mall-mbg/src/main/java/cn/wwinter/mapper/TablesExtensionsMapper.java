package cn.wwinter.mapper;

import cn.wwinter.model.TablesExtensions;
import cn.wwinter.model.TablesExtensionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablesExtensionsMapper {
    int countByExample(TablesExtensionsExample example);

    int deleteByExample(TablesExtensionsExample example);

    int insert(TablesExtensions record);

    int insertSelective(TablesExtensions record);

    List<TablesExtensions> selectByExampleWithBLOBs(TablesExtensionsExample example);

    List<TablesExtensions> selectByExample(TablesExtensionsExample example);

    int updateByExampleSelective(@Param("record") TablesExtensions record, @Param("example") TablesExtensionsExample example);

    int updateByExampleWithBLOBs(@Param("record") TablesExtensions record, @Param("example") TablesExtensionsExample example);

    int updateByExample(@Param("record") TablesExtensions record, @Param("example") TablesExtensionsExample example);
}