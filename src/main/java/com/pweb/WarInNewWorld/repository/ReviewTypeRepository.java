package com.pweb.WarInNewWorld.repository;

import com.pweb.WarInNewWorld.model.ReviewType;
import com.pweb.WarInNewWorld.projection.ReviewTypeView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewTypeRepository extends JpaRepository<ReviewType, Long> {
    List<ReviewTypeView> findAllBy();

}
