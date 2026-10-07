package com.cmaster.cloner;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h12 extends gv0 {
    public final boolean OooOOOO;
    public final pe OooOOOo;

    public h12(Context context, String str, boolean z) {
        pe peVar = new pe();
        peVar.OooO0o0 = new LinkedHashMap();
        peVar.OooO0o = new ArrayList();
        this.OooOOOo = peVar;
        this.OooOOOO = z;
        OooOOO0(new File(context.getExternalFilesDir(null).getParentFile(), str), "external/");
        OooOOO0(new File(context.getExternalMediaDirs()[0], str), "media/");
        OooOOO0(new File(context.getFilesDir().getParentFile(), str.concat("/data")), "internal/");
    }

    public final void OooOOO0(File file, String str) {
        pe peVar = this.OooOOOo;
        peVar.getClass();
        if (file.isDirectory()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(new LinkedHashMap().size());
            pe.OooO0OO(file, str, linkedHashMap);
            ((LinkedHashMap) peVar.OooO0o0).putAll(linkedHashMap);
        }
    }
}
