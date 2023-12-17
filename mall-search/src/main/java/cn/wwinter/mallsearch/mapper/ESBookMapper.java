package cn.wwinter.mallsearch.mapper;

import cn.wwinter.mallsearch.domain.Book;
import org.springframework.data.elasticsearch.annotations.Mapping;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Description:
 * @Datetime: 2023/12/16
 * @Author: zhangdd
 */
@Mapping
public interface ESBookMapper extends ElasticsearchRepository<Book, Integer> {
}
