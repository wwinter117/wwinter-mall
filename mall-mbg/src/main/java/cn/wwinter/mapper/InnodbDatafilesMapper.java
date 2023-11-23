package cn.wwinter.mapper;

import cn.wwinter.model.InnodbDatafiles;
import cn.wwinter.model.InnodbDatafilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbDatafilesMapper {
    int countByExample(InnodbDatafilesExample example);

    int deleteByExample(InnodbDatafilesExample example);

    int insert(InnodbDatafiles record);

    int insertSelective(InnodbDatafiles record);

    List<InnodbDatafiles> selectByExampleWithBLOBs(InnodbDatafilesExample example);

    List<InnodbDatafiles> selectByExample(InnodbDatafilesExample example);

    int updateByExampleSelective(@Param("record") InnodbDatafiles record, @Param("example") InnodbDatafilesExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbDatafiles record, @Param("example") InnodbDatafilesExample example);

    int updateByExample(@Param("record") InnodbDatafiles record, @Param("example") InnodbDatafilesExample example);
}