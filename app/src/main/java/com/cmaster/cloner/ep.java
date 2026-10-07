package com.cmaster.cloner;

import android.app.Notification;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ep {
    public static int OooO(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static Handler OooO00o(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler OooO0O0(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static String[] OooO0OO(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static int OooO0Oo(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static int OooO0o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static String OooO0o0(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int OooO0oO(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int OooO0oo(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int OooOO0(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params OooOO0O(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static int OooOO0o(Object obj) {
        return ((Icon) obj).getType();
    }

    public static void OooOOO(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static Uri OooOOO0(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void OooOOOO(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean OooOOOo(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
