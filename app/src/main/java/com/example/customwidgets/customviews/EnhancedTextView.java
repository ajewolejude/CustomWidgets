package com.example.customwidgets.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;

import com.example.customwidgets.R;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class EnhancedTextView extends AppCompatTextView {

    public EnhancedTextView(Context context) {
        this(context, null);
    }

    public EnhancedTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public EnhancedTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray a = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.EnhancedTextView, defStyleAttr, 0);
        try {
            if (a.hasValue(R.styleable.EnhancedTextView_strikeThrough)) {
                setStrikeThrough(a.getBoolean(R.styleable.EnhancedTextView_strikeThrough, false));
            }
        } finally {
            a.recycle();
        }

    }

    public void setStrikeThrough(boolean strikeThrough) {
        if (strikeThrough) {
            this.setPaintFlags(this.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        } else {
            this.setPaintFlags(this.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
        }

    }

}
