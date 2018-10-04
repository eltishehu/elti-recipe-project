package com.elti.recipeproject.services;

import com.elti.recipeproject.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by e.sh. on 04-Oct-18
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
