package cn.wwinter.mapper;

import cn.wwinter.model.ProxiesPriv;
import cn.wwinter.model.ProxiesPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProxiesPrivMapper {
    int countByExample(ProxiesPrivExample example);

    int deleteByExample(ProxiesPrivExample example);

    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("proxiedHost") String proxiedHost, @Param("proxiedUser") String proxiedUser);

    int insert(ProxiesPriv record);

    int insertSelective(ProxiesPriv record);

    List<ProxiesPriv> selectByExample(ProxiesPrivExample example);

    ProxiesPriv selectByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("proxiedHost") String proxiedHost, @Param("proxiedUser") String proxiedUser);

    int updateByExampleSelective(@Param("record") ProxiesPriv record, @Param("example") ProxiesPrivExample example);

    int updateByExample(@Param("record") ProxiesPriv record, @Param("example") ProxiesPrivExample example);

    int updateByPrimaryKeySelective(ProxiesPriv record);

    int updateByPrimaryKey(ProxiesPriv record);
}