package com.dakhouch.anass.ecoadminapi.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Product_gauge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name="idproduct")
    private Product product;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( name="idgauge")
    private Gauge gauge;
    private String value;
}
