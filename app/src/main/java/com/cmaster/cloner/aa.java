package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class aa implements bh0 {
    public final int OooO0Oo;
    public final Object OooO0o;
    public final int OooO0o0;

    public aa(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.OooO0o = new ArrayList();
        this.OooO0o0 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e61.OooO0oo);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.OooO0Oo = typedArrayObtainStyledAttributes.getResourceId(index, this.OooO0Oo);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.OooO0o0);
                this.OooO0o0 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new fi().OooO00o(context, resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.cmaster.cloner.bh0
    public void OooO00o(an1 an1Var) {
    }

    @Override // com.cmaster.cloner.bh0
    public void OooO0O0(y21 y21Var) {
    }

    @Override // com.cmaster.cloner.bh0
    public void OooO0OO(zm1 zm1Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x030d A[Catch: all -> 0x025d, Merged into TryCatch #0 {all -> 0x00c0, all -> 0x025d, blocks: (B:25:0x00b2, B:27:0x00b9, B:31:0x00c3, B:33:0x00c9, B:35:0x00cf, B:38:0x00dc, B:40:0x00e0, B:41:0x00ea, B:43:0x0138, B:44:0x013f, B:46:0x0145, B:49:0x0153, B:51:0x0179, B:52:0x017c, B:53:0x0194, B:55:0x019f, B:56:0x01a7, B:57:0x01ab, B:59:0x01b4, B:61:0x01c6, B:63:0x01d2, B:66:0x01df, B:67:0x021b, B:69:0x0223, B:71:0x0232, B:73:0x023e, B:75:0x0242, B:113:0x0329, B:79:0x024c, B:80:0x024e, B:116:0x032c, B:117:0x032d, B:81:0x024f, B:83:0x025b, B:87:0x0260, B:88:0x028f, B:90:0x0295, B:93:0x02bc, B:102:0x02d2, B:104:0x02d8, B:106:0x02e1, B:108:0x02e8, B:109:0x030b, B:111:0x030d, B:112:0x0328), top: B:127:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.cmaster.cloner.ac3 OooO0Oo(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.aa.OooO0Oo(java.lang.Object):com.cmaster.cloner.ac3");
    }

    @Override // com.cmaster.cloner.bh0
    public void OooO0o0(x21 x21Var) {
        if (x21Var.OooO0Oo.OooO00o == 3) {
            int i = ((cl) x21Var.OooO0oo).OooO0Oo;
            boolean[] zArr = (boolean[]) this.OooO0o;
            zArr[0] = zArr[0] && (this.OooO0Oo - this.OooO0o0) + i == x21Var.OooO0o.OooO0Oo;
        }
    }

    public /* synthetic */ aa(int i, int i2, Object obj) {
        this.OooO0o = obj;
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
    }

    public /* synthetic */ aa(int i, int i2, o92 o92Var) {
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
        this.OooO0o = o92Var;
    }
}
