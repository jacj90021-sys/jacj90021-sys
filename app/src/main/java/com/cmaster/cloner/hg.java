package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hg implements ju0, rr {
    public final /* synthetic */ int OooO0Oo;
    public Context OooO0o0;

    public hg(Context context, im2 im2Var) {
        this.OooO0Oo = 0;
        this.OooO0o0 = context;
    }

    @Override // com.cmaster.cloner.rr
    public Class OooO00o() {
        return Drawable.class;
    }

    @Override // com.cmaster.cloner.rr
    public /* bridge */ /* synthetic */ void OooO0O0(Object obj) {
    }

    @Override // com.cmaster.cloner.rr
    public Object OooO0OO(int i, Resources.Theme theme, Resources resources) {
        Context context = this.OooO0o0;
        return kq2.OooO00o(context, context, i, theme);
    }

    public ym OooO0Oo() {
        Context context = this.OooO0o0;
        if (context == null) {
            qa.OooO0OO(Context.class.getCanonicalName(), " must be set");
            return null;
        }
        ym ymVar = new ym();
        ymVar.OooO0Oo = qs.OooO00o(u52.OooO00o);
        uf ufVar = new uf(context);
        ymVar.OooO0o0 = ufVar;
        ymVar.OooO0o = qs.OooO00o(new e81(ufVar, new o00OO000(ufVar, 10), 21));
        q51 q51VarOooO00o = qs.OooO00o(new na1(new o00OO000(ymVar.OooO0o0, 27), 1));
        ymVar.OooO0oO = q51VarOooO00o;
        v03 v03Var = new v03();
        uf ufVar2 = ymVar.OooO0o0;
        a02 a02Var = new a02(ufVar2, q51VarOooO00o, v03Var, 18);
        q51 q51Var = ymVar.OooO0Oo;
        q51 q51Var2 = ymVar.OooO0o;
        yo yoVar = new yo();
        yoVar.OooO0Oo = q51Var;
        yoVar.OooO0o0 = q51Var2;
        yoVar.OooO0oo = a02Var;
        yoVar.OooO0o = q51VarOooO00o;
        yoVar.OooO0oO = q51VarOooO00o;
        ymVar.OooO0oo = qs.OooO00o(new a02(yoVar, new oO0Ooooo(ufVar2, q51Var2, q51VarOooO00o, a02Var, q51Var, q51VarOooO00o, 6), new ho1(q51Var, q51VarOooO00o, a02Var, q51VarOooO00o, 23), 22));
        return ymVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    public ArrayList OooO0o0() throws PackageManager.NameNotFoundException {
        List arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = this.OooO0o0;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) MlKitComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", MlKitComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new g03((String) it.next(), 4));
        }
        return arrayList2;
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        switch (this.OooO0Oo) {
            case 2:
                return new t3(this.OooO0o0, this);
            case 3:
            default:
                return new t3(this.OooO0o0, ho1Var.OooOO0O(Integer.class, AssetFileDescriptor.class));
            case 4:
                return new sr0(this.OooO0o0, 0);
        }
    }

    public /* synthetic */ hg(Context context, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = context;
    }

    public /* synthetic */ hg() {
        this.OooO0Oo = 1;
    }
}
