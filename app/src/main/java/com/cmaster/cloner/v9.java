package com.cmaster.cloner;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v9 implements in {
    public final /* synthetic */ int OooO0Oo;
    public final Object OooO0o0;

    public /* synthetic */ v9(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    private final void OooO0O0() {
    }

    private final void OooO0OO() {
    }

    private final void OooO0oO() {
    }

    private final void OooO0oo() {
    }

    @Override // com.cmaster.cloner.in
    public final Class OooO00o() {
        switch (this.OooO0Oo) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.OooO0o0.getClass();
        }
    }

    @Override // com.cmaster.cloner.in
    public final void OooO0Oo() {
        int i = this.OooO0Oo;
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
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                try {
                    hnVar.OooO0oO(ba.OooO00o((File) obj));
                    break;
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    hnVar.OooO0O0(e);
                    return;
                }
            default:
                hnVar.OooO0oO(obj);
                break;
        }
    }

    @Override // com.cmaster.cloner.in
    public final void cancel() {
        int i = this.OooO0Oo;
    }
}
