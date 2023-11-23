package cn.wwinter.mapper;

import cn.wwinter.model.InnodbRedoLogFiles;
import cn.wwinter.model.InnodbRedoLogFilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbRedoLogFilesMapper {
    int countByExample(InnodbRedoLogFilesExample example);

    int deleteByExample(InnodbRedoLogFilesExample example);

    int insert(InnodbRedoLogFiles record);

    int insertSelective(InnodbRedoLogFiles record);

    List<InnodbRedoLogFiles> selectByExample(InnodbRedoLogFilesExample example);

    int updateByExampleSelective(@Param("record") InnodbRedoLogFiles record, @Param("example") InnodbRedoLogFilesExample example);

    int updateByExample(@Param("record") InnodbRedoLogFiles record, @Param("example") InnodbRedoLogFilesExample example);
}