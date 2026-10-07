package com.cmaster.cloner;

import android.content.pm.PackageInstaller;
import android.graphics.Bitmap;
import android.os.IBinder;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hc0 implements jc0 {
    public IBinder OooO0Oo;

    static {
        DexUtils.classesInit0(79);
    }

    @Override // com.cmaster.cloner.jc0
    public final native void OooO0oo(int i, String str);

    @Override // com.cmaster.cloner.jc0
    public final native ArrayList Oooo0O0(int i);

    @Override // com.cmaster.cloner.jc0
    public final native int Ooooooo(PackageInstaller.SessionParams sessionParams, String str, int i);

    @Override // android.os.IInterface
    public final native IBinder asBinder();

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
}
