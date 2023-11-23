package cn.wwinter.mapper;

import cn.wwinter.model.TableConstraintsExtensions;
import cn.wwinter.model.TableConstraintsExtensionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableConstraintsExtensionsMapper {
    int countByExample(TableConstraintsExtensionsExample example);

    int deleteByExample(TableConstraintsExtensionsExample example);

    int insert(TableConstraintsExtensions record);

    int insertSelective(TableConstraintsExtensions record);

    List<TableConstraintsExtensions> selectByExampleWithBLOBs(TableConstraintsExtensionsExample example);

    List<TableConstraintsExtensions> selectByExample(TableConstraintsExtensionsExample example);

    int updateByExampleSelective(@Param("record") TableConstraintsExtensions record, @Param("example") TableConstraintsExtensionsExample example);

    int updateByExampleWithBLOBs(@Param("record") TableConstraintsExtensions record, @Param("example") TableConstraintsExtensionsExample example);

    int updateByExample(@Param("record") TableConstraintsExtensions record, @Param("example") TableConstraintsExtensionsExample example);
}