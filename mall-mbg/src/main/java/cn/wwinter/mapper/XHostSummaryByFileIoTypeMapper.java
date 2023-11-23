package cn.wwinter.mapper;

import cn.wwinter.model.XHostSummaryByFileIoType;
import cn.wwinter.model.XHostSummaryByFileIoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XHostSummaryByFileIoTypeMapper {
    int countByExample(XHostSummaryByFileIoTypeExample example);

    int deleteByExample(XHostSummaryByFileIoTypeExample example);

    int insert(XHostSummaryByFileIoType record);

    int insertSelective(XHostSummaryByFileIoType record);

    List<XHostSummaryByFileIoType> selectByExample(XHostSummaryByFileIoTypeExample example);

    int updateByExampleSelective(@Param("record") XHostSummaryByFileIoType record, @Param("example") XHostSummaryByFileIoTypeExample example);

    int updateByExample(@Param("record") XHostSummaryByFileIoType record, @Param("example") XHostSummaryByFileIoTypeExample example);
}