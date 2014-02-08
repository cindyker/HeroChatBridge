package com.rylinaux.herochatbridge.bungee;

import com.rylinaux.herochatbridge.bungee.listeners.PluginMessageListener;

import net.md_5.bungee.api.plugin.Plugin;

public class HeroChatBridgeBungee extends Plugin {

    @Override
    public void onEnable() {
        this.getProxy().registerChannel("HeroChatBridge");
        this.getProxy().getPluginManager().registerListener(this, new PluginMessageListener(this));
    }

    @Override
    public void onDisable() {
        this.getProxy().unregisterChannel("HeroChatBridge");
        this.getProxy().getPluginManager().unregisterListeners(this);
    }

}