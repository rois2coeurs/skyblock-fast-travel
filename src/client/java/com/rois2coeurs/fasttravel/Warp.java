package com.rois2coeurs.fasttravel;

import net.minecraft.client.gui.widget.ButtonWidget;

public class Warp {
    public String Name;
    public ButtonWidget.PressAction OnClick;

    public Warp(String name, ButtonWidget.PressAction onClick) {
        Name = name;
        OnClick = onClick;
    }
}
