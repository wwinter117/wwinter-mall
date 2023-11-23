package cn.wwinter.mapper;

import cn.wwinter.model.NdbBinlogIndex;
import cn.wwinter.model.NdbBinlogIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NdbBinlogIndexMapper {
    int countByExample(NdbBinlogIndexExample example);

    int deleteByExample(NdbBinlogIndexExample example);

    int deleteByPrimaryKey(@Param("epoch") Long epoch, @Param("origServerId") Integer origServerId, @Param("origEpoch") Long origEpoch);

    int insert(NdbBinlogIndex record);

    int insertSelective(NdbBinlogIndex record);

    List<NdbBinlogIndex> selectByExample(NdbBinlogIndexExample example);

    NdbBinlogIndex selectByPrimaryKey(@Param("epoch") Long epoch, @Param("origServerId") Integer origServerId, @Param("origEpoch") Long origEpoch);

    int updateByExampleSelective(@Param("record") NdbBinlogIndex record, @Param("example") NdbBinlogIndexExample example);

    int updateByExample(@Param("record") NdbBinlogIndex record, @Param("example") NdbBinlogIndexExample example);

    int updateByPrimaryKeySelective(NdbBinlogIndex record);

    int updateByPrimaryKey(NdbBinlogIndex record);
}