package net.niemiecki.moreamethysts.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.niemiecki.moreamethysts.MoreAmethysts;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreAmethysts.MOD_ID);

    public static final DeferredItem<Item> BLUE_AMETHYST = ITEMS.register("blue_amethyst",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
