package com.ias.core.event;

import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakEvent;

public class ItemFramePhysicsListener implements Listener {

    // Cancel physics based item frame breaking
    @EventHandler
    public void onItemFramePhysics(HangingBreakEvent event) {
        if (!(event.getEntity() instanceof ItemFrame frame)) return;
        event.setCancelled(event.getCause() != HangingBreakEvent.RemoveCause.DEFAULT
                && event.getCause() != HangingBreakEvent.RemoveCause.ENTITY);
    }
}