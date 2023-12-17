package cn.wwinter.mallsearch.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serial;
import java.io.Serializable;

@Data
@Document(indexName = "book_index")
public class Book implements Serializable {
    @Serial
    private static final long serialVersionUID = -4004634388298285271L;

    private Integer id;
    private String title;
    private String author;
}
