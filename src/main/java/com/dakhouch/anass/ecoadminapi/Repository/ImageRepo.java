package com.dakhouch.anass.ecoadminapi.Repository;

import com.dakhouch.anass.ecoadminapi.Model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepo extends JpaRepository<Image,Long> {
}
