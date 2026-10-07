package com.cmaster.cloner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class t72 {
    public static final byte[] OooO00o = {112, 114, 111, 0};
    public static final byte[] OooO0O0 = {112, 114, 109, 0};

    /* JADX WARN: Finally extract failed */
    public static boolean OooO(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, vq[] vqVarArr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = w72.OooO00o;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = w72.OooO0O0;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrOooO00o = OooO00o(vqVarArr, bArr3);
                dr2.OooO0o0(byteArrayOutputStream, vqVarArr.length, 1);
                dr2.OooO0o0(byteArrayOutputStream, bArrOooO00o.length, 4);
                byte[] bArrOooO00o2 = dr2.OooO00o(bArrOooO00o);
                dr2.OooO0o0(byteArrayOutputStream, bArrOooO00o2.length, 4);
                byteArrayOutputStream.write(bArrOooO00o2);
                return true;
            }
            byte[] bArr4 = w72.OooO0Oo;
            if (Arrays.equals(bArr, bArr4)) {
                dr2.OooO0o0(byteArrayOutputStream, vqVarArr.length, 1);
                for (vq vqVar : vqVarArr) {
                    int size = vqVar.OooO.size() * 4;
                    String strOooO0O0 = OooO0O0(vqVar.OooO00o, bArr4, vqVar.OooO0O0);
                    Charset charset = StandardCharsets.UTF_8;
                    dr2.OooO0o(byteArrayOutputStream, strOooO0O0.getBytes(charset).length);
                    dr2.OooO0o(byteArrayOutputStream, vqVar.OooO0oo.length);
                    dr2.OooO0o0(byteArrayOutputStream, size, 4);
                    dr2.OooO0o0(byteArrayOutputStream, vqVar.OooO0OO, 4);
                    byteArrayOutputStream.write(strOooO0O0.getBytes(charset));
                    Iterator it = vqVar.OooO.keySet().iterator();
                    while (it.hasNext()) {
                        dr2.OooO0o(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        dr2.OooO0o(byteArrayOutputStream, 0);
                    }
                    for (int i2 : vqVar.OooO0oo) {
                        dr2.OooO0o(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = w72.OooO0OO;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrOooO00o3 = OooO00o(vqVarArr, bArr5);
                dr2.OooO0o0(byteArrayOutputStream, vqVarArr.length, 1);
                dr2.OooO0o0(byteArrayOutputStream, bArrOooO00o3.length, 4);
                byte[] bArrOooO00o4 = dr2.OooO00o(bArrOooO00o3);
                dr2.OooO0o0(byteArrayOutputStream, bArrOooO00o4.length, 4);
                byteArrayOutputStream.write(bArrOooO00o4);
                return true;
            }
            byte[] bArr6 = w72.OooO0o0;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            dr2.OooO0o(byteArrayOutputStream, vqVarArr.length);
            for (vq vqVar2 : vqVarArr) {
                String str = vqVar2.OooO00o;
                TreeMap treeMap = vqVar2.OooO;
                String strOooO0O02 = OooO0O0(str, bArr6, vqVar2.OooO0O0);
                Charset charset2 = StandardCharsets.UTF_8;
                dr2.OooO0o(byteArrayOutputStream, strOooO0O02.getBytes(charset2).length);
                dr2.OooO0o(byteArrayOutputStream, treeMap.size());
                dr2.OooO0o(byteArrayOutputStream, vqVar2.OooO0oo.length);
                dr2.OooO0o0(byteArrayOutputStream, vqVar2.OooO0OO, 4);
                byteArrayOutputStream.write(strOooO0O02.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    dr2.OooO0o(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : vqVar2.OooO0oo) {
                    dr2.OooO0o(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            dr2.OooO0o(byteArrayOutputStream2, vqVarArr.length);
            int i4 = 2;
            int i5 = 2;
            for (vq vqVar3 : vqVarArr) {
                dr2.OooO0o0(byteArrayOutputStream2, vqVar3.OooO0OO, 4);
                dr2.OooO0o0(byteArrayOutputStream2, vqVar3.OooO0Oo, 4);
                dr2.OooO0o0(byteArrayOutputStream2, vqVar3.OooO0oO, 4);
                String strOooO0O03 = OooO0O0(vqVar3.OooO00o, bArr2, vqVar3.OooO0O0);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strOooO0O03.getBytes(charset3).length;
                dr2.OooO0o(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strOooO0O03.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            f12 f12Var = new f12(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList2.add(f12Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < vqVarArr.length) {
                try {
                    vq vqVar4 = vqVarArr[i6];
                    dr2.OooO0o(byteArrayOutputStream3, i6);
                    dr2.OooO0o(byteArrayOutputStream3, vqVar4.OooO0o0);
                    i7 = i7 + 4 + (vqVar4.OooO0o0 * i4);
                    int[] iArr = vqVar4.OooO0oo;
                    int length3 = iArr.length;
                    int i8 = i;
                    while (i < length3) {
                        int i9 = iArr[i];
                        dr2.OooO0o(byteArrayOutputStream3, i9 - i8);
                        i++;
                        i4 = i4;
                        i8 = i9;
                    }
                    i6++;
                    i = 0;
                } catch (Throwable th) {
                }
            }
            int i10 = i4;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            f12 f12Var2 = new f12(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList2.add(f12Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < vqVarArr.length) {
                try {
                    vq vqVar5 = vqVarArr[i11];
                    Iterator it3 = vqVar5.OooO.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        OooOO0o(byteArrayOutputStream4, iIntValue, vqVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            OooOOO0(byteArrayOutputStream4, vqVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            dr2.OooO0o(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            dr2.OooO0o0(byteArrayOutputStream3, length4, 4);
                            dr2.OooO0o(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            f12 f12Var3 = new f12(byteArray5, 4, true);
            byteArrayOutputStream3.close();
            arrayList2.add(f12Var3);
            long size2 = 12 + (arrayList2.size() * 16);
            dr2.OooO0o0(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                f12 f12Var4 = (f12) arrayList2.get(i14);
                int i15 = f12Var4.OooO00o;
                byte[] bArr7 = f12Var4.OooO0O0;
                int i16 = i10;
                if (i15 == 1) {
                    j = 0;
                } else if (i15 == i16) {
                    j = 1;
                } else if (i15 == 3) {
                    j = 2;
                } else if (i15 == 4) {
                    j = 3;
                } else {
                    if (i15 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                dr2.OooO0o0(byteArrayOutputStream, j, 4);
                dr2.OooO0o0(byteArrayOutputStream, size2, 4);
                if (f12Var4.OooO0OO) {
                    long length5 = bArr7.length;
                    byte[] bArrOooO00o5 = dr2.OooO00o(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrOooO00o5);
                    dr2.OooO0o0(byteArrayOutputStream, bArrOooO00o5.length, 4);
                    dr2.OooO0o0(byteArrayOutputStream, length5, 4);
                    length = bArrOooO00o5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    dr2.OooO0o0(byteArrayOutputStream, bArr7.length, 4);
                    dr2.OooO0o0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i14++;
                arrayList5 = arrayList;
                i10 = i16;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static byte[] OooO00o(vq[] vqVarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (vq vqVar : vqVarArr) {
            length += ((((vqVar.OooO0oO * 2) + 7) & (-8)) / 8) + (vqVar.OooO0o0 * 2) + OooO0O0(vqVar.OooO00o, bArr, vqVar.OooO0O0).getBytes(StandardCharsets.UTF_8).length + 16 + vqVar.OooO0o;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, w72.OooO0OO)) {
            int length2 = vqVarArr.length;
            while (i < length2) {
                vq vqVar2 = vqVarArr[i];
                OooOO0O(byteArrayOutputStream, vqVar2, OooO0O0(vqVar2.OooO00o, bArr, vqVar2.OooO0O0));
                OooOO0(byteArrayOutputStream, vqVar2);
                i++;
            }
        } else {
            for (vq vqVar3 : vqVarArr) {
                OooOO0O(byteArrayOutputStream, vqVar3, OooO0O0(vqVar3.OooO00o, bArr, vqVar3.OooO0O0));
            }
            int length3 = vqVarArr.length;
            while (i < length3) {
                OooOO0(byteArrayOutputStream, vqVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String OooO0O0(String str, byte[] bArr, String str2) {
        byte[] bArr2 = w72.OooO0o0;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = w72.OooO0Oo;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return rj.OooO0oO(rj.OooOO0(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int[] OooO0OO(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iOooO0Oo = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iOooO0Oo += (int) dr2.OooO0Oo(byteArrayInputStream, 2);
            iArr[i2] = iOooO0Oo;
        }
        return iArr;
    }

    public static vq[] OooO0Oo(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, vq[] vqVarArr) throws IOException {
        byte[] bArr3 = w72.OooO0o;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, w72.OooO0oO)) {
                qa.OooO0o("Unsupported meta version");
                return null;
            }
            int iOooO0Oo = (int) dr2.OooO0Oo(fileInputStream, 2);
            byte[] bArrOooO0OO = dr2.OooO0OO(fileInputStream, (int) dr2.OooO0Oo(fileInputStream, 4), (int) dr2.OooO0Oo(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                qa.OooO0o("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrOooO0OO);
            try {
                vq[] vqVarArrOooO0o = OooO0o(byteArrayInputStream, bArr2, iOooO0Oo, vqVarArr);
                byteArrayInputStream.close();
                return vqVarArrOooO0o;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(w72.OooO00o, bArr2)) {
            qa.OooO0o("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            qa.OooO0o("Unsupported meta version");
            return null;
        }
        int iOooO0Oo2 = (int) dr2.OooO0Oo(fileInputStream, 1);
        byte[] bArrOooO0OO2 = dr2.OooO0OO(fileInputStream, (int) dr2.OooO0Oo(fileInputStream, 4), (int) dr2.OooO0Oo(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            qa.OooO0o("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrOooO0OO2);
        try {
            vq[] vqVarArrOooO0o0 = OooO0o0(byteArrayInputStream2, iOooO0Oo2, vqVarArr);
            byteArrayInputStream2.close();
            return vqVarArrOooO0o0;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static vq[] OooO0o(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, vq[] vqVarArr) throws IOException {
        vq vqVar;
        if (byteArrayInputStream.available() == 0) {
            return new vq[0];
        }
        if (i != vqVarArr.length) {
            qa.OooO0o("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            dr2.OooO0Oo(byteArrayInputStream, 2);
            String str = new String(dr2.OooO0O0(byteArrayInputStream, (int) dr2.OooO0Oo(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jOooO0Oo = dr2.OooO0Oo(byteArrayInputStream, 4);
            int iOooO0Oo = (int) dr2.OooO0Oo(byteArrayInputStream, 2);
            if (vqVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < vqVarArr.length; i3++) {
                    if (vqVarArr[i3].OooO0O0.equals(strSubstring)) {
                        vqVar = vqVarArr[i3];
                        break;
                    }
                }
                vqVar = null;
            } else {
                vqVar = null;
            }
            if (vqVar == null) {
                qa.OooO0o("Missing profile key: ".concat(str));
                return null;
            }
            vqVar.OooO0Oo = jOooO0Oo;
            int[] iArrOooO0OO = OooO0OO(byteArrayInputStream, iOooO0Oo);
            if (Arrays.equals(bArr, w72.OooO0o0)) {
                vqVar.OooO0o0 = iOooO0Oo;
                vqVar.OooO0oo = iArrOooO0OO;
            }
        }
        return vqVarArr;
    }

    public static vq[] OooO0o0(ByteArrayInputStream byteArrayInputStream, int i, vq[] vqVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new vq[0];
        }
        if (i != vqVarArr.length) {
            qa.OooO0o("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iOooO0Oo = (int) dr2.OooO0Oo(byteArrayInputStream, 2);
            iArr[i2] = (int) dr2.OooO0Oo(byteArrayInputStream, 2);
            strArr[i2] = new String(dr2.OooO0O0(byteArrayInputStream, iOooO0Oo), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            vq vqVar = vqVarArr[i3];
            if (!vqVar.OooO0O0.equals(strArr[i3])) {
                qa.OooO0o("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            vqVar.OooO0o0 = i4;
            vqVar.OooO0oo = OooO0OO(byteArrayInputStream, i4);
        }
        return vqVarArr;
    }

    public static vq[] OooO0oO(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, w72.OooO0O0)) {
            qa.OooO0o("Unsupported version");
            return null;
        }
        int iOooO0Oo = (int) dr2.OooO0Oo(fileInputStream, 1);
        byte[] bArrOooO0OO = dr2.OooO0OO(fileInputStream, (int) dr2.OooO0Oo(fileInputStream, 4), (int) dr2.OooO0Oo(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            qa.OooO0o("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrOooO0OO);
        try {
            vq[] vqVarArrOooO0oo = OooO0oo(byteArrayInputStream, str, iOooO0Oo);
            byteArrayInputStream.close();
            return vqVarArrOooO0oo;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static vq[] OooO0oo(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new vq[0];
        }
        vq[] vqVarArr = new vq[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iOooO0Oo = (int) dr2.OooO0Oo(byteArrayInputStream, 2);
            int iOooO0Oo2 = (int) dr2.OooO0Oo(byteArrayInputStream, 2);
            vqVarArr[i3] = new vq(str, new String(dr2.OooO0O0(byteArrayInputStream, iOooO0Oo), StandardCharsets.UTF_8), dr2.OooO0Oo(byteArrayInputStream, 4), iOooO0Oo2, (int) dr2.OooO0Oo(byteArrayInputStream, 4), (int) dr2.OooO0Oo(byteArrayInputStream, 4), new int[iOooO0Oo2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            vq vqVar = vqVarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = vqVar.OooO0o;
            int i6 = vqVar.OooO0oO;
            TreeMap treeMap = vqVar.OooO;
            int i7 = iAvailable - i5;
            int iOooO0Oo3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iOooO0Oo3 += (int) dr2.OooO0Oo(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iOooO0Oo3), 1);
                int iOooO0Oo4 = (int) dr2.OooO0Oo(byteArrayInputStream, 2);
                while (iOooO0Oo4 > 0) {
                    dr2.OooO0Oo(byteArrayInputStream, 2);
                    int iOooO0Oo5 = (int) dr2.OooO0Oo(byteArrayInputStream, 1);
                    if (iOooO0Oo5 != 6 && iOooO0Oo5 != 7) {
                        while (iOooO0Oo5 > 0) {
                            dr2.OooO0Oo(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iOooO0Oo6 = (int) dr2.OooO0Oo(byteArrayInputStream, 1); iOooO0Oo6 > 0; iOooO0Oo6--) {
                                dr2.OooO0Oo(byteArrayInputStream, 2);
                            }
                            iOooO0Oo5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iOooO0Oo4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                qa.OooO0o("Read too much data during profile line parse");
                return null;
            }
            vqVar.OooO0oo = OooO0OO(byteArrayInputStream, vqVar.OooO0o0);
            BitSet bitSetValueOf = BitSet.valueOf(dr2.OooO0O0(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return vqVarArr;
    }

    public static void OooOO0(ByteArrayOutputStream byteArrayOutputStream, vq vqVar) throws IOException {
        OooOOO0(byteArrayOutputStream, vqVar);
        int i = vqVar.OooO0oO;
        int[] iArr = vqVar.OooO0oo;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            dr2.OooO0o(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : vqVar.OooO.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void OooOO0O(ByteArrayOutputStream byteArrayOutputStream, vq vqVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        dr2.OooO0o(byteArrayOutputStream, str.getBytes(charset).length);
        dr2.OooO0o(byteArrayOutputStream, vqVar.OooO0o0);
        dr2.OooO0o0(byteArrayOutputStream, vqVar.OooO0o, 4);
        dr2.OooO0o0(byteArrayOutputStream, vqVar.OooO0OO, 4);
        dr2.OooO0o0(byteArrayOutputStream, vqVar.OooO0oO, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void OooOO0o(ByteArrayOutputStream byteArrayOutputStream, int i, vq vqVar) throws IOException {
        int i2 = vqVar.OooO0oO;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : vqVar.OooO.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void OooOOO0(ByteArrayOutputStream byteArrayOutputStream, vq vqVar) throws IOException {
        int i = 0;
        for (Map.Entry entry : vqVar.OooO.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                dr2.OooO0o(byteArrayOutputStream, iIntValue - i);
                dr2.OooO0o(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
