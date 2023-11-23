package cn.wwinter.mapper;

import cn.wwinter.model.SchemataExtensions;
import cn.wwinter.model.SchemataExtensionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemataExtensionsMapper {
    int countByExample(SchemataExtensionsExample example);

    int deleteByExample(SchemataExtensionsExample example);

    int insert(SchemataExtensions record);

    int insertSelective(SchemataExtensions record);

    List<SchemataExtensions> selectByExample(SchemataExtensionsExample example);

    int updateByExampleSelective(@Param("record") SchemataExtensions record, @Param("example") SchemataExtensionsExample example);

    int updateByExample(@Param("record") SchemataExtensions record, @Param("example") SchemataExtensionsExample example);
}