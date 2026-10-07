package com.cmaster.cloner;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u42 implements ay0 {
    public OutputStream OooO00o;
    public final HashMap OooO0O0;
    public final HashMap OooO0OO;
    public final zx0 OooO0Oo;
    public final l52 OooO0o0 = new l52(this, 0);
    public static final Charset OooO0o = Charset.forName("UTF-8");
    public static final jz OooO0oO = new jz("key", px0.OooOOoo(px0.OooOOo0(o42.class, new w32(1))));
    public static final jz OooO0oo = new jz("value", px0.OooOOoo(px0.OooOOo0(o42.class, new w32(2))));
    public static final rk0 OooO = rk0.OooO0OO;

    public u42(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, zx0 zx0Var) {
        this.OooO00o = byteArrayOutputStream;
        this.OooO0O0 = map;
        this.OooO0OO = map2;
        this.OooO0Oo = zx0Var;
    }

    public static int OooO0o(jz jzVar) {
        o42 o42Var = (o42) ((Annotation) jzVar.OooO0O0.get(o42.class));
        if (o42Var != null) {
            return o42Var.zza();
        }
        throw new ew("Field has no @Protobuf config");
    }

    public final void OooO(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.OooO00o;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }

    @Override // com.cmaster.cloner.ay0
    public final ay0 OooO00o(jz jzVar, Object obj) {
        OooO0OO(jzVar, obj, true);
        return this;
    }

    @Override // com.cmaster.cloner.ay0
    public final /* synthetic */ ay0 OooO0O0(jz jzVar, long j) throws IOException {
        OooO0o0(jzVar, j, true);
        return this;
    }

    public final void OooO0OO(jz jzVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            OooO0oo((OooO0o(jzVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(OooO0o);
            OooO0oo(bytes.length);
            this.OooO00o.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                OooO0OO(jzVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                OooO0oO(OooO, jzVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            OooO0oo((OooO0o(jzVar) << 3) | 1);
            this.OooO00o.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            OooO0oo((OooO0o(jzVar) << 3) | 5);
            this.OooO00o.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            OooO0o0(jzVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            OooO0Oo(jzVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            OooO0oo((OooO0o(jzVar) << 3) | 2);
            OooO0oo(bArr.length);
            this.OooO00o.write(bArr);
            return;
        }
        zx0 zx0Var = (zx0) this.OooO0O0.get(obj.getClass());
        if (zx0Var != null) {
            OooO0oO(zx0Var, jzVar, obj, z);
            return;
        }
        wr1 wr1Var = (wr1) this.OooO0OO.get(obj.getClass());
        if (wr1Var != null) {
            l52 l52Var = this.OooO0o0;
            l52Var.OooO0O0 = false;
            l52Var.OooO0Oo = jzVar;
            l52Var.OooO0OO = z;
            wr1Var.OooO00o(obj, l52Var);
            return;
        }
        if (obj instanceof h42) {
            OooO0Oo(jzVar, ((h42) obj).zza(), true);
        } else if (obj instanceof Enum) {
            OooO0Oo(jzVar, ((Enum) obj).ordinal(), true);
        } else {
            OooO0oO(this.OooO0Oo, jzVar, obj, z);
        }
    }

    public final void OooO0Oo(jz jzVar, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        o42 o42Var = (o42) ((Annotation) jzVar.OooO0O0.get(o42.class));
        if (o42Var == null) {
            throw new ew("Field has no @Protobuf config");
        }
        int iOrdinal = o42Var.zzb().ordinal();
        if (iOrdinal == 0) {
            OooO0oo(o42Var.zza() << 3);
            OooO0oo(i);
        } else if (iOrdinal == 1) {
            OooO0oo(o42Var.zza() << 3);
            OooO0oo((i + i) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            OooO0oo((o42Var.zza() << 3) | 5);
            this.OooO00o.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    public final void OooO0o0(jz jzVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        o42 o42Var = (o42) ((Annotation) jzVar.OooO0O0.get(o42.class));
        if (o42Var == null) {
            throw new ew("Field has no @Protobuf config");
        }
        int iOrdinal = o42Var.zzb().ordinal();
        if (iOrdinal == 0) {
            OooO0oo(o42Var.zza() << 3);
            OooO(j);
        } else if (iOrdinal == 1) {
            OooO0oo(o42Var.zza() << 3);
            OooO((j >> 63) ^ (j + j));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            OooO0oo((o42Var.zza() << 3) | 1);
            this.OooO00o.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void OooO0oO(zx0 zx0Var, jz jzVar, Object obj, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        e42 e42Var = new e42(0);
        e42Var.OooO0o0 = 0L;
        try {
            OutputStream outputStream = this.OooO00o;
            this.OooO00o = e42Var;
            try {
                zx0Var.OooO00o(obj, this);
                this.OooO00o = outputStream;
                long j = e42Var.OooO0o0;
                e42Var.close();
                if (z && j == 0) {
                    return;
                }
                OooO0oo((OooO0o(jzVar) << 3) | 2);
                OooO(j);
                zx0Var.OooO00o(obj, this);
            } catch (Throwable th) {
                this.OooO00o = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                e42Var.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void OooO0oo(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.OooO00o;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }
}
