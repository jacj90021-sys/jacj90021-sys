package com.cmaster.cloner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzded;
import com.google.android.gms.internal.ads.zzdsj;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class v03 implements qo1, sr, tz, la1, e41, sz0, iy, ie, bu1, cu {
    public static v03 OooO0Oo;
    public static v03 OooO0oO;
    public static v03 OooO0oo;
    public static final v03 OooO0o0 = new v03();
    public static final /* synthetic */ v03 OooO0o = new v03();

    public static void OooOOOo(rc1 rc1Var, Object obj) {
        c81 c81Var = (c81) obj;
        rc1Var.OooO00o(1, c81Var.OooO00o);
        rc1Var.OooO00o(2, c81Var.OooO0O0);
        rc1Var.OooO00o(3, c81Var.OooO0OO);
        String str = c81Var.OooO0Oo;
        if (str == null) {
            rc1Var.OooO0O0(4);
        } else {
            rc1Var.OooO0oO(4, str);
        }
        String str2 = c81Var.OooO0o0;
        if (str2 == null) {
            rc1Var.OooO0O0(5);
        } else {
            rc1Var.OooO0oO(5, str2);
        }
        rc1Var.OooO00o(6, c81Var.OooO0o);
        rc1Var.OooO00o(7, c81Var.OooO0oO);
        rc1Var.OooO00o(8, c81Var.OooO0oo);
        String str3 = c81Var.OooO;
        if (str3 == null) {
            rc1Var.OooO0O0(9);
        } else {
            rc1Var.OooO0oO(9, str3);
        }
        String str4 = c81Var.OooOO0;
        if (str4 == null) {
            rc1Var.OooO0O0(10);
        } else {
            rc1Var.OooO0oO(10, str4);
        }
        rc1Var.OooO00o(11, c81Var.OooOO0O);
    }

    public static final void OooOOo(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z, zzdsj zzdsjVar) {
        if (adOverlayInfoParcel.OooOOO == 4 && adOverlayInfoParcel.OooO0o == null) {
            e32 e32Var = adOverlayInfoParcel.OooO0o0;
            if (e32Var != null) {
                e32Var.onAdClicked();
            }
            zzded zzdedVar = adOverlayInfoParcel.OooOo;
            if (zzdedVar != null) {
                zzdedVar.zzdf();
            }
            Activity activityZzi = adOverlayInfoParcel.OooO0oO.zzi();
            ib2 ib2Var = adOverlayInfoParcel.OooO0Oo;
            Context context2 = (ib2Var == null || !ib2Var.OooOOO0 || activityZzi == null) ? context : activityZzi;
            gu0 gu0Var = ya3.OooOooO.OooO00o;
            gu0.OooOO0(context2, ib2Var, adOverlayInfoParcel.OooOO0o, ib2Var != null ? ib2Var.OooOO0o : null, zzdsjVar, adOverlayInfoParcel.OooOo00);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.OooOOOo.OooO0oO);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zznx)).booleanValue()) {
            a73 a73Var = ya3.OooOooO.OooO0OO;
            a73.OooOOoo(context, intent, zzdsjVar, adOverlayInfoParcel.OooOo00);
        } else {
            a73 a73Var2 = ya3.OooOooO.OooO0OO;
            a73.OooOOo0(context, intent);
        }
    }

    public static synchronized void OooOOo0() {
        if (OooO0Oo == null) {
            OooO0Oo = new v03();
        }
    }

    @Override // com.cmaster.cloner.e41
    public CharSequence OooO(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        CharSequence[] charSequenceArr = listPreference.o000oOoO;
        int iOooOoO = listPreference.OooOoO(listPreference.OoooOOo);
        if (TextUtils.isEmpty((iOooOoO < 0 || charSequenceArr == null) ? null : charSequenceArr[iOooOoO])) {
            return listPreference.OooO0Oo.getString(R.string.not_set);
        }
        int iOooOoO2 = listPreference.OooOoO(listPreference.OoooOOo);
        if (iOooOoO2 < 0 || charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[iOooOoO2];
    }

    @Override // com.cmaster.cloner.tz
    public Class OooO00o() {
        return ParcelFileDescriptor.class;
    }

    @Override // com.cmaster.cloner.tz
    public void OooO0O0(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }

    public yt1 OooO0OO(Class cls) {
        return su2.OooO00o(cls);
    }

    @Override // com.cmaster.cloner.bu1
    public yt1 OooO0Oo(rd rdVar, fv0 fv0Var) {
        Class cls = rdVar.OooO00o;
        cls.getClass();
        return OooOOO(cls, fv0Var);
    }

    @Override // com.cmaster.cloner.la1
    public int OooO0o(xz0 xz0Var) {
        return 1;
    }

    @Override // com.cmaster.cloner.sz0
    public void OooO0o0(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // com.cmaster.cloner.sr
    public File OooO0oO(zk0 zk0Var) {
        return null;
    }

    @Override // com.cmaster.cloner.ie
    public long OooO0oo() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.cmaster.cloner.tz
    public Object OooOO0(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // com.cmaster.cloner.zv
    public boolean OooOO0O(Object obj, File file, xz0 xz0Var) throws Throwable {
        try {
            ba.OooO0Oo(((d50) ((x40) ((fa1) obj).get()).OooO0Oo.OooO0O0).OooO00o.OooO0Oo.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // com.cmaster.cloner.cu
    public int OooOO0o(Context context, String str, boolean z) {
        return fu.OooO0Oo(context, str, z);
    }

    public yt1 OooOOO(Class cls, fv0 fv0Var) {
        return OooO0OO(cls);
    }

    @Override // com.cmaster.cloner.cu
    public int OooOOO0(Context context, String str) {
        return fu.OooO00o(context, str);
    }

    @Override // com.cmaster.cloner.sr
    public void OooOOOO(zk0 zk0Var, hx2 hx2Var) {
    }

    @Override // com.cmaster.cloner.qo1
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // com.cmaster.cloner.q51
    public Object get() {
        qc3 qc3Var = new qc3(14);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            qa.OooOOO0("Null flags");
            return null;
        }
        map.put(s41.OooO0Oo, new f5(30000L, 86400000L, set));
        if (set == null) {
            qa.OooOOO0("Null flags");
            return null;
        }
        map.put(s41.OooO0o, new f5(1000L, 86400000L, set));
        if (set == null) {
            qa.OooOOO0("Null flags");
            return null;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(pd1.OooO0Oo, pd1.OooO0o0)));
        if (setUnmodifiableSet == null) {
            qa.OooOOO0("Null flags");
            return null;
        }
        map.put(s41.OooO0o0, new f5(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() >= s41.values().length) {
            new HashMap();
            return new e5(qc3Var, map);
        }
        qa.OooO0o("Not all priorities have been configured");
        return null;
    }
}
