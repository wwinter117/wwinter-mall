package cn.wwinter.mapper;

import cn.wwinter.model.TableHandles;
import cn.wwinter.model.TableHandlesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableHandlesMapper {
    int countByExample(TableHandlesExample example);

    int deleteByExample(TableHandlesExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(TableHandles record);

    int insertSelective(TableHandles record);

    List<TableHandles> selectByExample(TableHandlesExample example);

    TableHandles selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") TableHandles record, @Param("example") TableHandlesExample example);

    int updateByExample(@Param("record") TableHandles record, @Param("example") TableHandlesExample example);

    int updateByPrimaryKeySelective(TableHandles record);

    int updateByPrimaryKey(TableHandles record);
}