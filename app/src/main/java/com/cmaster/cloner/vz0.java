package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class vz0 {
    public static final iz[] OooO00o = new iz[0];
    public static final iz OooO0O0;
    public static final t52 OooO0OO;
    public static final t52 OooO0Oo;

    static {
        iz izVar = new iz("vision.barcode", 1L);
        OooO0O0 = izVar;
        iz izVar2 = new iz("vision.custom.ica", 1L);
        iz izVar3 = new iz("vision.face", 1L);
        iz izVar4 = new iz("vision.ica", 1L);
        iz izVar5 = new iz("vision.ocr", 1L);
        iz izVar6 = new iz("mlkit.langid", 1L);
        iz izVar7 = new iz("mlkit.nlclassifier", 1L);
        iz izVar8 = new iz("tflite_dynamite", 1L);
        iz izVar9 = new iz("mlkit.barcode.ui", 1L);
        iz izVar10 = new iz("mlkit.smartreply", 1L);
        o00Oo00 o00oo00 = new o00Oo00(7);
        o00oo00.OooOOO("barcode", izVar);
        o00oo00.OooOOO("custom_ica", izVar2);
        o00oo00.OooOOO("face", izVar3);
        o00oo00.OooOOO("ica", izVar4);
        o00oo00.OooOOO("ocr", izVar5);
        o00oo00.OooOOO("langid", izVar6);
        o00oo00.OooOOO("nlclassifier", izVar7);
        o00oo00.OooOOO("tflite_dynamite", izVar8);
        o00oo00.OooOOO("barcode_ui", izVar9);
        o00oo00.OooOOO("smart_reply", izVar10);
        g42 g42Var = (g42) o00oo00.OooO0oO;
        if (g42Var != null) {
            throw g42Var.OooO00o();
        }
        t52 t52VarOooO00o = t52.OooO00o(o00oo00.OooO0o0, (Object[]) o00oo00.OooO0o, o00oo00);
        g42 g42Var2 = (g42) o00oo00.OooO0oO;
        if (g42Var2 != null) {
            throw g42Var2.OooO00o();
        }
        OooO0OO = t52VarOooO00o;
        o00Oo00 o00oo002 = new o00Oo00(7);
        o00oo002.OooOOO("com.google.android.gms.vision.barcode", izVar);
        o00oo002.OooOOO("com.google.android.gms.vision.custom.ica", izVar2);
        o00oo002.OooOOO("com.google.android.gms.vision.face", izVar3);
        o00oo002.OooOOO("com.google.android.gms.vision.ica", izVar4);
        o00oo002.OooOOO("com.google.android.gms.vision.ocr", izVar5);
        o00oo002.OooOOO("com.google.android.gms.mlkit.langid", izVar6);
        o00oo002.OooOOO("com.google.android.gms.mlkit.nlclassifier", izVar7);
        o00oo002.OooOOO("com.google.android.gms.tflite_dynamite", izVar8);
        o00oo002.OooOOO("com.google.android.gms.mlkit_smartreply", izVar10);
        g42 g42Var3 = (g42) o00oo002.OooO0oO;
        if (g42Var3 != null) {
            throw g42Var3.OooO00o();
        }
        t52 t52VarOooO00o2 = t52.OooO00o(o00oo002.OooO0o0, (Object[]) o00oo002.OooO0o, o00oo002);
        g42 g42Var4 = (g42) o00oo002.OooO0oO;
        if (g42Var4 != null) {
            throw g42Var4.OooO00o();
        }
        OooO0Oo = t52VarOooO00o2;
    }

    public static void OooO00o(Context context, List list) {
        ac3 ac3VarOooO0OO;
        e60.OooO0O0.getClass();
        if (e60.OooO00o(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        iz[] izVarArrOooO0O0 = OooO0O0(OooO0OO, list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i23(izVarArrOooO0O0, 0));
        by2.OooO00o("APIs must not be empty.", !arrayList.isEmpty());
        s22 s22Var = new s22(context, s22.OooOOO0, oOO0000.OooO00o, a60.OooO0O0);
        oOO0 ooo0OooO00o = oOO0.OooO00o(arrayList, true);
        if (ooo0OooO00o.OooO0Oo.isEmpty()) {
            ac3VarOooO0OO = m43.OooO0OO(new ou0(0, false));
        } else {
            z8 z8Var = new z8();
            z8Var.OooO0o0 = new iz[]{q92.OooO00o};
            z8Var.OooO0OO = true;
            z8Var.OooO0O0 = 27304;
            z8Var.OooO0Oo = new na1(s22Var, ooo0OooO00o);
            ac3VarOooO0OO = s22Var.OooO0OO(0, z8Var.OooO00o());
        }
        d83 d83Var = new d83(17);
        ac3VarOooO0OO.getClass();
        ac3VarOooO0OO.OooO00o(am1.OooO00o, d83Var);
    }

    public static iz[] OooO0O0(t52 t52Var, List list) {
        iz[] izVarArr = new iz[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iz izVar = (iz) t52Var.get(list.get(i));
            by2.OooO0oo(izVar);
            izVarArr[i] = izVar;
        }
        return izVarArr;
    }
}
