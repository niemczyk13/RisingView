package com.niemiec.risingview.view;

import android.content.Context;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class ViewBuilder {
    private TextView risingSoundDescription;
    private RisingSoundViewButtons buttons;


    public ViewBuilder(Context context) {
        risingSoundDescription = new TextView(context);
        risingSoundDescription.setText("Narastający dźwięk: ");


        buttons = new RisingSoundViewButtons(context);

    }

    public TextView getTextView() {
        return risingSoundDescription;
    }

    public RisingSoundViewButtons getRisingSoundViewButtons() {
        return buttons;
    }
}
