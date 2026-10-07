package com.cmaster.cloner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vf {
    public final Set OooO00o;
    public final Set OooO0O0;
    public final int OooO0OO;
    public final ig OooO0Oo;
    public final Set OooO0o0;

    public vf(HashSet hashSet, HashSet hashSet2, int i, ig igVar, HashSet hashSet3) {
        this.OooO00o = Collections.unmodifiableSet(hashSet);
        this.OooO0O0 = Collections.unmodifiableSet(hashSet2);
        this.OooO0OO = i;
        this.OooO0Oo = igVar;
        this.OooO0o0 = Collections.unmodifiableSet(hashSet3);
    }

    public static xb OooO00o(Class cls) {
        return new xb(cls, new Class[0]);
    }

    public static vf OooO0O0(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            dy2.OooO00o(cls2, "Null interface");
        }
        Collections.addAll(hashSet, clsArr);
        return new vf(new HashSet(hashSet), new HashSet(hashSet2), 0, new uf(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.OooO00o.toArray()) + ">{0, type=" + this.OooO0OO + ", deps=" + Arrays.toString(this.OooO0O0.toArray()) + "}";
    }
}
