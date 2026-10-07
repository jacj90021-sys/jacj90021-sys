package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pr implements ju0, rr, ru, r50 {
    public final /* synthetic */ int OooO0Oo;
    public final Context OooO0o0;

    public pr(Context context) {
        this.OooO0Oo = 1;
        this.OooO0o0 = context.getApplicationContext();
    }

    @Override // com.cmaster.cloner.rr
    public Class OooO00o() {
        return InputStream.class;
    }

    @Override // com.cmaster.cloner.rr
    public void OooO0O0(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // com.cmaster.cloner.rr
    public Object OooO0OO(int i, Resources.Theme theme, Resources resources) {
        return resources.openRawResource(i);
    }

    @Override // com.cmaster.cloner.ru
    public void OooO0Oo(sq2 sq2Var) {
        sg sgVar = new sg("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), sgVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new yc(this, sq2Var, threadPoolExecutor, 1));
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        int i = this.OooO0Oo;
        Context context = this.OooO0o0;
        switch (i) {
            case 0:
                return new t3(context, this);
            case 1:
            default:
                return new t3(context, ho1Var.OooOO0O(Integer.class, InputStream.class));
            case 2:
                return new sr0(context, 1);
        }
    }

    @Override // com.cmaster.cloner.r50
    public Object get() {
        return (ConnectivityManager) this.OooO0o0.getSystemService("connectivity");
    }

    public /* synthetic */ pr(Context context, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = context;
    }
}
