package cn.wwinter.mapper;

import cn.wwinter.model.DataLocks;
import cn.wwinter.model.DataLocksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataLocksMapper {
    int countByExample(DataLocksExample example);

    int deleteByExample(DataLocksExample example);

    int deleteByPrimaryKey(@Param("engineLockId") String engineLockId, @Param("engine") String engine);

    int insert(DataLocks record);

    int insertSelective(DataLocks record);

    List<DataLocks> selectByExample(DataLocksExample example);

    DataLocks selectByPrimaryKey(@Param("engineLockId") String engineLockId, @Param("engine") String engine);

    int updateByExampleSelective(@Param("record") DataLocks record, @Param("example") DataLocksExample example);

    int updateByExample(@Param("record") DataLocks record, @Param("example") DataLocksExample example);

    int updateByPrimaryKeySelective(DataLocks record);

    int updateByPrimaryKey(DataLocks record);
}