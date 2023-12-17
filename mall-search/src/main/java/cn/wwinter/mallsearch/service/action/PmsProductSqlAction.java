package cn.wwinter.mallsearch.service.action;

import cn.wwinter.entity.PmsProduct;
import cn.wwinter.mapper.PmsProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/17
 * @Author: zhangdd
 */
@Component
@AllArgsConstructor
public class PmsProductSqlAction {
    private final PmsProductMapper pmsProductMapper;

    public List<PmsProduct> getList() {
        return null;
    }
}
