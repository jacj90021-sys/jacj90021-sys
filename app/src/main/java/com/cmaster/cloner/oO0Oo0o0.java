package com.cmaster.cloner;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.Random;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class oO0Oo0o0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int OooO0Oo = 1;
    public final /* synthetic */ Object OooO0o0;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new oOOo0000((Context) obj, 1), new Random().nextInt(Math.max(zzbcj.zzq.zzf, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ oO0Oo0o0(Runnable runnable) {
        this.OooO0o0 = runnable;
    }
}
