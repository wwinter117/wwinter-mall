package cnn.wwinter.malladmin.service.impl;

import cn.wwinter.mapper.PmsProductCategoryMapper;
import cn.wwinter.mapper.PmsProductMapper;
import cn.wwinter.model.PmsProductCategory;
import cn.wwinter.model.PmsProductCategoryExample;
import cnn.wwinter.malladmin.model.dto.PmsProductCategoryDto;
import cnn.wwinter.malladmin.service.ProductCategoryService;
import com.github.pagehelper.PageHelper;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * ClassName: ProductCategoryServiceImpl
 * Package: cnn.wwinter.malladmin.service.impl
 * Description:
 * Datetime: 2023/11/28
 * Author: zhangdd
 */
@Service
@AllArgsConstructor
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final PmsProductCategoryMapper productCategoryMapper;

    @Override
    public int create(PmsProductCategoryDto pmsProductCategoryDto) {
        PmsProductCategory productCategory = new PmsProductCategory();
        BeanUtils.copyProperties(pmsProductCategoryDto, productCategory);
        return productCategoryMapper.insert(productCategory);
    }

    @Override
    public int update(Long id, PmsProductCategoryDto pmsProductCategoryDto) {
        PmsProductCategory productCategory = new PmsProductCategory();
        BeanUtils.copyProperties(pmsProductCategoryDto, productCategory);
        productCategory.setId(id);
        return productCategoryMapper.updateByPrimaryKeySelective(productCategory);
    }

    @Override
    public List<PmsProductCategory> getList(Long parentId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PmsProductCategoryExample example = new PmsProductCategoryExample();
        example.setOrderByClause("sort desc");
        example.createCriteria().andParentIdEqualTo(parentId);
        return productCategoryMapper.selectByExample(example);
    }

    @Override
    public List<PmsProductCategory> getList() {
        return productCategoryMapper.selectByExample(new PmsProductCategoryExample());
    }

    @Override
    public int delete(Long id) {
        return productCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Object getItem(Long id) {
        return productCategoryMapper.selectByPrimaryKey(id);
    }

}
