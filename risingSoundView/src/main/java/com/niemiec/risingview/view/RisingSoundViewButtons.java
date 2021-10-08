package com.niemiec.risingview.view;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.material.button.MaterialButton;
import com.niemiec.risingview.model.RisingSound;

public class RisingSoundViewButtons {
    private Context context;
    private MaterialButton[] risingValuesButtons;
    private String[] buttonsNames;
    private int[] buttonValues;
    private int checkedButtonId;

    public RisingSoundViewButtons(Context context) {
        this.context = context;
        createRisingButtonNames();
        createButtons();
        createButtonValues();
    }

    private void createButtonValues() {
        buttonValues = new int[4];
        buttonValues[RisingSoundValue.NONE.getButtonId()] = RisingSoundValue.NONE.getValue();
        buttonValues[RisingSoundValue.FIRST.getButtonId()] = RisingSoundValue.FIRST.getValue();
        buttonValues[RisingSoundValue.SECOND.getButtonId()] = RisingSoundValue.SECOND.getValue();
        buttonValues[RisingSoundValue.THIRD.getButtonId()] = RisingSoundValue.THIRD.getValue();
    }

    private void createRisingButtonNames() {
        buttonsNames = new String[4];
        buttonsNames[RisingSoundValue.NONE.getButtonId()] = RisingSoundValue.NONE.getName();
        buttonsNames[RisingSoundValue.FIRST.getButtonId()] = RisingSoundValue.FIRST.getName();
        buttonsNames[RisingSoundValue.SECOND.getButtonId()] = RisingSoundValue.SECOND.getName();
        buttonsNames[RisingSoundValue.THIRD.getButtonId()] = RisingSoundValue.THIRD.getName();
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

    public void setRisingSound(RisingSound risingSound) {
        uncheckCheckedButton();

        checkedButtonId = risingSound.getButtonId();
        checkCheckedButton();

    }

    private void checkCheckedButton() {
        risingValuesButtons[checkedButtonId].setChecked(true);
    }

    private void uncheckCheckedButton() {
        risingValuesButtons[checkedButtonId].setChecked(false);
    }

    public MaterialButton[] getButtons() {
        return risingValuesButtons;
    }
}
