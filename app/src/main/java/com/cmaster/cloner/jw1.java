package com.cmaster.cloner;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes.dex */
public final class jw1 extends se0 {
    public static final Intent OooOOOO;
    public static final Intent OooOOOo;
    public static final oO00OOOo OooOOo0;
    public final SparseArray OooO;
    public ox1 OooO0o;
    public pw1 OooO0o0;
    public final ConditionVariable OooO0oO;
    public final SparseArray OooO0oo;
    public final SparseArray OooOO0;
    public final LinkedHashMap OooOO0O;
    public final LinkedList OooOO0o;
    public iw1 OooOOO;
    public final xi1 OooOOO0;

    public jw1() {
        attachInterface(this, u7.OooO00o(new byte[]{59, 25, -116, 24, -14, 84, 55, 24, 44, 19, -109, 24, -14, 85, 57, 5, 61, 4, -49, 96, -55, 116, 15, 63, 28, 44, -72, 112, -53, 97, 27, 61, 29, 59, -79}, new byte[]{88, 118, -31, 54, -111, 57, 86, 107}));
        this.OooO0oO = new ConditionVariable();
        this.OooO0oo = new SparseArray();
        this.OooO = new SparseArray();
        this.OooOO0 = new SparseArray();
        this.OooOO0O = new LinkedHashMap();
        this.OooOO0o = new LinkedList();
        this.OooOOO0 = new xi1(Looper.getMainLooper(), 1, false);
    }

    public static native AuthenticatorDescription o00oOoo(Resources resources, String str, AttributeSet attributeSet);

    @Override // com.cmaster.cloner.te0
    public final native Account[] OooO0O0(int i, String str);

    @Override // com.cmaster.cloner.te0
    public final native Map OooO0o(int i, Account account);

    @Override // com.cmaster.cloner.te0
    public final native void OooOO0o(int i, IBinder iBinder, Account account, boolean z);

    @Override // com.cmaster.cloner.te0
    public final native String OooOOOo(int i, Account account, String str);

    @Override // com.cmaster.cloner.te0
    public final native void OooOoo0(int i, IBinder iBinder, Account account, String str, boolean z, Bundle bundle);

    @Override // com.cmaster.cloner.te0
    public final native void OoooO(int i, String str, String str2);

    @Override // com.cmaster.cloner.te0
    public final native void OoooO0O(int i, Account account);

    @Override // com.cmaster.cloner.te0
    public final native boolean Ooooo00(int i, int i2, Account account, String str);

    @Override // com.cmaster.cloner.te0
    public final native void Ooooo0o(int i, IBinder iBinder, String str, String[] strArr);

    @Override // com.cmaster.cloner.te0
    public final native void OooooO0(int i, IBinder iBinder, Account account, Bundle bundle, boolean z);

    @Override // com.cmaster.cloner.te0
    public final native boolean Oooooo0(int i, String str);

    public final native g12 o00(int i, String str);

    @Override // com.cmaster.cloner.te0
    public final native boolean o000000(int i, Account account, String str, Bundle bundle);

    @Override // com.cmaster.cloner.te0
    public final native void o0000OO(int i, Account account, String str, String str2);

    @Override // com.cmaster.cloner.te0
    public final native Account[] o0000Ooo(int i);

    public final native ew1 o0000o0O(int i, String str, boolean z);

    @Override // com.cmaster.cloner.te0
    public final native String o000O00O(int i, Account account);

    @Override // com.cmaster.cloner.te0
    public final native void o000OoO(int i, Account account, String str);

    @Override // com.cmaster.cloner.te0
    public final native boolean o000Ooo(int i, Account account);

    @Override // com.cmaster.cloner.te0
    public final native String o000o000(int i, Account account, String str);

    @Override // com.cmaster.cloner.te0
    public final native int o000o00o(int i, Account account, String str);

    @Override // com.cmaster.cloner.te0
    public final native void o000oo00(int i, IBinder iBinder, String str, String str2);

    @Override // com.cmaster.cloner.te0
    public final native void o000oo0o(int i, Account account, String str, String str2);

    @Override // com.cmaster.cloner.te0
    public final native boolean o000ooO(int i, Account account, String str, Bundle bundle, Map map);

    @Override // com.cmaster.cloner.te0
    public final native void o000oooO(int i, IBinder iBinder, String str, String str2, String[] strArr, boolean z, Bundle bundle);

    public final native sv1 o000oooo(int i, String str, String str2);

    public final native void o00O00(int i, String str);

    public final native boolean o00O000(int i, Account account);

    public final native boolean o00O0000(int i, Account account, String str, Bundle bundle);

    public final native void o00O000o(int i, String str);

    public final native void o00O00O(int i);

    @Override // com.cmaster.cloner.te0
    public final native void o00oO0o(int i, IBinder iBinder, Account account, String str, boolean z, boolean z2, Bundle bundle);

    @Override // com.cmaster.cloner.te0
    public final native void o00ooo(int i, IBinder iBinder, String str, boolean z);

    public final native void o0O0ooO(int i, String str);

    @Override // com.cmaster.cloner.te0
    public final native AuthenticatorDescription[] o0OO00O(int i);

    @Override // com.cmaster.cloner.te0
    public final native void o0OOO0o(int i, IBinder iBinder, Account account, String[] strArr);

    @Override // com.cmaster.cloner.te0
    public final native Map o0OoOo0(int i, String str, String str2);

    @Override // com.cmaster.cloner.te0
    public final native String o0ooOO0(int i, Account account);

    @Override // com.cmaster.cloner.te0
    public final native void o0ooOOo(int i, IBinder iBinder, Account account, String str);

    public final native void oOO00O(int i, Account account, String str);

    @Override // com.cmaster.cloner.te0
    public final native boolean ooOO(int i, Account account);

    static {
        DexUtils.classesInit0(72);
        OooOOOO = new Intent(u7.OooO00o(new byte[]{-69, 27, -51, 108, -50, -26, 84, -12, -69, 22, -54, 113, -44, -31, 68, -87, -12, 57, -26, 89, -24, -63, 111, -101, -103, 54, -26, 75, -17, -37, 99, -123, -103, 61, -24, 80, -26, -54, 116}, new byte[]{-38, 117, -87, 30, -95, -113, 48, -38}));
        OooOOOo = new Intent(u7.OooO00o(new byte[]{-87, -89, 70, 91, -51, 126, 90, 112, -87, -86, 65, 70, -41, 121, 74, 45, -26, -88, 65, 93, -53, 120, 80, 112, -98, -128, 113, 96, -32, 91, 123, 1, -119, -118, 97, 102, -9, 89, 106, 13, -105, -118, 106, 104, -20, 80, 123, 26}, new byte[]{-56, -55, 34, 41, -94, 23, 62, 94}));
        OooOOo0 = new oO00OOOo(9);
    }
}
