package com.cmaster.cloner;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class du1 {
    public final LinkedHashMap OooO00o = new LinkedHashMap();

    public final void OooO00o() {
        LinkedHashMap linkedHashMap = this.OooO00o;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((yt1) it.next()).OooO00o();
        }
        linkedHashMap.clear();
    }
}
