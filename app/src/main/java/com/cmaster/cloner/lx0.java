package com.cmaster.cloner;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lx0 extends OooOO0O {
    public IconCompat OooO0o;
    public IconCompat OooO0o0;
    public boolean OooO0oO;

    @Override // com.cmaster.cloner.OooOO0O
    public final void OooO0OO(ho1 ho1Var) {
        Bitmap bitmapOooO00o;
        Notification.Builder builder = (Notification.Builder) ho1Var.OooO0o;
        Context context = (Context) ho1Var.OooO0o0;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.OooO0o0;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                kx0.OooO00o(bigContentTitle, iconCompat.OooO0oO(context));
            } else if (iconCompat.OooO0o0() == 1) {
                IconCompat iconCompat2 = this.OooO0o0;
                int i = iconCompat2.OooO00o;
                if (i == -1) {
                    Object obj = iconCompat2.OooO0O0;
                    bitmapOooO00o = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapOooO00o = (Bitmap) iconCompat2.OooO0O0;
                } else {
                    if (i != 5) {
                        ra.OooO0o0(iconCompat2, "called getBitmap() on ");
                        return;
                    }
                    bitmapOooO00o = IconCompat.OooO00o((Bitmap) iconCompat2.OooO0O0, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapOooO00o);
            }
        }
        if (this.OooO0oO) {
            IconCompat iconCompat3 = this.OooO0o;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                jx0.OooO00o(bigContentTitle, iconCompat3.OooO0oO(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            kx0.OooO0OO(bigContentTitle, false);
            kx0.OooO0O0(bigContentTitle, null);
        }
    }

    @Override // com.cmaster.cloner.OooOO0O
    public final String OooO0o() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
