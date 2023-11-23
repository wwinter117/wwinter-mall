package cn.wwinter.mapper;

import cn.wwinter.model.UmsIntergrationConsumeSetting;
import cn.wwinter.model.UmsIntergrationConsumeSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsIntergrationConsumeSettingMapper {
    int countByExample(UmsIntergrationConsumeSettingExample example);

    int deleteByExample(UmsIntergrationConsumeSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsIntergrationConsumeSetting record);

    int insertSelective(UmsIntergrationConsumeSetting record);

    List<UmsIntergrationConsumeSetting> selectByExample(UmsIntergrationConsumeSettingExample example);

    UmsIntergrationConsumeSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsIntergrationConsumeSetting record, @Param("example") UmsIntergrationConsumeSettingExample example);

    int updateByExample(@Param("record") UmsIntergrationConsumeSetting record, @Param("example") UmsIntergrationConsumeSettingExample example);

    int updateByPrimaryKeySelective(UmsIntergrationConsumeSetting record);

    int updateByPrimaryKey(UmsIntergrationConsumeSetting record);
}