package cn.wwinter.malladmin.simpleTest;

import cn.wwinter.malladmin.service.action.sqlAction.brand.PmsBrandSqlAction;
import cn.wwinter.malladmin.model.domain.PmsBrand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/7
 * @Author: zhangdd
 */
@SpringBootTest
public class PmsBrandTest {
    @Autowired
    private PmsBrandSqlAction pmsBrandSqlAction;

    @Test
    void testPmsBrandSqlActionGet() {
        System.out.println("pmsBrandSqlAction.getIterm(1L) = " + pmsBrandSqlAction.getIterm(1L));

        System.out.println("pmsBrandSqlAction.getList() = " + pmsBrandSqlAction.getList());

        System.out.println("pmsBrandSqlAction.getListPage(1, 2) = " + pmsBrandSqlAction.getListPage(1, 2));

    }

    @Test
    void testPmsBrandSqlActionInsert() {
        List<PmsBrand> pmsBrandList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            PmsBrand pmsBrand = new PmsBrand();
            pmsBrand.setName("test-" + i);
            pmsBrandList.add(pmsBrand);
        }
        System.out.println("pmsBrandSqlAction.insertList(pmsBrandList) = " + pmsBrandSqlAction.insertList(pmsBrandList));
    }


}
