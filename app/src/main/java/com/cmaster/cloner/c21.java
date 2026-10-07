package com.cmaster.cloner;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c21 {
    public static final g21 OooOo0o;
    public final String OooO;
    public final String OooO00o;
    public final int OooO0O0;
    public final String OooO0OO;
    public String OooO0Oo;
    public final String[] OooO0o;
    public final String OooO0o0;
    public final long[] OooO0oO;
    public final String OooO0oo;
    public final long OooOO0;
    public final long OooOO0O;
    public final long OooOO0o;
    public final HashSet OooOOO;
    public long OooOOO0;
    public String OooOOOO;
    public final int OooOOOo;
    public final int OooOOo;
    public long OooOOo0;
    public final fh0 OooOOoo;
    public final SparseArray OooOo0;
    public d11 OooOo00;
    public final SparseArray OooOo0O;

    public c21(JSONObject jSONObject) throws JSONException {
        String[] strArr;
        long[] jArr;
        String[] strArr2;
        HashSet hashSet = new HashSet();
        this.OooOOO = hashSet;
        int i = -1;
        this.OooOOOo = -1;
        this.OooOo0 = new SparseArray();
        this.OooOo0O = new SparseArray();
        this.OooO00o = jSONObject.optString(u7.OooO00o(new byte[]{-14, -76, 58}, new byte[]{-86, -13, 109, 101, -24, 0, -109, 50}), null);
        this.OooO0O0 = jSONObject.optInt(u7.OooO00o(new byte[]{-36, 2, 55, 92, 38}, new byte[]{-98, 68, 118, 24, 116, -78, 104, -7}));
        this.OooO0Oo = jSONObject.optString(u7.OooO00o(new byte[]{-126, 89, 90, 102, -13, 110, 82, -81, -124, 92, 71, 100}, new byte[]{-56, 10, 0, 32, -80, 59, 25, -26}), null);
        this.OooO0OO = jSONObject.optString(u7.OooO00o(new byte[]{-100, -126, 49, 40, 56, -119, 11, 124}, new byte[]{-46, -42, 101, 113, 118, -36, 66, 45}), null);
        this.OooO0o0 = jSONObject.optString(u7.OooO00o(new byte[]{126, 102, -27, -66, -88, -40, -95, -5, 112, 102, -27, -95}, new byte[]{42, 46, -67, -24, -16, -103, -28, -84}), null);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(u7.OooO00o(new byte[]{-7, 16, 60, -43, -113, -15, 124, 24, -15, 15, 42, -45, -103, -21, 103, 2, -1, 29, 36}, new byte[]{-88, 69, 112, -106, -40, -91, 54, 76}));
        int i2 = qk0.OooO00o;
        if (jSONArrayOptJSONArray == null) {
            strArr = null;
        } else {
            strArr = new String[jSONArrayOptJSONArray.length()];
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                strArr[i3] = jSONArrayOptJSONArray.optString(i3);
            }
        }
        this.OooO0o = strArr;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(u7.OooO00o(new byte[]{1, -58, 45, 30, 97, -97, 70, 24, 9, -52, 53, 7, 117, -114, 87, 8, 7, -37, 58, 1, 118, -125, 92, 0, 0, -58, 56}, new byte[]{69, -125, 125, 72, 52, -53, 5, 78}));
        if (jSONArrayOptJSONArray2 == null) {
            jArr = null;
        } else {
            jArr = new long[jSONArrayOptJSONArray2.length()];
            for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                jArr[i4] = jSONArrayOptJSONArray2.optLong(i4);
            }
        }
        this.OooO0oO = jArr;
        this.OooO0oo = jSONObject.optString(u7.OooO00o(new byte[]{42, 75, 126, 90, 55, -57, 10, -77, 63, 79, 103, 88, 51}, new byte[]{102, 5, 55, 11, 98, -113, 79, -7}), null);
        this.OooO = jSONObject.optString(u7.OooO00o(new byte[]{62, -83, -109, 72, -83, 0, 8, 114, 45, -88, -121, 82, -77, 18, 31}, new byte[]{107, -8, -34, 30, -3, 80, 80, 55}), null);
        int i5 = 9;
        this.OooOO0 = jSONObject.optLong(u7.OooO00o(new byte[]{-50, 114, 80, -43, 52, 114, -6, -45, -63}, new byte[]{-128, 35, 28, -105, 98, 62, -87, -122}));
        this.OooOO0O = jSONObject.optLong(u7.OooO00o(new byte[]{-123, -90, 17, 64, 76, 40, -22, 109, -121, -71, 7, 72, 91, 52, -22, 125}, new byte[]{-64, -13, 86, 5, 10, 109, -77, 44}));
        this.OooOO0o = jSONObject.optLong(u7.OooO00o(new byte[]{-20, -8, 104, -10, -39, -36, 52, -84, -22, -18, 96, -12, -58}, new byte[]{-85, -66, 47, -89, -127, -99, 110, -22}));
        this.OooOOO0 = jSONObject.optLong(u7.OooO00o(new byte[]{-112, 75, 2, -25, -110, 77, 121}, new byte[]{-55, 29, 85, -88, -53, 21, 59, 110}));
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(u7.OooO00o(new byte[]{27, -47, 7, -25, 105, 113, 37, -94, 2, -33, 15, -9}, new byte[]{75, -104, 74, -80, 47, 37, 104, -20}));
        if (jSONArrayOptJSONArray3 == null) {
            strArr2 = null;
        } else {
            strArr2 = new String[jSONArrayOptJSONArray3.length()];
            for (int i6 = 0; i6 < jSONArrayOptJSONArray3.length(); i6++) {
                strArr2[i6] = jSONArrayOptJSONArray3.optString(i6);
            }
        }
        if (strArr2 != null) {
            hashSet.addAll(Arrays.asList(strArr2));
        }
        this.OooOOOO = jSONObject.optString(u7.OooO00o(new byte[]{104, 123, -115, -22, 36, 37, -76, -128, 96}, new byte[]{41, 62, -33, -80, 105, 125, -29, -62}), null);
        this.OooOOOo = jSONObject.optInt(u7.OooO00o(new byte[]{-28, -10, -105, -96, -30, 49, 26, -52, -12, -21, -111, -96}, new byte[]{-77, -89, -46, -19, -85, 103, 89, -114}));
        this.OooOOo0 = jSONObject.optLong(u7.OooO00o(new byte[]{13, -59, -81, 33, 68, 114, -41, 49}, new byte[]{67, -120, -25, 117, 1, 54, -99, 117}));
        this.OooOOo = jSONObject.optInt(u7.OooO00o(new byte[]{-85, -85, 8, 115, 20, -104, 83, -25, -95, -70, 10, 102, 16, -122, 78}, new byte[]{-18, -13, 68, 39, 65, -56, 0, -93}));
        JSONArray jSONArray = jSONObject.getJSONArray(u7.OooO00o(new byte[]{65, -93, -94, 7, -95, 66, 55, -114, 77}, new byte[]{0, -7, -24, 84, -5, 7, 117, -55}));
        int i7 = 0;
        while (i7 < jSONArray.length()) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
            int iOptInt = jSONObject2.optInt(u7.OooO00o(new byte[]{-58, -8, 89, -84, 113}, new byte[]{-127, -74, 22, -18, 50, 74, -20, -121}));
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(u7.OooO00o(new byte[]{-42, 106, -121, 83}, new byte[]{-112, 34, -56, 0, 67, -34, -32, -80}));
            SparseArray sparseArray = this.OooOo0;
            g21 g21Var = new g21();
            g21Var.OooOO0 = i;
            byte[] bArr = new byte[i5];
            // fill-array-data instruction
            bArr[0] = 47;
            bArr[1] = -5;
            bArr[2] = -76;
            bArr[3] = 52;
            bArr[4] = 63;
            bArr[5] = 73;
            bArr[6] = 27;
            bArr[7] = 59;
            bArr[8] = 40;
            g21Var.OooO0Oo = jSONObjectOptJSONObject.optBoolean(u7.OooO00o(bArr, new byte[]{123, -81, -9, 98, 103, 11, 82, 105}));
            g21Var.OooO0o0 = jSONObjectOptJSONObject.optBoolean(u7.OooO00o(new byte[]{43, -23, -90, 59, -119, 54, -79}, new byte[]{105, -94, -14, 119, -39, 126, -4, 112}));
            g21Var.OooO0o = jSONObjectOptJSONObject.optBoolean(u7.OooO00o(new byte[]{104, -32, -38, -117, -65, 64, 88, -31, 127, -22, -46}, new byte[]{56, -87, -98, -61, -20, 18, 10, -94}));
            g21Var.OooO0oO = jSONObjectOptJSONObject.optBoolean(u7.OooO00o(new byte[]{50, 3, -94, 86, 67, -125}, new byte[]{119, 85, -6, 0, 0, -64, -73, -99}));
            g21Var.OooO0oo = jSONObjectOptJSONObject.optInt(u7.OooO00o(new byte[]{82, 66, -121, -13, -20, -67, -105}, new byte[]{26, 27, -41, -93, -69, -24, -38, 49}));
            g21Var.OooO = jSONObjectOptJSONObject.optBoolean(u7.OooO00o(new byte[]{-29, -14, 65, 11, -102, -35, -77, -95, -21, -9}, new byte[]{-84, -96, 20, 92, -48, -109, -1, -32}));
            g21Var.OooOO0 = jSONObjectOptJSONObject.optInt(u7.OooO00o(new byte[]{35, 36, 106, 13, -27, -31, -5, -27, 51, 57, 108, 13}, new byte[]{116, 117, 47, 64, -84, -73, -72, -89}));
            g21Var.OooOO0O = jSONObjectOptJSONObject.optString(u7.OooO00o(new byte[]{64, -110, 79, -128, 68, 39, -33, 99, 87, -109, 67, -112, 83, 37, -36, 114, 95, -100, 68, -110}, new byte[]{16, -48, 6, -47, 1, 104, -107, 39}));
            g21Var.OooOO0o = new HashSet();
            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject.optJSONArray(u7.OooO00o(new byte[]{56, -82, -66, 21, -111, 79, 70, 44, 32, -68, -95, 19, -105, 85, 75, 55, 42, -96}, new byte[]{97, -21, -25, 95, -37, 5, 4, 96}));
            if (jSONArrayOptJSONArray4 != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray4.length(); i8++) {
                    g21Var.OooOO0o.add(jSONArrayOptJSONArray4.optString(i8));
                }
            }
            g21Var.OooOOO0 = new HashSet();
            JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject.optJSONArray(u7.OooO00o(new byte[]{65, 55, 74, 41, 60, -125, -3, 95, 71, 47, 70, 43, 47, -99, -26, 68, 91}, new byte[]{23, 117, 30, 127, 118, -57, -83, 30}));
            if (jSONArrayOptJSONArray5 != null) {
                for (int i9 = 0; i9 < jSONArrayOptJSONArray5.length(); i9++) {
                    g21Var.OooOOO0.add(jSONArrayOptJSONArray5.optString(i9));
                }
            }
            sparseArray.put(iOptInt, g21Var);
            i7++;
            i = -1;
            i5 = 9;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(u7.OooO00o(new byte[]{90, 22, 61, 106, 81, 25, -51, 67, 91, 29, 46, 100, 71}, new byte[]{29, 84, 100, 38, 21, 83, -125, 20}));
        if (jSONObjectOptJSONObject2 != null) {
            fh0 fh0Var = new fh0();
            String[] strArr3 = fh0.OooOOoo;
            fh0Var.OooOOo0 = strArr3;
            fh0Var.OooOOo = strArr3;
            fh0Var.OooO0Oo = jSONObjectOptJSONObject2.optInt(u7.OooO00o(new byte[]{-58, -77, -115, -40, -128}, new byte[]{-127, -3, -62, -102, -61, -4, -116, 120}));
            fh0Var.OooO0o0 = jSONObjectOptJSONObject2.optInt(u7.OooO00o(new byte[]{73, 8, -93, -5, 72, -1, -100}, new byte[]{16, 94, -12, -76, 17, -89, -34, 80}));
            fh0Var.OooO0o = jSONObjectOptJSONObject2.optInt(u7.OooO00o(new byte[]{116, 91, 79, -28, 101}, new byte[]{38, 8, 29, -91, 33, 1, 33, 46}));
            fh0Var.OooO0oO = jSONObjectOptJSONObject2.optInt(u7.OooO00o(new byte[]{19, -6, -116, 16, 47, -41, 123, 100, 20, -23}, new byte[]{94, -86, -51, 84, 121, -108, 52, 50}));
            fh0Var.OooO0oo = jSONObjectOptJSONObject2.optBoolean(u7.OooO00o(new byte[]{-114, 43, -111, 54, 21, -66, 58, -57, -103, 33, -116}, new byte[]{-51, 106, -35, 125, 80, -7, 99, -112}));
            fh0Var.OooO = jSONObjectOptJSONObject2.optBoolean(u7.OooO00o(new byte[]{96, -50, -85, 127, -46, -56, 45, 32}, new byte[]{54, -119, -27, 58, -120, -111, 125, 115}));
            fh0Var.OooOO0 = jSONObjectOptJSONObject2.optBoolean(u7.OooO00o(new byte[]{-65, 65, 107, -49, 126, 102, -78, 48, -92, 88, 99, -46, 99, 122, -73, 54}, new byte[]{-14, 17, 36, -98, 54, 32, -3, 125}));
            fh0Var.OooOO0O = jSONObjectOptJSONObject2.optBoolean(u7.OooO00o(new byte[]{0, -76, -119, -88, 30, -74, -85, -45, 16, -89, -124, -72, 6, -87, -84, -63, 0}, new byte[]{68, -29, -45, -19, 82, -16, -31, -125}));
            fh0Var.OooOO0o = jSONObjectOptJSONObject2.optBoolean(u7.OooO00o(new byte[]{-51, -31, -32, 110, 10, -13, -115, -43, -40}, new byte[]{-119, -85, -95, 47, 76, -71, -41, -128}));
            fh0Var.OooOOO0 = jSONObjectOptJSONObject2.optString(u7.OooO00o(new byte[]{-61, -89, 18}, new byte[]{-101, -32, 69, 46, -10, -68, 64, -4}));
            fh0Var.OooOOO = jSONObjectOptJSONObject2.optString(u7.OooO00o(new byte[]{-53, -102, 2, -20, 125, -78, -63, -104}, new byte[]{-103, -33, 72, -82, 47, -16, -113, -55}));
            fh0Var.OooOOOO = jSONObjectOptJSONObject2.optString(u7.OooO00o(new byte[]{-55, 83, -34, -111, -38, 57, -62, 120, -45, 67, -41}, new byte[]{-71, 50, -77, -6, -73, 86, -81, 34}));
            fh0Var.OooOOOo = jSONObjectOptJSONObject2.optString(u7.OooO00o(new byte[]{-24, 93, 49, -13, 4, -73, -98, -11, -17, 64, 58, -15}, new byte[]{-69, 19, 96, -75, 87, -3, -43, -69}));
            JSONArray jSONArrayOptJSONArray6 = jSONObjectOptJSONObject2.optJSONArray(u7.OooO00o(new byte[]{-6, -35, -72, -66, -55, -33, -121, -101, -6, -54, -81, -89, -62, -61, -99, -113, -19, -33, -86, -75, -63, -61}, new byte[]{-76, -102, -5, -31, -121, -114, -40, -43}));
            if (jSONArrayOptJSONArray6 != null) {
                fh0Var.OooOOo0 = new String[jSONArrayOptJSONArray6.length()];
                for (int i10 = 0; i10 < jSONArrayOptJSONArray6.length(); i10++) {
                    fh0Var.OooOOo0[i10] = jSONArrayOptJSONArray6.getString(i10);
                }
            }
            JSONArray jSONArrayOptJSONArray7 = jSONObjectOptJSONObject2.optJSONArray(u7.OooO00o(new byte[]{34, -94, 96, -104, -80, 25, -95, -102, 50, -71, 108, -126, -77, 7, -80, -111, 57, -78, 99, -119, -96, 11, -70}, new byte[]{115, -29, 39, -57, -27, 65, -2, -35}));
            if (jSONArrayOptJSONArray7 != null) {
                fh0Var.OooOOo = new String[jSONArrayOptJSONArray7.length()];
                for (int i11 = 0; i11 < jSONArrayOptJSONArray7.length(); i11++) {
                    fh0Var.OooOOo[i11] = jSONArrayOptJSONArray7.optString(i11);
                }
            }
            this.OooOOoo = fh0Var;
        }
        JSONArray jSONArrayOptJSONArray8 = jSONObject.optJSONArray(u7.OooO00o(new byte[]{-96, -38, 74, -113, 36, -20, 46, -122, -70}, new byte[]{-48, -69, 39, -28, 105, -125, 67, -4}));
        if (jSONArrayOptJSONArray8 != null) {
            for (int i12 = 0; i12 < jSONArrayOptJSONArray8.length(); i12++) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray8.getJSONObject(i12);
                this.OooOo0O.put(jSONObject3.optInt(u7.OooO00o(new byte[]{-116, 91, 84, -55, -92}, new byte[]{-53, 21, 27, -117, -25, 38, 18, 112})), new ir1(jSONObject3.optJSONObject(u7.OooO00o(new byte[]{-98, -120, -35, 57}, new byte[]{-40, -64, -110, 106, 60, -26, -26, 67}))));
            }
        }
        SparseArray sparseArray2 = this.OooOo0O;
        SparseArray sparseArray3 = this.OooOo0;
        for (int i13 = 0; i13 < sparseArray3.size(); i13++) {
            int iKeyAt = sparseArray3.keyAt(i13);
            ir1 ir1Var = (ir1) sparseArray2.get(iKeyAt);
            if (ir1Var == null) {
                fh0 fh0Var2 = this.OooOOoo;
                if (TextUtils.isEmpty(fh0Var2.OooOOOO)) {
                    fh0Var2.OooOOOO = e92.OooO00o.getPackageName();
                }
                ir1Var = new ir1(iKeyAt, fh0Var2.OooOOOO, this.OooO00o);
            }
            sparseArray2.put(iKeyAt, ir1Var);
        }
    }

    public final native byte[] OooO00o();

    public final native int[] OooO0O0();

    public final native g21 OooO0OO(int i);

    public final native g21 OooO0Oo(int i, boolean z, boolean z2);

    public final native boolean OooO0o(boolean z);

    public final native g21 OooO0o0(int i);

    public final native String toString();

    static {
        DexUtils.classesInit0(2);
        OooOo0o = new g21();
    }

    public c21(String str, int i, String str2, fh0 fh0Var, SparseArray sparseArray, SparseArray sparseArray2) {
        this.OooOOO = new HashSet();
        this.OooOOOo = -1;
        this.OooOo0 = new SparseArray();
        new SparseArray();
        this.OooO00o = str;
        this.OooO0O0 = i;
        this.OooO0OO = str2;
        this.OooOOoo = fh0Var;
        this.OooOo0 = sparseArray;
        this.OooOo0O = sparseArray2;
    }

    public c21(String str, int i, String str2, fh0 fh0Var) {
        this.OooOOO = new HashSet();
        this.OooOOOo = -1;
        this.OooOo0 = new SparseArray();
        this.OooOo0O = new SparseArray();
        this.OooO00o = str;
        this.OooO0O0 = i;
        this.OooO0OO = str2;
        this.OooOOoo = fh0Var;
    }
}
