package cn.wwinter.mapper;

import cn.wwinter.model.Processlist;
import cn.wwinter.model.ProcesslistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcesslistMapper {
    int countByExample(ProcesslistExample example);

    int deleteByExample(ProcesslistExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Processlist record);

    int insertSelective(Processlist record);

    List<Processlist> selectByExampleWithBLOBs(ProcesslistExample example);

    List<Processlist> selectByExample(ProcesslistExample example);

    Processlist selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Processlist record, @Param("example") ProcesslistExample example);

    int updateByExampleWithBLOBs(@Param("record") Processlist record, @Param("example") ProcesslistExample example);

    int updateByExample(@Param("record") Processlist record, @Param("example") ProcesslistExample example);

    int updateByPrimaryKeySelective(Processlist record);

    int updateByPrimaryKeyWithBLOBs(Processlist record);

    int updateByPrimaryKey(Processlist record);
}