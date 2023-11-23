package cn.wwinter.mapper;

import cn.wwinter.model.GlobalGrants;
import cn.wwinter.model.GlobalGrantsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GlobalGrantsMapper {
    int countByExample(GlobalGrantsExample example);

    int deleteByExample(GlobalGrantsExample example);

    int deleteByPrimaryKey(@Param("user") String user, @Param("host") String host, @Param("priv") String priv);

    int insert(GlobalGrants record);

    int insertSelective(GlobalGrants record);

    List<GlobalGrants> selectByExample(GlobalGrantsExample example);

    GlobalGrants selectByPrimaryKey(@Param("user") String user, @Param("host") String host, @Param("priv") String priv);

    int updateByExampleSelective(@Param("record") GlobalGrants record, @Param("example") GlobalGrantsExample example);

    int updateByExample(@Param("record") GlobalGrants record, @Param("example") GlobalGrantsExample example);

    int updateByPrimaryKeySelective(GlobalGrants record);

    int updateByPrimaryKey(GlobalGrants record);
}