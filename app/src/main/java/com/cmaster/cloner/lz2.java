package com.cmaster.cloner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzcwl;
import com.google.android.gms.internal.ads.zzded;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzdsj;
import com.google.android.gms.internal.ads.zzecm;
import com.google.android.gms.internal.ads.zzecn;
import com.google.android.gms.internal.ads.zzedf;
import com.google.android.gms.internal.ads.zzedh;
import com.google.android.gms.internal.ads.zzfwg;
import java.util.Collections;
import org.json.JSONException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class lz2 extends zzbtp {
    public static final int OooOoO = Color.argb(0, 0, 0, 0);
    public final Activity OooO0Oo;
    public zzcfg OooO0o;
    public AdOverlayInfoParcel OooO0o0;
    public ho0 OooO0oO;
    public o93 OooO0oo;
    public FrameLayout OooOO0;
    public WebChromeClient.CustomViewCallback OooOO0O;
    public to2 OooOOO;
    public u91 OooOOo;
    public boolean OooOOoo;
    public Toolbar OooOo;
    public boolean OooOo00;
    public boolean OooO = false;
    public boolean OooOO0o = false;
    public boolean OooOOO0 = false;
    public boolean OooOOOO = false;
    public int OooOoO0 = 1;
    public final Object OooOOOo = new Object();
    public final o00O00O OooOOo0 = new o00O00O(this, 6);
    public boolean OooOo0 = false;
    public boolean OooOo0O = false;
    public boolean OooOo0o = true;

    public lz2(Activity activity) {
        this.OooO0Oo = activity;
    }

    public static final void o0O0ooO(View view, zzedh zzedhVar) {
        if (zzedhVar == null || view == null) {
            return;
        }
        if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzfB)).booleanValue() && zzedhVar.zzb()) {
            return;
        }
        ya3.OooOooO.OooOoO0.zzj(zzedhVar.zza(), view);
    }

    public final void o00(View view) {
        zzedh zzedhVarZzQ;
        zzedf zzedfVarZzP;
        zzcfg zzcfgVar = this.OooO0o;
        if (zzcfgVar == null) {
            return;
        }
        zzbcv zzbcvVar = zzbde.zzfC;
        u72 u72Var = u72.OooO0Oo;
        if (((Boolean) u72Var.OooO0OO.zzb(zzbcvVar)).booleanValue() && (zzedfVarZzP = zzcfgVar.zzP()) != null) {
            zzedfVarZzP.zza(view);
        } else if (((Boolean) u72Var.OooO0OO.zzb(zzbde.zzfB)).booleanValue() && (zzedhVarZzQ = zzcfgVar.zzQ()) != null && zzedhVarZzQ.zzb()) {
            ya3.OooOooO.OooOoO0.zzg(zzedhVarZzQ.zza(), view);
        }
    }

    public final void o0000o0O(int i) {
        Activity activity = this.OooO0Oo;
        int i2 = activity.getApplicationInfo().targetSdkVersion;
        zzbcv zzbcvVar = zzbde.zzgk;
        u72 u72Var = u72.OooO0Oo;
        if (i2 >= ((Integer) u72Var.OooO0OO.zzb(zzbcvVar)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) u72Var.OooO0OO.zzb(zzbde.zzgl)).intValue()) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= ((Integer) u72Var.OooO0OO.zzb(zzbde.zzgm)).intValue()) {
                    if (i3 <= ((Integer) u72Var.OooO0OO.zzb(zzbde.zzgn)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            ya3.OooOooO.OooO0oo.zzv(th, "AdOverlay.setRequestedOrientation");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o000oooo(boolean r42) throws org.json.JSONException, com.cmaster.cloner.nm2 {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.lz2.o000oooo(boolean):void");
    }

    public final void o00O000(boolean z, boolean z2) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        kx2 kx2Var;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        kx2 kx2Var2;
        zzbcv zzbcvVar = zzbde.zzbl;
        u72 u72Var = u72.OooO0Oo;
        boolean z3 = true;
        boolean z4 = ((Boolean) u72Var.OooO0OO.zzb(zzbcvVar)).booleanValue() && (adOverlayInfoParcel2 = this.OooO0o0) != null && (kx2Var2 = adOverlayInfoParcel2.OooOOo) != null && kx2Var2.OooOO0O;
        boolean z5 = ((Boolean) u72Var.OooO0OO.zzb(zzbde.zzbm)).booleanValue() && (adOverlayInfoParcel = this.OooO0o0) != null && (kx2Var = adOverlayInfoParcel.OooOOo) != null && kx2Var.OooOO0o;
        if (z && z2 && z4 && !z5) {
            new zzbsu(this.OooO0o, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        o93 o93Var = this.OooO0oo;
        if (o93Var != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            ImageButton imageButton = o93Var.OooO0Oo;
            if (!z3) {
                imageButton.setVisibility(0);
                return;
            }
            imageButton.setVisibility(8);
            if (((Long) u72Var.OooO0OO.zzb(zzbde.zzbp)).longValue() > 0) {
                imageButton.animate().cancel();
                imageButton.clearAnimation();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o00O0000(android.content.res.Configuration r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.lz2.o00O0000(android.content.res.Configuration):void");
    }

    public final void o00oOoo(boolean z) throws JSONException {
        if (this.OooO0o0.OooOoO) {
            return;
        }
        zzbcv zzbcvVar = zzbde.zzfs;
        u72 u72Var = u72.OooO0Oo;
        int iIntValue = ((Integer) u72Var.OooO0OO.zzb(zzbcvVar)).intValue();
        boolean z2 = ((Boolean) u72Var.OooO0OO.zzb(zzbde.zzbn)).booleanValue() || z;
        i83 i83Var = new i83();
        i83Var.OooO00o = 0;
        i83Var.OooO0O0 = 0;
        i83Var.OooO0OO = 0;
        i83Var.OooO0Oo = 50;
        i83Var.OooO00o = true != z2 ? 0 : iIntValue;
        i83Var.OooO0O0 = true != z2 ? iIntValue : 0;
        i83Var.OooO0OO = iIntValue;
        this.OooO0oo = new o93(this.OooO0Oo, i83Var, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        o00O000(z, this.OooO0o0.OooOO0);
        this.OooOOO.addView(this.OooO0oo, layoutParams);
        o00(this.OooO0oo);
    }

    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        x53 x53Var;
        if (!this.OooO0Oo.isFinishing() || this.OooOo0) {
            return;
        }
        this.OooOo0 = true;
        zzcfg zzcfgVar = this.OooO0o;
        if (zzcfgVar != null) {
            zzcfgVar.zzZ(this.OooOoO0 - 1);
            synchronized (this.OooOOOo) {
                try {
                    if (!this.OooOOoo && this.OooO0o.zzaC()) {
                        zzbcv zzbcvVar = zzbde.zzfn;
                        u72 u72Var = u72.OooO0Oo;
                        if (((Boolean) u72Var.OooO0OO.zzb(zzbcvVar)).booleanValue() && !this.OooOo0O && (adOverlayInfoParcel = this.OooO0o0) != null && (x53Var = adOverlayInfoParcel.OooO0o) != null) {
                            x53Var.zzds();
                        }
                        u91 u91Var = new u91(this, 22);
                        this.OooOOo = u91Var;
                        a73.OooOO0o.postDelayed(u91Var, ((Long) u72Var.OooO0OO.zzb(zzbde.zzbk)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final boolean zzH() {
        this.OooOoO0 = 1;
        if (this.OooO0o == null) {
            return true;
        }
        if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzjp)).booleanValue() && this.OooO0o.canGoBack()) {
            this.OooO0o.goBack();
            return false;
        }
        boolean zZzaH = this.OooO0o.zzaH();
        if (!zZzaH) {
            this.OooO0o.zzd("onbackblocked", Collections.EMPTY_MAP);
        }
        return zZzaH;
    }

    public final void zzb() {
        this.OooOoO0 = 3;
        Activity activity = this.OooO0Oo;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.OooO0o0;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.OooOOO != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzcfg zzcfgVar = this.OooO0o;
        if (zzcfgVar != null) {
            zzcfgVar.zzai(null);
        }
    }

    public final void zzc() {
        zzcfg zzcfgVar;
        x53 x53Var;
        if (this.OooOo0O) {
            return;
        }
        this.OooOo0O = true;
        zzcfg zzcfgVar2 = this.OooO0o;
        if (zzcfgVar2 != null) {
            this.OooOOO.removeView(zzcfgVar2.zzF());
            ho0 ho0Var = this.OooO0oO;
            if (ho0Var != null) {
                this.OooO0o.zzan((Context) ho0Var.OooO0Oo);
                this.OooO0o.zzaq(false);
                if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zznc)).booleanValue() && this.OooO0o.getParent() != null) {
                    ((ViewGroup) this.OooO0o.getParent()).removeView(this.OooO0o.zzF());
                }
                ViewGroup viewGroup = (ViewGroup) this.OooO0oO.OooO0OO;
                View viewZzF = this.OooO0o.zzF();
                ho0 ho0Var2 = this.OooO0oO;
                viewGroup.addView(viewZzF, ho0Var2.OooO00o, (ViewGroup.LayoutParams) ho0Var2.OooO0O0);
                this.OooO0oO = null;
            } else {
                Activity activity = this.OooO0Oo;
                if (activity.getApplicationContext() != null) {
                    this.OooO0o.zzan(activity.getApplicationContext());
                }
            }
            this.OooO0o = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.OooO0o0;
        if (adOverlayInfoParcel != null && (x53Var = adOverlayInfoParcel.OooO0o) != null) {
            x53Var.zzdw(this.OooOoO0);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.OooO0o0;
        if (adOverlayInfoParcel2 == null || (zzcfgVar = adOverlayInfoParcel2.OooO0oO) == null) {
            return;
        }
        o0O0ooO(this.OooO0o0.OooO0oO.zzF(), zzcfgVar.zzQ());
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.OooO0o0;
        if (adOverlayInfoParcel != null && this.OooO) {
            o0000o0O(adOverlayInfoParcel.OooOOO0);
        }
        if (this.OooOO0 != null) {
            this.OooO0Oo.setContentView(this.OooOOO);
            this.OooOo00 = true;
            this.OooOO0.removeAllViews();
            this.OooOO0 = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.OooOO0O;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.OooOO0O = null;
        }
        this.OooO = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzh(int i, int i2, Intent intent) {
        zzdsj zzdsjVarZze;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            zzbcv zzbcvVar = zzbde.zzny;
            u72 u72Var = u72.OooO0Oo;
            if (((Boolean) u72Var.OooO0OO.zzb(zzbcvVar)).booleanValue()) {
                uh2.OooO00o("Callback from intent launch with requestCode: 236 and resultCode: " + i2);
                zzcfg zzcfgVar = this.OooO0o;
                if (zzcfgVar == null || zzcfgVar.zzN() == null || (zzdsjVarZze = zzcfgVar.zzN().zze()) == null || (adOverlayInfoParcel = this.OooO0o0) == null || !((Boolean) u72Var.OooO0OO.zzb(zzbcvVar)).booleanValue()) {
                    return;
                }
                zzdsi zzdsiVarZza = zzdsjVarZze.zza();
                zzdsiVarZza.zzb("action", "hilca");
                zzdsiVarZza.zzb("gqi", zzfwg.zzc(adOverlayInfoParcel.OooOo00));
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                zzdsiVarZza.zzb("hilr", sb.toString());
                if (i2 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zzdsiVarZza.zzb("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zzdsiVarZza.zzb("hills", stringExtra2);
                    }
                }
                zzdsiVarZza.zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzi() {
        this.OooOoO0 = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzk(fc0 fc0Var) {
        o00O0000((Configuration) ey0.o0O0ooO(fc0Var));
    }

    public void zzl(Bundle bundle) throws JSONException, nm2 {
        boolean z = this.OooOo00;
        Activity activity = this.OooO0Oo;
        if (!z) {
            activity.requestWindowFeature(1);
        }
        this.OooOO0o = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelOooO00o = AdOverlayInfoParcel.OooO00o(activity.getIntent());
            this.OooO0o0 = adOverlayInfoParcelOooO00o;
            if (adOverlayInfoParcelOooO00o == null) {
                throw new nm2("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelOooO00o.OooOoO) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.OooO0o0.OooOOOo.OooO0o > 7500000) {
                this.OooOoO0 = 4;
            }
            if (activity.getIntent() != null) {
                this.OooOo0o = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.OooO0o0;
            kx2 kx2Var = adOverlayInfoParcel.OooOOo;
            int i = adOverlayInfoParcel.OooOOO;
            if (kx2Var != null) {
                boolean z2 = kx2Var.OooO0Oo;
                this.OooOOO0 = z2;
                if (z2) {
                    if (i != 5 && kx2Var.OooO != -1) {
                        new jb2(this).zzb();
                    }
                }
            } else if (i == 5) {
                this.OooOOO0 = true;
                if (i != 5) {
                    new jb2(this).zzb();
                }
            } else {
                this.OooOOO0 = false;
            }
            if (bundle == null) {
                if (this.OooOo0o) {
                    zzcwl zzcwlVar = this.OooO0o0.OooOo0o;
                    if (zzcwlVar != null) {
                        zzcwlVar.zzb();
                    }
                    x53 x53Var = this.OooO0o0.OooO0o;
                    if (x53Var != null) {
                        x53Var.zzdt();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.OooO0o0;
                if (adOverlayInfoParcel2.OooOOO != 1) {
                    e32 e32Var = adOverlayInfoParcel2.OooO0o0;
                    if (e32Var != null) {
                        e32Var.onAdClicked();
                    }
                    zzded zzdedVar = this.OooO0o0.OooOo;
                    if (zzdedVar != null) {
                        zzdedVar.zzdf();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.OooO0o0;
            to2 to2Var = new to2(activity, adOverlayInfoParcel3.OooOOo0, adOverlayInfoParcel3.OooOOOo.OooO0Oo, adOverlayInfoParcel3.OooOo0O);
            this.OooOOO = to2Var;
            to2Var.setId(zzbcj.zzq.zzf);
            ya3.OooOooO.OooO0o.OooO0o(activity);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.OooO0o0;
            int i2 = adOverlayInfoParcel4.OooOOO;
            if (i2 == 1) {
                o000oooo(false);
                return;
            }
            if (i2 == 2) {
                this.OooO0oO = new ho0(adOverlayInfoParcel4.OooO0oO);
                o000oooo(false);
            } else if (i2 == 3) {
                o000oooo(true);
            } else {
                if (i2 != 5) {
                    throw new nm2("Could not determine ad overlay type.");
                }
                o000oooo(false);
            }
        } catch (nm2 e) {
            String message = e.getMessage();
            int i3 = uh2.OooO0O0;
            uh2.OooOO0(message);
            this.OooOoO0 = 4;
            activity.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzm() {
        zzcfg zzcfgVar = this.OooO0o;
        if (zzcfgVar != null) {
            try {
                this.OooOOO.removeView(zzcfgVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzo() {
        x53 x53Var;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.OooO0o0;
        if (adOverlayInfoParcel != null && (x53Var = adOverlayInfoParcel.OooO0o) != null) {
            x53Var.zzdk();
        }
        if (!((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzfp)).booleanValue() && this.OooO0o != null && (!this.OooO0Oo.isFinishing() || this.OooO0oO == null)) {
            this.OooO0o.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzp(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            zzecm zzecmVarZze = zzecn.zze();
            zzecmVarZze.zza(this.OooO0Oo);
            zzecmVarZze.zzb(this.OooO0o0.OooOOO == 5 ? this : null);
            try {
                this.OooO0o0.OooOoO0.zzf(strArr, iArr, new ey0(zzecmVarZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzr() {
        x53 x53Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.OooO0o0;
        if (adOverlayInfoParcel != null && (x53Var = adOverlayInfoParcel.OooO0o) != null) {
            x53Var.zzd();
        }
        o00O0000(this.OooO0Oo.getResources().getConfiguration());
        if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzfp)).booleanValue()) {
            return;
        }
        zzcfg zzcfgVar = this.OooO0o;
        if (zzcfgVar != null && !zzcfgVar.zzaE()) {
            this.OooO0o.onResume();
        } else {
            int i = uh2.OooO0O0;
            uh2.OooOO0("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.OooOO0o);
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzt() {
        if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzfp)).booleanValue()) {
            zzcfg zzcfgVar = this.OooO0o;
            if (zzcfgVar != null && !zzcfgVar.zzaE()) {
                this.OooO0o.onResume();
            } else {
                int i = uh2.OooO0O0;
                uh2.OooOO0("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzu() {
        if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzfp)).booleanValue() && this.OooO0o != null && (!this.OooO0Oo.isFinishing() || this.OooO0oO == null)) {
            this.OooO0o.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzv() {
        x53 x53Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.OooO0o0;
        if (adOverlayInfoParcel == null || (x53Var = adOverlayInfoParcel.OooO0o) == null) {
            return;
        }
        x53Var.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzx() {
        this.OooOo00 = true;
    }
}
