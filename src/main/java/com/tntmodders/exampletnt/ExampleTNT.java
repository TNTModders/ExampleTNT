package com.tntmodders.exampletnt;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


@Mod(ExampleTNT.MOD_ID)
public class ExampleTNT {
    public static final String MOD_ID = "exampletnt";

    public ExampleTNT() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExampleTNTItems.register(modEventBus);
    }

    @Mod.EventBusSubscriber(modid = ExampleTNT.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ExampleTNTEvents {

        @SubscribeEvent
        public static void creativeTabsBuildEvent(CreativeModeTabEvent.BuildContents event) {
            if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
                event.accept(ExampleTNTItems.SMALL_TNT.get());
            }
        }
    }

    public static class ExampleTNTItems {
        private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
        public static final RegistryObject<Item> SMALL_TNT = ITEMS.register("small_tnt", () -> new Item(new Item.Properties()));

        public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
    }
}
