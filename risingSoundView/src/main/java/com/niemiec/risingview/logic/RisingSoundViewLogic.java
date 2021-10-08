package com.niemiec.risingview.logic;

import com.niemiec.risingview.model.RisingSound;
import com.niemiec.risingview.view.RisingSoundViewButtons;

public class RisingSoundViewLogic {
    private RisingSoundViewButtons buttons;
    public RisingSoundViewLogic(RisingSoundViewButtons buttons) {
        this.buttons = buttons;
    }

    public void initialize(RisingSound risingSound) {
        buttons.setRisingSound(risingSound);
    }
}
