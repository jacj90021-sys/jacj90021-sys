package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class oh implements ln1, Comparable<oh> {
    @Override // java.lang.Comparable
    /* renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final int compareTo(oh ohVar) {
        Class<?> cls = getClass();
        Class<?> cls2 = ohVar.getClass();
        return cls != cls2 ? cls.getName().compareTo(cls2.getName()) : OooO0Oo(ohVar);
    }

    public abstract int OooO0Oo(oh ohVar);

    public abstract String OooO0o0();
}
