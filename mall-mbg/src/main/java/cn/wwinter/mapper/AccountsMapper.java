package cn.wwinter.mapper;

import cn.wwinter.model.Accounts;
import cn.wwinter.model.AccountsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountsMapper {
    int countByExample(AccountsExample example);

    int deleteByExample(AccountsExample example);

    int insert(Accounts record);

    int insertSelective(Accounts record);

    List<Accounts> selectByExample(AccountsExample example);

    int updateByExampleSelective(@Param("record") Accounts record, @Param("example") AccountsExample example);

    int updateByExample(@Param("record") Accounts record, @Param("example") AccountsExample example);
}