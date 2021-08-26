package com.drdiabolical.riteofpassage;

import com.drdiabolical.riteofpassage.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialBismuth implements ToolMaterial {
    // Custom material static instance to be called for reference
    public static final ToolMaterialBismuth INSTANCE = new ToolMaterialBismuth();

    // Override getDurability - Returns the material's base durability
    @Override
    public int getDurability() {
        return 1923;
    }

    // Override getMiningSpeedMultiplier - Returns the material's base mining speed multiplier
    @Override
    public float getMiningSpeedMultiplier() {
        return 9.0f;
    }

    // Override getAttackDamage - Returns the material's base attack damage
    @Override
    public float getAttackDamage() {
        return 2.5f;
    }

    // Override getMiningLevel - Returns the material's mining level
    @Override
    public int getMiningLevel() {
        return 3;
    }

    // Override getEnchantability - Returns the material's enchantability
    @Override
    public int getEnchantability() {
        return 16;
    }

    // Override getRepairIngredient - Returns the material's repair ingredient
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.BISMUTH);
    }
}
