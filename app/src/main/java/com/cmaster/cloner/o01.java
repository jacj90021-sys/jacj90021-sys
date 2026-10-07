package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageInstaller;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.AtomicFile;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o01 extends ic0 {
    public static final String OooOOo;
    public static final String OooOOoo;
    public final oOo00o0o OooO;
    public final ox1 OooO0o;
    public final Context OooO0o0;
    public final HandlerThread OooO0oO;
    public final Handler OooO0oo;
    public final AtomicFile OooOO0;
    public final File OooOO0O;
    public final xb1 OooOO0o;
    public final SparseBooleanArray OooOOO;
    public final SecureRandom OooOOO0;
    public final SparseArray OooOOOO;
    public final ArrayList OooOOOo;
    public final SparseIntArray OooOOo0;

    static {
        DexUtils.classesInit0(56);
        OooOOo = u7.OooO00o(new byte[]{-86, 10, -56}, new byte[]{-6, 71, -127, 105, -10, 118, -12, 23});
        OooOOoo = u7.OooO00o(new byte[]{-35, 48, 58, -51, -58, -13, 21, -109}, new byte[]{-82, 85, 73, -66, -81, -100, 123, -32});
        u7.OooO00o(new byte[]{79, 115, 5, -89, -13, 107, 47, 112, 77, 114, 15, -95, -7, 108, 63, 112, 94, 112, 79, -80, -28, 118, 57, 63, 0, 81, 36, -110, -35, 65, 18, 1, 125, 73, 32, -127, -55, 81}, new byte[]{46, 29, 97, -43, -100, 2, 75, 94});
    }

    public o01(Context context, ox1 ox1Var) {
        attachInterface(this, u7.OooO00o(new byte[]{-67, -89, 56, -76, -63, 10, 52, 4, -86, -83, 39, -76, -63, 11, 58, 25, -69, -70, 123, -51, -26, 51, 31, 35, -100, -104, 17, -39, -16, 43, 17, 63, -106, -121, 24, -61}, new byte[]{-34, -56, 85, -102, -94, 103, 85, 119}));
        this.OooOO0o = new xb1(this, 25);
        this.OooOOO0 = new SecureRandom();
        this.OooOOO = new SparseBooleanArray();
        this.OooOOOO = new SparseArray();
        this.OooOOOo = new ArrayList();
        this.OooOOo0 = new SparseIntArray();
        new SparseBooleanArray();
        this.OooO0o0 = context;
        this.OooO0o = ox1Var;
        HandlerThread handlerThread = new HandlerThread(u7.OooO00o(new byte[]{-23, 26, 11}, new byte[]{-71, 87, 66, -78, 75, -74, 27, -54}));
        this.OooO0oO = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.OooO0oo = handler;
        this.OooO = new oOo00o0o(handlerThread.getLooper());
        this.OooOO0 = new AtomicFile(new File(dx1.OooO0O0(), u7.OooO00o(new byte[]{-46, -80, 27, -31, -94}, new byte[]{-69, -61, 53, -123, -64, -113, 51, -124})));
        File file = new File(dx1.OooO0O0(), u7.OooO00o(new byte[]{-47, -52}, new byte[]{-72, -65, -15, 66, -60, 77, 0, -94}));
        zz.OooOO0(file, false);
        this.OooOO0O = file;
        handler.post(new o00OOOOo(this, 11));
    }

    public static native void o0000o0O(Context context, Intent intent, IntentSender intentSender);

    public static native File o0O0ooO(int i);

    @Override // com.cmaster.cloner.jc0
    public final native void OooO0oo(int i, String str);

    @Override // com.cmaster.cloner.jc0
    public final native ArrayList Oooo0O0(int i);

    @Override // com.cmaster.cloner.jc0
    public final native int Ooooooo(PackageInstaller.SessionParams sessionParams, String str, int i);

    public final native int o00();

    @Override // com.cmaster.cloner.jc0
    public final native void o000(int i, boolean z);

    @Override // com.cmaster.cloner.jc0
    public final native ArrayList o0000O(int i, String str);

    @Override // com.cmaster.cloner.jc0
    public final native void o0000O00(IBinder iBinder, int i);

    @Override // com.cmaster.cloner.jc0
    public final native void o0000OOO(int i);

    @Override // com.cmaster.cloner.jc0
    public final native IBinder o000O(int i);

    @Override // com.cmaster.cloner.jc0
    public final native void o000o0O(IBinder iBinder);

    @Override // com.cmaster.cloner.jc0
    public final native PackageInstaller.SessionInfo o000o0o(int i);

    @Override // com.cmaster.cloner.jc0
    public final native void o000oo(int i, Bitmap bitmap);

    public final native void o000oooo(t01 t01Var);

    public final native void o00O00();

    public final native t01 o00O000(int i);

    public final native File o00O0000(int i);

    public final native t01 o00O000o(int i);

    public final native void o00O00O();

    public final native int o00oOoo(PackageInstaller.SessionParams sessionParams, String str, int i);
}
