package com.tsongkha.spinnerdatepicker;

import android.text.InputFilter;
import android.widget.EditText;
import android.widget.NumberPicker;

/**
 * Created by David on 26/11/2017.
 */

public class NumberPickers {

    //inefficient way of obtaining EditText from inside NumberPicker - not too bad here as View
    //hierarchy is very small -
    public static EditText findEditText(NumberPicker np) {
        for (int i = 0; i < np.getChildCount(); i++) {
            if (np.getChildAt(i) instanceof EditText) {
                EditText ed = (EditText) np.getChildAt(i);
                ed.setFilters(new InputFilter[0]);
                return ed;
            }
        }
        return null;
    }
}
