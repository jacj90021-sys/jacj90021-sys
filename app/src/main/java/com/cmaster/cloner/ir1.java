package com.cmaster.cloner;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Base64;
import java.io.File;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ir1 implements Parcelable, vk0 {
    public static final Parcelable.Creator<ir1> CREATOR;
    public static final String OooOOO;
    public static final String OooOOOO;
    public static final String OooOOOo;
    public static final String OooOOo0;
    public String OooO0Oo;
    public final int OooO0o;
    public final String OooO0o0;
    public final File OooO0oO;
    public final File OooO0oo;
    public File OooOO0O;
    public File OooOO0o;
    public File OooOOO0;
    public final HashSet OooO = new HashSet();
    public final HashSet OooOO0 = new HashSet();

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{39, 3, 102, 112, -65, 36, 59, -75, 109, 21, 40}, new byte[]{8, 103, 7, 4, -34, 11, 78, -58}));
        sb.append(jr1.OooO00o());
        OooOOO = rj.OooO0oo(new byte[]{48}, new byte[]{31, 87, 59, 83, 12, -57, 19, -124}, sb);
        OooOOOO = u7.OooO00o(new byte[]{75, -76, 33, 60, -128, -45, -8, 38, 16, -79, 111}, new byte[]{100, -48, 64, 72, -31, -4, -100, 71});
        OooOOOo = u7.OooO00o(new byte[]{27, -31, -30, 104, 4, -18, -30, 6, 71, -26, -36, 127, 0, -18}, new byte[]{52, -123, -125, 28, 101, -63, -113, 111}) + jr1.OooO00o();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(u7.OooO00o(new byte[]{59, 77, 75, -64, -19, -73, -125, -31, 113, 91, 117, -48, -23, -73}, new byte[]{20, 41, 42, -76, -116, -104, -10, -110}));
        sb2.append(jr1.OooO00o());
        OooOOo0 = rj.OooO0oo(new byte[]{-102}, new byte[]{-75, -10, -105, -52, -110, -92, 106, -51}, sb2);
        CREATOR = new b41(10);
    }

    public ir1(JSONObject jSONObject) {
        this.OooO0Oo = jSONObject.optString(u7.OooO00o(new byte[]{99, -33, -29, -125, 19, -37, -44, -50, 121, -49, -22}, new byte[]{19, -66, -114, -24, 126, -76, -71, -108}));
        this.OooO0o0 = jSONObject.optString(u7.OooO00o(new byte[]{-37, -45, -37, -107, -35, 92, -38}, new byte[]{-75, -80, -74, -45, -80, 46, -65, -24}));
        this.OooO0o = jSONObject.optInt(u7.OooO00o(new byte[]{41, -7, 119, 33, -53, 75, -10, -64, 47}, new byte[]{89, -105, 19, 102, -94, 58, -108, -117}));
        this.OooO0oO = new File(jSONObject.optString(u7.OooO00o(new byte[]{127, -88, -35, -34, 49, 83, 64}, new byte[]{8, -54, -78, -107, 66, 32, 42, 115})));
        this.OooO0oo = new File(jSONObject.optString(u7.OooO00o(new byte[]{43, -120, 102, 91, -31, 58, -119}, new byte[]{83, -17, 11, 31, -123, 93, -17, -47})));
        OooOOO0(e92.OooO00o);
    }

    public static String OooO0oO(String str) {
        int iIndexOf = str.indexOf(u7.OooO00o(new byte[]{-100, -83, -55, -103, 97, 109, -107, -55, -100, -120, -58, -119, 114}, new byte[]{-77, -20, -89, -3, 19, 2, -4, -83}));
        if (iIndexOf <= 0) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static String OooO0oo(String str) {
        byte[] bArr = new byte[16];
        new Random(str.hashCode()).nextBytes(bArr);
        return str + '-' + Base64.encodeToString(bArr, 10);
    }

    public final File OooO() {
        File file = new File(OooO0OO(), u7.OooO00o(new byte[]{108, 126, -99}, new byte[]{13, 14, -19, 26, -80, -9, 104, 127}));
        zz.OooOO0(file, false);
        return file;
    }

    @Override // com.cmaster.cloner.vk0
    public final void OooO00o(JSONObject jSONObject) throws JSONException {
        jSONObject.putOpt(u7.OooO00o(new byte[]{-63, 69, -107, 7, 17, -46, 1, -25, -37, 85, -100}, new byte[]{-79, 36, -8, 108, 124, -67, 108, -67}), this.OooO0Oo);
        jSONObject.putOpt(u7.OooO00o(new byte[]{-29, 96, -75, -24, 23, -14, 78}, new byte[]{-115, 3, -40, -82, 122, -128, 43, -32}), this.OooO0o0);
        jSONObject.putOpt(u7.OooO00o(new byte[]{97, 101, -103, -50, 89, 51, 4, 88, 103}, new byte[]{17, 11, -3, -119, 48, 66, 102, 19}), Integer.valueOf(this.OooO0o));
        jSONObject.putOpt(u7.OooO00o(new byte[]{34, 123, 28, 39, -111, -64, 111}, new byte[]{85, 25, 115, 108, -30, -77, 5, -111}), this.OooO0oO.getAbsolutePath());
        jSONObject.putOpt(u7.OooO00o(new byte[]{-52, -17, -105, -38, -66, -95, 25}, new byte[]{-76, -120, -6, -98, -38, -58, 127, -98}), this.OooO0oo.getAbsoluteFile());
    }

    public final File OooO0O0() {
        File file = new File(OooO0Oo(), u7.OooO00o(new byte[]{8, -117, -31}, new byte[]{100, -30, -125, 110, 93, -30, -13, 74}));
        zz.OooOO0(file, false);
        return file;
    }

    public final File OooO0OO() {
        File file = this.OooO0oo;
        if (file == null) {
            throw new AndroidRuntimeException(u7.OooO00o(new byte[]{77, -56, -55, 75, 122, 43, -27, 44, 67, -87, -33, 92, 8, 42, -30, 65}, new byte[]{15, -119, -102, 14, 90, 101, -80, 96}));
        }
        File file2 = new File(file, u7.OooO00o(new byte[]{28, -40, 17, -13}, new byte[]{120, -71, 101, -110, -79, -93, -101, -39}));
        zz.OooOO0(file2, false);
        return file2;
    }

    public final File OooO0Oo() {
        File file = new File(OooO(), OooO0oo(this.OooO0o0));
        zz.OooOO0(file, false);
        return file;
    }

    public final File OooO0o() {
        File file = new File(OooO0OO(), u7.OooO00o(new byte[]{-36, -55, -81, 25}, new byte[]{-87, -70, -54, 107, -117, -37, -103, 45}));
        zz.OooOO0(file, false);
        File file2 = new File(file, String.valueOf(this.OooO0o));
        zz.OooOO0(file2, false);
        File file3 = new File(file2, this.OooO0o0);
        zz.OooOO0(file3, false);
        return file3;
    }

    public final File OooO0o0() {
        File file = new File(OooOO0o(), String.valueOf(this.OooO0o));
        zz.OooOO0(file, false);
        File file2 = new File(file, this.OooO0o0);
        zz.OooOO0(file2, false);
        return file2;
    }

    public final File OooOO0() {
        File file = new File(new File(new File(this.OooOO0O, u7.OooO00o(new byte[]{-35, -12, -20, -76}, new byte[]{-104, -90, -68, -10, 73, 82, 58, 109})), u7.OooO00o(new byte[]{-97, -71, -44, 71, 47, -73, -77, -58, -97, -81, -51, 93, 49, -73, -96, -58, -44}, new byte[]{-80, -54, -96, 40, 93, -42, -44, -93})), String.valueOf(this.OooO0o));
        zz.OooOO0(file, false);
        return file;
    }

    public final File OooOO0O() {
        File file = new File(OooOO0(), u7.OooO00o(new byte[]{117, 27, -84, 44, -84, -41, 103, 9, 117, 62, -93, 60, -65}, new byte[]{90, 90, -62, 72, -34, -72, 14, 109}));
        zz.OooOO0(file, false);
        File file2 = new File(file, this.OooO0o0);
        zz.OooOO0(file2, false);
        return file2;
    }

    public final File OooOO0o() {
        File file = new File(OooO0OO(), u7.OooO00o(new byte[]{-17, 75, -43, 120, 38, -30, -19}, new byte[]{-102, 56, -80, 10, 121, -122, -120, 15}));
        zz.OooOO0(file, false);
        return file;
    }

    public final void OooOOO0(Context context) {
        String strOooO0oO;
        if (TextUtils.isEmpty(this.OooO0Oo)) {
            this.OooO0Oo = context.getPackageName();
        }
        String strReplace = null;
        for (File file : context.getExternalFilesDirs(null)) {
            if (file != null) {
                strReplace = file.getParent();
            }
        }
        if (strReplace == null) {
            File file2 = this.OooO0oo;
            File parentFile = file2.getParentFile();
            StringBuilder sb = new StringBuilder();
            sb.append(file2.getName());
            strReplace = new File(parentFile, rj.OooO0oo(new byte[]{117, 121, 15, 73}, new byte[]{42, 60, 87, 29, 45, 7, 54, -125}, sb)).getAbsolutePath();
        }
        String packageName = context.getPackageName();
        if (!TextUtils.equals(packageName, this.OooO0Oo)) {
            strReplace = strReplace.replace(packageName, this.OooO0Oo);
        }
        this.OooOO0O = new File(strReplace);
        this.OooOO0o = new File(strReplace.replace(u7.OooO00o(new byte[]{19, 87, -11, 48, 54, -106, 26, 96, 19, 114, -6, 32, 37}, new byte[]{60, 22, -101, 84, 68, -7, 115, 4}), u7.OooO00o(new byte[]{50, 0, 35, -9, -12, -101, -113, -66, 50, 44, 40, -9, -17, -107}, new byte[]{29, 65, 77, -109, -122, -12, -26, -38})));
        this.OooOOO0 = new File(strReplace.replace(u7.OooO00o(new byte[]{50, 76, 29, -9, 112, 30, 125, -125, 50, 105, 18, -25, 99}, new byte[]{29, 13, 115, -109, 2, 113, 20, -25}), u7.OooO00o(new byte[]{-103, -108, 108, -6, 57, 66, -105, -30, -103, -70, 96, -4}, new byte[]{-74, -43, 2, -98, 75, 45, -2, -122})));
        String strOooO0oO2 = OooO0oO(strReplace);
        HashSet hashSet = this.OooO;
        hashSet.add(strOooO0oO2);
        hashSet.add(u7.OooO00o(new byte[]{-45, -109, 102, 14, 64, -43, 44}, new byte[]{-4, -32, 2, 109, 33, -89, 72, 68}));
        HashSet hashSet2 = this.OooOO0;
        hashSet2.addAll(hashSet);
        File[] externalFilesDirs = context.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            for (File file3 : externalFilesDirs) {
                if (file3 != null && (strOooO0oO = OooO0oO(file3.getAbsolutePath())) != null) {
                    hashSet2.add(strOooO0oO);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format(u7.OooO00o(new byte[]{41, 77, 112, 71, -38, 23, 21, 119, 47, 71, 102, 65, -7, 19, 2, 55, 15, 18, 53, 16, -17, 82, 89, 55, 15, 18, 53, 16, -17}, new byte[]{124, 62, 21, 53, -100, 126, 121, 18}), this.OooO0Oo, this.OooO0o0, Integer.valueOf(this.OooO0o), this.OooO0oO);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.OooO0Oo);
        parcel.writeString(this.OooO0o0);
        parcel.writeInt(this.OooO0o);
        parcel.writeString(this.OooO0oO.getAbsolutePath());
        parcel.writeString(this.OooO0oo.getAbsolutePath());
    }

    public ir1(Parcel parcel) {
        this.OooO0Oo = parcel.readString();
        this.OooO0o0 = parcel.readString();
        this.OooO0o = parcel.readInt();
        String string = parcel.readString();
        if (string != null) {
            this.OooO0oO = new File(string);
        }
        String string2 = parcel.readString();
        if (string2 != null) {
            this.OooO0oo = new File(string2);
        }
        OooOOO0(e92.OooO00o);
    }

    public ir1(int i, String str, String str2) {
        File parentFile;
        if (this.OooO0oo != null) {
            return;
        }
        this.OooO0Oo = str;
        this.OooO0o0 = str2;
        this.OooO0o = i;
        if (!TextUtils.isEmpty(str)) {
            parentFile = new File(e92.OooO00o.getPackageManager().getApplicationInfo(str, 0).dataDir);
        } else {
            this.OooO0Oo = e92.OooO00o.getPackageName();
            parentFile = e92.OooO00o.getCacheDir().getParentFile();
        }
        this.OooO0oO = parentFile;
        File file = new File(parentFile, u7.OooO00o(new byte[]{88, 53, -7, 65}, new byte[]{29, 103, -87, 3, 101, 66, 39, -81}));
        this.OooO0oo = file;
        zz.OooOO0(file, false);
        zz.OooOO0(file.getParentFile(), false);
        OooOOO0(e92.OooO00o);
    }
}
