package com.cmaster.cloner;

import android.content.Context;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class vy2 {
    public static final qb1 OooO00o(Context context, Class cls, String str) {
        context.getClass();
        if (uj1.OooO0o0(str)) {
            ra.OooOOO("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new qb1(context, cls, str);
        }
        ra.OooOOO("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }
}
