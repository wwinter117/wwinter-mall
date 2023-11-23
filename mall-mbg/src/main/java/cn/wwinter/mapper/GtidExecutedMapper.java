package cn.wwinter.mapper;

import cn.wwinter.model.GtidExecuted;
import cn.wwinter.model.GtidExecutedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GtidExecutedMapper {
    int countByExample(GtidExecutedExample example);

    int deleteByExample(GtidExecutedExample example);

    int deleteByPrimaryKey(@Param("sourceUuid") String sourceUuid, @Param("intervalStart") Long intervalStart);

    int insert(GtidExecuted record);

    int insertSelective(GtidExecuted record);

    List<GtidExecuted> selectByExample(GtidExecutedExample example);

    GtidExecuted selectByPrimaryKey(@Param("sourceUuid") String sourceUuid, @Param("intervalStart") Long intervalStart);

    int updateByExampleSelective(@Param("record") GtidExecuted record, @Param("example") GtidExecutedExample example);

    int updateByExample(@Param("record") GtidExecuted record, @Param("example") GtidExecutedExample example);

    int updateByPrimaryKeySelective(GtidExecuted record);

    int updateByPrimaryKey(GtidExecuted record);
}