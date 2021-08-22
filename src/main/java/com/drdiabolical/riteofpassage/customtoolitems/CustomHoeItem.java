package com.drdiabolical.riteofpassage.customtoolitems;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class CustomHoeItem extends HoeItem {
    // CustomHoeItem - Constructs a custom hoe tool item
    public CustomHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
