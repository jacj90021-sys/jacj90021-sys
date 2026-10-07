package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xh {
    public final float OooO00o;
    public final float OooO0O0;
    public final float OooO0OO;
    public final float OooO0Oo;
    public final int OooO0o0;

    public xh(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.OooO00o = Float.NaN;
        this.OooO0O0 = Float.NaN;
        this.OooO0OO = Float.NaN;
        this.OooO0Oo = Float.NaN;
        this.OooO0o0 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e61.OooOO0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.OooO0o0);
                this.OooO0o0 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new fi().OooO00o(context, resourceId);
                }
            } else if (index == 1) {
                this.OooO0Oo = typedArrayObtainStyledAttributes.getDimension(index, this.OooO0Oo);
            } else if (index == 2) {
                this.OooO0O0 = typedArrayObtainStyledAttributes.getDimension(index, this.OooO0O0);
            } else if (index == 3) {
                this.OooO0OO = typedArrayObtainStyledAttributes.getDimension(index, this.OooO0OO);
            } else if (index == 4) {
                this.OooO00o = typedArrayObtainStyledAttributes.getDimension(index, this.OooO00o);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
