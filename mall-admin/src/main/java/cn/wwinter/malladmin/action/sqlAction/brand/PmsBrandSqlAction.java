package cn.wwinter.malladmin.action.sqlAction.brand;

import cn.wwinter.malladmin.action.sqlAction.common.CommonSqlAction;
import cn.wwinter.malladmin.mapper.PmsBrandMapper;
import cn.wwinter.malladmin.model.entity.brand.PmsBrand;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/3
 * @Author: zhangdd
 */
@AllArgsConstructor
@Component
@Slf4j
public class PmsBrandSqlAction implements CommonSqlAction<PmsBrand> {

    private final PmsBrandMapper pmsBrandMapper;

    public PmsBrand getIterm(Long id) {
        try {
            return pmsBrandMapper.selectById(id);
        } catch (Exception e) {
            log.error("品牌查询失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public List<PmsBrand> getList() {
        try {
            return pmsBrandMapper.selectList(null);
        } catch (Exception e) {
            log.error("品牌查询失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageInfo<PmsBrand> getListPage(Integer pageNum, Integer pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<PmsBrand> pmsBrandList = pmsBrandMapper.selectList(null);
            return new PageInfo<>(pmsBrandList);
        } catch (Exception e) {
            log.error("品牌分页数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertIterm(PmsBrand pmsBrand) {
        try {
            return pmsBrandMapper.insert(pmsBrand);
        } catch (Exception e) {
            log.error("品牌入库失败:{}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertList(List<PmsBrand> list) {
        try {
            return pmsBrandMapper.insertList(list);
        } catch (Exception e) {
            log.error("品牌批次插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateIterm(PmsBrand pmsBrand) {
        try {
            return pmsBrandMapper.updateById(pmsBrand);
        } catch (Exception e) {
            log.error("更新品牌失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteIterm(Long id) {
        try {
            return pmsBrandMapper.deleteById(id);
        } catch (Exception e) {
            log.error("删除品牌失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteList(List<Long> ids) {
        try {
            return pmsBrandMapper.deleteBatchIds(ids);
        } catch (Exception e) {
            log.error("批量删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    public PageInfo<PmsBrand> selectByKeyword(String keyword, Integer pageNum, Integer pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<PmsBrand> pmsBrandList = pmsBrandMapper.selectByKeyword(keyword);
            return new PageInfo<>(pmsBrandList);
        } catch (Exception e) {
            log.error("品牌分页查询失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public int updateShowStatusBatchById(List<Long> ids, Integer showStatus) {
        try {
            return pmsBrandMapper.updateShowStatusBatch(ids, showStatus);
        } catch (Exception e) {
            log.error("品牌显示状态更新失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    public int updateFactoryStatusBatch(List<Long> ids, Integer factoryStatus) {
        try {
            return pmsBrandMapper.updateFactoryStatusBatch(ids, factoryStatus);
        } catch (Exception e) {
            log.error("厂家制造商状态更新失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
