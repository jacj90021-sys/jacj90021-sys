package com.cmaster.cloner;

import android.content.Context;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v4 extends lk {
    public final Context OooO00o;
    public final ie OooO0O0;
    public final ie OooO0OO;
    public final String OooO0Oo;

    public v4(Context context, ie ieVar, ie ieVar2, String str) {
        if (context == null) {
            qa.OooOOO0("Null applicationContext");
            throw null;
        }
        this.OooO00o = context;
        if (ieVar == null) {
            qa.OooOOO0("Null wallClock");
            throw null;
        }
        this.OooO0O0 = ieVar;
        if (ieVar2 == null) {
            qa.OooOOO0("Null monotonicClock");
            throw null;
        }
        this.OooO0OO = ieVar2;
        if (str != null) {
            this.OooO0Oo = str;
        } else {
            qa.OooOOO0("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lk) {
            v4 v4Var = (v4) ((lk) obj);
            if (this.OooO00o.equals(v4Var.OooO00o) && this.OooO0O0.equals(v4Var.OooO0O0) && this.OooO0OO.equals(v4Var.OooO0OO) && this.OooO0Oo.equals(v4Var.OooO0Oo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0Oo.hashCode() ^ ((((((this.OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.OooO0O0.hashCode()) * 1000003) ^ this.OooO0OO.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.OooO00o);
        sb.append(", wallClock=");
        sb.append(this.OooO0O0);
        sb.append(", monotonicClock=");
        sb.append(this.OooO0OO);
        sb.append(", backendName=");
        return rj.OooO0oO(sb, this.OooO0Oo, "}");
    }
}
