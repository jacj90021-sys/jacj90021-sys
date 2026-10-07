package com.cmaster.cloner;

import android.net.NetworkRequest;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class uw0 implements IInterface {
    public final Messenger OooO0Oo;
    public final IBinder OooO0o;
    public final NetworkRequest OooO0o0;

    public uw0(Messenger messenger, NetworkRequest networkRequest, IBinder iBinder) {
        this.OooO0Oo = messenger;
        this.OooO0o0 = networkRequest;
        this.OooO0o = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0Oo.getBinder();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uw0.class == obj.getClass()) {
            uw0 uw0Var = (uw0) obj;
            if (Objects.equals(this.OooO0o0, uw0Var.OooO0o0) && Objects.equals(this.OooO0o, uw0Var.OooO0o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.OooO0o0, this.OooO0o);
    }
}
