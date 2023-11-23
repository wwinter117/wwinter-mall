package cn.wwinter.mapper;

import cn.wwinter.model.FileSummaryByInstance;
import cn.wwinter.model.FileSummaryByInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileSummaryByInstanceMapper {
    int countByExample(FileSummaryByInstanceExample example);

    int deleteByExample(FileSummaryByInstanceExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(FileSummaryByInstance record);

    int insertSelective(FileSummaryByInstance record);

    List<FileSummaryByInstance> selectByExample(FileSummaryByInstanceExample example);

    FileSummaryByInstance selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") FileSummaryByInstance record, @Param("example") FileSummaryByInstanceExample example);

    int updateByExample(@Param("record") FileSummaryByInstance record, @Param("example") FileSummaryByInstanceExample example);

    int updateByPrimaryKeySelective(FileSummaryByInstance record);

    int updateByPrimaryKey(FileSummaryByInstance record);
}