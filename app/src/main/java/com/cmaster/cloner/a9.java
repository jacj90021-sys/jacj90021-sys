package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a9 implements View.OnClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ sl OooO0o0;

    public /* synthetic */ a9(sl slVar, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = slVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.OooO0Oo;
        sl slVar = this.OooO0o0;
        switch (i) {
            case 0:
                if (slVar.OooOOO0 && slVar.isShowing()) {
                    if (!slVar.OooOOOO) {
                        TypedArray typedArrayObtainStyledAttributes = slVar.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                        slVar.OooOOO = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        slVar.OooOOOO = true;
                    }
                    if (slVar.OooOOO) {
                        slVar.cancel();
                        break;
                    }
                }
                break;
            case 1:
                Context context = view.getContext();
                Bundle bundle = Bundle.EMPTY;
                j1.OooO0o(context, t1.class).OooO0o0(slVar.OooOo00, new k1(this, 4));
                break;
            case 2:
                Intent intent = new Intent(sn2.OooO00o("kmqMqyjVNS6aapy8Kch/YZBwgbYpkgFJsE8=\n", "8wTo2Ue8UQA=\n"), MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                m1 m1Var = slVar.OooOo00;
                m1Var.OooOo(intent).OooO0o0(m1Var, new k1(this, 6));
                break;
            case 3:
                slVar.OooO0oO(-1);
                break;
            case 4:
                slVar.OooO0oO(-2);
                break;
            default:
                gy0 gy0Var = slVar.OooOo0;
                StringBuilder sb = new StringBuilder();
                wu1 wu1Var = slVar.OooOo0o;
                sb.append(wu1Var.OooOOO0.OooO00o(qj0.OooOO0));
                sb.append(sn2.OooO00o("nw==\n", "suZ7V7JlTSU=\n"));
                sb.append(wu1Var.OooOOO0.OooO0OO + 1);
                gy0Var.OooO0Oo(sb.toString());
                PackageInfo packageInfo = wu1Var.OooOO0o;
                if (packageInfo != null) {
                    slVar.OooOO0(packageInfo.applicationInfo);
                    break;
                }
                break;
        }
    }
}
