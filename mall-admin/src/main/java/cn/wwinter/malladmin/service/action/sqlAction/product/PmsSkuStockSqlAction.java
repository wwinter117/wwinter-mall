package cn.wwinter.malladmin.service.action.sqlAction.product;

import cn.wwinter.malladmin.service.action.sqlAction.common.CommonSqlAction;
import cn.wwinter.malladmin.mapper.PmsSkuStockMapper;
import cn.wwinter.malladmin.model.domain.PmsSkuStock;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/3
 * @Author: zhangdd
 */
@Component
@AllArgsConstructor
@Slf4j
public class PmsSkuStockSqlAction implements CommonSqlAction<PmsSkuStock> {
    private final PmsSkuStockMapper pmsSkuStockMapper;

    @Override
    public PmsSkuStock getIterm(Long id) {
        try {
            return pmsSkuStockMapper.selectById(id);
        } catch (Exception e) {
            log.error("商品信息数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<PmsSkuStock> getList() {
        try {
            return pmsSkuStockMapper.selectList(null);
        } catch (Exception e) {
            log.error("商品信息数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageInfo<PmsSkuStock> getListPage(Integer pageNum, Integer pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<PmsSkuStock> cmsPreferenceAreaProductRelationList = pmsSkuStockMapper.selectList(null);
            return new PageInfo<>(cmsPreferenceAreaProductRelationList);
        } catch (Exception e) {
            log.error("商品信息分页数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    @Override
    public int insertIterm(PmsSkuStock cmsPreferenceAreaProductRelation) {
        try {
            return pmsSkuStockMapper.insert(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品信息表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertList(List<PmsSkuStock> cmsPreferenceAreaProductRelations) {
        try {
            return pmsSkuStockMapper.insertList(cmsPreferenceAreaProductRelations);
        } catch (Exception e) {
            log.error("商品信息表批次插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateIterm(PmsSkuStock cmsPreferenceAreaProductRelation) {
        try {
            return pmsSkuStockMapper.updateById(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品信息表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteIterm(Long id) {
        try {
            return pmsSkuStockMapper.deleteById(id);
        } catch (Exception e) {
            log.error("商品信息数据删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteList(List<Long> ids) {
        try {
            return pmsSkuStockMapper.deleteBatchIds(ids);
        } catch (Exception e) {
            log.error("商品信息数据批次删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
