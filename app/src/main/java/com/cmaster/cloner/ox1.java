package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteCallbackList;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class ox1 extends gf0 {
    public static final oO00OOOo OooOo0;
    public static final String OooOo00;
    public static final jg OooOo0O;
    public final o01 OooO;
    public final Context OooO0o;
    public final ArrayList OooO0o0;
    public final PackageManager OooO0oO;
    public vx1 OooO0oo;
    public final ComponentName OooOO0;
    public final o0O000O OooOO0O;
    public final RemoteCallbackList OooOO0o;
    public final ConditionVariable OooOOO;
    public final ze1 OooOOO0;
    public final t62 OooOOOO;
    public final boolean OooOOOo;
    public final List OooOOo;
    public String OooOOo0;
    public final HashSet OooOOoo;

    static {
        DexUtils.classesInit0(3);
        OooOo00 = u7.OooO00o(new byte[]{-24, -92, -76, -114, 77, 20, 88}, new byte[]{-104, -59, -41, -27, 44, 115, 61, -2});
        OooOo0 = new oO00OOOo(21);
        OooOo0O = new jg(4);
    }

    public ox1(Context context) {
        attachInterface(this, u7.OooO00o(new byte[]{64, -8, 6, -21, -15, 27, 68, -82, 87, -14, 25, -21, -15, 26, 74, -77, 70, -27, 69, -113, -53, 59, 98, -103, 114, -34, 40, -124, -47, 49, 117, -103, 105, -59, 38}, new byte[]{35, -105, 107, -59, -110, 118, 37, -35}));
        this.OooO0o0 = new ArrayList();
        this.OooOO0o = new RemoteCallbackList();
        this.OooOOO0 = new ze1(1);
        this.OooOOO = new ConditionVariable(false);
        this.OooOOOo = true;
        this.OooOOoo = new HashSet(20);
        this.OooO0o = context;
        this.OooO0oO = p80.OooO0OO.OooO00o;
        this.OooOO0 = new ComponentName(context.getPackageName(), "");
        t62 t62Var = new t62();
        t62Var.OooO0Oo = new LinkedHashMap();
        t62Var.OooO0o0 = new LinkedHashMap();
        t62Var.OooO0o = new SparseArray();
        t62Var.OooO0oO = new LinkedHashMap();
        t62Var.OooOO0 = context;
        t62Var.OooO0oo = new ng(vx1.OooO0O0(), this, t62Var);
        t62Var.OooO = new hx2(t62Var);
        this.OooOOOO = t62Var;
        this.OooOO0O = new o0O000O(t62Var);
        this.OooO = new o01(context, this);
        if (a02.OooOO0o == null) {
            a02.OooOO0o = new a02(context, 15);
        }
        this.OooOOo = Arrays.asList(u7.OooO00o(new byte[]{-17, -82, 77, 46, -102, 62, 32, -113, -29, -88, 68, 46, -115, 53, 42, -103, -27, -81, 71}, new byte[]{-116, -63, 32, 0, -5, 80, 68, -3}), u7.OooO00o(new byte[]{58, -105, -2, 79, 60, 100, -57, 56, 53, -99, -67, 0, 53, 111, -38, 48, 48, -100, -67, 6, 54, 120}, new byte[]{89, -8, -109, 97, 91, 11, -88, 95}), u7.OooO00o(new byte[]{-1, -34, -62, -62, 79, -123, -117, 77, -16, -44, -127, -115, 70, -114, -106, 69, -11, -43, -127, -117, 91, -116}, new byte[]{-100, -79, -81, -20, 40, -22, -28, 42}));
    }

    public static native int o00O0OOO(int i, int i2);

    public static native ox1 o0O0ooO();

    @Override // com.cmaster.cloner.hf0
    public final native boolean OooOO0(int i, String str);

    @Override // com.cmaster.cloner.hf0
    public final native List OooOO0O(int i, int i2, int i3, String str, String str2);

    @Override // com.cmaster.cloner.hf0
    public final native IBinder OooOOO();

    @Override // com.cmaster.cloner.hf0
    public final native List OooOOoo(String str, Intent intent, String str2, int i, int i2);

    @Override // com.cmaster.cloner.hf0
    public final native ActivityInfo OooOo0(String str, ComponentName componentName, int i, int i2);

    @Override // com.cmaster.cloner.hf0
    public final native ArrayList OooOoO(String str, Intent intent, String str2, int i, int i2);

    @Override // com.cmaster.cloner.hf0
    public final native ArrayList OooOooo(int i, int i2);

    @Override // com.cmaster.cloner.hf0
    public final native List Oooo0(String str, Intent intent, String str2, int i, int i2);

    @Override // com.cmaster.cloner.hf0
    public final native ArrayList Oooo0o0(int i, int i2);

    @Override // com.cmaster.cloner.hf0
    public final native ir1 Oooo0oO(int i, String str);

    @Override // com.cmaster.cloner.hf0
    public final native void OoooOO0(int i, int i2, String str, int i3);

    @Override // com.cmaster.cloner.hf0
    public final native int OooooOo(int i, int i2, String str);

    @Override // com.cmaster.cloner.hf0
    public final native int Oooooo(int i, String str, String str2);

    public final native void o00(int i, int i2, String str);

    @Override // com.cmaster.cloner.hf0
    public final native ActivityInfo o000000o(String str, ComponentName componentName, int i, int i2);

    @Override // com.cmaster.cloner.hf0
    public final native int o0000Oo(int i, String str);

    @Override // com.cmaster.cloner.hf0
    public final native int o0000Oo0(String str, String str2, int i, String str3);

    @Override // com.cmaster.cloner.hf0
    public final native List o0000o0(String str, Intent intent, String str2, int i, int i2);

    public final native int o0000o0O(String str, int i, String str2, String str3);

    @Override // com.cmaster.cloner.hf0
    public final native boolean o0000o0o(int i, int i2, String str);

    @Override // com.cmaster.cloner.hf0
    public final native ApplicationInfo o0000oO0(int i, int i2, String str, String str2);

    @Override // com.cmaster.cloner.hf0
    public final native ResolveInfo o000O0(String str, Intent intent, String str2, int i, int i2);

    @Override // com.cmaster.cloner.hf0
    public final native ArrayList o000O00(int i, String str);

    @Override // com.cmaster.cloner.hf0
    public final native ProviderInfo o000O0oO(String str, ComponentName componentName, int i, int i2);

    @Override // com.cmaster.cloner.hf0
    public final native String o000OO0o(int i, String str);

    @Override // com.cmaster.cloner.hf0
    public final native ResolveInfo o000OOO(int i, Intent intent);

    @Override // com.cmaster.cloner.hf0
    public final native i01 o000Oo(int i, String str);

    @Override // com.cmaster.cloner.hf0
    public final native String[] o000Oo0(int i, int i2, int i3);

    @Override // com.cmaster.cloner.hf0
    public final native ResolveInfo o000OoOo(String str, Intent intent, String str2, int i, int i2);

    @Override // com.cmaster.cloner.hf0
    public final native boolean o000OooO(int i, String str);

    @Override // com.cmaster.cloner.hf0
    public final native ProviderInfo o000o0Oo(int i, int i2, String str, String str2);

    @Override // com.cmaster.cloner.hf0
    public final native PackageInfo o000o0oo(int i, int i2, String str, String str2);

    @Override // com.cmaster.cloner.hf0
    public final native int o000ooo0(int i, int i2, String str);

    public final native void o000oooo(int i, String str);

    public final native int o00O0(int i, String str, int i2, ParcelFileDescriptor[] parcelFileDescriptorArr);

    public final native List o00O00(ComponentName componentName, int i);

    public final native int[] o00O000(String str);

    public final native void o00O0000(c21 c21Var, int i, String str);

    public final native ArrayList o00O000o(int i, int i2);

    public final native ActivityInfo o00O00O(int i, String str);

    public final native int o00O00OO(int i, String str);

    public final native c21 o00O00Oo(String str);

    public final native String[] o00O00o(int i);

    public final native Bundle o00O00o0(String str);

    public final native PermissionGroupInfo o00O00oO(int i, String str);

    @Override // com.cmaster.cloner.hf0
    public final native ServiceInfo o00O0O(String str, ComponentName componentName, int i, int i2);

    public final native i10 o00O0O0(eh0 eh0Var);

    public final native i10 o00O0O00(eh0 eh0Var);

    public final native boolean o00O0O0O(ComponentInfo componentInfo, int i, int i2);

    public final native void o00O0O0o(int i, int i2, String str);

    public final native boolean o00O0OO(String str);

    public final native List o00O0OO0(String str, Intent intent, String str2, int i, int i2);

    public final native ArrayList o00oOoo();

    @Override // com.cmaster.cloner.hf0
    public final native int o0OoO0o(ComponentName componentName, int i);

    public final native Intent oOO00O(int i, String str);

    public final native boolean oo00o(int i, String str);

    public final native void oo0o0O0(n90 n90Var);

    @Override // com.cmaster.cloner.hf0
    public final native void oo0o0Oo(ComponentName componentName, int i, int i2, int i3);

    @Override // com.cmaster.cloner.hf0
    public final native PermissionInfo oooo00o(int i, int i2, String str);
}
