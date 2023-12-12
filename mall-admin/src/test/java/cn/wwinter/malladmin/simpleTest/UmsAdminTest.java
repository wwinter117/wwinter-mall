package cn.wwinter.malladmin.simpleTest;

import cn.wwinter.malladmin.mapper.PmsBrandMapper;
import cn.wwinter.malladmin.mapper.UmsAdminMapper;
import cn.wwinter.malladmin.model.domain.UmsAdmin;
import cn.wwinter.malladmin.model.domain.PmsBrand;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/4
 * @Author: zhangdd
 */
@SpringBootTest
@Slf4j
public class UmsAdminTest {
    @Autowired
    private UmsAdminMapper umsAdminMapper;
    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testUmsAdminDao() {
        List<UmsAdmin> umsAdminList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            UmsAdmin umsAdmin = new UmsAdmin();
            umsAdmin.setUsername("zdd-wwinter-" + i);
            umsAdmin.setIcon("test1");
            umsAdmin.setEmail("206798qw34@qq.com");
            umsAdmin.setPassword("test");
            umsAdminList.add(umsAdmin);
        }
        umsAdminMapper.insertList(umsAdminList);

        List<UmsAdmin> umsAdmins = umsAdminMapper.selectList(null);
        umsAdmins.forEach(System.out::println);
    }

    @Test
    void testPmsBrandMapper() {
        List<PmsBrand> pmsBrands = pmsBrandMapper.selectList(null);
        pmsBrands.forEach(System.out::println);

        System.out.println("===========");

        List<Long> ids = Arrays.asList(61L, 62L, 63L, 64L);
        int count = pmsBrandMapper.updateShowStatusBatch(ids, 0);
        System.out.println("count = " + count);

        System.out.println("===========");
        List<PmsBrand> pmsBrands1 = pmsBrandMapper.selectList(null);
        pmsBrands1.forEach(System.out::println);
    }


}
