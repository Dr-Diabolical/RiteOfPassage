package com.drdiabolical.riteofpassage;

import com.drdiabolical.riteofpassage.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ArmorMaterialBismuth implements ArmorMaterial {
    // Custom material static instance to be called for reference
    public static final ArmorMaterialBismuth INSTANCE = new ArmorMaterialBismuth();

    // Base armor durability {Helmet, Chestplate, Leggings, Boots}
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    // Base armor protection value {Helmet, Chestplate, Leggings, Boots}
    private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3};

    // Override getDurability - Returns the material's base durability depending on slot
    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 35;
    }

    // Override getProtectionAmount - Returns protection value depending on slot
    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    // Override getEnchantability - Returns material enchantibilty
    @Override
    public int getEnchantability() {
        return 16;
    }

    // Override getEquipSound - Returns sound effect to play when equipping the armor
    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    // Override getRepairIngredient - Returns the ingredient that the armor can be repaired with
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.BISMUTH);
    }

    // Override getName - Returns the material's name
    @Override
    public String getName() {
        return "bismuth";
    }

    // Override getToughness - Returns the toughness value of the material
    @Override
    public float getToughness() {
        return 3.0f;
    }

    // Override getKnockbackResistance - Returns the knockback resistance value of the material
    @Override
    public float getKnockbackResistance() {
        return 0.0f;
    }
}
