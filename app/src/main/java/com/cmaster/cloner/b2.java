package com.cmaster.cloner;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.os.Trace;
import com.cmaster.cloner.y41;
import com.google.android.gms.internal.ads.zzbcj;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class b2 {
    public static void OooO(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static ColorFilter OooO00o(Object obj) {
        return new BlendModeColorFilter(0, (BlendMode) obj);
    }

    public static String OooO0O0(Context context) {
        return context.getOpPackageName();
    }

    public static boolean OooO0OO() {
        return Trace.isEnabled();
    }

    public static Object OooO0Oo() {
        switch (rj.OooOOoo(1)) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case 16:
                return BlendMode.DARKEN;
            case 17:
                return BlendMode.LIGHTEN;
            case 18:
                return BlendMode.COLOR_DODGE;
            case 19:
                return BlendMode.COLOR_BURN;
            case 20:
                return BlendMode.HARD_LIGHT;
            case zzbcj.zzt.zzm /* 21 */:
                return BlendMode.SOFT_LIGHT;
            case 22:
                return BlendMode.DIFFERENCE;
            case 23:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case 25:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case 27:
                return BlendMode.COLOR;
            case 28:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static void OooO0o(Resources.Theme theme) {
        theme.rebase();
    }

    public static Insets OooO0o0(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static final void OooO0oO(Activity activity, y41.OooO00o oooO00o) {
        activity.registerActivityLifecycleCallbacks(oooO00o);
    }

    public static void OooO0oo(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void OooOO0(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
