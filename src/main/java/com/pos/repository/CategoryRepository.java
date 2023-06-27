package com.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pos.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
