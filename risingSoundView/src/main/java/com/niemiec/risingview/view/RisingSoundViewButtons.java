package com.niemiec.risingview.view;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.material.button.MaterialButton;

public class RisingSoundViewButtons {
    private Context context;
    private MaterialButton[] risingValuesButtons;
    private String[] buttonsNames;

    public RisingSoundViewButtons(Context context) {
        this.context = context;
        createRisingButtonNames();
        createButtons();
    }

    private void createRisingButtonNames() {
        buttonsNames = new String[4];
        buttonsNames[0] = "Brak";
        buttonsNames[1] = "30s";
        buttonsNames[2] = "60s";
        buttonsNames[3] = "90s";
    }

    private void createButtons() {
        createRisingButtons();
    }

    private void createRisingButtons() {
        risingValuesButtons = new MaterialButton[4];
        for (int i = 0; i < risingValuesButtons.length; i++) {
            MaterialButton button = createRisingButton(buttonsNames[i]);
            risingValuesButtons[i] = button;
        }
    }

    private MaterialButton createRisingButton(String buttonsName) {
        MaterialButton button = new MaterialButton(context);
        button.setText(buttonsName);
        LinearLayout.LayoutParams params = getDefaultLayoutParamsForDayButton();
        button.setLayoutParams(params);
        button.setPadding(0, 0, 0, 0);
        button.setCheckable(true);
        setUncheckColorButton(button);
        button.setId(View.generateViewId());
        button.setOnClickListener(this::onRisingButtonClick);
        return button;
    }

    private void setUncheckColorButton(MaterialButton button) {
        button.setBackgroundColor(Color.rgb(0, 0, 0));
        button.setTextColor(Color.rgb(255, 255, 255));
    }

    private void setCheckColorButton(MaterialButton button) {
        button.setBackgroundColor(Color.rgb(255, 255, 255));
        button.setTextColor(Color.rgb(0,0,0));
    }

    private LinearLayout.LayoutParams getDefaultLayoutParamsForDayButton() {
        final float scale = context.getResources().getDisplayMetrics().density;

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.weight = 2;
        params.leftMargin = 1;
        params.rightMargin = 1;
        int dp = 55;
        params.height = (int) ((dp * scale) + 0.5f);

        return params;
    }

    //TODO
    private void onRisingButtonClick(View view) {
    }

    public MaterialButton[] getRisingValuesButtons() {
        return risingValuesButtons;
    }
}
