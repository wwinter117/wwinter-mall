package cn.wwinter.mapper;

import cn.wwinter.model.InnodbTrx;
import cn.wwinter.model.InnodbTrxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTrxMapper {
    int countByExample(InnodbTrxExample example);

    int deleteByExample(InnodbTrxExample example);

    int insert(InnodbTrx record);

    int insertSelective(InnodbTrx record);

    List<InnodbTrx> selectByExample(InnodbTrxExample example);

    int updateByExampleSelective(@Param("record") InnodbTrx record, @Param("example") InnodbTrxExample example);

    int updateByExample(@Param("record") InnodbTrx record, @Param("example") InnodbTrxExample example);
}