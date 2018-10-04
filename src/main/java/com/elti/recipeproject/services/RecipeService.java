package com.elti.recipeproject.services;

import com.elti.recipeproject.commands.RecipeCommand;
import com.elti.recipeproject.model.Recipe;

import java.util.Set;

/**
 * Created by e.sh. on 01-Oct-18
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    void deleteById(Long id);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
