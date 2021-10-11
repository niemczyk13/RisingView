package com.niemiec.risingview.view.style;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;

import com.niemiec.risingview.R;

public class RisingSoundViewAttributes {
    private static float descriptionTextSize; // = tutaj zapisac defaoult wartosci
    private static float buttonTextSize;
    private static int buttonCheckBackgroundColor;
    private static int buttonCheckTextColor;
    private static int buttonUncheckBackgroundColor;
    private static int buttonUncheckTextColor;

    public static void setAttributes(Context context, AttributeSet attrs) {
        @SuppressLint("Recycle") TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.RisingSoundView);
        descriptionTextSize = a.getDimension(R.styleable.RisingSoundView_descriptionTextSize, 12);
        buttonTextSize = a.getDimension(R.styleable.RisingSoundView_buttonTextSize, 12);
        buttonCheckBackgroundColor = a.getColor(R.styleable.RisingSoundView_buttonCheckBackgroundColor, Color.rgb(255, 255, 255));
        buttonCheckTextColor = a.getColor(R.styleable.RisingSoundView_buttonCheckTextColor, Color.rgb(0,0,0));
        buttonUncheckBackgroundColor = a.getColor(R.styleable.RisingSoundView_buttonUncheckBackgroundColor, Color.rgb(0, 0, 0));
        buttonUncheckTextColor = a.getColor(R.styleable.RisingSoundView_buttonUncheckTextColor, Color.rgb(255, 255, 255));
    }

    public static float getDescriptionTextSize() {
        return descriptionTextSize;
    }

    public static float getButtonTextSize() {
        return buttonTextSize;
    }

    public static int getButtonCheckBackgroundColor() {
        return buttonCheckBackgroundColor;
    }

    public static int getButtonCheckTextColor() {
        return buttonCheckTextColor;
    }

    public static int getButtonUncheckBackgroundColor() {
        return buttonUncheckBackgroundColor;
    }

    public static int getButtonUncheckTextColor() {
        return buttonUncheckTextColor;
    }
}
