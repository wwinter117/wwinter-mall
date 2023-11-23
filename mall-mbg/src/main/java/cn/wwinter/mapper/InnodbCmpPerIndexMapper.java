package cn.wwinter.mapper;

import cn.wwinter.model.InnodbCmpPerIndex;
import cn.wwinter.model.InnodbCmpPerIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpPerIndexMapper {
    int countByExample(InnodbCmpPerIndexExample example);

    int deleteByExample(InnodbCmpPerIndexExample example);

    int insert(InnodbCmpPerIndex record);

    int insertSelective(InnodbCmpPerIndex record);

    List<InnodbCmpPerIndex> selectByExample(InnodbCmpPerIndexExample example);

    int updateByExampleSelective(@Param("record") InnodbCmpPerIndex record, @Param("example") InnodbCmpPerIndexExample example);

    int updateByExample(@Param("record") InnodbCmpPerIndex record, @Param("example") InnodbCmpPerIndexExample example);
}