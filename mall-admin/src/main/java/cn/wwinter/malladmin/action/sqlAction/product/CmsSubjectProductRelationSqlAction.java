package cn.wwinter.malladmin.action.sqlAction.product;

import cn.wwinter.malladmin.action.sqlAction.common.CommonSqlAction;
import cn.wwinter.malladmin.mapper.CmsSubjectProductRelationMapper;
import cn.wwinter.malladmin.model.entity.product.CmsSubjectProductRelation;
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
public class CmsSubjectProductRelationSqlAction implements CommonSqlAction<CmsSubjectProductRelation> {
    private final CmsSubjectProductRelationMapper cmsSubjectProductRelationMapper;


    @Override
    public CmsSubjectProductRelation getIterm(Long id) {
        try {
            return cmsSubjectProductRelationMapper.selectById(id);
        } catch (Exception e) {
            log.error("专题和商品关系数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<CmsSubjectProductRelation> getList() {
        try {
            return cmsSubjectProductRelationMapper.selectList(null);
        } catch (Exception e) {
            log.error("专题和商品关系数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public PageInfo<CmsSubjectProductRelation> getListPage(Integer pageNum, Integer pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<CmsSubjectProductRelation> cmsPreferenceAreaProductRelationList = cmsSubjectProductRelationMapper.selectList(null);
            return new PageInfo<>(cmsPreferenceAreaProductRelationList);
        } catch (Exception e) {
            log.error("专题和商品关系分页数据获取失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    @Override
    public int insertIterm(CmsSubjectProductRelation cmsPreferenceAreaProductRelation) {
        try {
            return cmsSubjectProductRelationMapper.insert(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("专题和商品关系表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertList(List<CmsSubjectProductRelation> cmsPreferenceAreaProductRelations) {
        try {
            return cmsSubjectProductRelationMapper.insertList(cmsPreferenceAreaProductRelations);
        } catch (Exception e) {
            log.error("专题和商品关系表批次插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateIterm(CmsSubjectProductRelation cmsPreferenceAreaProductRelation) {
        try {
            return cmsSubjectProductRelationMapper.updateById(cmsPreferenceAreaProductRelation);
        } catch (Exception e) {
            log.error("专题和商品关系表插入失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteIterm(Long id) {
        try {
            return cmsSubjectProductRelationMapper.deleteById(id);
        } catch (Exception e) {
            log.error("专题和商品关系数据删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteList(List<Long> ids) {
        try {
            return cmsSubjectProductRelationMapper.deleteBatchIds(ids);
        } catch (Exception e) {
            log.error("专题和商品关系数据批次删除失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


}
