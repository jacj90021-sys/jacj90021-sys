package com.cmaster.cloner;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzdve;
import com.google.android.gms.internal.ads.zzdvi;
import com.google.android.gms.internal.ads.zzfrw;
import com.google.android.gms.internal.ads.zzgdy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class c62 {
    public PointF OooO;
    public final Context OooO00o;
    public final zzdvi OooO0O0;
    public String OooO0OO;
    public String OooO0Oo;
    public String OooO0o;
    public String OooO0o0;
    public final int OooO0oo;
    public PointF OooOO0;
    public final zzfrw OooOO0O;
    public int OooO0oO = 0;
    public final y32 OooOO0o = new y32(this, 1);

    public c62(Context context) {
        this.OooO00o = context;
        this.OooO0oo = ViewConfiguration.get(context).getScaledTouchSlop();
        ya3 ya3Var = ya3.OooOooO;
        ya3Var.OooOo00.OooO0o();
        this.OooOO0O = (zzfrw) ya3Var.OooOo00.OooO0OO;
        this.OooO0O0 = (zzdvi) ya3Var.OooOOOO.OooO0oO;
    }

    public static final int OooO0o0(ArrayList arrayList, String str, boolean z) {
        if (!z) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void OooO00o(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.OooO0oO = 0;
            this.OooO = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.OooO0oO;
        if (i == -1) {
            return;
        }
        y32 y32Var = this.OooOO0o;
        zzfrw zzfrwVar = this.OooOO0O;
        if (i == 0) {
            if (actionMasked == 5) {
                this.OooO0oO = 5;
                this.OooOO0 = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                zzfrwVar.postDelayed(y32Var, ((Long) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzfg)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !OooO0Oo(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (OooO0Oo(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.OooO0oO = -1;
            zzfrwVar.removeCallbacks(y32Var);
        }
    }

    public final void OooO0O0() {
        String str;
        try {
            Context context = this.OooO00o;
            if (!(context instanceof Activity)) {
                int i = uh2.OooO0O0;
                uh2.OooO("Can not create dialog without Activity Context");
                return;
            }
            ya3 ya3Var = ya3.OooOooO;
            pb1 pb1Var = ya3Var.OooOOOO;
            synchronized (pb1Var.OooO0OO) {
                str = (String) pb1Var.OooO0o0;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != ya3Var.OooOOOO.OooOOO() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iOooO0o0 = OooO0o0(arrayList, "Ad information", true);
            final int iOooO0o02 = OooO0o0(arrayList, str2, true);
            final int iOooO0o03 = OooO0o0(arrayList, str3, true);
            boolean zBooleanValue = ((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzjE)).booleanValue();
            final int iOooO0o04 = OooO0o0(arrayList, "Open ad inspector", zBooleanValue);
            final int iOooO0o05 = OooO0o0(arrayList, "Ad inspector settings", zBooleanValue);
            AlertDialog.Builder builderOooOO0 = a73.OooOO0(context);
            builderOooOO0.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.cmaster.cloner.b52
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    final c62 c62Var = this.OooO0Oo;
                    zzdvi zzdviVar = c62Var.OooO0O0;
                    final int i3 = 1;
                    if (i2 != iOooO0o0) {
                        if (i2 == iOooO0o02) {
                            int i4 = uh2.OooO0O0;
                            uh2.OooO0o0("Debug mode [Creative Preview] selected.");
                            zzcaf.zza.execute(new y32(c62Var, 2));
                            return;
                        }
                        if (i2 == iOooO0o03) {
                            int i5 = uh2.OooO0O0;
                            uh2.OooO0o0("Debug mode [Troubleshooting] selected.");
                            zzcaf.zza.execute(new y32(c62Var, 6));
                            return;
                        }
                        if (i2 == iOooO0o04) {
                            final zzgdy zzgdyVar = zzcaf.zzf;
                            zzgdy zzgdyVar2 = zzcaf.zza;
                            if (zzdviVar.zzq()) {
                                zzgdyVar.execute(new y32(c62Var, 5));
                                return;
                            } else {
                                zzgdyVar2.execute(new Runnable() { // from class: com.cmaster.cloner.w42
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i6 = i3;
                                        zzgdy zzgdyVar3 = zzgdyVar;
                                        c62 c62Var2 = c62Var;
                                        switch (i6) {
                                            case 0:
                                                ya3 ya3Var2 = ya3.OooOooO;
                                                pb1 pb1Var2 = ya3Var2.OooOOOO;
                                                Context context2 = c62Var2.OooO00o;
                                                if (!pb1Var2.OooOO0o(context2, c62Var2.OooO0Oo, c62Var2.OooO0o0)) {
                                                    ya3Var2.OooOOOO.OooO0oo(context2, c62Var2.OooO0Oo, c62Var2.OooO0o0);
                                                    break;
                                                } else {
                                                    zzgdyVar3.execute(new y32(c62Var2, 4));
                                                    break;
                                                }
                                            default:
                                                ya3 ya3Var3 = ya3.OooOooO;
                                                pb1 pb1Var3 = ya3Var3.OooOOOO;
                                                Context context3 = c62Var2.OooO00o;
                                                if (!pb1Var3.OooOO0o(context3, c62Var2.OooO0Oo, c62Var2.OooO0o0)) {
                                                    ya3Var3.OooOOOO.OooO0oo(context3, c62Var2.OooO0Oo, c62Var2.OooO0o0);
                                                    break;
                                                } else {
                                                    zzgdyVar3.execute(new y32(c62Var2, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i2 == iOooO0o05) {
                            final zzgdy zzgdyVar3 = zzcaf.zzf;
                            zzgdy zzgdyVar4 = zzcaf.zza;
                            final int i6 = 0;
                            if (zzdviVar.zzq()) {
                                zzgdyVar3.execute(new y32(c62Var, i6));
                                return;
                            } else {
                                zzgdyVar4.execute(new Runnable() { // from class: com.cmaster.cloner.w42
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i62 = i6;
                                        zzgdy zzgdyVar32 = zzgdyVar3;
                                        c62 c62Var2 = c62Var;
                                        switch (i62) {
                                            case 0:
                                                ya3 ya3Var2 = ya3.OooOooO;
                                                pb1 pb1Var2 = ya3Var2.OooOOOO;
                                                Context context2 = c62Var2.OooO00o;
                                                if (!pb1Var2.OooOO0o(context2, c62Var2.OooO0Oo, c62Var2.OooO0o0)) {
                                                    ya3Var2.OooOOOO.OooO0oo(context2, c62Var2.OooO0Oo, c62Var2.OooO0o0);
                                                    break;
                                                } else {
                                                    zzgdyVar32.execute(new y32(c62Var2, 4));
                                                    break;
                                                }
                                            default:
                                                ya3 ya3Var3 = ya3.OooOooO;
                                                pb1 pb1Var3 = ya3Var3.OooOOOO;
                                                Context context3 = c62Var2.OooO00o;
                                                if (!pb1Var3.OooOO0o(context3, c62Var2.OooO0Oo, c62Var2.OooO0o0)) {
                                                    ya3Var3.OooOOOO.OooO0oo(context3, c62Var2.OooO0Oo, c62Var2.OooO0o0);
                                                    break;
                                                } else {
                                                    zzgdyVar32.execute(new y32(c62Var2, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = c62Var.OooO00o;
                    if (!(context2 instanceof Activity)) {
                        int i7 = uh2.OooO0O0;
                        uh2.OooO("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = c62Var.OooO0OO;
                    String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        a73 a73Var = ya3.OooOooO.OooO0OO;
                        HashMap mapOooOOO0 = a73.OooOOO0(uriBuild);
                        for (String str6 : mapOooOOO0.keySet()) {
                            sb.append(str6);
                            sb.append(" = ");
                            sb.append((String) mapOooOOO0.get(str6));
                            sb.append("\n\n");
                        }
                        String strTrim = sb.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str5 = strTrim;
                        }
                    }
                    a73 a73Var2 = ya3.OooOooO.OooO0OO;
                    AlertDialog.Builder builderOooOO02 = a73.OooOO0(context2);
                    builderOooOO02.setMessage(str5);
                    builderOooOO02.setTitle("Ad Information");
                    builderOooOO02.setPositiveButton("Share", new bv1(c62Var, str5, i3));
                    builderOooOO02.setNegativeButton("Close", new av1(1));
                    builderOooOO02.create().show();
                }
            });
            builderOooOO0.create().show();
        } catch (WindowManager.BadTokenException e) {
            uh2.OooO0O0("", e);
        }
    }

    public final void OooO0OO(Context context) {
        ArrayList arrayList = new ArrayList();
        int iOooO0o0 = OooO0o0(arrayList, "None", true);
        final int iOooO0o02 = OooO0o0(arrayList, "Shake", true);
        final int iOooO0o03 = OooO0o0(arrayList, "Flick", true);
        int iOrdinal = this.OooO0O0.zza().ordinal();
        final int i = iOrdinal != 1 ? iOrdinal != 2 ? iOooO0o0 : iOooO0o03 : iOooO0o02;
        a73 a73Var = ya3.OooOooO.OooO0OO;
        AlertDialog.Builder builderOooOO0 = a73.OooOO0(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builderOooOO0.setTitle("Setup gesture");
        builderOooOO0.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new jn0(atomicInteger, 3));
        builderOooOO0.setNegativeButton("Dismiss", new jn0(this, 4));
        builderOooOO0.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.cmaster.cloner.r52
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                c62 c62Var = this.OooO0Oo;
                zzdvi zzdviVar = c62Var.OooO0O0;
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i) {
                    if (atomicInteger2.get() == iOooO0o02) {
                        zzdviVar.zzm(zzdve.SHAKE);
                    } else if (atomicInteger2.get() == iOooO0o03) {
                        zzdviVar.zzm(zzdve.FLICK);
                    } else {
                        zzdviVar.zzm(zzdve.NONE);
                    }
                }
                c62Var.OooO0O0();
            }
        });
        builderOooOO0.setOnCancelListener(new br(this, 1));
        builderOooOO0.create().show();
    }

    public final boolean OooO0Oo(float f, float f2, float f3, float f4) {
        float fAbs = Math.abs(this.OooO.x - f);
        int i = this.OooO0oo;
        return fAbs < ((float) i) && Math.abs(this.OooO.y - f2) < ((float) i) && Math.abs(this.OooOO0.x - f3) < ((float) i) && Math.abs(this.OooOO0.y - f4) < ((float) i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.OooO0OO);
        sb.append(",DebugSignal: ");
        sb.append(this.OooO0o);
        sb.append(",AFMA Version: ");
        sb.append(this.OooO0o0);
        sb.append(",Ad Unit ID: ");
        return rj.OooO0oO(sb, this.OooO0Oo, "}");
    }
}
