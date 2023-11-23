package cn.wwinter.mapper;

import cn.wwinter.model.XStatementsWithSorting;
import cn.wwinter.model.XStatementsWithSortingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XStatementsWithSortingMapper {
    int countByExample(XStatementsWithSortingExample example);

    int deleteByExample(XStatementsWithSortingExample example);

    int insert(XStatementsWithSorting record);

    int insertSelective(XStatementsWithSorting record);

    List<XStatementsWithSorting> selectByExampleWithBLOBs(XStatementsWithSortingExample example);

    List<XStatementsWithSorting> selectByExample(XStatementsWithSortingExample example);

    int updateByExampleSelective(@Param("record") XStatementsWithSorting record, @Param("example") XStatementsWithSortingExample example);

    int updateByExampleWithBLOBs(@Param("record") XStatementsWithSorting record, @Param("example") XStatementsWithSortingExample example);

    int updateByExample(@Param("record") XStatementsWithSorting record, @Param("example") XStatementsWithSortingExample example);
}