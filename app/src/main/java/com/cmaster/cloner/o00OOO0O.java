package com.cmaster.cloner;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.TransactionTooLargeException;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00OOO0O extends Handler {
    public final ArrayMap OooO00o;
    public final ArrayMap OooO0O0;
    public final ArrayList OooO0OO;
    public final ArrayList OooO0Oo;
    public final /* synthetic */ o0o0Oo OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(o0o0Oo o0o0oo, Looper looper) {
        super(looper);
        this.OooO0o0 = o0o0oo;
        this.OooO00o = new ArrayMap();
        this.OooO0O0 = new ArrayMap();
        this.OooO0OO = new ArrayList();
        this.OooO0Oo = new ArrayList();
    }

    public final void OooO00o() {
        removeMessages(1);
        long jUptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = this.OooO0Oo;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            kf1 kf1Var = (kf1) arrayList.get(i);
            if (kf1Var.OooOOoo <= jUptimeMillis) {
                u7.OooO00o(new byte[]{68, -34}, new byte[]{5, -115, -64, -63, 81, 14, -53, 8});
                u7.OooO00o(new byte[]{24, -95, -80, -89, 126, 57, -101, 67, 32, -82, -66, -13, 126, 51, -44, 90, 40, -88, -7, -75, 116, 47, -127, 15}, new byte[]{79, -64, -39, -45, 27, 93, -69, 47});
                u7.OooO00o(new byte[]{-26}, new byte[]{-102, 88, -62, -54, -79, -8, -78, 61});
                u7.OooO00o(new byte[]{13}, new byte[]{113, -127, 97, 121, 0, -21, 72, 94});
                Objects.toString(kf1Var.OooO0oo);
                int i2 = fp0.OooO00o;
                arrayList.remove(i);
                size--;
                i--;
            }
            i++;
        }
        while (true) {
            ArrayList arrayList2 = this.OooO0OO;
            if (arrayList2.size() <= 0) {
                break;
            }
            int size2 = arrayList.size();
            o0o0Oo o0o0oo = this.OooO0o0;
            if (size2 >= o0o0oo.OooO0oO) {
                break;
            }
            kf1 kf1Var2 = (kf1) arrayList2.remove(0);
            if (kf1Var2.OooOoOO.size() <= 0) {
                u7.OooO00o(new byte[]{88, -87}, new byte[]{25, -6, -79, -61, -114, 107, 62, 63});
                u7.OooO00o(new byte[]{-78, -106, -113, 18, -122, -113, -76, 127, -56, -7, -21, 124, -17, -113, -68, 127, -53, -24, -28, 106, -14, -110, -38, 127}, new byte[]{-104, -68, -91, 56, -90, -63, -5, 95});
                u7.OooO00o(new byte[]{-120, -48, 49, 61, 18, -32, -18, -111, -39, -98}, new byte[]{-88, -93, 69, 92, 96, -108, -68, -12});
                int i3 = fp0.OooO00o;
            } else {
                try {
                    o0o0oo.OooOo00(this, ((jf1) kf1Var2.OooOoOO.get(0)).OooO0OO, kf1Var2);
                } catch (TransactionTooLargeException unused) {
                }
            }
        }
        if (arrayList.size() > 0) {
            long j = ((kf1) arrayList.get(0)).OooOOoo;
            if (j > jUptimeMillis) {
                jUptimeMillis = j;
            }
            sendMessageAtTime(obtainMessage(1), jUptimeMillis);
        }
        arrayList.size();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1 || i == 3) {
            synchronized (this.OooO0o0.OooO00o) {
                OooO00o();
            }
        }
    }
}
