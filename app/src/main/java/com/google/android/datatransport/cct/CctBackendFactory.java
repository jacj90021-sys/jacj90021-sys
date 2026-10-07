package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import com.cmaster.cloner.bc;
import com.cmaster.cloner.gp1;
import com.cmaster.cloner.lk;
import com.cmaster.cloner.v4;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public gp1 create(lk lkVar) {
        Context context = ((v4) lkVar).OooO00o;
        v4 v4Var = (v4) lkVar;
        return new bc(context, v4Var.OooO0O0, v4Var.OooO0OO);
    }
}
