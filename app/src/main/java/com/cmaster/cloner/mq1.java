package com.cmaster.cloner;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mq1 extends lq1 {
    @Override // com.cmaster.cloner.lq1
    public final Font OooO0oo(c10 c10Var) {
        Font fontOooO0Oo;
        Uri uri = c10Var.OooO00o;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = c10Var.OooO0o0;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontOooO0Oo = gq1.OooO0Oo(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontOooO0Oo;
                }
                try {
                    return new Font.Builder(fontOooO0Oo).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
