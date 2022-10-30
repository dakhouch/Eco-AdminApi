package com.dakhouch.anass.ecoadminapi.DTO;
import lombok.Data;

@Data
public class ProductGaugeDto {
    private Long product_id;
    private Long gauge_id;
    private String value;
}
