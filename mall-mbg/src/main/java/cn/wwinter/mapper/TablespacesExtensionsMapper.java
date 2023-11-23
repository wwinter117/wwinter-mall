package cn.wwinter.mapper;

import cn.wwinter.model.TablespacesExtensions;
import cn.wwinter.model.TablespacesExtensionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablespacesExtensionsMapper {
    int countByExample(TablespacesExtensionsExample example);

    int deleteByExample(TablespacesExtensionsExample example);

    int insert(TablespacesExtensions record);

    int insertSelective(TablespacesExtensions record);

    List<TablespacesExtensions> selectByExampleWithBLOBs(TablespacesExtensionsExample example);

    List<TablespacesExtensions> selectByExample(TablespacesExtensionsExample example);

    int updateByExampleSelective(@Param("record") TablespacesExtensions record, @Param("example") TablespacesExtensionsExample example);

    int updateByExampleWithBLOBs(@Param("record") TablespacesExtensions record, @Param("example") TablespacesExtensionsExample example);

    int updateByExample(@Param("record") TablespacesExtensions record, @Param("example") TablespacesExtensionsExample example);
}