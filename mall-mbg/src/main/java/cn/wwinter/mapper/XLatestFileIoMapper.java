package cn.wwinter.mapper;

import cn.wwinter.model.XLatestFileIo;
import cn.wwinter.model.XLatestFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XLatestFileIoMapper {
    int countByExample(XLatestFileIoExample example);

    int deleteByExample(XLatestFileIoExample example);

    int insert(XLatestFileIo record);

    int insertSelective(XLatestFileIo record);

    List<XLatestFileIo> selectByExample(XLatestFileIoExample example);

    int updateByExampleSelective(@Param("record") XLatestFileIo record, @Param("example") XLatestFileIoExample example);

    int updateByExample(@Param("record") XLatestFileIo record, @Param("example") XLatestFileIoExample example);
}