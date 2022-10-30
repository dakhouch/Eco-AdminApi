package com.dakhouch.anass.ecoadminapi.Repository;

import com.dakhouch.anass.ecoadminapi.Model.Product_gauge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface Product_GaugeRepo extends JpaRepository<Product_gauge,Long> {
    @Query("from Product_gauge where product.id=?1")
    List<Product_gauge> findByproduct(Long id);
}

