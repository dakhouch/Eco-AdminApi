package com.dakhouch.anass.ecoadminapi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Sell {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String sellDate;
    private Float sellQuantity;
    private Float sellPrice;
    private String customerName;
    private String customerNic;
    private String customerLink;
    private String customerAdresse;
    private  String customerDadresse;
    @OneToOne
    private Product product;
}
