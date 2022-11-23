package com.melogale.geomagy.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class GeomagyTab {

    public static final CreativeModeTab GEOMAGY_TAB = new CreativeModeTab("geomagy_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(GeomagyItems.garnet.get());
        }
    };

}
