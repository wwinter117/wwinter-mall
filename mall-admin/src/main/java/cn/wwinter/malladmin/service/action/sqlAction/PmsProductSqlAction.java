package cn.wwinter.malladmin.service.action.sqlAction;

import cn.wwinter.mapper.PmsProductMapper;
import cn.wwinter.entity.PmsProduct;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/2
 * @Author: zhangdd
 */
@Component
@AllArgsConstructor
@Slf4j
public class PmsProductSqlAction implements CommonSqlAction<PmsProduct> {

    private final PmsProductMapper pmsProductMapper;


    @Override
    public PmsProduct getIterm(Long id) {
        try {
            return pmsProductMapper.selectById(id);
        } catch (Exception e) {
            log.error("商品信息数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<PmsProduct> getList() {
        try {
            return pmsProductMapper.selectList(null);
        } catch (Exception e) {
            log.error("商品信息数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageInfo<PmsProduct> getListPage(Integer pageNum, Integer pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<PmsProduct> cmsPreferenceAreaProductRelationList = pmsProductMapper.selectList(null);
            return new PageInfo<>(cmsPreferenceAreaProductRelationList);
        } catch (Exception e) {
            log.error("商品信息分页数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    @Override
    public int insertIterm(PmsProduct cmsPreferenceAreaProductRelation) {
        try {
            return pmsProductMapper.insert(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品信息表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertList(List<PmsProduct> cmsPreferenceAreaProductRelations) {
        try {
            return pmsProductMapper.insertList(cmsPreferenceAreaProductRelations);
        } catch (Exception e) {
            log.error("商品信息表批次插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateIterm(PmsProduct cmsPreferenceAreaProductRelation) {
        try {
            return pmsProductMapper.updateById(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品信息表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteIterm(Long id) {
        try {
            return pmsProductMapper.deleteById(id);
        } catch (Exception e) {
            log.error("商品信息数据删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteList(List<Long> ids) {
        try {
            return pmsProductMapper.deleteBatchIds(ids);
        } catch (Exception e) {
            log.error("商品信息数据批次删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
