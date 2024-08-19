package com.rois2coeurs.fasttravel;

import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class Warp {
    public String displayName;
    public Identifier texture;
    public Consumer<Void> onClick;

    public Warp(String name, String texturePath, Consumer<Void> onClick) {
        displayName = name;
        texture = new Identifier("fasttravel", texturePath);
        this.onClick = onClick;
    }
}
