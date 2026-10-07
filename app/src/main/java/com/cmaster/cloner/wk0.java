package com.cmaster.cloner;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wk0 implements ay0, xr1 {
    public final boolean OooO00o = true;
    public final JsonWriter OooO0O0;
    public final Map OooO0OO;
    public final Map OooO0Oo;
    public final boolean OooO0o;
    public final zx0 OooO0o0;

    public wk0(Writer writer, Map map, Map map2, zx0 zx0Var, boolean z) {
        this.OooO0O0 = new JsonWriter(writer);
        this.OooO0OO = map;
        this.OooO0Oo = map2;
        this.OooO0o0 = zx0Var;
        this.OooO0o = z;
    }

    @Override // com.cmaster.cloner.ay0
    public final ay0 OooO00o(jz jzVar, Object obj) throws IOException {
        OooO0o(obj, jzVar.OooO00o);
        return this;
    }

    @Override // com.cmaster.cloner.ay0
    public final ay0 OooO0O0(jz jzVar, long j) throws IOException {
        String str = jzVar.OooO00o;
        OooO0oO();
        JsonWriter jsonWriter = this.OooO0O0;
        jsonWriter.name(str);
        OooO0oO();
        jsonWriter.value(j);
        return this;
    }

    @Override // com.cmaster.cloner.xr1
    public final xr1 OooO0OO(String str) throws IOException {
        OooO0oO();
        this.OooO0O0.value(str);
        return this;
    }

    @Override // com.cmaster.cloner.xr1
    public final xr1 OooO0Oo(boolean z) throws IOException {
        OooO0oO();
        this.OooO0O0.value(z);
        return this;
    }

    public final wk0 OooO0o(Object obj, String str) throws IOException {
        boolean z = this.OooO0o;
        JsonWriter jsonWriter = this.OooO0O0;
        if (z) {
            if (obj == null) {
                return this;
            }
            OooO0oO();
            jsonWriter.name(str);
            OooO0o0(obj);
            return this;
        }
        OooO0oO();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        OooO0o0(obj);
        return this;
    }

    public final wk0 OooO0o0(Object obj) {
        JsonWriter jsonWriter = this.OooO0O0;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    OooO0o0(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        OooO0o(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new ew(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            zx0 zx0Var = (zx0) this.OooO0OO.get(obj.getClass());
            if (zx0Var != null) {
                jsonWriter.beginObject();
                zx0Var.OooO00o(obj, this);
                jsonWriter.endObject();
                return this;
            }
            wr1 wr1Var = (wr1) this.OooO0Oo.get(obj.getClass());
            if (wr1Var != null) {
                wr1Var.OooO00o(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                OooO0oO();
                jsonWriter.value(strName);
                return this;
            }
            jsonWriter.beginObject();
            this.OooO0o0.OooO00o(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            OooO0oO();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                OooO0oO();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                OooO0o0(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                OooO0o0(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final void OooO0oO() {
        if (this.OooO00o) {
            return;
        }
        qa.OooO0o("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
