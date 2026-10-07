package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class dp2 {
    public static eq1 OooO00o(Object obj) {
        if (obj == null) {
            return dl.OooO0Oo;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? uk.OooO0o : uk.OooO0o0;
        }
        if (obj instanceof Byte) {
            return new vk(((Byte) obj).byteValue());
        }
        if (obj instanceof Character) {
            return new wk(((Character) obj).charValue());
        }
        if (obj instanceof Double) {
            return new xk(Double.doubleToLongBits(((Double) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return new zk(Float.floatToIntBits(((Float) obj).floatValue()));
        }
        if (obj instanceof Integer) {
            return cl.OooO(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return new hl(((Long) obj).longValue());
        }
        if (obj instanceof Short) {
            return new ll(((Short) obj).shortValue());
        }
        if (obj instanceof String) {
            return new ml((String) obj);
        }
        if (obj instanceof Class) {
            return new nl(xp1.OooO00o((Class) obj).OooO0O0);
        }
        if (obj instanceof xp1) {
            return new nl(((xp1) obj).OooO0O0);
        }
        throw new UnsupportedOperationException(u7.OooO00o(new byte[]{-60, -22, 81, 3, -97, -56, 79, 2, -28, -10, 81, 66, -112, -100, 22, 77}, new byte[]{-118, -123, 37, 35, -2, -24, 44, 109}) + obj);
    }
}
