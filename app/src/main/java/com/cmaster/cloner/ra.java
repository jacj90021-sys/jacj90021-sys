package com.cmaster.cloner;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class ra implements om1, uo1 {
    public final /* synthetic */ int OooO0o;

    public /* synthetic */ ra(int i) {
        this.OooO0o = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OooO(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void OooO0O0() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void OooO0OO(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void OooO0Oo(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void OooO0o(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void OooO0o0(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void OooO0oO(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void OooO0oo(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void OooOO0(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void OooOO0O(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void OooOO0o() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void OooOOO(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void OooOOO0(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void OooOOOO(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    @Override // com.cmaster.cloner.uo1
    public void OooO00o(to1 to1Var, vo1 vo1Var) {
        switch (this.OooO0o) {
            case 14:
                to1Var.OooO00o(vo1Var);
                break;
            default:
                to1Var.OooO0o0();
                break;
        }
    }
}
