package com.niemiec.risingview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.google.android.material.button.MaterialButton;
import com.niemiec.risingview.logic.RisingSoundViewLogic;

import androidx.annotation.Nullable;

public class RisingSoundView extends LinearLayout {
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
        for (MaterialButton button : viewBuilder.getButtons()) {
            addView(button);
        }
    }
}
