package com.elti.recipeproject.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by e.sh. on 03-Oct-18
 */
@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {

    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand uom;

}
