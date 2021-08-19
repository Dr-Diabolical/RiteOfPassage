package com.drdiabolical.riteofpassage;

import com.drdiabolical.riteofpassage.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialSapphire implements ToolMaterial {
    public static final ToolMaterialSapphire INSTANCE = new ToolMaterialSapphire();

    @Override
    public int getDurability() {
        return 1923;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.0f;
    }

    @Override
    public float getAttackDamage() {
        return 2.5f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 16;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.SAPPHIRE);
    }
}
