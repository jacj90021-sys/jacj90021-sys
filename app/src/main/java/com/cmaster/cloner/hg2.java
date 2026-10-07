package com.cmaster.cloner;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hg2 implements Map, Serializable {
    public final /* synthetic */ int OooO0Oo;
    public transient AbstractCollection OooO0o;
    public final transient Object[] OooO0o0;
    public transient AbstractCollection OooO0oO;
    public transient AbstractCollection OooO0oo;

    public /* synthetic */ hg2(Object[] objArr, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.OooO0Oo) {
            case 0:
                if (get(obj) != null) {
                }
                break;
            default:
                if (get(obj) != null) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.OooO0Oo) {
            case 0:
                eg2 eg2Var = (eg2) this.OooO0oo;
                if (eg2Var == null) {
                    eg2Var = new eg2(this.OooO0o0, 1);
                    this.OooO0oo = eg2Var;
                }
                return eg2Var.contains(obj);
            default:
                jd3 jd3Var = (jd3) this.OooO0oo;
                if (jd3Var == null) {
                    jd3Var = new jd3(this.OooO0o0, 1);
                    this.OooO0oo = jd3Var;
                }
                return jd3Var.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.OooO0Oo) {
            case 0:
                wf2 wf2Var = (wf2) this.OooO0o;
                if (wf2Var != null) {
                    return wf2Var;
                }
                wf2 wf2Var2 = new wf2(this, this.OooO0o0);
                this.OooO0o = wf2Var2;
                return wf2Var2;
            default:
                zb3 zb3Var = (zb3) this.OooO0o;
                if (zb3Var != null) {
                    return zb3Var;
                }
                zb3 zb3Var2 = new zb3(this, this.OooO0o0);
                this.OooO0o = zb3Var2;
                return zb3Var2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.OooO0Oo) {
            case 0:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof Map) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.OooO0Oo
            r1 = 0
            java.lang.Object[] r4 = r4.OooO0o0
            r2 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L23;
                default: goto La;
            }
        La:
            if (r5 != 0) goto Le
        Lc:
            r4 = r2
            goto L1e
        Le:
            r0 = r4[r1]
            r0.getClass()
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto Lc
            r4 = r4[r3]
            r4.getClass()
        L1e:
            if (r4 != 0) goto L21
            goto L22
        L21:
            r2 = r4
        L22:
            return r2
        L23:
            if (r5 != 0) goto L27
        L25:
            r4 = r2
            goto L37
        L27:
            r0 = r4[r1]
            java.util.Objects.requireNonNull(r0)
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L25
            r4 = r4[r3]
            java.util.Objects.requireNonNull(r4)
        L37:
            if (r4 != 0) goto L3a
            goto L3b
        L3a:
            r2 = r4
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.hg2.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.OooO0Oo) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            default:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.OooO0Oo) {
            case 0:
                wf2 wf2Var = (wf2) this.OooO0o;
                if (wf2Var == null) {
                    wf2Var = new wf2(this, this.OooO0o0);
                    this.OooO0o = wf2Var;
                }
                return v73.OooO00o(wf2Var);
            default:
                zb3 zb3Var = (zb3) this.OooO0o;
                if (zb3Var == null) {
                    zb3Var = new zb3(this, this.OooO0o0);
                    this.OooO0o = zb3Var;
                }
                Iterator it = zb3Var.iterator();
                int iHashCode = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    iHashCode += next != null ? next.hashCode() : 0;
                }
                return iHashCode;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.OooO0Oo) {
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.OooO0Oo) {
            case 0:
                ag2 ag2Var = (ag2) this.OooO0oO;
                if (ag2Var != null) {
                    return ag2Var;
                }
                ag2 ag2Var2 = new ag2(this, new eg2(this.OooO0o0, 0));
                this.OooO0oO = ag2Var2;
                return ag2Var2;
            default:
                nc3 nc3Var = (nc3) this.OooO0oO;
                if (nc3Var != null) {
                    return nc3Var;
                }
                nc3 nc3Var2 = new nc3(this, new jd3(this.OooO0o0, 0));
                this.OooO0oO = nc3Var2;
                return nc3Var2;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.OooO0Oo) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.OooO0Oo) {
        }
        return 1;
    }

    public final String toString() {
        boolean z = true;
        switch (this.OooO0Oo) {
            case 0:
                StringBuilder sb = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb.append('{');
                Iterator it = ((wf2) entrySet()).iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                sb.append('}');
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb2.append('{');
                Iterator it2 = ((zb3) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z = false;
                }
                sb2.append('}');
                return sb2.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.OooO0Oo) {
            case 0:
                eg2 eg2Var = (eg2) this.OooO0oo;
                if (eg2Var != null) {
                    return eg2Var;
                }
                eg2 eg2Var2 = new eg2(this.OooO0o0, 1);
                this.OooO0oo = eg2Var2;
                return eg2Var2;
            default:
                jd3 jd3Var = (jd3) this.OooO0oo;
                if (jd3Var != null) {
                    return jd3Var;
                }
                jd3 jd3Var2 = new jd3(this.OooO0o0, 1);
                this.OooO0oo = jd3Var2;
                return jd3Var2;
        }
    }
}
