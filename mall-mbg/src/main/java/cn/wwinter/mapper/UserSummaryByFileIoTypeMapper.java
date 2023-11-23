package cn.wwinter.mapper;

import cn.wwinter.model.UserSummaryByFileIoType;
import cn.wwinter.model.UserSummaryByFileIoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByFileIoTypeMapper {
    int countByExample(UserSummaryByFileIoTypeExample example);

    int deleteByExample(UserSummaryByFileIoTypeExample example);

    int insert(UserSummaryByFileIoType record);

    int insertSelective(UserSummaryByFileIoType record);

    List<UserSummaryByFileIoType> selectByExample(UserSummaryByFileIoTypeExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByFileIoType record, @Param("example") UserSummaryByFileIoTypeExample example);

    int updateByExample(@Param("record") UserSummaryByFileIoType record, @Param("example") UserSummaryByFileIoTypeExample example);
}