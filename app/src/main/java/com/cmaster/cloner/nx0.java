package com.cmaster.cloner;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nx0 {
    public int OooO;
    public final Context OooO00o;
    public CharSequence OooO0o;
    public CharSequence OooO0o0;
    public PendingIntent OooO0oO;
    public IconCompat OooO0oo;
    public OooOO0O OooOO0O;
    public String OooOOO;
    public Bundle OooOOO0;
    public final boolean OooOOOO;
    public final Notification OooOOOo;
    public final ArrayList OooOOo0;
    public final ArrayList OooO0O0 = new ArrayList();
    public final ArrayList OooO0OO = new ArrayList();
    public final ArrayList OooO0Oo = new ArrayList();
    public final boolean OooOO0 = true;
    public boolean OooOO0o = false;

    public nx0(Context context, String str) {
        Notification notification = new Notification();
        this.OooOOOo = notification;
        this.OooO00o = context;
        this.OooOOO = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.OooO = 0;
        this.OooOOo0 = new ArrayList();
        this.OooOOOO = true;
    }

    public static CharSequence OooO0O0(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification OooO00o() {
        Bundle bundle;
        ho1 ho1Var = new ho1(this);
        nx0 nx0Var = (nx0) ho1Var.OooO0oO;
        OooOO0O oooOO0O = nx0Var.OooOO0O;
        if (oooOO0O != null) {
            oooOO0O.OooO0OO(ho1Var);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) ho1Var.OooO0o;
        Notification notificationBuild = i >= 26 ? builder.build() : builder.build();
        if (oooOO0O != null) {
            nx0Var.OooOO0O.getClass();
        }
        if (oooOO0O != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", oooOO0O.OooO0o());
        }
        return notificationBuild;
    }

    public final void OooO0OO(boolean z) {
        Notification notification = this.OooOOOo;
        if (z) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void OooO0Oo(Bitmap bitmap) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT < 27) {
            Resources resources = this.OooO00o.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
            }
        }
        PorterDuff.Mode mode = IconCompat.OooOO0O;
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.OooO0O0 = bitmap;
        this.OooO0oo = iconCompat;
    }

    public final void OooO0o0(OooOO0O oooOO0O) {
        if (this.OooOO0O != oooOO0O) {
            this.OooOO0O = oooOO0O;
            if (((nx0) oooOO0O.OooO0Oo) != this) {
                oooOO0O.OooO0Oo = this;
                OooO0o0(oooOO0O);
            }
        }
    }
}
