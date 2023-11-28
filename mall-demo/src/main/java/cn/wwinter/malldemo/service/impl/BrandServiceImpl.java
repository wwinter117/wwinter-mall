package cn.wwinter.malldemo.service.impl;

import cn.wwinter.malldemo.model.dto.PmsBrandDto;
import cn.wwinter.malldemo.service.BrandService;
import cn.wwinter.mapper.PmsBrandMapper;
import cn.wwinter.model.PmsBrand;
import cn.wwinter.model.PmsBrandExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

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
    public List<PmsBrand> listBrands(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrandDto pmsBrandDto) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandDto, pmsBrand);
        return brandMapper.insert(pmsBrand);
    }

    @Override
    public int updateBrand(Long id, PmsBrandDto pmsBrandDto) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandDto, pmsBrand);
        pmsBrand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(pmsBrand);
    }

    @Override
    public int deleteBrand(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

}
