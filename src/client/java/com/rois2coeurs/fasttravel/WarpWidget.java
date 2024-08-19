package com.rois2coeurs.fasttravel;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.text.Text;

public class WarpWidget extends ClickableWidget {
    private final Warp warp;

    public WarpWidget(double x, double y, double width, double height, Warp warp) {
        super((int) x, (int) y, (int) width, (int) height, Text.empty());
        this.warp = warp;
    }

    @Override
    protected void renderWidget(DrawContext context, int mouseX, int mouseY, float delta) {
        if (isHovered()) {
            context.drawTexture(warp.texture, getX() - 5, getY() - 5, 0, 0, getWidth() + 10, getHeight() + 10, getWidth() + 10, getHeight() + 10);
            context.drawTooltip(MinecraftClient.getInstance().textRenderer, Text.literal(warp.displayName), mouseX, mouseY);
        } else {
            context.drawTexture(warp.texture, getX(), getY(), 0, 0, getWidth(), getHeight(), getWidth(), getHeight());
        }
    }

    @Override
    protected void appendClickableNarrations(NarrationMessageBuilder builder) {
    }

    @Override
    public void onClick(double mouseX, double mouseY) {
        warp.onClick.accept(null);
    }
}
