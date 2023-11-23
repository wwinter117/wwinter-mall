package cn.wwinter.mapper;

import cn.wwinter.model.InnodbTablespacesBrief;
import cn.wwinter.model.InnodbTablespacesBriefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTablespacesBriefMapper {
    int countByExample(InnodbTablespacesBriefExample example);

    int deleteByExample(InnodbTablespacesBriefExample example);

    int insert(InnodbTablespacesBrief record);

    int insertSelective(InnodbTablespacesBrief record);

    List<InnodbTablespacesBrief> selectByExampleWithBLOBs(InnodbTablespacesBriefExample example);

    List<InnodbTablespacesBrief> selectByExample(InnodbTablespacesBriefExample example);

    int updateByExampleSelective(@Param("record") InnodbTablespacesBrief record, @Param("example") InnodbTablespacesBriefExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbTablespacesBrief record, @Param("example") InnodbTablespacesBriefExample example);

    int updateByExample(@Param("record") InnodbTablespacesBrief record, @Param("example") InnodbTablespacesBriefExample example);
}