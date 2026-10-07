package com.cmaster.cloner;

import android.util.Log;
import com.bumptech.matrix.ui.qrcode.GraphicOverlay;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class va implements Runnable {
    public ByteBuffer OooO0o;
    public final /* synthetic */ xa OooO0oO;
    public final Object OooO0Oo = new Object();
    public boolean OooO0o0 = true;

    public va(xa xaVar) {
        this.OooO0oO = xaVar;
    }

    public final void OooO00o(boolean z) {
        synchronized (this.OooO0Oo) {
            this.OooO0o0 = z;
            this.OooO0Oo.notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ByteBuffer byteBuffer;
        while (true) {
            synchronized (this.OooO0Oo) {
                while (true) {
                    z = this.OooO0o0;
                    if (!z || this.OooO0o != null) {
                        break;
                    }
                    try {
                        this.OooO0Oo.wait();
                    } catch (InterruptedException e) {
                        Log.d(sn2.OooO00o("id0oYi5gZDq0ri9mLmpXK5f7GXUgag==\n", "xJRsB0MPJUo=\n"), sn2.OooO00o("LzXR2xlqvOYGJNXFDyOi80kr39kMarjxGyrZ2B0+qfBH\n", "aUewtnxKzJQ=\n"), e);
                        return;
                    }
                }
                if (!z) {
                    return;
                }
                byteBuffer = this.OooO0o;
                this.OooO0o = null;
            }
            try {
                synchronized (this.OooO0oO.OooOO0) {
                    xa xaVar = this.OooO0oO;
                    b6 b6Var = xaVar.OooOO0O;
                    ph1 ph1Var = xaVar.OooO0o0;
                    int i = ph1Var.OooO00o;
                    int i2 = ph1Var.OooO0O0;
                    int i3 = xaVar.OooO0Oo;
                    du duVar = new du();
                    duVar.OooO00o = i;
                    duVar.OooO0O0 = i2;
                    duVar.OooO0OO = i3;
                    GraphicOverlay graphicOverlay = xaVar.OooO0oO;
                    synchronized (b6Var) {
                        b6Var.OooOOOO = byteBuffer;
                        b6Var.OooOOOo = duVar;
                        if (b6Var.OooOOo0 == null && b6Var.OooOOo == null) {
                            b6Var.OooO0OO(graphicOverlay);
                        }
                    }
                }
            } catch (Exception e2) {
                Log.e(sn2.OooO00o("v9dt73uOjvuCpGrre4S96qHxXPh1hA==\n", "8p4pihbhz4s=\n"), sn2.OooO00o("tc8iCS1H8sKelzUEL1zsw9DRMwMwE+nIk9IoGjhBtQ==\n", "8LdBbF0zm60=\n"), e2);
            } finally {
                this.OooO0oO.OooO0O0.addCallbackBuffer(byteBuffer.array());
            }
        }
    }
}
