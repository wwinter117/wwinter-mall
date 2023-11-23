package cn.wwinter.mapper;

import cn.wwinter.model.LatestFileIo;
import cn.wwinter.model.LatestFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LatestFileIoMapper {
    int countByExample(LatestFileIoExample example);

    int deleteByExample(LatestFileIoExample example);

    int insert(LatestFileIo record);

    int insertSelective(LatestFileIo record);

    List<LatestFileIo> selectByExample(LatestFileIoExample example);

    int updateByExampleSelective(@Param("record") LatestFileIo record, @Param("example") LatestFileIoExample example);

    int updateByExample(@Param("record") LatestFileIo record, @Param("example") LatestFileIoExample example);
}