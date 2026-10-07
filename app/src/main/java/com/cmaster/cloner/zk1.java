package com.cmaster.cloner;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ISyncStatusObserver;
import android.content.Intent;
import android.content.SyncRequest;
import android.content.SyncStatusInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.AtomicFile;
import android.util.SparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zk1 extends Handler {
    public static final String OooOOO;
    public static final String OooOOOO;
    public static final String OooOOOo;
    public static final String OooOOo;
    public static final String OooOOo0;
    public static final String OooOOoo;
    public static final Intent OooOo0;
    public static final HashMap OooOo00;
    public static volatile zk1 OooOo0O;
    public final int OooO;
    public final SparseArray OooO00o = new SparseArray();
    public final HashMap OooO0O0 = new HashMap();
    public final SparseArray OooO0OO = new SparseArray();
    public final SparseArray OooO0Oo = new SparseArray();
    public int OooO0o;
    public final RemoteCallbackList OooO0o0;
    public final yk1[] OooO0oO;
    public final Context OooO0oo;
    public final AtomicFile OooOO0;
    public final AtomicFile OooOO0O;
    public final AtomicFile OooOO0o;
    public final SparseArray OooOOO0;

    static {
        u7.OooO00o(new byte[]{-114, -90, 39, -24, 106, 20, -104, 90, -70, -70, 59}, new byte[]{-35, -33, 73, -117, 39, 117, -10, 59});
        u7.OooO00o(new byte[]{7, 26, -27, 12, 40, 122, 123, 104, 51, 6, -7, 41, 12, 119, 112}, new byte[]{84, 99, -117, 111, 101, 27, 21, 9});
        OooOOO = u7.OooO00o(new byte[]{-27, -82, 45, 35, 86, 30, -71, -17, -28, -71, 60, 35, 110, 34, -87}, new byte[]{-117, -53, 85, 87, 23, 107, -51, -121});
        OooOOOO = u7.OooO00o(new byte[]{49, 17, -80, -104, 47, -106, -103, -110, 50, 10, -18, -104, 35, -101, -33, -104, 56, 11}, new byte[]{93, 120, -61, -20, 74, -8, -76, -12});
        OooOOOo = u7.OooO00o(new byte[]{60, 45, 15, -35, -54, -54, 30, 87, 0, 46, 10, -63, -63, -38, 36}, new byte[]{83, 75, 105, -82, -81, -66, 87, 57});
        OooOOo0 = u7.OooO00o(new byte[]{30, 55, 62, -75, -113, 119, -31}, new byte[]{123, 89, 95, -41, -29, 18, -123, -51});
        OooOOo = u7.OooO00o(new byte[]{114, -96, -63, -19}, new byte[]{7, -45, -92, -97, -104, 69, -58, 124});
        OooOOoo = u7.OooO00o(new byte[]{45, -55, 66, 127, 100, -5, 103, 102, 51, -12, 88, 104, 106, -7, 68, 122}, new byte[]{65, -96, 49, 11, 1, -107, 33, 9});
        u7.OooO00o(new byte[]{-64, -16, -96, -124, 28, 37, -80}, new byte[]{-77, -123, -61, -25, 121, 86, -61, 63});
        u7.OooO00o(new byte[]{-123, 6, -122, 69, 72, -92, 127, 60}, new byte[]{-26, 103, -24, 38, 45, -56, 26, 88});
        u7.OooO00o(new byte[]{-105, 105, 69, -74, 7, 54}, new byte[]{-60, 44, 23, -32, 66, 100, 24, -62});
        u7.OooO00o(new byte[]{-31, -118, -50, -49, 115}, new byte[]{-83, -59, -115, -114, 63, 97, -9, -124});
        u7.OooO00o(new byte[]{44, -43, 67, -5}, new byte[]{124, -102, 15, -73, -108, 82, 96, -86});
        u7.OooO00o(new byte[]{112, -113, -3, 33}, new byte[]{37, -36, -72, 115, 21, -124, -122, -107});
        u7.OooO00o(new byte[]{27, 55, -121, 82, -67, -85, -119, -46}, new byte[]{75, 114, -43, 27, -14, -17, -64, -111});
        u7.OooO00o(new byte[]{101, -48, -119, 38, -98, 109, 116}, new byte[]{54, -107, -37, 112, -41, 46, 49, -7});
        OooOo0 = new Intent(u7.OooO00o(new byte[]{-15, 122, 66, 124, 124, 82, 48, -14, -3, 124, 75, 124, 110, 69, 58, -29, -68, 70, 118, 28, 94, 99, 23, -49, -36, 91, 112, 1, 73, 125, 0, -43, -63, 74, 108, 26, 92, 114, 19, -59, -42}, new byte[]{-110, 21, 47, 82, 29, 60, 84, -128}));
        HashMap map = new HashMap();
        OooOo00 = map;
        map.put(u7.OooO00o(new byte[]{67, 94, 89, 105, 19, 96, 84, 70}, new byte[]{32, 49, 55, 29, 114, 3, 32, 53}), u7.OooO00o(new byte[]{-21, 53, 11, 60, 110, 84, 113, 2, -25, 51, 2, 60, 108, 85, 123, 4, -23, 57, 18, 97}, new byte[]{-120, 90, 102, 18, 15, 58, 21, 112}));
        map.put(u7.OooO00o(new byte[]{28, 85, -12, -1, 76, -97, -118, -123}, new byte[]{127, 52, -104, -102, 34, -5, -21, -9}), u7.OooO00o(new byte[]{-126, 68, 82, 89, 50, 83, 32, -36, -114, 66, 91, 89, 48, 92, 40, -53, -113, 79, 94, 5}, new byte[]{-31, 43, 63, 119, 83, 61, 68, -82}));
        OooOo0O = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x03f9, code lost:
    
        if (r7 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03fb, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x041c, code lost:
    
        if (r7 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0459, code lost:
    
        com.cmaster.cloner.u7.OooO00o(new byte[]{59, 125, 8, -68, 33, 85, 102, -126, 29, 103, 2, -90, 59, 81, 40, -42, 1, 120, 6, -68, 116, 2}, new byte[]{110, 19, 99, -46, 78, 34, 8, -94});
        r2 = com.cmaster.cloner.fp0.OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x049b, code lost:
    
        com.cmaster.cloner.u7.OooO00o(new byte[]{-46, -92, -95, -14, 57, 1, 127, 104, -12, -66, -85, -24, 37, 86, 101, 39, -20, -81, -92, -90, 118}, new byte[]{-121, -54, -54, -100, 86, 118, 17, 72});
        r0 = com.cmaster.cloner.fp0.OooO00o;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e6 A[LOOP:5: B:74:0x0221->B:110:0x02e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ca A[Catch: all -> 0x03db, TRY_ENTER, TryCatch #28 {all -> 0x03db, blocks: (B:151:0x03ca, B:155:0x03de, B:162:0x0403), top: B:225:0x0104 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03de A[Catch: all -> 0x03db, TRY_LEAVE, TryCatch #28 {all -> 0x03db, blocks: (B:151:0x03ca, B:155:0x03de, B:162:0x0403), top: B:225:0x0104 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0505 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02e4 A[EDGE_INSN: B:259:0x02e4->B:109:0x02e4 BREAK  A[LOOP:5: B:74:0x0221->B:110:0x02e6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01df A[Catch: IOException -> 0x01b0, XmlPullParserException -> 0x01b5, all -> 0x01f4, TryCatch #11 {all -> 0x01f4, blocks: (B:50:0x01c8, B:57:0x01db, B:59:0x01df, B:65:0x01fd, B:67:0x0201, B:72:0x020b, B:56:0x01d9), top: B:215:0x01c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b9 A[PHI: r11
      0x02b9: PHI (r11v13 com.cmaster.cloner.px1) = 
      (r11v8 com.cmaster.cloner.px1)
      (r11v8 com.cmaster.cloner.px1)
      (r11v8 com.cmaster.cloner.px1)
      (r11v8 com.cmaster.cloner.px1)
      (r11v8 com.cmaster.cloner.px1)
      (r11v8 com.cmaster.cloner.px1)
      (r11v8 com.cmaster.cloner.px1)
      (r11v9 com.cmaster.cloner.px1)
      (r11v8 com.cmaster.cloner.px1)
      (r11v8 com.cmaster.cloner.px1)
     binds: [B:74:0x0221, B:101:0x02bf, B:102:0x02c1, B:104:0x02d5, B:105:0x02d7, B:96:0x02b1, B:97:0x02b3, B:98:0x02b5, B:91:0x0290, B:92:0x0292] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.cmaster.cloner.zk1] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference failed for: r8v74 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zk1(android.content.Context r18, java.io.File r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.zk1.<init>(android.content.Context, java.io.File):void");
    }

    public static long OooO00o(long j) {
        if (j < 5) {
            return 0L;
        }
        if (j < 86400) {
            return (long) (j * 0.04d);
        }
        return 3456L;
    }

    public static int OooO0OO(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndex(str));
    }

    public static void OooOO0(XmlPullParser xmlPullParser, Bundle bundle) {
        String attributeValue = xmlPullParser.getAttributeValue(null, u7.OooO00o(new byte[]{32, -18, -14, -32}, new byte[]{78, -113, -97, -123, -21, -38, -56, 105}));
        String attributeValue2 = xmlPullParser.getAttributeValue(null, u7.OooO00o(new byte[]{114, -105, -87, 5}, new byte[]{6, -18, -39, 96, -64, 115, 112, 115}));
        String attributeValue3 = xmlPullParser.getAttributeValue(null, u7.OooO00o(new byte[]{34, -7, 29, -122, -47, 109}, new byte[]{84, -104, 113, -13, -76, 92, -81, -19}));
        String attributeValue4 = xmlPullParser.getAttributeValue(null, u7.OooO00o(new byte[]{-99, 20, 109, -66, 57, -110}, new byte[]{-21, 117, 1, -53, 92, -96, 19, -73}));
        try {
            if (u7.OooO00o(new byte[]{-17, -49, 125, -2}, new byte[]{-125, -96, 19, -103, 112, 121, -32, -3}).equals(attributeValue2)) {
                bundle.putLong(attributeValue, Long.parseLong(attributeValue3));
                return;
            }
            if (u7.OooO00o(new byte[]{9, 113, -43, -38, -116, -8, -102}, new byte[]{96, 31, -95, -65, -21, -99, -24, -61}).equals(attributeValue2)) {
                bundle.putInt(attributeValue, Integer.parseInt(attributeValue3));
                return;
            }
            if (u7.OooO00o(new byte[]{84, 84, 106, -23, -10, -14}, new byte[]{48, 59, 31, -117, -102, -105, -5, 48}).equals(attributeValue2)) {
                bundle.putDouble(attributeValue, Double.parseDouble(attributeValue3));
                return;
            }
            if (u7.OooO00o(new byte[]{-66, -51, 79, 4, -100}, new byte[]{-40, -95, 32, 101, -24, -8, 66, -65}).equals(attributeValue2)) {
                bundle.putFloat(attributeValue, Float.parseFloat(attributeValue3));
                return;
            }
            if (u7.OooO00o(new byte[]{-113, 58, -25, -91, 107, 47, 78}, new byte[]{-19, 85, -120, -55, 14, 78, 32, 64}).equals(attributeValue2)) {
                bundle.putBoolean(attributeValue, Boolean.parseBoolean(attributeValue3));
            } else if (u7.OooO00o(new byte[]{-78, -84, -26, -74, -37, 75}, new byte[]{-63, -40, -108, -33, -75, 44, -89, 40}).equals(attributeValue2)) {
                bundle.putString(attributeValue, attributeValue3);
            } else if (u7.OooO00o(new byte[]{119, 24, -81, 60, -19, -7, 28}, new byte[]{22, 123, -52, 83, -104, -105, 104, 59}).equals(attributeValue2)) {
                bundle.putParcelable(attributeValue, new Account(attributeValue3, attributeValue4));
            }
        } catch (NullPointerException unused) {
            u7.OooO00o(new byte[]{-23, -69, 123, -60, -24, 28, 53, 75, -2, -70, 96, -59, -3, 28, 39, 95, -30, -83, 101, -50, -70, 74, 36, 70, -7, -84}, new byte[]{-116, -55, 9, -85, -102, 60, 69, 42});
            int i = fp0.OooO00o;
        } catch (NumberFormatException unused2) {
            u7.OooO00o(new byte[]{-54, -74, -100, 24, -33, -27, 71, 57, -35, -73, -121, 25, -54, -27, 85, 45, -63, -96, -126, 18, -115, -77, 86, 52, -38, -95}, new byte[]{-81, -60, -18, 119, -83, -59, 55, 88});
            int i2 = fp0.OooO00o;
        }
    }

    public static px1 OooOO0o(XmlPullParser xmlPullParser, xk1 xk1Var) throws NumberFormatException {
        long jOooO00o;
        Bundle bundle = new Bundle();
        String attributeValue = xmlPullParser.getAttributeValue(null, u7.OooO00o(new byte[]{-38, 30, -115, 88, 86, 104}, new byte[]{-86, 123, -1, 49, 57, 12, 73, 92}));
        String attributeValue2 = xmlPullParser.getAttributeValue(null, u7.OooO00o(new byte[]{110, 63, -65, -93}, new byte[]{8, 83, -38, -37, -67, -38, 118, -54}));
        try {
            long j = Long.parseLong(attributeValue);
            try {
                jOooO00o = Long.parseLong(attributeValue2);
            } catch (NullPointerException unused) {
                jOooO00o = OooO00o(j);
                u7.OooO00o(new byte[]{-127, -44, 46, 26, 27, 93, -53, 48, -69, -46, 99, 25, 87, 75, -61, 117, -84, -46, 104, 21, 18, 92, -109, 118, -96, -55, 46, 8, 31, 81, -64, 48, -68, -62, 96, 31, 91, 24, -58, 99, -90, -43, 105, 92, 22, 24, -41, 117, -87, -38, 123, 16, 3, 22, -109, 96, -86, -55, 103, 19, 19, 2, -109}, new byte[]{-49, -69, 14, 124, 119, 56, -77, 16});
                u7.OooO00o(new byte[]{61, -93, 97, 87, 105, 32, -99}, new byte[]{29, -59, 13, 50, 17, 26, -67, -4});
                int i = fp0.OooO00o;
            } catch (NumberFormatException unused2) {
                jOooO00o = OooO00o(j);
                u7.OooO00o(new byte[]{-76, 114, -116, 106, 89, -97, 52, 108, -125, 109, -97, 113, 95, -42, 60, 100, -47, 118, -97, 105, 94, -38, 114, 115, -112, 114, -115, 96, 79, -97, 52, 108, -125, 32, -114, 96, 89, -42, 61, 103, -104, 99, -34, 118, 82, -47, 49, 35, -105, 108, -101, 125, 17, -97}, new byte[]{-15, 0, -2, 5, 43, -65, 82, 3});
                u7.OooO00o(new byte[]{112, 126, 86, 59, 5, -8, 94, -70, 56, 59, 69, 41, 25, -6, 77, -96, 124}, new byte[]{92, 94, 35, 72, 108, -106, 57, -102});
                int i2 = fp0.OooO00o;
            }
            o00Oo00 o00oo00 = xk1Var.OooO00o;
            px1 px1Var = new px1((Account) o00oo00.OooO0o, (String) o00oo00.OooO0oO, bundle, j, jOooO00o);
            xk1Var.OooO0o.add(px1Var);
            return px1Var;
        } catch (NullPointerException unused3) {
            u7.OooO00o(new byte[]{11, -11, 64, -70, 47, 85, -124, 53, 16, -7, 5, -11, 57, 16, -105, 124, 15, -8, 87, -13, 48, 84, -97, 63, 95, -18, 92, -12, 60, 16, -97, 47, 95, -13, 80, -10, 51}, new byte[]{127, -99, 37, -102, 95, 48, -10, 92});
            int i3 = fp0.OooO00o;
            return null;
        } catch (NumberFormatException unused4) {
            u7.OooO00o(new byte[]{125, -126, 59, -89, -7, 87, -105, -27, 106, -125, 32, -90, -20, 87, -109, -20, 125, -48, 57, -83, -7, 30, -120, -32, 56, -97, 47, -24, -22, 87, -105, -31, 106, -103, 38, -84, -30, 20, -57, -9, 97, -98, 42}, new byte[]{24, -16, 73, -56, -117, 119, -25, -124});
            int i4 = fp0.OooO00o;
            return null;
        }
    }

    public static void OooOOO0() {
        BackupManager.dataChanged(u7.OooO00o(new byte[]{-50, 114, -63, -101, 93, 8, 26}, new byte[]{-81, 28, -91, -23, 50, 97, 126, -91}));
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0262 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.cmaster.cloner.xk1 OooO(org.xmlpull.v1.XmlPullParser r19, int r20, com.cmaster.cloner.a02 r21) throws java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.zk1.OooO(org.xmlpull.v1.XmlPullParser, int, com.cmaster.cloner.a02):com.cmaster.cloner.xk1");
    }

    public final ArrayList OooO0O0(int i, boolean z) {
        ArrayList arrayList;
        tx1 tx1Var;
        synchronized (this.OooO00o) {
            try {
                SparseArray sparseArray = this.OooO0OO;
                ArrayList arrayList2 = (ArrayList) sparseArray.get(i);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    sparseArray.put(i, arrayList2);
                }
                arrayList = new ArrayList();
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    tx1 tx1Var2 = (tx1) obj;
                    if (z) {
                        tx1Var = new tx1(tx1Var2);
                    } else {
                        tx1Var = new tx1(tx1Var2.OooO0Oo, tx1.OooO0oo, tx1Var2.OooO0o, tx1Var2.OooO0oO);
                    }
                    arrayList.add(tx1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final xk1 OooO0Oo(o00Oo00 o00oo00, int i) throws IOException {
        boolean z;
        Account account = (Account) o00oo00.OooO0o;
        String str = (String) o00oo00.OooO0oO;
        o00O000o o00o000o = new o00O000o(o00oo00.OooO0o0, account);
        HashMap map = this.OooO0O0;
        wk1 wk1Var = (wk1) map.get(o00o000o);
        if (wk1Var == null) {
            wk1Var = new wk1();
            map.put(o00o000o, wk1Var);
        }
        HashMap map2 = wk1Var.OooO00o;
        xk1 xk1Var = (xk1) map2.get(str);
        if (xk1Var != null) {
            return xk1Var;
        }
        if (i < 0) {
            i = this.OooO0o;
            this.OooO0o = i + 1;
            z = true;
        } else {
            z = false;
        }
        int i2 = fp0.OooO00o;
        xk1 xk1Var2 = new xk1(o00oo00, i);
        this.OooO00o.put(i, xk1Var2);
        if (z) {
            OooOOoo();
        }
        map2.put(str, xk1Var2);
        return xk1Var2;
    }

    public final boolean OooO0o(int i, Account account, String str) {
        xk1 xk1Var;
        synchronized (this.OooO00o) {
            boolean z = false;
            try {
                if (account != null) {
                    u7.OooO00o(new byte[]{-71, 127, -61, -26, 22, 27, 42, 127, -85, 110, -40, -40, 14, 1, 32, 93, -65, 118, -37, -52}, new byte[]{-34, 26, -73, -75, 111, 117, 73, 62});
                    wk1 wk1Var = (wk1) this.OooO0O0.get(new o00O000o(i, account));
                    xk1 xk1Var2 = null;
                    if (wk1Var == null || (xk1Var = (xk1) wk1Var.OooO00o.get(str)) == null) {
                        int i2 = fp0.OooO00o;
                    } else {
                        xk1Var2 = xk1Var;
                    }
                    if (xk1Var2 != null && xk1Var2.OooO0OO) {
                        z = true;
                    }
                    return z;
                }
                int size = this.OooO00o.size();
                while (size > 0) {
                    size--;
                    xk1 xk1Var3 = (xk1) this.OooO00o.valueAt(size);
                    o00Oo00 o00oo00 = xk1Var3.OooO00o;
                    int i3 = o00oo00.OooO0o0;
                    if (i3 == i || i3 == -1 || i == -1) {
                        boolean zEquals = account == null ? true : ((Account) o00oo00.OooO0o).equals(account);
                        boolean zEquals2 = str == null ? true : ((String) o00oo00.OooO0oO).equals(str);
                        if (zEquals && zEquals2 && xk1Var3.OooO0OO) {
                            return true;
                        }
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public final SyncStatusInfo OooO0o0(o00Oo00 o00oo00) {
        if (((Account) o00oo00.OooO0o) == null || ((String) o00oo00.OooO0oO) == null) {
            return null;
        }
        synchronized (this.OooO00o) {
            try {
                int size = this.OooO0Oo.size();
                for (int i = 0; i < size; i++) {
                    SyncStatusInfo syncStatusInfo = (SyncStatusInfo) this.OooO0Oo.valueAt(i);
                    xk1 xk1Var = (xk1) this.OooO00o.get(syncStatusInfo.authorityId);
                    if (xk1Var != null && xk1Var.OooO00o.OooO(o00oo00)) {
                        return syncStatusInfo;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean OooO0oO(o00Oo00 o00oo00) {
        ArrayList arrayList;
        xk1 xk1Var;
        synchronized (this.OooO00o) {
            int i = o00oo00.OooO0o0;
            synchronized (this.OooO00o) {
                SparseArray sparseArray = this.OooO0OO;
                arrayList = (ArrayList) sparseArray.get(i);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    sparseArray.put(i, arrayList);
                }
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                int i3 = ((tx1) obj).OooO0Oo;
                synchronized (this.OooO00o) {
                    xk1Var = (xk1) this.OooO00o.get(i3);
                }
                if (xk1Var != null && xk1Var.OooO00o.OooO(o00oo00)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean OooO0oo(o00Oo00 o00oo00) {
        synchronized (this.OooO00o) {
            try {
                int size = this.OooO0Oo.size();
                for (int i = 0; i < size; i++) {
                    SyncStatusInfo syncStatusInfo = (SyncStatusInfo) this.OooO0Oo.valueAt(i);
                    xk1 xk1Var = (xk1) this.OooO00o.get(syncStatusInfo.authorityId);
                    if (xk1Var != null && xk1Var.OooO00o.OooO(o00oo00) && syncStatusInfo.pending) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOO0O(org.xmlpull.v1.XmlPullParser r5) throws java.lang.NumberFormatException {
        /*
            r4 = this;
            java.lang.String r0 = com.cmaster.cloner.zk1.OooOOo
            r1 = 0
            java.lang.String r0 = r5.getAttributeValue(r1, r0)
            r2 = 8
            r3 = 0
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NullPointerException -> Lf java.lang.NumberFormatException -> L21
            goto L33
        Lf:
            r0 = 38
            byte[] r0 = new byte[r0]
            r0 = {x004c: FILL_ARRAY_DATA , data: [83, 125, 52, -88, -66, 12, -55, 106, 7, 124, 63, -88, -89, 22, -33, 108, 66, 123, 124, -18, -92, 13, -127, 108, 78, 118, 58, -28, -82, 12, -116, 113, 84, 53, 63, -3, -89, 19} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x0064: FILL_ARRAY_DATA , data: [39, 21, 81, -120, -53, 127, -84, 24} // fill-array
            com.cmaster.cloner.u7.OooO00o(r0, r2)
            int r0 = com.cmaster.cloner.fp0.OooO00o
            goto L32
        L21:
            r0 = 45
            byte[] r0 = new byte[r0]
            r0 = {x006c: FILL_ARRAY_DATA , data: [98, 83, 46, -46, -73, 111, 8, 78, 117, 82, 53, -45, -94, 111, 12, 71, 98, 1, 41, -50, -96, 61, 88, 73, 104, 83, 124, -47, -84, 60, 12, 74, 105, 12, 58, -46, -73, 98, 12, 70, 100, 74, 48, -40, -74} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x0088: FILL_ARRAY_DATA , data: [7, 33, 92, -67, -59, 79, 120, 47} // fill-array
            com.cmaster.cloner.u7.OooO00o(r0, r2)
            int r0 = com.cmaster.cloner.fp0.OooO00o
        L32:
            r0 = r3
        L33:
            java.lang.String r2 = com.cmaster.cloner.zk1.OooOOo0
            java.lang.String r5 = r5.getAttributeValue(r1, r2)
            if (r5 == 0) goto L41
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            if (r5 == 0) goto L42
        L41:
            r3 = 1
        L42:
            android.util.SparseArray r4 = r4.OooOOO0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r4.put(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.zk1.OooOO0O(org.xmlpull.v1.XmlPullParser):void");
    }

    public final void OooOOO() {
        SQLiteDatabase sQLiteDatabaseOpenDatabase;
        boolean z;
        File databasePath = this.OooO0oo.getDatabasePath(u7.OooO00o(new byte[]{-25, -121, -68, 32, -53, -54, -24, 12, -13, -101, -96, 109, -62, -55}, new byte[]{-108, -2, -46, 67, -90, -85, -122, 109}));
        if (databasePath.exists()) {
            String path = databasePath.getPath();
            try {
                sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(path, null, 1);
            } catch (SQLiteException unused) {
                sQLiteDatabaseOpenDatabase = null;
            }
            if (sQLiteDatabaseOpenDatabase != null) {
                int i = 0;
                boolean z2 = sQLiteDatabaseOpenDatabase.getVersion() >= 11;
                int i2 = fp0.OooO00o;
                SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
                sQLiteQueryBuilder.setTables(u7.OooO00o(new byte[]{-92, 30, -60, 54, 31, 92, -58, 26, -93, 11, -47, 55, 31}, new byte[]{-41, 106, -91, 66, 108, 112, -26, 105}));
                HashMap map = new HashMap();
                map.put(u7.OooO00o(new byte[]{54, 100, -40}, new byte[]{105, 13, -68, -12, -102, -69, 63, 97}), u7.OooO00o(new byte[]{52, -105, 40, 36, 125, -67, 80, 77, 46, -121, 105, 49, 123, -18, 33, 123, 35}, new byte[]{71, -29, 73, 80, 8, -50, 126, 18}));
                map.put(u7.OooO00o(new byte[]{-100, 3, -37, 115, -38, -101, 14}, new byte[]{-3, 96, -72, 28, -81, -11, 122, -123}), u7.OooO00o(new byte[]{87, -48, 120, -125, 102, -104, -9, -88, 71, -53, 108, -103, 97, -106, -9, -72, 4, -59, 122, -108, 122, -61, -8, -65}, new byte[]{36, -92, 25, -9, 21, -74, -106, -53}));
                if (z2) {
                    map.put(u7.OooO00o(new byte[]{-84, -2, 126, 21, -117, 33, 84, -70, -71, -28, 109, 31}, new byte[]{-51, -99, 29, 122, -2, 79, 32, -27}), u7.OooO00o(new byte[]{-2, -118, 109, 84, 40, -115, 41, -36, -18, -111, 121, 78, 47, -4, 60, -58, -3, -101, 44, 65, 40, -125, 41, -36, -18, -111, 121, 78, 47, -4, 60, -58, -3, -101}, new byte[]{-115, -2, 12, 32, 91, -93, 72, -65}));
                }
                map.put(u7.OooO00o(new byte[]{-69, -63, 7, -70, -53, 56, 93, -8, -93}, new byte[]{-38, -76, 115, -46, -92, 74, 52, -116}), u7.OooO00o(new byte[]{-124, -118, 70, -9, -14, -84, 41, 86, -125, -106, 72, -15, -24, -10, 49, 3, -106, -115, 7, -30, -12, -10, 32, 76, -123, -105, 83, -6}, new byte[]{-9, -2, 39, -125, -127, -126, 72, 35}));
                map.put(u7.OooO00o(new byte[]{-30, 7, 79, -123, 70, 96, 83, -71, -26, 27, 94, -128, 126, 76, 82, -67}, new byte[]{-106, 104, 59, -28, 42, 37, 63, -40}), u7.OooO00o(new byte[]{77, 110, -13, -107, -11, 34, -128, -50, 73, 114, -30, -112, -51, 14, -127, -54}, new byte[]{57, 1, -121, -12, -103, 103, -20, -81}));
                map.put(u7.OooO00o(new byte[]{8, 36, -6, -88, 96, -56, -27, -2}, new byte[]{102, 81, -105, -5, 25, -90, -122, -115}), u7.OooO00o(new byte[]{-112, 46, -15, -15, 69, 77, 61, -86}, new byte[]{-2, 91, -100, -94, 60, 35, 94, -39}));
                map.put(u7.OooO00o(new byte[]{90, 98, -116, 80, -45, -40, -80, 121, 81, 91, -114, 96, -35, -63}, new byte[]{52, 23, -31, 3, -68, -83, -62, 26}), u7.OooO00o(new byte[]{37, 69, 62, -20, -106, 27, -72, 114, 46, 124, 60, -36, -104, 2}, new byte[]{75, 48, 83, -65, -7, 110, -54, 17}));
                map.put(u7.OooO00o(new byte[]{-95, -96, 20, -119, -63, 127, -56, -33, -86, -123, 22, -74, -62}, new byte[]{-49, -43, 121, -38, -82, 10, -70, -68}), u7.OooO00o(new byte[]{74, -85, -107, -67, -68, 90, -21, 112, 65, -114, -105, -126, -65}, new byte[]{36, -34, -8, -18, -45, 47, -103, 19}));
                map.put(u7.OooO00o(new byte[]{59, -88, -78, 2, 42, -100, 115, 24, 48, -114, -70, 35, 51, -116, 115}, new byte[]{85, -35, -33, 81, 69, -23, 1, 123}), u7.OooO00o(new byte[]{69, -120, -107, 90, -62, -31, -2, 14, 78, -82, -99, 123, -37, -15, -2}, new byte[]{43, -3, -8, 9, -83, -108, -116, 109}));
                map.put(u7.OooO00o(new byte[]{47, -114, 65, -98, 9, 111, 50, 15, 36, -82, 95, -88, 20}, new byte[]{65, -5, 44, -51, 102, 26, 64, 108}), u7.OooO00o(new byte[]{-39, 36, 74, 47, 26, -5, -103, 116, -46, 4, 84, 25, 7}, new byte[]{-73, 81, 39, 124, 117, -114, -21, 23}));
                map.put(u7.OooO00o(new byte[]{-50, 55, 118, 46, 42, 17, -37, -70, -57, 37, 118, 9, 22, 17, -54, -70, -57}, new byte[]{-94, 86, 5, 90, 121, 100, -72, -39}), u7.OooO00o(new byte[]{48, -78, -50, -10, -101, -124, 54, -60, 57, -96, -50, -47, -89, -124, 39, -60, 57}, new byte[]{92, -45, -67, -126, -56, -15, 85, -89}));
                map.put(u7.OooO00o(new byte[]{-95, -96, 114, -108, 36, 109, -55, 127, -88, -78, 114, -76, 30, 117, -49}, new byte[]{-51, -63, 1, -32, 119, 24, -86, 28}), u7.OooO00o(new byte[]{-3, 35, -25, -18, 16, 29, 97, -79, -12, 49, -25, -50, 42, 5, 103}, new byte[]{-111, 66, -108, -102, 67, 104, 2, -46}));
                map.put(u7.OooO00o(new byte[]{-40, -35, -105, 121, 54, 7, -108, -84, -63, -50, -127, 94, 31, 19, -113, -93, -47}, new byte[]{-76, -68, -28, 13, 112, 102, -3, -64}), u7.OooO00o(new byte[]{10, -92, 50, 58, -83, 112, -51, -71, 19, -73, 36, 29, -124, 100, -42, -74, 3}, new byte[]{102, -59, 65, 78, -21, 17, -92, -43}));
                map.put(u7.OooO00o(new byte[]{113, -46, -104, 72, 34, 97, 60, 107, 104, -63, -114, 104, 13, 109, 48}, new byte[]{29, -77, -21, 60, 100, 0, 85, 7}), u7.OooO00o(new byte[]{-71, 33, 41, -3, -53, 115, -72, -87, -96, 50, 63, -35, -28, 127, -76}, new byte[]{-43, 64, 90, -119, -115, 18, -47, -59}));
                map.put(u7.OooO00o(new byte[]{-37, 42, 55, 36, -96, -56, -116, -103, -62, 57, 33, 29, -125, -38, -126}, new byte[]{-73, 75, 68, 80, -26, -87, -27, -11}), u7.OooO00o(new byte[]{2, 121, 53, -109, -75, -42, 0, -51, 27, 106, 35, -86, -106, -60, 14}, new byte[]{110, 24, 70, -25, -13, -73, 105, -95}));
                map.put(u7.OooO00o(new byte[]{-16, -13, -98, -11, -114, -51, -54}, new byte[]{-128, -106, -16, -111, -25, -93, -83, -13}), u7.OooO00o(new byte[]{-48, -13, 32, 58, 38, 83, -53}, new byte[]{-96, -106, 78, 94, 79, 61, -84, 72}));
                sQLiteQueryBuilder.setProjectionMap(map);
                sQLiteQueryBuilder.appendWhere(u7.OooO00o(new byte[]{-40, -40, 94, -126, 108, -43, 127, -66, -49, -116, 2, -42, 108, -113, 65, -93, -34, -33, 17, -123, 107, -102, 84, -92, -12, -59, 91}, new byte[]{-85, -84, 63, -10, 31, -5, 32, -41}));
                Cursor cursorQuery = sQLiteQueryBuilder.query(sQLiteDatabaseOpenDatabase, null, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex(u7.OooO00o(new byte[]{68, 71, 94, -85, 102, -65, -92}, new byte[]{37, 36, 61, -60, 19, -47, -48, 105})));
                    String string2 = z2 ? cursorQuery.getString(cursorQuery.getColumnIndex(u7.OooO00o(new byte[]{61, 31, -103, 56, -89, -57, -100, 112, 40, 5, -118, 50}, new byte[]{92, 124, -6, 87, -46, -87, -24, 47}))) : null;
                    if (string2 == null) {
                        string2 = u7.OooO00o(new byte[]{-87, 95, -51, 124, 59, 94, 53, 82, -90, 85}, new byte[]{-54, 48, -96, 82, 92, 49, 90, 53});
                    }
                    int i3 = OooO0Oo(new o00Oo00(new Account(string, string2), cursorQuery.getString(cursorQuery.getColumnIndex(u7.OooO00o(new byte[]{95, -49, -114, -34, 79, -75, 112, -81, 71}, new byte[]{62, -70, -6, -74, 32, -57, 25, -37}))), i, 5), -1).OooO0O0;
                    SparseArray sparseArray = this.OooO0Oo;
                    int size = sparseArray.size();
                    SyncStatusInfo syncStatusInfo = null;
                    while (true) {
                        if (size <= 0) {
                            z = false;
                            break;
                        }
                        size--;
                        syncStatusInfo = (SyncStatusInfo) sparseArray.valueAt(size);
                        if (syncStatusInfo.authorityId == i3) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        syncStatusInfo = new SyncStatusInfo(i3);
                        sparseArray.put(i3, syncStatusInfo);
                    }
                    syncStatusInfo.totalElapsedTime = cursorQuery.getLong(cursorQuery.getColumnIndex(u7.OooO00o(new byte[]{22, -12, 55, -30, 81, 93, 105, 111, 18, -24, 38, -25, 105, 113, 104, 107}, new byte[]{98, -101, 67, -125, 61, 24, 5, 14})));
                    syncStatusInfo.numSyncs = OooO0OO(cursorQuery, u7.OooO00o(new byte[]{-70, 104, -51, 70, 13, 18, -6, 124}, new byte[]{-44, 29, -96, 21, 116, 124, -103, 15}));
                    syncStatusInfo.numSourceLocal = OooO0OO(cursorQuery, u7.OooO00o(new byte[]{-73, -92, 94, 116, 7, 80, 22, 59, -68, -99, 92, 68, 9, 73}, new byte[]{-39, -47, 51, 39, 104, 37, 100, 88}));
                    syncStatusInfo.numSourcePoll = OooO0OO(cursorQuery, u7.OooO00o(new byte[]{124, -75, -77, 17, 68, 28, -40, -103, 119, -112, -79, 46, 71}, new byte[]{18, -64, -34, 66, 43, 105, -86, -6}));
                    syncStatusInfo.numSourceServer = OooO0OO(cursorQuery, u7.OooO00o(new byte[]{16, -16, -71, 25, -112, -32, -102, 117, 27, -42, -79, 56, -119, -16, -102}, new byte[]{126, -123, -44, 74, -1, -107, -24, 22}));
                    syncStatusInfo.numSourceUser = OooO0OO(cursorQuery, u7.OooO00o(new byte[]{-118, -81, 75, -69, 121, 98, -59, 37, -127, -113, 85, -115, 100}, new byte[]{-28, -38, 38, -24, 22, 23, -73, 70}));
                    syncStatusInfo.numSourcePeriodic = 0;
                    syncStatusInfo.lastSuccessSource = OooO0OO(cursorQuery, u7.OooO00o(new byte[]{114, -127, -87, 113, 72, 54, -64, -26, 123, -109, -87, 86, 116, 54, -47, -26, 123}, new byte[]{30, -32, -38, 5, 27, 67, -93, -123}));
                    syncStatusInfo.lastSuccessTime = cursorQuery.getLong(cursorQuery.getColumnIndex(u7.OooO00o(new byte[]{2, 83, 47, 3, 105, -100, 36, 123, 11, 65, 47, 35, 83, -124, 34}, new byte[]{110, 50, 92, 119, 58, -23, 71, 24})));
                    syncStatusInfo.lastFailureSource = OooO0OO(cursorQuery, u7.OooO00o(new byte[]{1, -108, -126, 56, -70, -69, -88, 63, 24, -121, -108, 31, -109, -81, -77, 48, 8}, new byte[]{109, -11, -15, 76, -4, -38, -63, 83}));
                    syncStatusInfo.lastFailureTime = cursorQuery.getLong(cursorQuery.getColumnIndex(u7.OooO00o(new byte[]{105, 28, 60, 10, 115, 61, 14, 103, 112, 15, 42, 42, 92, 49, 2}, new byte[]{5, 125, 79, 126, 53, 92, 103, 11})));
                    syncStatusInfo.lastFailureMesg = cursorQuery.getString(cursorQuery.getColumnIndex(u7.OooO00o(new byte[]{-55, -84, 87, 26, -69, 10, 8, -28, -48, -65, 65, 35, -104, 24, 6}, new byte[]{-91, -51, 36, 110, -3, 107, 97, -120})));
                    syncStatusInfo.pending = OooO0OO(cursorQuery, u7.OooO00o(new byte[]{70, -58, 116, 36, -90, 121, -51}, new byte[]{54, -93, 26, 64, -49, 23, -86, 60})) != 0;
                }
                cursorQuery.close();
                SQLiteQueryBuilder sQLiteQueryBuilder2 = new SQLiteQueryBuilder();
                sQLiteQueryBuilder2.setTables(u7.OooO00o(new byte[]{-9, -81, -48, -51, 63, -41, 21, -74}, new byte[]{-124, -54, -92, -71, 86, -71, 114, -59}));
                Cursor cursorQuery2 = sQLiteQueryBuilder2.query(sQLiteDatabaseOpenDatabase, null, null, null, null, null, null);
                while (cursorQuery2.moveToNext()) {
                    String string3 = cursorQuery2.getString(cursorQuery2.getColumnIndex(u7.OooO00o(new byte[]{22, -82, 120, -79}, new byte[]{120, -49, 21, -44, 81, -20, 13, -76})));
                    String string4 = cursorQuery2.getString(cursorQuery2.getColumnIndex(u7.OooO00o(new byte[]{-28, -1, -120, 68, -118}, new byte[]{-110, -98, -28, 49, -17, -30, -41, -34})));
                    if (string3 != null) {
                        if (string3.equals(u7.OooO00o(new byte[]{-110, -88, -11, -9, 13, -88, -15, 108, -111, -77, -39, -9, 1, -91, -59, 102, -101, -78}, new byte[]{-2, -63, -122, -125, 104, -58, -82, 10}))) {
                            OooOOo0(0, string4 == null || Boolean.parseBoolean(string4));
                        } else if (string3.startsWith(u7.OooO00o(new byte[]{-52, 73, -109, -10, -40, -73, 70, -54, -55, 89, -103, -16, -11, -104}, new byte[]{-65, 48, -3, -107, -121, -57, 52, -91}))) {
                            String strSubstring = string3.substring(u7.OooO00o(new byte[]{-59, 63, 80, -64, 73, 113, -107, 11, -64, 47, 90, -58, 100, 94}, new byte[]{-74, 70, 62, -93, 22, 1, -25, 100}).length(), string3.length());
                            SparseArray sparseArray2 = this.OooO00o;
                            int size2 = sparseArray2.size();
                            while (size2 > 0) {
                                size2--;
                                xk1 xk1Var = (xk1) sparseArray2.valueAt(size2);
                                if (((String) xk1Var.OooO00o.OooO0oO).equals(strSubstring)) {
                                    xk1Var.OooO0OO = string4 == null || Boolean.parseBoolean(string4);
                                    xk1Var.OooO0Oo = 1;
                                }
                            }
                        }
                    }
                }
                cursorQuery2.close();
                sQLiteDatabaseOpenDatabase.close();
                new File(path).delete();
            }
        }
    }

    public final void OooOOOO() {
        ArrayList arrayList;
        RemoteCallbackList remoteCallbackList;
        synchronized (this.OooO00o) {
            try {
                int iBeginBroadcast = this.OooO0o0.beginBroadcast();
                arrayList = null;
                while (true) {
                    remoteCallbackList = this.OooO0o0;
                    if (iBeginBroadcast <= 0) {
                        break;
                    }
                    iBeginBroadcast--;
                    if ((((Integer) remoteCallbackList.getBroadcastCookie(iBeginBroadcast)).intValue() & 1) != 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList(iBeginBroadcast);
                        }
                        arrayList.add(this.OooO0o0.getBroadcastItem(iBeginBroadcast));
                    }
                }
                remoteCallbackList.finishBroadcast();
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = fp0.OooO00o;
        if (arrayList != null) {
            int size = arrayList.size();
            while (size > 0) {
                size--;
                try {
                    ((ISyncStatusObserver) arrayList.get(size)).onStatusChanged(1);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public final void OooOOOo(int i, int i2, Account account, String str) {
        o00Oo00 o00oo00 = new o00Oo00(account, str, i, 5);
        synchronized (this.OooO00o) {
            try {
                xk1 xk1VarOooO0Oo = OooO0Oo(o00oo00, -1);
                if (i2 < -1) {
                    i2 = -1;
                }
                int i3 = fp0.OooO00o;
                if (xk1VarOooO0Oo.OooO0Oo == i2) {
                    return;
                }
                xk1VarOooO0Oo.OooO0Oo = i2;
                OooOOoo();
                if (i2 == 1) {
                    Bundle bundle = new Bundle();
                    Process.myUid();
                    SyncRequest.Builder extras = new SyncRequest.Builder().syncOnce().setExtras(bundle);
                    o00Oo00 o00oo002 = xk1VarOooO0Oo.OooO00o;
                    extras.setSyncAdapter((Account) o00oo002.OooO0o, (String) o00oo002.OooO0oO);
                    ContentResolver.requestSync(extras.build());
                }
                OooOOOO();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOOo(int i, Account account, String str, boolean z) {
        int i2 = fp0.OooO00o;
        synchronized (this.OooO00o) {
            try {
                xk1 xk1VarOooO0Oo = OooO0Oo(new o00Oo00(account, str, i, 5), -1);
                if (xk1VarOooO0Oo.OooO0OO == z) {
                    return;
                }
                if (z && xk1VarOooO0Oo.OooO0Oo == 2) {
                    xk1VarOooO0Oo.OooO0Oo = -1;
                }
                xk1VarOooO0Oo.OooO0OO = z;
                OooOOoo();
                if (z) {
                    Bundle bundle = new Bundle();
                    Process.myUid();
                    ContentResolver.requestSync(account, str, bundle);
                }
                OooOOOO();
                OooOOO0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOOo0(int i, boolean z) {
        synchronized (this.OooO00o) {
            try {
                Boolean bool = (Boolean) this.OooOOO0.get(i);
                if (bool == null || !bool.equals(Boolean.valueOf(z))) {
                    this.OooOOO0.put(i, Boolean.valueOf(z));
                    OooOOoo();
                    if (z) {
                        Bundle bundle = new Bundle();
                        Process.myUid();
                        ContentResolver.requestSync(null, null, bundle);
                    }
                    OooOOOO();
                    this.OooO0oo.sendBroadcast(OooOo0);
                    OooOOO0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOOoo() throws IOException {
        String str;
        String str2;
        SparseArray sparseArray = this.OooO00o;
        SparseArray sparseArray2 = this.OooOOO0;
        AtomicFile atomicFile = this.OooOO0;
        int i = fp0.OooO00o;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                gz gzVar = new gz();
                gzVar.setOutput(fileOutputStreamStartWrite, StandardCharsets.UTF_8.name());
                gzVar.startDocument(null, Boolean.TRUE);
                gzVar.setFeature(u7.OooO00o(new byte[]{-90, -83, 13, -53, 61, -31, -22, -98, -93, -75, 9, -50, 107, -94, -21, -119, -68, -66, 86, -51, 54, -31, -95, -119, -83, -10, 31, -34, 102, -70, -80, -108, -85, -86, 87, -45, 115, -93, -87, -59, -89, -73, 29, -34, 105, -70, -24, -119, -69, -83, 9, -50, 115}, new byte[]{-50, -39, 121, -69, 7, -50, -59, -26}), true);
                gzVar.startTag(null, u7.OooO00o(new byte[]{113, -20, -48, 84, -82, -70, 113, -31}, new byte[]{16, -113, -77, 59, -37, -44, 5, -110}));
                int i2 = 7;
                gzVar.attribute(null, u7.OooO00o(new byte[]{92, 72, 13, -45, -21, -58, -6}, new byte[]{42, 45, 127, -96, -126, -87, -108, -87}), Integer.toString(3));
                gzVar.attribute(null, OooOOO, Integer.toString(this.OooO0o));
                gzVar.attribute(null, OooOOOo, Integer.toString(this.OooO));
                int size = sparseArray2.size();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    str = OooOOo0;
                    str2 = OooOOo;
                    if (i4 >= size) {
                        break;
                    }
                    int iKeyAt = sparseArray2.keyAt(i4);
                    Boolean bool = (Boolean) sparseArray2.valueAt(i4);
                    String str3 = OooOOoo;
                    gzVar.startTag(null, str3);
                    gzVar.attribute(null, str2, Integer.toString(iKeyAt));
                    gzVar.attribute(null, str, Boolean.toString(bool.booleanValue()));
                    gzVar.endTag(null, str3);
                    i4++;
                }
                int size2 = sparseArray.size();
                while (i3 < size2) {
                    xk1 xk1Var = (xk1) sparseArray.valueAt(i3);
                    o00Oo00 o00oo00 = xk1Var.OooO00o;
                    gzVar.startTag(null, u7.OooO00o(new byte[]{120, 62, -7, -77, 23, 9, -52, -2, 96}, new byte[]{25, 75, -115, -37, 120, 123, -91, -118}));
                    gzVar.attribute(null, u7.OooO00o(new byte[]{115, 109}, new byte[]{26, 9, 61, -44, 46, 97, 57, -107}), Integer.toString(xk1Var.OooO0O0));
                    int i5 = o00oo00.OooO0o0;
                    Account account = (Account) o00oo00.OooO0o;
                    gzVar.attribute(null, str2, Integer.toString(i5));
                    gzVar.attribute(null, str, Boolean.toString(xk1Var.OooO0OO));
                    byte[] bArr = new byte[i2];
                    // fill-array-data instruction
                    bArr[0] = -19;
                    bArr[1] = 107;
                    bArr[2] = 96;
                    bArr[3] = 42;
                    bArr[4] = -52;
                    bArr[5] = -4;
                    bArr[6] = 51;
                    gzVar.attribute(null, u7.OooO00o(bArr, new byte[]{-116, 8, 3, 69, -71, -110, 71, 30}), account.name);
                    gzVar.attribute(null, u7.OooO00o(new byte[]{80, -115, 52, 118}, new byte[]{36, -12, 68, 19, 25, 37, -125, 17}), account.type);
                    gzVar.attribute(null, u7.OooO00o(new byte[]{-21, -70, 103, -81, -122, 94, -35, 85, -13}, new byte[]{-118, -49, 19, -57, -23, 44, -76, 33}), (String) o00oo00.OooO0oO);
                    gzVar.attribute(null, u7.OooO00o(new byte[]{105, -83, 57, -22, 47, -100, 39, 88}, new byte[]{26, -44, 87, -119, 78, -2, 75, 61}), Integer.toString(xk1Var.OooO0Oo));
                    gzVar.endTag(null, u7.OooO00o(new byte[]{-13, 122, 55, 15, 55, 113, -41, 26, -21}, new byte[]{-110, 15, 67, 103, 88, 3, -66, 110}));
                    i3++;
                    i2 = 7;
                }
                gzVar.endTag(null, u7.OooO00o(new byte[]{-86, 72, -35, 55, -128, 73, -101, -79}, new byte[]{-53, 43, -66, 88, -11, 39, -17, -62}));
                gzVar.flush();
                atomicFile.finishWrite(fileOutputStreamStartWrite);
            } catch (IOException unused) {
                fileOutputStream = fileOutputStreamStartWrite;
                u7.OooO00o(new byte[]{-25, 60, -69, 30, 68, -116, 82, 103, -53, 58, -96, 31, 81, -116, 68, 118, -63, 33, -68, 31, 66, -33}, new byte[]{-94, 78, -55, 113, 54, -84, 37, 21});
                int i6 = fp0.OooO00o;
                if (fileOutputStream != null) {
                    atomicFile.failWrite(fileOutputStream);
                }
            }
        } catch (IOException unused2) {
        }
    }

    public final void OooOo0() throws IOException {
        FileOutputStream fileOutputStreamStartWrite;
        SparseArray sparseArray = this.OooO0Oo;
        AtomicFile atomicFile = this.OooOO0O;
        int i = fp0.OooO00o;
        removeMessages(1);
        try {
            fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                Parcel parcelObtain = Parcel.obtain();
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    SyncStatusInfo syncStatusInfo = (SyncStatusInfo) sparseArray.valueAt(i2);
                    parcelObtain.writeInt(100);
                    syncStatusInfo.writeToParcel(parcelObtain, 0);
                }
                parcelObtain.writeInt(0);
                fileOutputStreamStartWrite.write(parcelObtain.marshall());
                parcelObtain.recycle();
                atomicFile.finishWrite(fileOutputStreamStartWrite);
            } catch (IOException unused) {
                u7.OooO00o(new byte[]{15, 127, -3, -51, 55, -39, 87, 70, 35, 121, -26, -52, 34, -39, 83, 64, 43, 121, -6, -47}, new byte[]{74, 13, -113, -94, 69, -7, 32, 52});
                int i3 = fp0.OooO00o;
                if (fileOutputStreamStartWrite != null) {
                    atomicFile.failWrite(fileOutputStreamStartWrite);
                }
            }
        } catch (IOException unused2) {
            fileOutputStreamStartWrite = null;
        }
    }

    public final void OooOo00() throws IOException {
        FileOutputStream fileOutputStreamStartWrite;
        yk1[] yk1VarArr = this.OooO0oO;
        AtomicFile atomicFile = this.OooOO0o;
        removeMessages(2);
        try {
            fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                Parcel parcelObtain = Parcel.obtain();
                for (yk1 yk1Var : yk1VarArr) {
                    if (yk1Var == null) {
                        break;
                    }
                    parcelObtain.writeInt(101);
                    parcelObtain.writeInt(yk1Var.OooO00o);
                    parcelObtain.writeInt(yk1Var.OooO0O0);
                    parcelObtain.writeLong(yk1Var.OooO0OO);
                    parcelObtain.writeInt(yk1Var.OooO0Oo);
                    parcelObtain.writeLong(yk1Var.OooO0o0);
                }
                parcelObtain.writeInt(0);
                fileOutputStreamStartWrite.write(parcelObtain.marshall());
                parcelObtain.recycle();
                atomicFile.finishWrite(fileOutputStreamStartWrite);
            } catch (IOException unused) {
                u7.OooO00o(new byte[]{-114, 107, 43, 123, 104, -128, 46, -12, -94, 109, 48, 122, 125, -128, 42, -14, -86, 109, 42}, new byte[]{-53, 25, 89, 20, 26, -96, 89, -122});
                int i = fp0.OooO00o;
                if (fileOutputStreamStartWrite != null) {
                    atomicFile.failWrite(fileOutputStreamStartWrite);
                }
            }
        } catch (IOException unused2) {
            fileOutputStreamStartWrite = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            synchronized (this.OooO00o) {
                OooOo0();
            }
        } else if (i == 2) {
            synchronized (this.OooO00o) {
                OooOo00();
            }
        }
    }
}
