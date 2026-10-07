package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sh1 {
    public static final Bitmap.Config[] OooO0Oo;
    public static final Bitmap.Config[] OooO0o;
    public static final Bitmap.Config[] OooO0o0;
    public static final Bitmap.Config[] OooO0oO;
    public static final Bitmap.Config[] OooO0oo;
    public final ip0 OooO00o = new ip0(1);
    public final e81 OooO0O0 = new e81(19);
    public final HashMap OooO0OO = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        OooO0Oo = configArr;
        OooO0o0 = configArr;
        OooO0o = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        OooO0oO = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        OooO0oo = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String OooO0OO(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void OooO00o(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapOooO0Oo = OooO0Oo(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapOooO0Oo.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapOooO0Oo.remove(num);
                return;
            } else {
                navigableMapOooO0Oo.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strOooO0OO = OooO0OO(pr1.OooO0OO(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(strOooO0OO);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    public final Bitmap OooO0O0(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iOooO0Oo = pr1.OooO0Oo(config) * i * i2;
        ip0 ip0Var = this.OooO00o;
        g31 g31VarOooOO0O = (g31) ((ArrayDeque) ip0Var.OooO0Oo).poll();
        if (g31VarOooOO0O == null) {
            g31VarOooOO0O = ip0Var.OooOO0O();
        }
        rh1 rh1Var = (rh1) g31VarOooOO0O;
        rh1Var.OooO0O0 = iOooO0Oo;
        rh1Var.OooO0OO = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i3 = qh1.OooO00o[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : OooO0oo : OooO0oO : OooO0o : OooO0Oo;
        } else {
            configArr = OooO0o0;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer num = (Integer) OooO0Oo(config2).ceilingKey(Integer.valueOf(iOooO0Oo));
            if (num == null || num.intValue() > iOooO0Oo * 8) {
                i4++;
            } else if (num.intValue() != iOooO0Oo || (config2 != null ? !config2.equals(config) : config != null)) {
                ip0Var.OooO0oO(rh1Var);
                int iIntValue = num.intValue();
                g31 g31VarOooOO0O2 = (g31) ((ArrayDeque) ip0Var.OooO0Oo).poll();
                if (g31VarOooOO0O2 == null) {
                    g31VarOooOO0O2 = ip0Var.OooOO0O();
                }
                rh1Var = (rh1) g31VarOooOO0O2;
                rh1Var.OooO0O0 = iIntValue;
                rh1Var.OooO0OO = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.OooO0O0.OooO(rh1Var);
        if (bitmap != null) {
            OooO00o(Integer.valueOf(rh1Var.OooO0O0), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap OooO0Oo(Bitmap.Config config) {
        HashMap map = this.OooO0OO;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void OooO0o0(Bitmap bitmap) {
        int iOooO0OO = pr1.OooO0OO(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        ip0 ip0Var = this.OooO00o;
        g31 g31VarOooOO0O = (g31) ((ArrayDeque) ip0Var.OooO0Oo).poll();
        if (g31VarOooOO0O == null) {
            g31VarOooOO0O = ip0Var.OooOO0O();
        }
        rh1 rh1Var = (rh1) g31VarOooOO0O;
        rh1Var.OooO0O0 = iOooO0OO;
        rh1Var.OooO0OO = config;
        this.OooO0O0.OooOo0o(rh1Var, bitmap);
        NavigableMap navigableMapOooO0Oo = OooO0Oo(bitmap.getConfig());
        Integer num = (Integer) navigableMapOooO0Oo.get(Integer.valueOf(rh1Var.OooO0O0));
        navigableMapOooO0Oo.put(Integer.valueOf(rh1Var.OooO0O0), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbOooOO0 = rj.OooOO0("SizeConfigStrategy{groupedMap=");
        sbOooOO0.append(this.OooO0O0);
        sbOooOO0.append(", sortedSizes=(");
        HashMap map = this.OooO0OO;
        for (Map.Entry entry : map.entrySet()) {
            sbOooOO0.append(entry.getKey());
            sbOooOO0.append('[');
            sbOooOO0.append(entry.getValue());
            sbOooOO0.append("], ");
        }
        if (!map.isEmpty()) {
            sbOooOO0.replace(sbOooOO0.length() - 2, sbOooOO0.length(), "");
        }
        sbOooOO0.append(")}");
        return sbOooOO0.toString();
    }
}
