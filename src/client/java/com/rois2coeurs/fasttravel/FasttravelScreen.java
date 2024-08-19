package com.rois2coeurs.fasttravel;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

import java.util.ArrayList;

public class FasttravelScreen extends Screen {
    private static final int BUTTON_HEIGHT = 20; // minecraft default
    private static final int BUTTON_SPACING = 5; // minecraft default
    private static final int BUTTONS_PER_ROW = 3;

    protected FasttravelScreen() {
        super(Text.literal("Fast travel"));
    }

    @Override
    protected void init() {
        ArrayList<Warp> warps = new ArrayList<>();
        warps.add(new Warp("Hub", "textures/gui/hub.png", button -> {
            teleportToWarp("hub");
        }));
        warps.add(new Warp("The Park", "textures/gui/park.png", button -> {
            teleportToWarp("park");
        }));
        warps.add(new Warp("Spider's Den", "textures/gui/spidersden.png", button -> {
            teleportToWarp("spider");
        }));
        warps.add(new Warp("Gold Mine", "textures/gui/goldmine.png", button -> {
            teleportToWarp("gold");
        }));
        warps.add(new Warp("Farming Island", "textures/gui/farmingislands.png", button -> {
            teleportToWarp("barn");
        }));
        float horizontalUnit = (float) width / 100;
        float verticalUnit = (float) height / 100;
        WarpWidget hubWarpWidget = new WarpWidget(38.75 * horizontalUnit, 70  * verticalUnit, 22.5 * horizontalUnit, 30 * verticalUnit, warps.get(0));
        WarpWidget parkWarpWidget = new WarpWidget(28.5 * horizontalUnit, 70  * verticalUnit, 20 * verticalUnit, 20 * verticalUnit, warps.get(1));
        WarpWidget spidersdenWarpWidget = new WarpWidget(34 * horizontalUnit, 49  * verticalUnit, 20 * verticalUnit, 20 * verticalUnit, warps.get(2));
        WarpWidget goldmineWarpWidget = new WarpWidget(45 * horizontalUnit, 47  * verticalUnit, 20 * verticalUnit, 20 * verticalUnit, warps.get(3));
        WarpWidget farmingIslandWarpWidget = new WarpWidget(56 * horizontalUnit, 51  * verticalUnit, 20 * verticalUnit, 20 * verticalUnit, warps.get(4));
        addDrawableChild(hubWarpWidget);
        addDrawableChild(parkWarpWidget);
        addDrawableChild(spidersdenWarpWidget);
        addDrawableChild(goldmineWarpWidget);
        addDrawableChild(farmingIslandWarpWidget);
//        warps.add(new Warp("Private Island", button -> {
//            teleportToWarp("home");
//        }));
//        warps.add(new Warp("Hub Warps", button -> {
//            createMenu(getHubWarps());
//        }));
//        warps.add(new Warp("Dungeon Hub", button -> {
//            teleportToWarp("dungeon_hub");
//        }));
//        warps.add(new Warp("Farming Islands Warps", button -> {
//            createMenu(getFarmingIslandsWarps());
//        }));
//        warps.add(new Warp("Park Warps", button -> {
//            createMenu(getParkWarps());
//        }));
//        warps.add(new Warp("Gold Mine", button -> {
//            teleportToWarp("gold");
//        }));
//        warps.add(new Warp("Deep Caverns", button -> {
//            teleportToWarp("deep");
//        }));
//        warps.add(new Warp("Dwarven Mines Warps", button -> {
//            createMenu(getDwarvenMinesWarps());
//        }));
//        warps.add(new Warp("Crystal Hollows Warps", button -> {
//            createMenu(getCrystalHollowsWarps());
//        }));
//        warps.add(new Warp("Spider's Den Warps", button -> {
//            createMenu(getSpidersDenWarps());
//        }));
//        warps.add(new Warp("The End Warps", button -> {
//            createMenu(getTheEndWarps());
//        }));
//        warps.add(new Warp("Crimson Isle Warps", button -> {
//            createMenu(getCrimsonIsleWarps());
//        }));
//        warps.add(new Warp("The Garden", button -> {
//            teleportToWarp("garden");
//        }));
//        warps.add(new Warp("Jerry's Workshop", button -> {
//            teleportToWarp("jerry");
//        }));
//        createMenu(warps);
    }

//    private ArrayList<Warp> getHubWarps() {
//        ArrayList<Warp> warps = new ArrayList<>();
//        warps.add(new Warp("Spawn", button -> {
//            teleportToWarp("hub");
//        }));
//        warps.add(new Warp("Museum", button -> {
//            teleportToWarp("museum");
//        }));
//        warps.add(new Warp("Sirius Shack", button -> {
//            teleportToWarp("da");
//        }));
//        warps.add(new Warp("Ruins", button -> {
//            teleportToWarp("castle");
//        }));
//        warps.add(new Warp("Hub Crypts", button -> {
//            teleportToWarp("crypts");
//        }));
//        warps.add(new Warp("Carnival", button -> {
//            teleportToWarp("carnival");
//        }));
//        return warps;
//    }
//
//    private ArrayList<Warp> getFarmingIslandsWarps() {
//        ArrayList<Warp> warps = new ArrayList<>();
//        warps.add(new Warp("Spawn", button -> {
//            teleportToWarp("barn");
//        }));
//        warps.add(new Warp("Mushroom Desert", button -> {
//            teleportToWarp("desert");
//        }));
//        warps.add(new Warp("Trapper's Den", button -> {
//            teleportToWarp("trapper");
//        }));
//        return warps;
//    }
//
//    private ArrayList<Warp> getParkWarps() {
//        ArrayList<Warp> warps = new ArrayList<>();
//        warps.add(new Warp("Spawn", button -> {
//            teleportToWarp("park");
//        }));
//        warps.add(new Warp("Howling Cave", button -> {
//            teleportToWarp("howl");
//        }));
//        warps.add(new Warp("Jungle Island", button -> {
//            teleportToWarp("jungle");
//        }));
//        return warps;
//    }
//
//    private ArrayList<Warp> getDwarvenMinesWarps() {
//        ArrayList<Warp> warps = new ArrayList<>();
//        warps.add(new Warp("Spawn", button -> {
//            teleportToWarp("dwarves");
//        }));
//        warps.add(new Warp("The Forge", button -> {
//            teleportToWarp("forge");
//        }));
//        warps.add(new Warp("Dwarven Base Camp", button -> {
//            teleportToWarp("basecamp");
//        }));
//        return warps;
//    }
//
//    private ArrayList<Warp> getCrystalHollowsWarps() {
//        ArrayList<Warp> warps = new ArrayList<>();
//        warps.add(new Warp("Entrance", button -> {
//            teleportToWarp("crystals");
//        }));
//        warps.add(new Warp("Crystal Nucleus", button -> {
//            teleportToWarp("nucleus");
//        }));
//        return warps;
//    }
//
//    private ArrayList<Warp> getSpidersDenWarps() {
//        ArrayList<Warp> warps = new ArrayList<>();
//        warps.add(new Warp("Spawn", button -> {
//            teleportToWarp("spider");
//        }));
//        warps.add(new Warp("Top of Nest", button -> {
//            teleportToWarp("top");
//        }));
//        warps.add(new Warp("Arachne's Sanctuary", button -> {
//            teleportToWarp("arachne");
//        }));
//        return warps;
//    }
//
//    private ArrayList<Warp> getTheEndWarps() {
//        ArrayList<Warp> warps = new ArrayList<>();
//        warps.add(new Warp("Spawn", button -> {
//            teleportToWarp("end");
//        }));
//        warps.add(new Warp("Dragon's Nest", button -> {
//            teleportToWarp("drag");
//        }));
//        warps.add(new Warp("Void Sepulture", button -> {
//            teleportToWarp("void");
//        }));
//        return warps;
//    }
//
//    private ArrayList<Warp> getCrimsonIsleWarps() {
//        ArrayList<Warp> warps = new ArrayList<>();
//        warps.add(new Warp("Spawn", button -> {
//            teleportToWarp("isle");
//        }));
//        warps.add(new Warp("Forgotten Skull", button -> {
//            teleportToWarp("skull");
//        }));
//        warps.add(new Warp("Smoldering Tomb", button -> {
//            teleportToWarp("tomb");
//        }));
//        warps.add(new Warp("The Wasteland", button -> {
//            teleportToWarp("wasteland");
//        }));
//        warps.add(new Warp("Dragontail", button -> {
//            teleportToWarp("dragontail");
//        }));
//        warps.add(new Warp("Scarleton", button -> {
//            teleportToWarp("scarleton");
//        }));
//        return warps;
//    }

//    private void createMenu(ArrayList<Warp> warps) {
//        clearChildren();
//        int buttonWidth = (width - BUTTON_SPACING * (1 + BUTTONS_PER_ROW)) / (BUTTONS_PER_ROW);
//        for (int buttonNb = 0; buttonNb < warps.size(); buttonNb++) {
//            Warp warp = warps.get(buttonNb);
//            int xInitialPosition = width / BUTTONS_PER_ROW - buttonWidth;
//            int xDelta = (buttonWidth + BUTTON_SPACING);
//            int x = xInitialPosition + (buttonNb % BUTTONS_PER_ROW) * xDelta;
//            int yInitialPosition = 20;
//            int yDelta = (BUTTON_HEIGHT + BUTTON_SPACING);
//            int y = yInitialPosition + (buttonNb / BUTTONS_PER_ROW) * yDelta;
//            drawButton(warp.displayName, x, y, buttonWidth, warp.OnClick);
//            Identifier texture = new Identifier("fasttravel", "textures/gui/hub.png");
//            DrawContext drawContext = new DrawContext(MinecraftClient.getInstance(), MinecraftClient.getInstance().getBufferBuilders().getEffectVertexConsumers());
//            drawContext.drawTexture(texture, 90, 90, 0, 0, 16, 16, 16,16);
//        }
//        int imgWidth = width / 5;
//        int imgHeight = width / 5 / 4 * 3;
//        WarpWidget customWidget = new WarpWidget(width - width / 5, height - height / 2, imgWidth, imgHeight, "hub");
//        addDrawableChild(customWidget);
//    }

    private void drawButton(String text, int x, int y, int width, ButtonWidget.PressAction onClick) {
        ButtonWidget button = createButton(text, x, y, width, onClick);
        addDrawableChild(button);
    }

    private ButtonWidget createButton(String text, int x, int y, int width, ButtonWidget.PressAction onClick) {
        return ButtonWidget.builder(Text.literal(text), onClick)
                .dimensions(x, y, width, BUTTON_HEIGHT)
                .build();
    }

    private void teleportToWarp(String warpName) {
        assert MinecraftClient.getInstance().player != null;
        MinecraftClient.getInstance().player.networkHandler.sendChatCommand("warp " + warpName);
    }
}
