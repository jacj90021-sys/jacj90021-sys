package com.cmaster.cloner;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class r3 implements in {
    public final /* synthetic */ int OooO0Oo;
    public final Comparable OooO0o;
    public Object OooO0o0;
    public final Object OooO0oO;

    public /* synthetic */ r3(int i, Comparable comparable, Object obj) {
        this.OooO0Oo = i;
        this.OooO0oO = obj;
        this.OooO0o = comparable;
    }

    private final void OooO0O0() {
    }

    private final void OooO0OO() {
    }

    public abstract Object OooO(Uri uri, ContentResolver contentResolver);

    @Override // com.cmaster.cloner.in
    public final void OooO0Oo() {
        switch (this.OooO0Oo) {
            case 0:
                Object obj = this.OooO0o0;
                if (obj != null) {
                    try {
                        OooO0oO(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                Object obj2 = this.OooO0o0;
                if (obj2 != null) {
                    try {
                        OooO0oO(obj2);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.cmaster.cloner.in
    public final int OooO0o() {
        switch (this.OooO0Oo) {
        }
        return 1;
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0o0(t41 t41Var, hn hnVar) {
        int i = this.OooO0Oo;
        Object obj = this.OooO0oO;
        Comparable comparable = this.OooO0o;
        switch (i) {
            case 0:
                try {
                    Object objOooO0oo = OooO0oo((AssetManager) obj, (String) comparable);
                    this.OooO0o0 = objOooO0oo;
                    hnVar.OooO0oO(objOooO0oo);
                    break;
                } catch (IOException e) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
                    }
                    hnVar.OooO0O0(e);
                }
            default:
                try {
                    Object objOooO = OooO((Uri) comparable, (ContentResolver) obj);
                    this.OooO0o0 = objOooO;
                    hnVar.OooO0oO(objOooO);
                    break;
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e2);
                    }
                    hnVar.OooO0O0(e2);
                    return;
                }
        }
    }

    public abstract void OooO0oO(Object obj);

    public abstract Object OooO0oo(AssetManager assetManager, String str);

    @Override // com.cmaster.cloner.in
    public final void cancel() {
        int i = this.OooO0Oo;
    }
}
