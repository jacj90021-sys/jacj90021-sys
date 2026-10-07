package com.cmaster.cloner;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ej extends ContextWrapper {
    public static Configuration OooO0o;
    public int OooO00o;
    public Resources.Theme OooO0O0;
    public LayoutInflater OooO0OO;
    public Configuration OooO0Oo;
    public Resources OooO0o0;

    public ej(Context context, int i) {
        super(context);
        this.OooO00o = i;
    }

    public final void OooO00o(Configuration configuration) {
        if (this.OooO0o0 != null) {
            qa.OooO0o("getResources() or getAssets() has already been called");
        } else if (this.OooO0Oo == null) {
            this.OooO0Oo = new Configuration(configuration);
        } else {
            qa.OooO0o("Override configuration has already been set");
        }
    }

    public final void OooO0O0() {
        if (this.OooO0O0 == null) {
            this.OooO0O0 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.OooO0O0.setTo(theme);
            }
        }
        this.OooO0O0.applyStyle(this.OooO00o, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.OooO0o0
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.OooO0Oo
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = com.cmaster.cloner.ej.OooO0o
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            com.cmaster.cloner.ej.OooO0o = r1
        L1c:
            android.content.res.Configuration r1 = com.cmaster.cloner.ej.OooO0o
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.OooO0Oo
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.OooO0o0 = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.OooO0o0 = r0
        L38:
            android.content.res.Resources r3 = r3.OooO0o0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ej.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.OooO0OO == null) {
            this.OooO0OO = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.OooO0OO;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.OooO0O0;
        if (theme != null) {
            return theme;
        }
        if (this.OooO00o == 0) {
            this.OooO00o = R.style.Theme_AppCompat_Light;
        }
        OooO0O0();
        return this.OooO0O0;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.OooO00o != i) {
            this.OooO00o = i;
            OooO0O0();
        }
    }
}
