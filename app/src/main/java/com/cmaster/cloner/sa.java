package com.cmaster.cloner;

import com.google.android.gms.internal.ads.zzgzw;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class sa implements uo1 {
    public static /* synthetic */ void OooO(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void OooO0O0() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void OooO0OO(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void OooO0Oo(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new RuntimeException(sb.toString());
    }

    public static /* synthetic */ void OooO0o(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void OooO0o0(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void OooO0oO(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void OooO0oo(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void OooOO0(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void OooOO0O() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void OooOO0o(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void OooOOO(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void OooOOO0(String str) throws zzgzw {
        throw new zzgzw(str);
    }

    @Override // com.cmaster.cloner.uo1
    public void OooO00o(to1 to1Var, vo1 vo1Var) {
        to1Var.OooO0Oo(vo1Var);
    }
}
