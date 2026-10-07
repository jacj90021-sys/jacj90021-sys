package com.cmaster.cloner;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class gq1 {
    public static final f53 OooO00o;
    public static final np0 OooO0O0;
    public static Paint OooO0OO;

    static {
        s43.OooO00o("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            OooO00o = new mq1();
        } else if (i >= 29) {
            OooO00o = new lq1();
        } else if (i >= 28) {
            OooO00o = new kq1();
        } else if (i >= 26) {
            OooO00o = new jq1();
        } else {
            Method method = iq1.OooO0OO;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                OooO00o = new iq1();
            } else {
                OooO00o = new hq1();
            }
        }
        OooO0O0 = new np0(16);
        OooO0OO = null;
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        r7 = r12.build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface OooO00o(android.content.Context r16, com.cmaster.cloner.y00 r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, com.cmaster.cloner.py2 r23, boolean r24) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.gq1.OooO00o(android.content.Context, com.cmaster.cloner.y00, android.content.res.Resources, int, java.lang.String, int, int, com.cmaster.cloner.py2, boolean):android.graphics.Typeface");
    }

    public static String OooO0O0(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface OooO0OO(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font OooO0Oo(Typeface typeface) {
        if (OooO0OO == null) {
            OooO0OO = new Paint();
        }
        OooO0OO.setTextSize(10.0f);
        OooO0OO.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, OooO0OO);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
