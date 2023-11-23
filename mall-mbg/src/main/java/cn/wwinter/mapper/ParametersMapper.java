package cn.wwinter.mapper;

import cn.wwinter.model.Parameters;
import cn.wwinter.model.ParametersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParametersMapper {
    int countByExample(ParametersExample example);

    int deleteByExample(ParametersExample example);

    int insert(Parameters record);

    int insertSelective(Parameters record);

    List<Parameters> selectByExampleWithBLOBs(ParametersExample example);

    List<Parameters> selectByExample(ParametersExample example);

    int updateByExampleSelective(@Param("record") Parameters record, @Param("example") ParametersExample example);

    int updateByExampleWithBLOBs(@Param("record") Parameters record, @Param("example") ParametersExample example);

    int updateByExample(@Param("record") Parameters record, @Param("example") ParametersExample example);
}