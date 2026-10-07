package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class pj1 {
    public static void OooO00o(StringBuilder sb, Object obj, a40 a40Var) {
        if (a40Var != null) {
            sb.append((CharSequence) a40Var.OooO0o(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static String OooO0O0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        wm0 wm0Var = new wm0(str);
        int i = 0;
        while (wm0Var.hasNext()) {
            String strConcat = (String) wm0Var.next();
            strConcat.getClass();
            if (!uj1.OooO0o0(strConcat)) {
                strConcat = "    ".concat(strConcat);
            } else if (strConcat.length() < 4) {
                strConcat = "    ";
            }
            i++;
            if (i > 1) {
                sb.append((CharSequence) "\n");
            }
            OooO00o(sb, strConcat, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String OooO0OO(String str) {
        if (uj1.OooO0o0("|")) {
            ra.OooOOO("marginPrefix must be non-blank string.");
            return null;
        }
        List listOooO0o = uj1.OooO0o(str);
        int length = str.length();
        listOooO0o.size();
        int size = listOooO0o.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listOooO0o) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && uj1.OooO0o0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    char cCharAt = str2.charAt(i3);
                    if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        se.OooO0Oo(arrayList, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
