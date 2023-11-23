package cn.wwinter.mapper;

import cn.wwinter.model.InnodbCmpmem;
import cn.wwinter.model.InnodbCmpmemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbCmpmemMapper {
    int countByExample(InnodbCmpmemExample example);

    int deleteByExample(InnodbCmpmemExample example);

    int insert(InnodbCmpmem record);

    int insertSelective(InnodbCmpmem record);

    List<InnodbCmpmem> selectByExample(InnodbCmpmemExample example);

    int updateByExampleSelective(@Param("record") InnodbCmpmem record, @Param("example") InnodbCmpmemExample example);

    int updateByExample(@Param("record") InnodbCmpmem record, @Param("example") InnodbCmpmemExample example);
}