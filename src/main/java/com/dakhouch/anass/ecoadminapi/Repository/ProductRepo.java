package com.dakhouch.anass.ecoadminapi.Repository;

import com.dakhouch.anass.ecoadminapi.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Long> {
    @Query("from Product where status='Pending'")
    List<Product> getAllPending();
    @Query("from Product where status='Stock' and quantity>0")
    List<Product> getAllStock();

}
