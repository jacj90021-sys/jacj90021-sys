package com.cmaster.cloner;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bt1 extends sp0 {
    public final /* synthetic */ int OooO0oo;

    public bt1(int i, Class cls, int i2, int i3, int i4) {
        this.OooO0oo = i4;
        this.OooO0Oo = i;
        this.OooO0oO = cls;
        this.OooO0o = i2;
        this.OooO0o0 = i3;
    }

    @Override // com.cmaster.cloner.sp0
    public final Object OooO0OO(View view) {
        switch (this.OooO0oo) {
            case 0:
                return Boolean.valueOf(it1.OooO0OO(view));
            case 1:
                return it1.OooO00o(view);
            case 2:
                return kt1.OooO0O0(view);
            default:
                return Boolean.valueOf(it1.OooO0O0(view));
        }
    }

    @Override // com.cmaster.cloner.sp0
    public final void OooO0Oo(View view, Object obj) {
        switch (this.OooO0oo) {
            case 0:
                it1.OooO0o(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                it1.OooO0o0(view, (CharSequence) obj);
                break;
            case 2:
                kt1.OooO0OO(view, (CharSequence) obj);
                break;
            default:
                it1.OooO0Oo(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // com.cmaster.cloner.sp0
    public final boolean OooO0oO(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.OooO0oo) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
