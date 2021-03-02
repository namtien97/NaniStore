package com.nanistore.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "product_size")
@Table(name = "product_size")
@IdClass(ProductSizeId.class)
public class ProductSize {
    @Id
    @Column(name = "product_id")
    private String productId;

    @Id
    @Column(name = "size")
    private String size;

    @Column(name = "quanlity",nullable = false)
    private int quantity;
}
