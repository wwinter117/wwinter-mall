package cnn.wwinter.malladmin.service.impl;

import cn.wwinter.mapper.PmsBrandMapper;
import cn.wwinter.model.PmsBrand;
import cn.wwinter.model.PmsBrandExample;
import cnn.wwinter.malladmin.model.dto.PmsBrandDto;
import cnn.wwinter.malladmin.service.BrandService;
import com.github.pagehelper.PageHelper;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * ClassName: BrandServiceImpl
 * Package: cn.wwinter.malldemo.service.impl
 * Description:
 * Datetime: 2023/11/27
 * Author: zhangdd
 */
@Service
@AllArgsConstructor
public class BrandServiceImpl implements BrandService {
    private final PmsBrandMapper brandMapper;
    @Override
    public List<PmsBrand> listBrands() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public List<PmsBrand> listBrands(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PmsBrandExample example = new PmsBrandExample();
        if (StringUtils.hasLength(keyword)) {
            example.createCriteria().andNameLike("%" + keyword + "%");
        }
        return brandMapper.selectByExample(example);
    }

    @Override
    public int createBrand(PmsBrandDto pmsBrandDto) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandDto, pmsBrand);
        if (StringUtils.hasLength(pmsBrand.getFirstLetter())) {
            pmsBrand.setFirstLetter(pmsBrandDto.getName().substring(0, 1));
        }
        return brandMapper.insert(pmsBrand);
    }

    @Override
    public int updateBrand(Long id, PmsBrandDto pmsBrandDto) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandDto, pmsBrand);
        pmsBrand.setId(id);
        if (StringUtils.hasLength(pmsBrand.getFirstLetter())) {
            pmsBrand.setFirstLetter(pmsBrandDto.getName().substring(0, 1));
        }
        return brandMapper.updateByPrimaryKeySelective(pmsBrand);
    }

    @Override
    public int updateShowStatusBatch(List<Long> ids, Integer showStatus) {
        PmsBrand pmsBrand = new PmsBrand();
        pmsBrand.setShowStatus(showStatus);
        PmsBrandExample example = new PmsBrandExample();
        example.createCriteria().andIdIn(ids);
        return brandMapper.updateByExampleSelective(pmsBrand, example);
    }

    @Override
    public int updateFactoryStatusBatch(List<Long> ids, Integer factoryStatus) {
        PmsBrand pmsBrand = new PmsBrand();
        pmsBrand.setShowStatus(factoryStatus);
        PmsBrandExample example = new PmsBrandExample();
        example.createCriteria().andIdIn(ids);
        return brandMapper.updateByExampleSelective(pmsBrand, example);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteBrandBatch(List<Long> ids) {
        PmsBrandExample example = new PmsBrandExample();
        example.createCriteria().andIdIn(ids);
        return brandMapper.deleteByExample(example);
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

}
