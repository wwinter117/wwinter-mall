package cn.wwinter.mapper;

import cn.wwinter.model.InnodbCmpPerIndexReset;
import cn.wwinter.model.InnodbCmpPerIndexResetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpPerIndexResetMapper {
    int countByExample(InnodbCmpPerIndexResetExample example);

    int deleteByExample(InnodbCmpPerIndexResetExample example);

    int insert(InnodbCmpPerIndexReset record);

    int insertSelective(InnodbCmpPerIndexReset record);

    List<InnodbCmpPerIndexReset> selectByExample(InnodbCmpPerIndexResetExample example);

    int updateByExampleSelective(@Param("record") InnodbCmpPerIndexReset record, @Param("example") InnodbCmpPerIndexResetExample example);

    int updateByExample(@Param("record") InnodbCmpPerIndexReset record, @Param("example") InnodbCmpPerIndexResetExample example);
}