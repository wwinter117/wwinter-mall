package cn.wwinter.mapper;

import cn.wwinter.model.XUserSummaryByFileIo;
import cn.wwinter.model.XUserSummaryByFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryByFileIoMapper {
    int countByExample(XUserSummaryByFileIoExample example);

    int deleteByExample(XUserSummaryByFileIoExample example);

    int insert(XUserSummaryByFileIo record);

    int insertSelective(XUserSummaryByFileIo record);

    List<XUserSummaryByFileIo> selectByExample(XUserSummaryByFileIoExample example);

    int updateByExampleSelective(@Param("record") XUserSummaryByFileIo record, @Param("example") XUserSummaryByFileIoExample example);

    int updateByExample(@Param("record") XUserSummaryByFileIo record, @Param("example") XUserSummaryByFileIoExample example);
}