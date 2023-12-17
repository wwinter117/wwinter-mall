package cn.wwinter.malladmin.service.action.sqlAction;

import cn.wwinter.mapper.PmsProductAttributeValueMapper;
import cn.wwinter.entity.PmsProductAttributeValue;
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
public class PmsProductAttributeValueSqlAction implements CommonSqlAction<PmsProductAttributeValue> {
    private final PmsProductAttributeValueMapper pmsProductAttributeValueMapper;

    @Override
    public PmsProductAttributeValue getIterm(Long id) {
        try {
            return pmsProductAttributeValueMapper.selectById(id);
        } catch (Exception e) {
            log.error("商品参数及自定义规格属性数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<PmsProductAttributeValue> getList() {
        try {
            return pmsProductAttributeValueMapper.selectList(null);
        } catch (Exception e) {
            log.error("商品参数及自定义规格属性数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageInfo<PmsProductAttributeValue> getListPage(Integer pageNum, Integer pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<PmsProductAttributeValue> cmsPreferenceAreaProductRelationList = pmsProductAttributeValueMapper.selectList(null);
            return new PageInfo<>(cmsPreferenceAreaProductRelationList);
        } catch (Exception e) {
            log.error("商品参数及自定义规格属性分页数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    @Override
    public int insertIterm(PmsProductAttributeValue cmsPreferenceAreaProductRelation) {
        try {
            return pmsProductAttributeValueMapper.insert(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品参数及自定义规格属性表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertList(List<PmsProductAttributeValue> cmsPreferenceAreaProductRelations) {
        try {
            return pmsProductAttributeValueMapper.insertList(cmsPreferenceAreaProductRelations);
        } catch (Exception e) {
            log.error("商品参数及自定义规格属性表批次插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateIterm(PmsProductAttributeValue cmsPreferenceAreaProductRelation) {
        try {
            return pmsProductAttributeValueMapper.updateById(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("商品参数及自定义规格属性表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteIterm(Long id) {
        try {
            return pmsProductAttributeValueMapper.deleteById(id);
        } catch (Exception e) {
            log.error("商品参数及自定义规格属性数据删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteList(List<Long> ids) {
        try {
            return pmsProductAttributeValueMapper.deleteBatchIds(ids);
        } catch (Exception e) {
            log.error("商品参数及自定义规格属性数据批次删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
