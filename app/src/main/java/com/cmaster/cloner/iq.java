package com.cmaster.cloner;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class iq {
    public final Executor OooO00o;
    public final h51 OooO0O0;
    public final byte[] OooO0OO;
    public final File OooO0Oo;
    public boolean OooO0o = false;
    public final String OooO0o0;
    public vq[] OooO0oO;
    public byte[] OooO0oo;

    public iq(AssetManager assetManager, Executor executor, h51 h51Var, String str, File file) {
        byte[] bArr;
        this.OooO00o = executor;
        this.OooO0O0 = h51Var;
        this.OooO0o0 = str;
        this.OooO0Oo = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = w72.OooO0o0;
                    break;
                case 26:
                    bArr = w72.OooO0Oo;
                    break;
                case 27:
                    bArr = w72.OooO0OO;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = w72.OooO0O0;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = w72.OooO00o;
        }
        this.OooO0OO = bArr;
    }

    public final FileInputStream OooO00o(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.OooO0O0.OooO0O0();
            return null;
        }
    }

    public final void OooO0O0(int i, Serializable serializable) {
        this.OooO00o.execute(new hq(this, i, serializable, 0));
    }
}
