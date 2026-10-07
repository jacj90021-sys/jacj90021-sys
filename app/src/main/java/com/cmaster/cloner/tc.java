package com.cmaster.cloner;

import android.util.Property;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tc extends Property {
    public static final tc OooO00o = new tc(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Float f = (Float) obj2;
        float fFloatValue = f.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, f);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
