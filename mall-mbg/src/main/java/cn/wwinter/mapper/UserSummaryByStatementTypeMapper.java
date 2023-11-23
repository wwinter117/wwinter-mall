package cn.wwinter.mapper;

import cn.wwinter.model.UserSummaryByStatementType;
import cn.wwinter.model.UserSummaryByStatementTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByStatementTypeMapper {
    int countByExample(UserSummaryByStatementTypeExample example);

    int deleteByExample(UserSummaryByStatementTypeExample example);

    int insert(UserSummaryByStatementType record);

    int insertSelective(UserSummaryByStatementType record);

    List<UserSummaryByStatementType> selectByExample(UserSummaryByStatementTypeExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByStatementType record, @Param("example") UserSummaryByStatementTypeExample example);

    int updateByExample(@Param("record") UserSummaryByStatementType record, @Param("example") UserSummaryByStatementTypeExample example);
}