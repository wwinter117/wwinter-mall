package cnn.wwinter.malladmin.service.impl;

import cn.wwinter.mapper.PmsProductAttributeCategoryMapper;
import cn.wwinter.model.PmsProductAttributeCategory;
import cn.wwinter.model.PmsProductAttributeCategoryExample;
import cnn.wwinter.malladmin.service.ProductAttributeCategoryService;
import com.github.pagehelper.PageHelper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: ProductAttributeCategoryServiceImpl
 * Package: cnn.wwinter.malladmin.service.impl
 * Description:
 * Datetime: 2023/11/29
 * Author: zhangdd
 */
@Service
@AllArgsConstructor
public class ProductAttributeCategoryServiceImpl implements ProductAttributeCategoryService {
    private final PmsProductAttributeCategoryMapper productAttributeCategoryMapper;

    @Override
    public int create(String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        return productAttributeCategoryMapper.insertSelective(productAttributeCategory);
    }

    @Override
    public List<PmsProductAttributeCategory> getList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return productAttributeCategoryMapper.selectByExample(new PmsProductAttributeCategoryExample());
    }

}
