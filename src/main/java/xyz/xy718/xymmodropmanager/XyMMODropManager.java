package xyz.xy718.xymmodropmanager;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "xymmodropmanager",
        name = "XyMMODropManager",
        description = "XyMMO系列的一员-管理所有实体死亡时的掉落物",
        authors = {
                "Xy718"
        }
)
public class XyMMODropManager {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }
}
