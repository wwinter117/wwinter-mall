package cn.wwinter.mapper;

import cn.wwinter.model.FileSummaryByEventName;
import cn.wwinter.model.FileSummaryByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileSummaryByEventNameMapper {
    int countByExample(FileSummaryByEventNameExample example);

    int deleteByExample(FileSummaryByEventNameExample example);

    int deleteByPrimaryKey(String eventName);

    int insert(FileSummaryByEventName record);

    int insertSelective(FileSummaryByEventName record);

    List<FileSummaryByEventName> selectByExample(FileSummaryByEventNameExample example);

    FileSummaryByEventName selectByPrimaryKey(String eventName);

    int updateByExampleSelective(@Param("record") FileSummaryByEventName record, @Param("example") FileSummaryByEventNameExample example);

    int updateByExample(@Param("record") FileSummaryByEventName record, @Param("example") FileSummaryByEventNameExample example);

    int updateByPrimaryKeySelective(FileSummaryByEventName record);

    int updateByPrimaryKey(FileSummaryByEventName record);
}