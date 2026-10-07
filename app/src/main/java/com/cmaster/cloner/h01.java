package com.cmaster.cloner;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h01 implements c02 {
    public static final h01 OooO0OO = new h01();
    public final LinkedHashSet OooO00o = new LinkedHashSet();
    public gu0 OooO0O0;

    @Override // com.cmaster.cloner.c02
    public final Bundle OooO00o(Context context, int i, Bundle bundle) {
        LinkedHashSet<yu1> linkedHashSet = this.OooO00o;
        int i2 = 1;
        if (i == 1) {
            bundle.getString(qn2.OooO00o("yw0I30mgbsvtPj3qbdFwy+Mw\n", "rnV8rSiOPoo=\n"));
            bundle.getInt(qn2.OooO00o("7f4cG17VGV/ayTo2fLQYSA==\n", "iIZoaT/7XA0=\n"), 0);
            bundle.getString(qn2.OooO00o("sR3H5rX15naGKuHLmZ7wd5Ui9g==\n", "1GWzlNTboyQ=\n"));
            bundle.getInt(qn2.OooO00o("sDV5f/GsZFeQHw==\n", "1U0NDZCCMQQ=\n"), 0);
            for (yu1 yu1Var : linkedHashSet) {
                yu1Var.OooO.execute(new xu1(yu1Var, i2));
            }
        } else if (i == 2) {
            bundle.getString(qn2.OooO00o("afsK+iXqmYVPyD/PAZuHhUHG\n", "DIN+iETEycQ=\n"));
            bundle.getInt(qn2.OooO00o("kogc6xDHMp2lvzrGMqYzig==\n", "9/BomXHpd88=\n"), 0);
            bundle.getString(qn2.OooO00o("DyuVUz0kcJ44HLN+EU9mnysUpA==\n", "alPhIVwKNcw=\n"));
            bundle.getInt(qn2.OooO00o("ELnI3EjDM1owkw==\n", "dcG8rintZgk=\n"), 0);
            for (yu1 yu1Var2 : linkedHashSet) {
                yu1Var2.OooO.execute(new xu1(yu1Var2, i2));
            }
        } else if (i == 3) {
            bundle.getString(qn2.OooO00o("aM0idrXOXpFO/hdDkb9AkUDw\n", "DbVWBNTgDtA=\n"));
            bundle.getInt(qn2.OooO00o("5qXZYbVyASLRkv9MlxMANQ==\n", "g92tE9RcRHA=\n"), 0);
            bundle.getString(qn2.OooO00o("0K/AcCeXT7jnmOZdC/xZufSQ8Q==\n", "tde0Aka5Cuo=\n"));
            bundle.getInt(qn2.OooO00o("H1sREgazI9Y/cQ==\n", "eiNlYGeddoU=\n"), 0);
            for (yu1 yu1Var3 : linkedHashSet) {
                yu1Var3.OooO.execute(new xu1(yu1Var3, i2));
            }
        } else if (i == 5) {
            try {
                xb1 xb1Var = new xb1(bundle);
                if (this.OooO0O0 != null) {
                    Log.e(sn2.OooO00o("J/5SmQ==\n", "Yb8G2BMUMXE=\n"), sn2.OooO00o("vgVgoqDfjQ==\n", "3XcB0cjlrXg=\n"), (Exception) xb1Var.OooO0o0);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (i == 6) {
            String string = bundle.getString(qn2.OooO00o("RGepXmX5XYliVJxrQYhDiWxa\n", "IR/dLATXDcg=\n"));
            bundle.getBundle(qn2.OooO00o("aprU7/Vp\n", "D+KgnZQaHB0=\n"));
            if (qn2.OooO00o("YEIcKQ==\n", "JRBMa1i7Ghs=\n").equals(string)) {
                ((zz1) a02.OooO0oo.OooO0oO).pingBinder();
            }
        }
        return Bundle.EMPTY;
    }
}
