package com.cmaster.cloner;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j3 implements Iterator, Map.Entry {
    public int OooO0Oo;
    public boolean OooO0o;
    public int OooO0o0 = -1;
    public final /* synthetic */ k3 OooO0oO;

    public j3(k3 k3Var) {
        this.OooO0oO = k3Var;
        this.OooO0Oo = k3Var.OooO0o - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.OooO0o) {
            qa.OooO0o("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.OooO0o0;
            k3 k3Var = this.OooO0oO;
            if (ij0.OooO00o(key, k3Var.OooO0o(i)) && ij0.OooO00o(entry.getValue(), k3Var.OooOO0(this.OooO0o0))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.OooO0o) {
            return this.OooO0oO.OooO0o(this.OooO0o0);
        }
        qa.OooO0o("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.OooO0o) {
            return this.OooO0oO.OooOO0(this.OooO0o0);
        }
        qa.OooO0o("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OooO0o0 < this.OooO0Oo;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.OooO0o) {
            qa.OooO0o("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.OooO0o0;
        k3 k3Var = this.OooO0oO;
        Object objOooO0o = k3Var.OooO0o(i);
        Object objOooOO0 = k3Var.OooOO0(this.OooO0o0);
        return (objOooO0o == null ? 0 : objOooO0o.hashCode()) ^ (objOooOO0 != null ? objOooOO0.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            sa.OooOO0O();
            return null;
        }
        this.OooO0o0++;
        this.OooO0o = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.OooO0o) {
            ra.OooO0O0();
            return;
        }
        this.OooO0oO.OooO0oo(this.OooO0o0);
        this.OooO0o0--;
        this.OooO0Oo--;
        this.OooO0o = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.OooO0o) {
            return this.OooO0oO.OooO(this.OooO0o0, obj);
        }
        qa.OooO0o("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
