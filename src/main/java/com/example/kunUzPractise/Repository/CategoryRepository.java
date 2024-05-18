package com.example.kunUzPractise.Repository;

import com.example.kunUzPractise.Entity.ArticleTypeEntity;
import com.example.kunUzPractise.Entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<CategoryEntity,Integer> {

}
