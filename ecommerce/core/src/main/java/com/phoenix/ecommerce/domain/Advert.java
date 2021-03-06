package com.phoenix.ecommerce.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Advert {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
}
