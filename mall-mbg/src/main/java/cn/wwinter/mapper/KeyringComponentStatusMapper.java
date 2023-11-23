package cn.wwinter.mapper;

import cn.wwinter.model.KeyringComponentStatus;
import cn.wwinter.model.KeyringComponentStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeyringComponentStatusMapper {
    int countByExample(KeyringComponentStatusExample example);

    int deleteByExample(KeyringComponentStatusExample example);

    int insert(KeyringComponentStatus record);

    int insertSelective(KeyringComponentStatus record);

    List<KeyringComponentStatus> selectByExample(KeyringComponentStatusExample example);

    int updateByExampleSelective(@Param("record") KeyringComponentStatus record, @Param("example") KeyringComponentStatusExample example);

    int updateByExample(@Param("record") KeyringComponentStatus record, @Param("example") KeyringComponentStatusExample example);
}