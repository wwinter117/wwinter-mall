package cn.wwinter.mapper;

import cn.wwinter.model.InnodbMetrics;
import cn.wwinter.model.InnodbMetricsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbMetricsMapper {
    int countByExample(InnodbMetricsExample example);

    int deleteByExample(InnodbMetricsExample example);

    int insert(InnodbMetrics record);

    int insertSelective(InnodbMetrics record);

    List<InnodbMetrics> selectByExample(InnodbMetricsExample example);

    int updateByExampleSelective(@Param("record") InnodbMetrics record, @Param("example") InnodbMetricsExample example);

    int updateByExample(@Param("record") InnodbMetrics record, @Param("example") InnodbMetricsExample example);
}