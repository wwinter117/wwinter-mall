package cn.wwinter.mapper;

import cn.wwinter.model.ServerCost;
import cn.wwinter.model.ServerCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerCostMapper {
    int countByExample(ServerCostExample example);

    int deleteByExample(ServerCostExample example);

    int deleteByPrimaryKey(String costName);

    int insert(ServerCost record);

    int insertSelective(ServerCost record);

    List<ServerCost> selectByExample(ServerCostExample example);

    ServerCost selectByPrimaryKey(String costName);

    int updateByExampleSelective(@Param("record") ServerCost record, @Param("example") ServerCostExample example);

    int updateByExample(@Param("record") ServerCost record, @Param("example") ServerCostExample example);

    int updateByPrimaryKeySelective(ServerCost record);

    int updateByPrimaryKey(ServerCost record);
}