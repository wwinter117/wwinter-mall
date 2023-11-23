package cn.wwinter.mapper;

import cn.wwinter.model.PasswordHistory;
import cn.wwinter.model.PasswordHistoryExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PasswordHistoryMapper {
    int countByExample(PasswordHistoryExample example);

    int deleteByExample(PasswordHistoryExample example);

    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("passwordTimestamp") Date passwordTimestamp);

    int insert(PasswordHistory record);

    int insertSelective(PasswordHistory record);

    List<PasswordHistory> selectByExampleWithBLOBs(PasswordHistoryExample example);

    List<PasswordHistory> selectByExample(PasswordHistoryExample example);

    PasswordHistory selectByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("passwordTimestamp") Date passwordTimestamp);

    int updateByExampleSelective(@Param("record") PasswordHistory record, @Param("example") PasswordHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") PasswordHistory record, @Param("example") PasswordHistoryExample example);

    int updateByExample(@Param("record") PasswordHistory record, @Param("example") PasswordHistoryExample example);

    int updateByPrimaryKeySelective(PasswordHistory record);

    int updateByPrimaryKeyWithBLOBs(PasswordHistory record);
}