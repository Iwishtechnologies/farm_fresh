package Fonts;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.widget.TextView;

public class HindiFont extends android.support.v7.widget.AppCompatTextView {

    public HindiFont(Context context) {
        super(context);
        applyCustomFont(context);

    }

    public HindiFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);

    }

    public HindiFont(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {

        Typeface customFont = FontCacheRagular.getTypeface("Kruti Dev 010 Regular.ttf", context);

        setTypeface(customFont);
    }
}

