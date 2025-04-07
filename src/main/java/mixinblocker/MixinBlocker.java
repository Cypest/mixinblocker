package mixinblocker;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.spongepowered.asm.mixin.Mixins;

public class MixinBlocker implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        Mixins.disable("necronomicon-common.mixins.json:item.AnimatedItemNameMixin");
        Mixins.disable("archers_arsenal.mixins.json:FOVMixin");
        Mixins.disable("libertyvillagers.mixins.json:ModelPredicateProviderRegistryMixin");
        Mixins.disable("notenoughcrashes.fabric.mixins.json:iris.SilentNEC");
        Mixins.disable("snowrealmagic.mixins.json:sereneseasons.RandomUpdateHandlerMixin");
    }
}
