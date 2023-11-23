package cn.wwinter.mapper;

import cn.wwinter.model.StUnitsOfMeasure;
import cn.wwinter.model.StUnitsOfMeasureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StUnitsOfMeasureMapper {
    int countByExample(StUnitsOfMeasureExample example);

    int deleteByExample(StUnitsOfMeasureExample example);

    int insert(StUnitsOfMeasure record);

    int insertSelective(StUnitsOfMeasure record);

    List<StUnitsOfMeasure> selectByExample(StUnitsOfMeasureExample example);

    int updateByExampleSelective(@Param("record") StUnitsOfMeasure record, @Param("example") StUnitsOfMeasureExample example);

    int updateByExample(@Param("record") StUnitsOfMeasure record, @Param("example") StUnitsOfMeasureExample example);
}