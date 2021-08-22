package com.drdiabolical.riteofpassage;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomPickaxeItem extends PickaxeItem {
    // CustomPickaxeItem - Constructs a custom pickaxe tool item
    public CustomPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
