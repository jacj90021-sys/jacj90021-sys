package com.cmaster.cloner;

import android.text.TextUtils;
import java.io.IOException;
import java.net.ProtocolException;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class w63 {
    public static int OooO00o(XmlPullParser xmlPullParser, String str) throws ProtocolException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            rj.OooOOo0(new byte[]{107, -127, 29, 80, 57, -62, 120, 123, 107, -110, 0, 65, 60, -55, 114, 123}, new byte[]{27, -13, 114, 50, 85, -89, 21, 91}, sb, str);
            rj.OooOOo0(new byte[]{-11}, new byte[]{-56, -58, 39, 53, 45, 112, 109, -109}, sb, attributeValue);
            throw new ProtocolException(rj.OooO0oo(new byte[]{119, -27, -56, 3, -13, -55, 30}, new byte[]{87, -124, -69, 35, -102, -89, 106, 62}, sb));
        }
    }

    public static int OooO0O0(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (TextUtils.isEmpty(attributeValue)) {
            return i;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static long OooO0OO(XmlPullParser xmlPullParser, String str) throws ProtocolException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            rj.OooOOo0(new byte[]{-78, -15, -77, -46, 69, 57, -78, -59, -78, -30, -82, -61, 64, 50, -72, -59}, new byte[]{-62, -125, -36, -80, 41, 92, -33, -27}, sb, str);
            rj.OooOOo0(new byte[]{-22}, new byte[]{-41, -105, -85, 28, 47, 27, 87, -45}, sb, attributeValue);
            throw new ProtocolException(rj.OooO0oo(new byte[]{-14, -49, 86, -47, 112, -45, 50, -105}, new byte[]{-46, -82, 37, -15, 28, -68, 92, -16}, sb));
        }
    }

    public static void OooO0Oo(gz gzVar, String str, int i) throws IOException {
        gzVar.attribute(null, str, Integer.toString(i));
    }

    public static void OooO0o0(gz gzVar, String str, CharSequence charSequence) throws IOException {
        if (charSequence != null) {
            gzVar.attribute(null, str, charSequence.toString());
        }
    }
}
