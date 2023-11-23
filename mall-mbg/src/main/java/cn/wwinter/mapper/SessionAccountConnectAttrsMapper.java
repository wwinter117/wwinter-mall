package cn.wwinter.mapper;

import cn.wwinter.model.SessionAccountConnectAttrs;
import cn.wwinter.model.SessionAccountConnectAttrsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionAccountConnectAttrsMapper {
    int countByExample(SessionAccountConnectAttrsExample example);

    int deleteByExample(SessionAccountConnectAttrsExample example);

    int deleteByPrimaryKey(@Param("processlistId") Long processlistId, @Param("attrName") String attrName);

    int insert(SessionAccountConnectAttrs record);

    int insertSelective(SessionAccountConnectAttrs record);

    List<SessionAccountConnectAttrs> selectByExample(SessionAccountConnectAttrsExample example);

    SessionAccountConnectAttrs selectByPrimaryKey(@Param("processlistId") Long processlistId, @Param("attrName") String attrName);

    int updateByExampleSelective(@Param("record") SessionAccountConnectAttrs record, @Param("example") SessionAccountConnectAttrsExample example);

    int updateByExample(@Param("record") SessionAccountConnectAttrs record, @Param("example") SessionAccountConnectAttrsExample example);

    int updateByPrimaryKeySelective(SessionAccountConnectAttrs record);

    int updateByPrimaryKey(SessionAccountConnectAttrs record);
}