package com.elti.recipeproject.services;

import com.elti.recipeproject.commands.IngredientCommand;

/**
 * Created by e.sh. on 04-Oct-18
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
