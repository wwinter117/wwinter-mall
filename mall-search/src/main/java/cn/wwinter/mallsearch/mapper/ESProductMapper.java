package cn.wwinter.mallsearch.mapper;

import cn.wwinter.mallsearch.domain.EsProduct;
import org.springframework.data.elasticsearch.annotations.Mapping;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Description:
 * @Datetime: 2023/12/16
 * @Author: zhangdd
 */
@Mapping
public interface ESProductMapper extends ElasticsearchRepository<EsProduct, Long> {

}
