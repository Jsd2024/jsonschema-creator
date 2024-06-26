package org.demo.app.disney.bkp;

import jakarta.persistence.*;
import org.demo.app.disney.model.Product;

@Entity
public class Dine extends Product {
//    @Id
    private String dineId;

    private enum dineType {
        Lunch,
        Dinner,
        MealPlan,
        CharacterMeal,
        Breakfast,
        DailySelectableProduct,
        SupplementCharacterMeal
    }
}
