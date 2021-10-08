package com.niemiec.risingview.view;

public enum RisingSoundValue {
    NONE("Brak", 0, 0),
    FIRST("30s", 1, 30),
    SECOND("60s", 2, 60),
    THIRD("90s", 3, 90);

    private final String name;
    private final int buttonId;
    private final int value;

    RisingSoundValue(String name, int buttonId, int value) {
        this.name = name;
        this.buttonId = buttonId;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getButtonId() {
        return buttonId;
    }

    public int getValue() {
        return value;
    }
}
