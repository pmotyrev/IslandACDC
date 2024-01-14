package com.javarush.island.motyrev.entities.animals.predators;

import com.javarush.island.motyrev.entities.Entity;
import com.javarush.island.motyrev.entities.animals.Animal;

import java.util.Map;

public class Fox extends Animal {
    public Fox(int sex, double weight, int speed, double entityNeededFood, double loseWeight, Map<Class<? extends Entity>, Integer> eatProbability) {
        super(sex, weight, speed, entityNeededFood, loseWeight, eatProbability);
    }
}