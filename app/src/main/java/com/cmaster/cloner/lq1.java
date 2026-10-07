package com.cmaster.cloner;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class lq1 extends f53 {
    public static int OooO(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static Font OooO0o(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iOooO = OooO(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iOooO2 = OooO(fontStyle, font2.getStyle());
            if (iOooO2 < iOooO) {
                font = font2;
                iOooO = iOooO2;
            }
        }
        return font;
    }

    @Override // com.cmaster.cloner.f53
    public final Typeface OooO00o(Context context, z00 z00Var, Resources resources, int i) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (a10 a10Var : z00Var.OooO00o) {
                try {
                    Font fontBuild = new Font.Builder(resources, a10Var.OooO0o).setWeight(a10Var.OooO0O0).setSlant(a10Var.OooO0OO ? 1 : 0).setTtcIndex(a10Var.OooO0o0).setFontVariationSettings(a10Var.OooO0Oo).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(OooO0o(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // com.cmaster.cloner.f53
    public final Typeface OooO0O0(Context context, c10[] c10VarArr, int i) {
        try {
            FontFamily fontFamilyOooO0oO = OooO0oO(c10VarArr, context.getContentResolver());
            if (fontFamilyOooO0oO == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyOooO0oO).setStyle(OooO0o(fontFamilyOooO0oO, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // com.cmaster.cloner.f53
    public final Typeface OooO0OO(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyOooO0oO = OooO0oO((c10[]) list.get(0), contentResolver);
            if (fontFamilyOooO0oO == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyOooO0oO);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyOooO0oO2 = OooO0oO((c10[]) list.get(i2), contentResolver);
                if (fontFamilyOooO0oO2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyOooO0oO2);
                }
            }
            return customFallbackBuilder.setStyle(OooO0o(fontFamilyOooO0oO, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // com.cmaster.cloner.f53
    public final Typeface OooO0Oo(Context context, Resources resources, int i, String str, int i2) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final FontFamily OooO0oO(c10[] c10VarArr, ContentResolver contentResolver) throws IOException {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (c10 c10Var : c10VarArr) {
            if (Objects.equals(c10Var.OooO00o.getScheme(), "systemfont")) {
                fontBuild = OooO0oo(c10Var);
            } else {
                try {
                    Uri uri = c10Var.OooO00o;
                    str = c10Var.OooO0o0;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c10Var.OooO0OO).setSlant(c10Var.OooO0Oo ? 1 : 0).setTtcIndex(c10Var.OooO0O0);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font OooO0oo(c10 c10Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
