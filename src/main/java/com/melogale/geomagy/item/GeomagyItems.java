package com.melogale.geomagy.item;

import com.melogale.geomagy.Geomagy;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GeomagyItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Geomagy.MOD_ID);

    public static final RegistryObject<Item> garnet = ITEMS.register("garnet", () -> new Item(new Item.Properties().tab(GeomagyTab.GEOMAGY_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
