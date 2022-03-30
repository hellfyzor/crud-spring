package com.marcio.crudspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import javax.persistence.*;

@Data
@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 200, nullable = false)
    private String category;

}
