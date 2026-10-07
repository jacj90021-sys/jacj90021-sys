package com.cmaster.cloner;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Path;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzdsj;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gu0 implements uj, ig, ar0, oy, us1 {
    public final /* synthetic */ int OooO0Oo;
    public static final /* synthetic */ gu0 OooO0o0 = new gu0(1);
    public static final /* synthetic */ gu0 OooO0o = new gu0(2);

    public /* synthetic */ gu0(int i) {
        this.OooO0Oo = i;
    }

    public static Path OooO0oO(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static final boolean OooO0oo(Context context, Intent intent, x32 x32Var, h32 h32Var, boolean z, zzdsj zzdsjVar, String str) {
        int iOooOooO;
        if (z) {
            try {
                iOooOooO = ya3.OooOooO.OooO0OO.OooOooO(intent.getData(), context);
                if (x32Var != null) {
                    x32Var.zzg();
                }
            } catch (ActivityNotFoundException e) {
                String message = e.getMessage();
                int i = uh2.OooO0O0;
                uh2.OooOO0(message);
                iOooOooO = 6;
            }
            if (h32Var != null) {
                h32Var.zzb(iOooOooO);
            }
            return iOooOooO == 5;
        }
        try {
            uh2.OooO00o("Launching an intent: " + intent.toURI());
            if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zznx)).booleanValue()) {
                a73 a73Var = ya3.OooOooO.OooO0OO;
                a73.OooOOoo(context, intent, zzdsjVar, str);
            } else {
                a73 a73Var2 = ya3.OooOooO.OooO0OO;
                a73.OooOOo0(context, intent);
            }
            if (x32Var != null) {
                x32Var.zzg();
            }
            if (h32Var != null) {
                h32Var.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            String message2 = e2.getMessage();
            int i2 = uh2.OooO0O0;
            uh2.OooOO0(message2);
            if (h32Var != null) {
                h32Var.zza(false);
            }
            return false;
        }
    }

    public static final boolean OooOO0(Context context, ib2 ib2Var, x32 x32Var, h32 h32Var, zzdsj zzdsjVar, String str) {
        int i = 0;
        if (ib2Var == null) {
            int i2 = uh2.OooO0O0;
            uh2.OooOO0("No intent data for launcher overlay.");
            return false;
        }
        zzbde.zza(context);
        Intent intent = ib2Var.OooOO0O;
        if (intent != null) {
            return OooO0oo(context, intent, x32Var, h32Var, ib2Var.OooOOO0, zzdsjVar, str);
        }
        Intent intent2 = new Intent();
        String str2 = ib2Var.OooO0o0;
        if (TextUtils.isEmpty(str2)) {
            int i3 = uh2.OooO0O0;
            uh2.OooOO0("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = ib2Var.OooO0o;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = ib2Var.OooO0oO;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = ib2Var.OooO0oo;
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/", 2);
            if (strArrSplit.length < 2) {
                int i4 = uh2.OooO0O0;
                uh2.OooOO0("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str6 = ib2Var.OooO;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i5 = uh2.OooO0O0;
                uh2.OooOO0("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        zzbcv zzbcvVar = zzbde.zzeQ;
        u72 u72Var = u72.OooO0Oo;
        if (((Boolean) u72Var.OooO0OO.zzb(zzbcvVar)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) u72Var.OooO0OO.zzb(zzbde.zzeP)).booleanValue()) {
                a73 a73Var = ya3.OooOooO.OooO0OO;
                a73.Oooo000(context, intent2);
            }
        }
        return OooO0oo(context, intent2, x32Var, h32Var, ib2Var.OooOOO0, zzdsjVar, str);
    }

    @Override // com.cmaster.cloner.us1
    public void OooO(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // com.cmaster.cloner.us1
    public void OooO00o(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // com.cmaster.cloner.ar0
    public cr0 OooO0O0(int i, er0 er0Var) {
        return new ov(er0Var);
    }

    @Override // com.cmaster.cloner.oy
    public py OooO0OO(float f, float f2, float f3) {
        return new py(dp1.OooO0o0(f2, f3, f, 255, 0), 255, false);
    }

    @Override // com.cmaster.cloner.ar0
    public boolean OooO0Oo() {
        return false;
    }

    @Override // com.cmaster.cloner.ar0
    public gr0 OooO0o(oOOO00 oooo00, hm0 hm0Var, o00OO000 o00oo000, er0 er0Var) {
        return gr0.OooO0oo;
    }

    @Override // com.cmaster.cloner.ig
    public Object OooO0o0(ab1 ab1Var) {
        switch (this.OooO0Oo) {
            case 2:
                return new vu0(ab1Var.OooO0OO(uu0.class));
            default:
                synchronized (y73.class) {
                    u63 u63Var = new u63();
                    synchronized (y73.class) {
                        try {
                            if (y73.OooO00o == null) {
                                y73.OooO00o = new n03(1);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return new im2();
                }
                return new im2();
        }
    }
}
