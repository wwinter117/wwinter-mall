package cn.wwinter.mapper;

import cn.wwinter.model.XSession;
import cn.wwinter.model.XSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSessionMapper {
    int countByExample(XSessionExample example);

    int deleteByExample(XSessionExample example);

    int insert(XSession record);

    int insertSelective(XSession record);

    List<XSession> selectByExampleWithBLOBs(XSessionExample example);

    List<XSession> selectByExample(XSessionExample example);

    int updateByExampleSelective(@Param("record") XSession record, @Param("example") XSessionExample example);

    int updateByExampleWithBLOBs(@Param("record") XSession record, @Param("example") XSessionExample example);

    int updateByExample(@Param("record") XSession record, @Param("example") XSessionExample example);
}