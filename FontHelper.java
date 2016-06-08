package com.freelance.utils;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class FontHelper {
    private static FontHelper instance;
    private Typeface REGULAR;
    private Typeface BOLD;

    private FontHelper() {
        init();
    }

    public static FontHelper getInstance() {
        if (instance == null) {
            instance = new FontHelper();
        }

        return instance;
    }

    private void init() {
        try {
            REGULAR = Typeface.createFromAsset(CustomApp.getContext().getAssets(), "fonts/Roboto/Roboto-Condensed.ttf");
            BOLD = Typeface.createFromAsset(CustomApp.getContext().getAssets(), "fonts/Roboto/Roboto-BoldCondensed.ttf");
        } catch (Exception e) {
            new LogManager(FontHelper.class).printError("Can't get fonts", e);
        }
    }

    public void applyFont(View view) {
        if (view != null) {
            apply((ViewGroup) view);
        }
    }

    private void apply(ViewGroup parentView) {
        try {
            for (int i = 0; i < parentView.getChildCount(); i++) {
                View view = parentView.getChildAt(i);

                if (view instanceof CheckBox) {
                    Typeface typeFace = ((CheckBox) view).getTypeface();
                    if (typeFace == null)
                        ((CheckBox) view).setTypeface(REGULAR);
                    else {
                        if (typeFace.isBold())
                            ((CheckBox) view).setTypeface(BOLD);
                        else
                            ((CheckBox) view).setTypeface(REGULAR);
                    }
                } else if (view instanceof RadioButton) {
                    Typeface typeFace = ((RadioButton) view).getTypeface();
                    if (typeFace == null)
                        ((RadioButton) view).setTypeface(REGULAR);
                    else {
                        if (typeFace.isBold())
                            ((RadioButton) view).setTypeface(BOLD);
                        else
                            ((RadioButton) view).setTypeface(REGULAR);
                    }
                } else if (view instanceof Button) {
                    Typeface typeFace = ((Button) view).getTypeface();
                    if (typeFace == null)
                        ((Button) view).setTypeface(REGULAR);
                    else {
                        if (typeFace.isBold())
                            ((Button) view).setTypeface(BOLD);
                        else
                            ((Button) view).setTypeface(REGULAR);
                    }
                } else if (view instanceof EditText) {
                    Typeface typeFace = ((EditText) view).getTypeface();
                    if (typeFace == null)
                        ((EditText) view).setTypeface(REGULAR);
                    else {
                        if (typeFace.isBold())
                            ((EditText) view).setTypeface(BOLD);
                        else
                            ((EditText) view).setTypeface(REGULAR);
                    }
                } else if (view instanceof TextView) {
                    Typeface typeFace = ((TextView) view).getTypeface();
                    if (typeFace == null)
                        ((TextView) view).setTypeface(REGULAR);
                    else {
                        if (typeFace.isBold())
                            ((TextView) view).setTypeface(BOLD);
                        else
                            ((TextView) view).setTypeface(REGULAR);
                    }
                } else if (view instanceof ViewGroup && ((ViewGroup) view).getChildCount() > 0) {
                    apply((ViewGroup) view);
                }
            }
        } catch (Exception e) {
            new LogManager(FontHelper.class).printError("Can't apply font", e);
        }
    }
}
