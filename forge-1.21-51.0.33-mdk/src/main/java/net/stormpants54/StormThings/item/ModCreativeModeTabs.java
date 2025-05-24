package net.stormpants54.StormThings.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.stormpants54.StormThings.StormThings;
import net.stormpants54.StormThings.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StormThings.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AMETHYST_EQUIPMENT_TAB = CREATIVE_MODE_TABS.register("storms_things_items_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.AMETHYST_BLADE.get()))
                    .title(Component.translatable("creativetab.stormsthings.storms_things_items_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.AMETHYST_BLADE.get());
                        output.accept(ModItems.AMETHYST_UPGRADE_TEMPLATE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> STORMSTHINGS_BLOCKS = CREATIVE_MODE_TABS.register("storms_things_blocks_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.COBBLED_CALCITE.get()))
                    .withTabsBefore(AMETHYST_EQUIPMENT_TAB.getId())
                    .title(Component.translatable("creativetab.stormsthings.storms_things_blocks_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.COBBLED_CALCITE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
