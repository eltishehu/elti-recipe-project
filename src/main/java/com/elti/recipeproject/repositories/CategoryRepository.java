package com.elti.recipeproject.repositories;

import com.elti.recipeproject.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by e.sh. on 01-Oct-18
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String aDescription);
}
