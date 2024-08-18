package com.rois2coeurs.fasttravel;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class FasttravelClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		registerKeyBindings();
	}

	private void registerKeyBindings() {
		KeyBinding keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
				"key.fast-travel-map.open",
				InputUtil.Type.KEYSYM,
				GLFW.GLFW_KEY_Y,
				"key.categories.fast-travel-map"));

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			while (keyBinding.wasPressed()) {
				System.out.println("Key was pressed!");
				FasttravelScreen screen = new FasttravelScreen();
				client.setScreenAndRender(screen);
			}
		});
	}
}