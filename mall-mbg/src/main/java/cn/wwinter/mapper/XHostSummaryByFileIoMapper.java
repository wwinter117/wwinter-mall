package cn.wwinter.mapper;

import cn.wwinter.model.XHostSummaryByFileIo;
import cn.wwinter.model.XHostSummaryByFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XHostSummaryByFileIoMapper {
    int countByExample(XHostSummaryByFileIoExample example);

    int deleteByExample(XHostSummaryByFileIoExample example);

    int insert(XHostSummaryByFileIo record);

    int insertSelective(XHostSummaryByFileIo record);

    List<XHostSummaryByFileIo> selectByExample(XHostSummaryByFileIoExample example);

    int updateByExampleSelective(@Param("record") XHostSummaryByFileIo record, @Param("example") XHostSummaryByFileIoExample example);

    int updateByExample(@Param("record") XHostSummaryByFileIo record, @Param("example") XHostSummaryByFileIoExample example);
}