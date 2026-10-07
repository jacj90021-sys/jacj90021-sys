package com.cmaster.cloner;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzfdd;
import com.google.android.gms.internal.ads.zzgzv;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class qa implements uo1 {
    public final /* synthetic */ int OooO0o;

    public /* synthetic */ qa(int i) {
        this.OooO0o = i;
    }

    public static /* synthetic */ void OooO(Throwable th) throws zzfdd {
        throw new zzfdd(th);
    }

    public static /* synthetic */ void OooO0O0() throws RemoteException {
        throw new RemoteException();
    }

    public static /* synthetic */ void OooO0OO(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void OooO0Oo(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void OooO0o(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void OooO0o0(Object obj, String str, Object obj2) {
        throw new tf(str + obj + obj2);
    }

    public static /* synthetic */ void OooO0oO(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void OooO0oo(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void OooOO0() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void OooOO0O(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new RuntimeException(sb.toString());
    }

    public static /* synthetic */ void OooOO0o(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void OooOOO() throws zzgzv {
        throw new zzgzv("Protocol message tag had invalid wire type.");
    }

    public static /* synthetic */ void OooOOO0(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void OooOOOO(String str) throws IOException {
        throw new IOException(str);
    }

    @Override // com.cmaster.cloner.uo1
    public void OooO00o(to1 to1Var, vo1 vo1Var) {
        switch (this.OooO0o) {
            case 14:
                to1Var.OooO0O0(vo1Var);
                break;
            default:
                to1Var.OooO0OO();
                break;
        }
    }
}
