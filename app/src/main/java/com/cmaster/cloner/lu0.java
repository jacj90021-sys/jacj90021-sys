package com.cmaster.cloner;

import android.database.Cursor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lu0 implements oc1 {
    public final HashMap OooO0Oo;

    public lu0() {
        this.OooO0Oo = new HashMap();
    }

    @Override // com.cmaster.cloner.oc1
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        dw dwVar = qc1.OooO0oo;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Long lValueOf = Long.valueOf(j);
            HashMap map = this.OooO0Oo;
            Set hashSet = (Set) map.get(lValueOf);
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j), hashSet);
            }
            hashSet.add(new pc1(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public lu0(HashMap map) {
        this.OooO0Oo = map;
    }
}
