package com.niemiec.risingview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.google.android.material.button.MaterialButton;
import com.niemiec.risingview.logic.RisingSoundViewLogic;
import com.niemiec.risingview.model.RisingSound;

import androidx.annotation.Nullable;

public class RisingSoundView extends LinearLayout {
    //TODO tutaj wchodzi RisingSound i wychodzi zmienione
    private RisingSound risingSound;
    private RisingSoundViewLogic logic;
    private ViewBuilder viewBuilder;
    public RisingSoundView(Context context) {
        super(context);
        setProperties();
    }

    public RisingSoundView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setProperties();
    }

    public RisingSoundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setProperties();
    }

    private void setProperties() {
        viewBuilder = new ViewBuilder(super.getContext());

        addView(viewBuilder.getTextView());
        for (MaterialButton button : viewBuilder.getRisingSoundViewButtons().getButtons()) {
            addView(button);
        }

        createRisingSoundViewLogic(viewBuilder.getRisingSoundViewButtons());
    }

    private void createRisingSoundViewLogic(RisingSoundViewButtons buttons) {
        logic = new RisingSoundViewLogic(buttons);
    }

    //TODO
    public void initialize(RisingSound risingSound) {
        logic.initialize(risingSound);
    }
}
