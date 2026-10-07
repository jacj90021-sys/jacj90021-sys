package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ka1 implements ia1 {
    public static final tz0 OooO0O0 = new tz0("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, tz0.OooO0o0);
    public final Context OooO00o;

    public ka1(Context context) {
        this.OooO00o = context.getApplicationContext();
    }

    @Override // com.cmaster.cloner.ia1
    public final /* bridge */ /* synthetic */ fa1 OooO00o(Object obj, int i, int i2, xz0 xz0Var) {
        return OooO0OO((Uri) obj, xz0Var);
    }

    @Override // com.cmaster.cloner.ia1
    public final boolean OooO0O0(Object obj, xz0 xz0Var) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final fa1 OooO0OO(Uri uri, xz0 xz0Var) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.OooO00o;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                sa.OooOO0o(uri, "Failed to find resource id for: ");
                return null;
            }
        } else {
            if (pathSegments.size() != 1) {
                sa.OooOO0o(uri, "Unrecognized Uri format: ");
                return null;
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) xz0Var.OooO0OO(OooO0O0) : null;
        Drawable drawableOooO00o = theme == null ? kq2.OooO00o(context, contextCreatePackageContext, identifier, null) : kq2.OooO00o(context, context, identifier, theme);
        if (drawableOooO00o != null) {
            return new y40(drawableOooO00o, 1);
        }
        return null;
    }
}
