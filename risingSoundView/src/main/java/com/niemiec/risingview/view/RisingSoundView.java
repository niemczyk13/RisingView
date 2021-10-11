package com.niemiec.risingview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.niemiec.risingview.R;
import com.niemiec.risingview.logic.RisingSoundViewLogic;
import com.niemiec.risingview.model.RisingSound;
import com.niemiec.risingview.view.style.RisingSoundViewAttributes;

import androidx.annotation.Nullable;

import java.util.HashMap;
import java.util.Map;

public class RisingSoundView extends LinearLayout {
    private Map<Integer, Object> attributes;
    private float descriptionTextSize;
    private int buttonTextSize;
    private RisingSoundViewLogic logic;
    private ViewBuilder viewBuilder;
/*
    public RisingSoundView(Context context) {
        super(context);
        setProperties();
    }


 */
    public RisingSoundView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setProperties(attrs);
    }

    public RisingSoundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setProperties(attrs);
    }

    private void setProperties(AttributeSet attrs) {
        RisingSoundViewAttributes.setAttributes(super.getContext(), attrs);
        viewBuilder = new ViewBuilder(super.getContext());
        addViews();
        createRisingSoundViewLogic(viewBuilder.getRisingSoundViewButtons());
    }

    private void addViews() {
        addView(viewBuilder.getTextView());
        addButtonsInView();
    }

    private void addButtonsInView() {
        for (RisingSoundButton button : viewBuilder.getRisingSoundViewButtons().getButtons()) {
            addView(button);
        }
    }

    private void createRisingSoundViewLogic(RisingSoundViewButtons buttons) {
        logic = new RisingSoundViewLogic(buttons);
    }

    public void initialize(RisingSound risingSound) {
        logic.initialize(risingSound);
    }

    public RisingSound getRisingSound() {
        return logic.getRisingSound();
    }


}
