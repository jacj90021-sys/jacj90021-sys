package com.cmaster.cloner;

import android.content.pm.ResolveInfo;
import java.text.Collator;
import java.util.Comparator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zc implements Comparator {
    public final Collator OooO0Oo;
    public final int OooO0o;
    public final a02 OooO0o0;

    public zc(int i, a02 a02Var) {
        Collator collator = Collator.getInstance();
        this.OooO0Oo = collator;
        this.OooO0o = i;
        this.OooO0o0 = a02Var;
        collator.setStrength(0);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        ResolveInfo resolveInfo2 = (ResolveInfo) obj2;
        a02 a02Var = this.OooO0o0;
        int i = this.OooO0o;
        CharSequence charSequenceOooo0O0 = a02Var.Oooo0O0(i, resolveInfo);
        if (charSequenceOooo0O0 == null) {
            charSequenceOooo0O0 = resolveInfo.activityInfo.name;
        }
        CharSequence charSequenceOooo0O02 = a02Var.Oooo0O0(i, resolveInfo2);
        if (charSequenceOooo0O02 == null) {
            charSequenceOooo0O02 = resolveInfo2.activityInfo.name;
        }
        return this.OooO0Oo.compare(charSequenceOooo0O0.toString(), charSequenceOooo0O02.toString());
    }
}
