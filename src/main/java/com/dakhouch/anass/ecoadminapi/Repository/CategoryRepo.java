package com.dakhouch.anass.ecoadminapi.Repository;

import com.dakhouch.anass.ecoadminapi.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Long> {
}
