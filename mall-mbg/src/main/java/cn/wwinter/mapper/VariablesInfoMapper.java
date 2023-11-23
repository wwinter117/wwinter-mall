package cn.wwinter.mapper;

import cn.wwinter.model.VariablesInfo;
import cn.wwinter.model.VariablesInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VariablesInfoMapper {
    int countByExample(VariablesInfoExample example);

    int deleteByExample(VariablesInfoExample example);

    int insert(VariablesInfo record);

    int insertSelective(VariablesInfo record);

    List<VariablesInfo> selectByExample(VariablesInfoExample example);

    int updateByExampleSelective(@Param("record") VariablesInfo record, @Param("example") VariablesInfoExample example);

    int updateByExample(@Param("record") VariablesInfo record, @Param("example") VariablesInfoExample example);
}