package cn.wwinter.mapper;

import cn.wwinter.model.XHostSummaryByStatementType;
import cn.wwinter.model.XHostSummaryByStatementTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XHostSummaryByStatementTypeMapper {
    int countByExample(XHostSummaryByStatementTypeExample example);

    int deleteByExample(XHostSummaryByStatementTypeExample example);

    int insert(XHostSummaryByStatementType record);

    int insertSelective(XHostSummaryByStatementType record);

    List<XHostSummaryByStatementType> selectByExample(XHostSummaryByStatementTypeExample example);

    int updateByExampleSelective(@Param("record") XHostSummaryByStatementType record, @Param("example") XHostSummaryByStatementTypeExample example);

    int updateByExample(@Param("record") XHostSummaryByStatementType record, @Param("example") XHostSummaryByStatementTypeExample example);
}