package cn.wwinter.mapper;

import cn.wwinter.model.BinaryLogTransactionCompressionStats;
import cn.wwinter.model.BinaryLogTransactionCompressionStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BinaryLogTransactionCompressionStatsMapper {
    int countByExample(BinaryLogTransactionCompressionStatsExample example);

    int deleteByExample(BinaryLogTransactionCompressionStatsExample example);

    int insert(BinaryLogTransactionCompressionStats record);

    int insertSelective(BinaryLogTransactionCompressionStats record);

    List<BinaryLogTransactionCompressionStats> selectByExampleWithBLOBs(BinaryLogTransactionCompressionStatsExample example);

    List<BinaryLogTransactionCompressionStats> selectByExample(BinaryLogTransactionCompressionStatsExample example);

    int updateByExampleSelective(@Param("record") BinaryLogTransactionCompressionStats record, @Param("example") BinaryLogTransactionCompressionStatsExample example);

    int updateByExampleWithBLOBs(@Param("record") BinaryLogTransactionCompressionStats record, @Param("example") BinaryLogTransactionCompressionStatsExample example);

    int updateByExample(@Param("record") BinaryLogTransactionCompressionStats record, @Param("example") BinaryLogTransactionCompressionStatsExample example);
}