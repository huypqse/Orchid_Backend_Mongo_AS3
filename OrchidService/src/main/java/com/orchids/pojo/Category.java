package com.orchids.pojo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Document(collection = "categories")
@Getter
@Setter
public class Category {
    @Id
    private String categoryId;

    private String categoryName;

    private String status = "ACTIVE";

    private List<Orchid> orchids;
}