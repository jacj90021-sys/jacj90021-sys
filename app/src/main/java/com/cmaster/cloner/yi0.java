package com.cmaster.cloner;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.LogPrinter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class yi0 {
    public static final String OooO0oo = u7.OooO00o(new byte[]{102, 25, -120, -50, 48, -42, 118, 46, 92, 24, -112, -35, 59, -48}, new byte[]{47, 119, -4, -85, 94, -94, 36, 75});
    public static final p12 OooO = new p12(4);
    public final ArraySet OooO00o = new ArraySet();
    public final ArrayMap OooO0O0 = new ArrayMap();
    public final ArrayMap OooO0OO = new ArrayMap();
    public final ArrayMap OooO0Oo = new ArrayMap();
    public final ArrayMap OooO0o0 = new ArrayMap();
    public final ArrayMap OooO0o = new ArrayMap();
    public final ArrayMap OooO0oO = new ArrayMap();

    /* JADX WARN: Removed duplicated region for block: B:43:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList OooO(android.content.Intent r16, java.lang.String r17, boolean r18, int r19) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.yi0.OooO(android.content.Intent, java.lang.String, boolean, int):java.util.ArrayList");
    }

    public final void OooO00o(ArrayMap arrayMap, String str, IntentFilter intentFilter) {
        IntentFilter[] intentFilterArr = (IntentFilter[]) arrayMap.get(str);
        if (intentFilterArr == null) {
            IntentFilter[] intentFilterArrOooO0oO = OooO0oO(2);
            arrayMap.put(str, intentFilterArrOooO0oO);
            intentFilterArrOooO0oO[0] = intentFilter;
            return;
        }
        int length = intentFilterArr.length;
        int i = length;
        while (i > 0 && intentFilterArr[i - 1] == null) {
            i--;
        }
        if (i < length) {
            intentFilterArr[i] = intentFilter;
            return;
        }
        IntentFilter[] intentFilterArrOooO0oO2 = OooO0oO((length * 3) / 2);
        System.arraycopy(intentFilterArr, 0, intentFilterArrOooO0oO2, 0, length);
        intentFilterArrOooO0oO2[length] = intentFilter;
        arrayMap.put(str, intentFilterArrOooO0oO2);
    }

    public final void OooO0O0(c11 c11Var) {
        String strIntern;
        this.OooO00o.add(c11Var);
        Iterator<String> itSchemesIterator = c11Var.schemesIterator();
        u7.OooO00o(new byte[]{58, -109, -50, 62, -21, 37, 0, 92, 114, -42, -125, 123, -15, 37}, new byte[]{26, -77, -18, 30, -53, 5, 83, 63});
        int iOooOO0O = OooOO0O(c11Var, itSchemesIterator, this.OooO0o0);
        u7.OooO00o(new byte[]{105, 0, 121, 115, 2, -62, -51, 75, 57, 69, 99, 115}, new byte[]{73, 32, 89, 83, 34, -30, -103, 50});
        Iterator<String> itTypesIterator = c11Var.typesIterator();
        int i = 0;
        if (itTypesIterator != null) {
            int i2 = 0;
            while (itTypesIterator.hasNext()) {
                String next = itTypesIterator.next();
                i2++;
                int iIndexOf = next.indexOf(47);
                if (iIndexOf > 0) {
                    strIntern = next.substring(0, iIndexOf).intern();
                } else {
                    strIntern = next;
                    next = next.concat(u7.OooO00o(new byte[]{-25, 38}, new byte[]{-56, 12, -68, -84, -43, 112, 29, -123}));
                }
                OooO00o(this.OooO0O0, next, c11Var);
                if (iIndexOf > 0) {
                    OooO00o(this.OooO0OO, strIntern, c11Var);
                } else {
                    OooO00o(this.OooO0Oo, strIntern, c11Var);
                }
            }
            i = i2;
        }
        if (iOooOO0O == 0 && i == 0) {
            Iterator<String> itActionsIterator = c11Var.actionsIterator();
            u7.OooO00o(new byte[]{100, -71, -58, 82, -40, 112, 90, 0, 48, -16, -119, 28, -62, 112}, new byte[]{68, -103, -26, 114, -8, 80, 27, 99});
            OooOO0O(c11Var, itActionsIterator, this.OooO0o);
        }
        if (i != 0) {
            Iterator<String> itActionsIterator2 = c11Var.actionsIterator();
            u7.OooO00o(new byte[]{51, -54, -3, 122, -25, -10, -86, -56, 99, -113, -71, 27, -92, -94, -105, -34, 125, -48, -3}, new byte[]{19, -22, -35, 90, -57, -42, -2, -79});
            OooOO0O(c11Var, itActionsIterator2, this.OooO0oO);
        }
    }

    public abstract boolean OooO0OO(IntentFilter intentFilter, ArrayList arrayList);

    public final void OooO0Oo(Intent intent, xy xyVar, boolean z, boolean z2, String str, String str2, IntentFilter[] intentFilterArr, ArrayList arrayList, int i) {
        LogPrinter logPrinter;
        PrintWriter printWriter;
        IntentFilter intentFilter;
        IntentFilter[] intentFilterArr2 = intentFilterArr;
        String action = intent.getAction();
        Uri data = intent.getData();
        String str3 = intent.getPackage();
        intent.getFlags();
        if (z) {
            logPrinter = new LogPrinter(2, OooO0oo);
            printWriter = new PrintWriter(new StringWriter());
        } else {
            logPrinter = null;
            printWriter = null;
        }
        int length = intentFilterArr2 != null ? intentFilterArr2.length : 0;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length && (intentFilter = intentFilterArr2[i2]) != null) {
            if (z) {
                u7.OooO00o(new byte[]{51, 3, -70, 105, -77, -73, 100, 7, 94, 3, -87, 107, -78, -80, 121, 20, 94, 4, -89, 102, -81, -69, 120, 64}, new byte[]{126, 98, -50, 10, -37, -34, 10, 96});
                intentFilter.toString();
                int i3 = fp0.OooO00o;
            }
            if (str3 == null || OooO0o(str3, intentFilter)) {
                if (OooO0OO(intentFilter, arrayList)) {
                    int iMatch = intentFilter.match(action, str, str2, data, xyVar, OooO0oo);
                    if (iMatch >= 0) {
                        if (z) {
                            u7.OooO00o(new byte[]{-24, 85, -63, -16, 13, -80, -20, 2, -24, 24, -26, -19, 2, -84, -20, 20, -23, 85, -89, -12, 0, -80, -22, 24, -11, 69, -1}, new byte[]{-56, 117, -121, -103, 97, -60, -119, 112});
                            Integer.toHexString(iMatch);
                            u7.OooO00o(new byte[]{70, 4, -44, 6, -21, 86, 113, 40, 19, 0, -63, 72}, new byte[]{102, 108, -75, 117, -81, 51, 23, 73});
                            intentFilter.hasCategory(u7.OooO00o(new byte[]{-113, 56, 74, -109, 79, 37, -16, -119, -121, 56, 90, -124, 78, 56, -70, -60, -113, 34, 75, -122, 79, 62, -19, -119, -86, 19, 104, -96, 117, 0, -64}, new byte[]{-18, 86, 46, -31, 32, 76, -108, -89}));
                            int i4 = fp0.OooO00o;
                        }
                        if (!z2 || intentFilter.hasCategory(u7.OooO00o(new byte[]{-114, -84, 80, 79, 93, -116, 51, 20, -122, -84, 64, 88, 92, -111, 121, 89, -114, -74, 81, 90, 93, -105, 46, 20, -85, -121, 114, 124, 103, -87, 3}, new byte[]{-17, -62, 52, 61, 50, -27, 87, 58}))) {
                            Object objOooO0oo = OooO0oo(intentFilter, iMatch, i);
                            if (z) {
                                u7.OooO00o(new byte[]{17, 116, 56, -73, -27, 119, 72, 97, 69, 49, 124, -73, -44, 96, 94, 117, 93, 32, 34, -73}, new byte[]{49, 84, 24, -105, -90, 5, 45, 0});
                                Objects.toString(objOooO0oo);
                                int i5 = fp0.OooO00o;
                            }
                            if (objOooO0oo != null) {
                                arrayList.add(objOooO0oo);
                                if (z) {
                                    OooO0o0(printWriter, intentFilter);
                                    printWriter.flush();
                                    intentFilter.dump(logPrinter, "    ");
                                }
                            }
                        } else {
                            z3 = true;
                        }
                    } else if (z) {
                        if (iMatch == -4) {
                            u7.OooO00o(new byte[]{92, 36, -110, 54, -86, 6, -32, -103}, new byte[]{63, 69, -26, 83, -51, 105, -110, -32});
                        } else if (iMatch == -3) {
                            u7.OooO00o(new byte[]{100, -117, 119, 84, -28, 57}, new byte[]{5, -24, 3, 61, -117, 87, -104, 6});
                        } else if (iMatch == -2) {
                            u7.OooO00o(new byte[]{14, -128, 92, -96}, new byte[]{106, -31, 40, -63, 10, 30, 76, -14});
                        } else if (iMatch != -1) {
                            u7.OooO00o(new byte[]{-34, 62, -80, 85, -116, 17, 112, 20, -39, 53, -70, 72, -116, 8}, new byte[]{-85, 80, -37, 59, -29, 102, 30, 52});
                        } else {
                            u7.OooO00o(new byte[]{-64, -21, -75, 73}, new byte[]{-76, -110, -59, 44, -6, -21, -104, 68});
                        }
                        u7.OooO00o(new byte[]{-1, 109, 84, -91, 53, -110, 76, -13, -1, 41, 123, -88, 121, -120, 70, -11, -1, 32, 115, -72, 58, -114, 19, -95}, new byte[]{-33, 77, 18, -52, 89, -26, 41, -127});
                        int i6 = fp0.OooO00o;
                    }
                    i2++;
                    intentFilterArr2 = intentFilterArr;
                } else if (z) {
                    u7.OooO00o(new byte[]{122, 10, -53, -27, 71, -78, 82, 47, 125, 89, -83, -8, 74, -76, 80, 56, 46, 10, -20, -32, 89, -93, 86, 57, 35, 10, -20, -24, 79, -93, 83}, new byte[]{90, 42, -115, -116, 43, -58, 55, 93});
                    int i7 = fp0.OooO00o;
                }
            } else if (z) {
                u7.OooO00o(new byte[]{-122, -105, 53, -115, -22, 55, 60, -49, -122, -34, 0, -60, -24, 44, 45, -99, -64, -59, 28, -119, -90, 51, 56, -34, -51, -42, 20, -127, -90}, new byte[]{-90, -73, 115, -28, -122, 67, 89, -67});
                u7.OooO00o(new byte[]{127, 113, 47, -11, 51, -111, 116, 0, 42, 54}, new byte[]{68, 81, 92, -98, 90, -31, 4, 105});
                int i8 = fp0.OooO00o;
            }
            i2++;
            intentFilterArr2 = intentFilterArr;
        }
        if (z && z3) {
            if (arrayList.size() == 0) {
                u7.OooO00o(new byte[]{50, 107, -20, -26, -118, -114, 43, 30, 46, 122, -6, -25, -110, -40, 40, 54, 41, 98, -6, -19, -36, -40, 40, 56, 53, 96, -5, -87, -117, -103, 58, 52, 40, 34, -65, -21, -109, -116, 110, 57, 47, 96, -6, -87, -111, -111, 58, 63, 96, 77, -34, -35, -93, -65, 1, 5, 25, 81, -37, -52, -96, -71, 27, 27, 20}, new byte[]{64, 14, -97, -119, -26, -8, 78, 87});
                int i9 = fp0.OooO00o;
            } else if (arrayList.size() > 1) {
                u7.OooO00o(new byte[]{-102, 38, -59, 93, -120, -5, -74, -5, -122, 55, -45, 92, -112, -73, -13, -33, -99, 47, -62, 91, -108, -31, -74, -110, -123, 34, -62, 81, -116, -24, -96, -98, -56, 44, -40, 94, -99, -83, -96, -35, -123, 38, -106, 69, -115, -7, -69, -110, -85, 2, -30, 119, -93, -62, -127, -21, -73, 7, -13, 116, -91, -40, -97, -26}, new byte[]{-24, 67, -74, 50, -28, -115, -45, -78});
                int i10 = fp0.OooO00o;
            }
        }
    }

    public abstract boolean OooO0o(String str, IntentFilter intentFilter);

    public void OooO0o0(PrintWriter printWriter, IntentFilter intentFilter) {
        printWriter.print("    ");
        printWriter.println(intentFilter);
    }

    public abstract IntentFilter[] OooO0oO(int i);

    public abstract Object OooO0oo(IntentFilter intentFilter, int i, int i2);

    public final ArrayList OooOO0(Intent intent, String str, boolean z, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = (intent.getFlags() & 8) != 0;
        Set<String> categories = intent.getCategories();
        xy xyVar = categories == null ? null : new xy((String[]) categories.toArray(new String[categories.size()]));
        String scheme = intent.getScheme();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooO0Oo(intent, xyVar, z2, z, str, scheme, (IntentFilter[]) arrayList.get(i2), arrayList2, i);
        }
        OooOOO(arrayList2);
        return arrayList2;
    }

    public final int OooOO0O(IntentFilter intentFilter, Iterator it, ArrayMap arrayMap) {
        int i = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            i++;
            OooO00o(arrayMap, (String) it.next(), intentFilter);
        }
        return i;
    }

    public final void OooOO0o(c11 c11Var) {
        String strIntern;
        Iterator<String> itSchemesIterator = c11Var.schemesIterator();
        u7.OooO00o(new byte[]{41, -86, -115, 103, -70, -84, 1, -80, 97, -17, -64, 34, -96, -84}, new byte[]{9, -118, -83, 71, -102, -116, 82, -45});
        int iOooOOOO = OooOOOO(c11Var, itSchemesIterator, this.OooO0o0);
        u7.OooO00o(new byte[]{-82, -39, -49, -66, -77, -104, -12, 68, -2, -100, -43, -66}, new byte[]{-114, -7, -17, -98, -109, -72, -96, 61});
        Iterator<String> itTypesIterator = c11Var.typesIterator();
        int i = 0;
        if (itTypesIterator != null) {
            int i2 = 0;
            while (itTypesIterator.hasNext()) {
                String next = itTypesIterator.next();
                i2++;
                int iIndexOf = next.indexOf(47);
                if (iIndexOf > 0) {
                    strIntern = next.substring(0, iIndexOf).intern();
                } else {
                    strIntern = next;
                    next = next.concat(u7.OooO00o(new byte[]{8, 75}, new byte[]{39, 97, 95, 7, -125, -94, 12, 42}));
                }
                OooOOO0(this.OooO0O0, next, c11Var);
                if (iIndexOf > 0) {
                    OooOOO0(this.OooO0OO, strIntern, c11Var);
                } else {
                    OooOOO0(this.OooO0Oo, strIntern, c11Var);
                }
            }
            i = i2;
        }
        if (iOooOOOO == 0 && i == 0) {
            Iterator<String> itActionsIterator = c11Var.actionsIterator();
            u7.OooO00o(new byte[]{-42, 85, -52, 44, -103, -17, -1, 7, -126, 28, -125, 98, -125, -17}, new byte[]{-10, 117, -20, 12, -71, -49, -66, 100});
            OooOOOO(c11Var, itActionsIterator, this.OooO0o);
        }
        if (i != 0) {
            Iterator<String> itActionsIterator2 = c11Var.actionsIterator();
            u7.OooO00o(new byte[]{3, -52, 108, 19, -36, 111, -109, 38, 83, -119, 40, 114, -97, 59, -82, 48, 77, -42, 108}, new byte[]{35, -20, 76, 51, -4, 79, -57, 95});
            OooOOOO(c11Var, itActionsIterator2, this.OooO0oO);
        }
        this.OooO00o.remove(c11Var);
    }

    public void OooOOO(ArrayList arrayList) {
        Collections.sort(arrayList, OooO);
    }

    public final void OooOOO0(ArrayMap arrayMap, String str, IntentFilter intentFilter) {
        IntentFilter[] intentFilterArr = (IntentFilter[]) arrayMap.get(str);
        if (intentFilterArr != null) {
            int length = intentFilterArr.length - 1;
            while (length >= 0 && intentFilterArr[length] == null) {
                length--;
            }
            int i = length;
            while (length >= 0) {
                if (intentFilterArr[length] == intentFilter) {
                    int i2 = i - length;
                    if (i2 > 0) {
                        System.arraycopy(intentFilterArr, length + 1, intentFilterArr, length, i2);
                    }
                    intentFilterArr[i] = null;
                    i--;
                }
                length--;
            }
            if (i < 0) {
                arrayMap.remove(str);
            } else if (i < intentFilterArr.length / 2) {
                IntentFilter[] intentFilterArrOooO0oO = OooO0oO(i + 2);
                System.arraycopy(intentFilterArr, 0, intentFilterArrOooO0oO, 0, i + 1);
                arrayMap.put(str, intentFilterArrOooO0oO);
            }
        }
    }

    public final int OooOOOO(IntentFilter intentFilter, Iterator it, ArrayMap arrayMap) {
        int i = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            i++;
            OooOOO0(arrayMap, (String) it.next(), intentFilter);
        }
        return i;
    }
}
