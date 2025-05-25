package net.stormpants54.StormThings.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stormpants54.StormThings.StormThings;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StormThings.MOD_ID);
    //Registered Items
    public static final RegistryObject<Item> AMETHYST_BLADE = ITEMS.register("amethyst_blade",
            () -> new SwordItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AMETHYST, 3, -2.4f))));


    public static final RegistryObject<Item> AMETHYST_UPGRADE_TEMPLATE  = ITEMS.register("amethyst_upgrade_template",
            () -> new Item((new Item.Properties())));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
