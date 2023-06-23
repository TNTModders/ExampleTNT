package com.tntmodders.exampletnt;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleTNT.MOD_ID)
public class ExampleTNT {
    public static final String MOD_ID = "exampletnt";

    public ExampleTNT() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExampleTNTItems.register(modEventBus);
    }
}
