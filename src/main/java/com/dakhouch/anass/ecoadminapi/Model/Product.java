package com.dakhouch.anass.ecoadminapi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private String name;
    private Float quantity;
    private Float init_quantity;
    private Float unit_price;
    private Float deliv_price;
    private String source;
    private String link;
    private String status;
    @OneToOne(cascade = CascadeType.MERGE)
    private Category category;
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    List<Image> images;


}
