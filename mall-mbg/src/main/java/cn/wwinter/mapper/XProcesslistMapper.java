package cn.wwinter.mapper;

import cn.wwinter.model.XProcesslist;
import cn.wwinter.model.XProcesslistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XProcesslistMapper {
    int countByExample(XProcesslistExample example);

    int deleteByExample(XProcesslistExample example);

    int insert(XProcesslist record);

    int insertSelective(XProcesslist record);

    List<XProcesslist> selectByExampleWithBLOBs(XProcesslistExample example);

    List<XProcesslist> selectByExample(XProcesslistExample example);

    int updateByExampleSelective(@Param("record") XProcesslist record, @Param("example") XProcesslistExample example);

    int updateByExampleWithBLOBs(@Param("record") XProcesslist record, @Param("example") XProcesslistExample example);

    int updateByExample(@Param("record") XProcesslist record, @Param("example") XProcesslistExample example);
}