package cn.wwinter.mapper;

import cn.wwinter.model.ViewTableUsage;
import cn.wwinter.model.ViewTableUsageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewTableUsageMapper {
    int countByExample(ViewTableUsageExample example);

    int deleteByExample(ViewTableUsageExample example);

    int insert(ViewTableUsage record);

    int insertSelective(ViewTableUsage record);

    List<ViewTableUsage> selectByExample(ViewTableUsageExample example);

    int updateByExampleSelective(@Param("record") ViewTableUsage record, @Param("example") ViewTableUsageExample example);

    int updateByExample(@Param("record") ViewTableUsage record, @Param("example") ViewTableUsageExample example);
}