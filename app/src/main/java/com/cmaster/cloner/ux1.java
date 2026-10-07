package com.cmaster.cloner;

import android.os.Parcel;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ux1 extends jo0 implements vk0 {
    public final /* synthetic */ vx1 OooOOOO;

    static {
        DexUtils.classesInit0(14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux1(vx1 vx1Var) {
        super(new File(dx1.OooO0O0(), u7.OooO00o(new byte[]{-121, -124, -96, 50, 12}, new byte[]{-14, -9, -114, 86, 110, 50, 71, 28})));
        this.OooOOOO = vx1Var;
    }

    @Override // com.cmaster.cloner.vk0
    public final native void OooO00o(JSONObject jSONObject);

    @Override // com.cmaster.cloner.jo0
    public final native void OooO0oo(int i, Parcel parcel);

    @Override // com.cmaster.cloner.jo0
    public final native void OooOO0(Parcel parcel);

    public final native void OooOO0O(JSONObject jSONObject);
}
