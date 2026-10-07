package com.cmaster.cloner;

import android.app.NotificationManager;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ff1 implements Parcelable {
    public static final Parcelable.Creator<ff1> CREATOR = new b41(4);
    public IBinder OooO0Oo;
    public hf0 OooO0o0 = ox1.o0O0ooO();
    public we0 OooO0o = pw1.o00O0000();
    public ef0 OooO0oO = hx1.o0000o0O();
    public ze0 OooO0oo = (yw1) yw1.OooOOO0.OooO0O0();
    public bf0 OooO = bx1.o0000o0O();
    public te0 OooOO0 = (jw1) jw1.OooOOo0.OooO0O0();

    public static void OooO00o(Context context) {
        NotificationManager notificationManager;
        String string;
        int i = 12;
        final int i2 = 2;
        try {
            pw1.o00O0000().o00O00(context);
            ox1 ox1VarO0O0ooO = ox1.o0O0ooO();
            ox1VarO0O0ooO.getClass();
            ox1VarO0O0ooO.OooO0oo = vx1.OooO0O0();
            ox1VarO0O0ooO.OooOOO0.execute(new u91(ox1VarO0O0ooO, i));
        } catch (Exception unused) {
            u7.OooO00o(new byte[]{122, 28}, new byte[]{2, 100, 17, -45, -19, -103, -15, -106});
            int i3 = fp0.OooO00o;
        }
        final vx1 vx1VarOooO0O0 = vx1.OooO0O0();
        vx1VarOooO0O0.getClass();
        ox1.o0O0ooO().oo0o0O0(new n90() { // from class: com.cmaster.cloner.wv1
            static {
                DexUtils.classesInit0(63);
            }

            @Override // com.cmaster.cloner.n90
            public final native void OooO00o(int i4, int i5, String str);
        });
        vx1VarOooO0O0.OooO0O0.OooO0O0();
        final jw1 jw1Var = (jw1) jw1.OooOOo0.OooO0O0();
        jw1Var.getClass();
        jw1Var.OooO0o0 = pw1.o00O0000();
        jw1Var.OooO0o = ox1.o0O0ooO();
        vx1.OooO0O0();
        final int i4 = 0;
        jw1Var.OooO0o.oo0o0O0(new n90() { // from class: com.cmaster.cloner.wv1
            static {
                DexUtils.classesInit0(63);
            }

            @Override // com.cmaster.cloner.n90
            public final native void OooO00o(int i42, int i5, String str);
        });
        jw1Var.OooOOO = new iw1(jw1Var);
        final int i5 = 1;
        new s40(jw1Var, i5).start();
        final hx1 hx1VarO0000o0O = hx1.o0000o0O();
        hx1VarO0000o0O.OooO0o0 = context;
        hx1VarO0000o0O.OooO0oo = (JobScheduler) context.getSystemService(u7.OooO00o(new byte[]{-11, -102, -13, 107, -62, -91, -16, -44, -22, -103, -12, 106}, new byte[]{-97, -11, -111, 24, -95, -51, -107, -80}));
        pw1.o00O0000();
        ox1.o0O0ooO().oo0o0O0(new n90() { // from class: com.cmaster.cloner.wv1
            static {
                DexUtils.classesInit0(63);
            }

            @Override // com.cmaster.cloner.n90
            public final native void OooO00o(int i42, int i52, String str);
        });
        gx1 gx1Var = new gx1(hx1VarO0000o0O);
        hx1VarO0000o0O.OooO = gx1Var;
        gx1Var.OooO0O0();
        yw1 yw1Var = (yw1) yw1.OooOOO0.OooO0O0();
        HandlerThread handlerThread = yw1Var.OooO;
        if (!yw1Var.OooOO0) {
            yw1Var.OooO0o0 = context;
            handlerThread.start();
            new Handler(handlerThread.getLooper()).post(new o00OOOOo(yw1Var, 18));
            yw1Var.OooOO0 = true;
        }
        bx1 bx1VarO0000o0O = bx1.o0000o0O();
        bx1VarO0000o0O.OooO0Oo = context;
        bx1VarO0000o0O.OooO0o.OooO0O0();
        ax1 ax1Var = bx1VarO0000o0O.OooO0o;
        if (ax1Var.OooOOO == null) {
            Context context2 = ax1Var.OooOOOO.OooO0Oo;
            o80 o80Var = new o80();
            String string2 = Settings.Secure.getString(context2.getContentResolver(), u7.OooO00o(new byte[]{31, -121, -86, -106, -35, 70, 51, 30, 23, -115}, new byte[]{126, -23, -50, -28, -78, 47, 87, 65}));
            o80Var.OooO0o0 = string2;
            if (TextUtils.isEmpty(o80Var.OooO0o) || o80Var.OooO0o.startsWith(u7.OooO00o(new byte[]{115, -49}, new byte[]{67, -1, 95, 89, 22, 78, -111, 19})) || o80Var.OooO0o.startsWith(u7.OooO00o(new byte[]{-95, -15}, new byte[]{-112, -64, -90, 45, 6, -14, -56, 104}))) {
                StringBuilder sbOooOO0 = rj.OooOO0(string2);
                sbOooOO0.append(Build.DEVICE);
                sbOooOO0.append(u7.OooO00o(new byte[]{54}, new byte[]{118, -23, -122, -2, 90, -45, 34, 31}));
                sbOooOO0.append(Build.BRAND);
                sbOooOO0.append(u7.OooO00o(new byte[]{-63}, new byte[]{-127, -127, -32, 36, 3, -32, -5, -105}));
                sbOooOO0.append(Build.MANUFACTURER);
                sbOooOO0.append(u7.OooO00o(new byte[]{-45}, new byte[]{-109, -100, -102, -51, 106, 6, -78, -19}));
                sbOooOO0.append(Build.FINGERPRINT);
                sbOooOO0.append(u7.OooO00o(new byte[]{95}, new byte[]{31, 119, 22, 117, -26, 39, -112, 90}));
                sbOooOO0.append(System.currentTimeMillis());
                try {
                    byte[] bArrDigest = MessageDigest.getInstance(u7.OooO00o(new byte[]{-70, -10, 45}, new byte[]{-9, -78, 24, -69, -12, -87, 124, 56})).digest(sbOooOO0.toString().getBytes(StandardCharsets.UTF_8));
                    StringBuilder sb = new StringBuilder();
                    for (byte b : bArrDigest) {
                        sb.append(String.format(u7.OooO00o(new byte[]{44, 26, -84, -127}, new byte[]{9, 42, -98, -7, 19, -62, 60, 61}), Byte.valueOf(b)));
                    }
                    string = sb.toString();
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                    string = "";
                }
                o80Var.OooO0o = string.substring(0, 16);
            } else {
                o80Var.OooO0o = string2;
            }
            ax1Var.OooOOO = o80Var;
            Parcel parcelObtain = Parcel.obtain();
            try {
                ax1Var.OooOOO.writeToParcel(parcelObtain, 0);
                ax1Var.OooO0o(ax1.OooOOo0, parcelObtain.marshall(), ax1.OooOOo);
            } finally {
                parcelObtain.recycle();
            }
        }
        bx1VarO0000o0O.OooO0o0 = new zp(ax1Var.OooOOO);
        for (aq aqVar : bx1VarO0000o0O.OooO0o.OooOOO0.values()) {
            zp zpVar = bx1VarO0000o0O.OooO0o0;
            zpVar.getClass();
            Iterator<String> it = aqVar.OooO0Oo.keySet().iterator();
            while (it.hasNext()) {
                zpVar.OooO00o.add(String.valueOf(aqVar.OooO0Oo.get(it.next())));
            }
        }
        lx1 lx1Var = (lx1) lx1.OooO0o.OooO0O0();
        HandlerThread handlerThread2 = lx1Var.OooO00o;
        lx1Var.OooO0O0 = (NotificationManager) context.getSystemService(u7.OooO00o(new byte[]{21, -96, 57, 37, -101, -75, 124, -112, 15, -90, 34, 34}, new byte[]{123, -49, 77, 76, -3, -36, 31, -15}));
        if (yn2.OooO0O0() && (notificationManager = lx1Var.OooO0O0) != null) {
            String str = lx1.OooO0Oo;
            if (notificationManager.getNotificationChannel(str) == null) {
                y82.OooOOO();
                lx1Var.OooO0O0.createNotificationChannel(y01.OooO0o0(str, lx1.OooO0o0));
            }
        }
        handlerThread2.start();
        new oOo00o0o(lx1Var, handlerThread2.getLooper(), 5).sendEmptyMessage(1);
        new ff1().OooO0O0(context);
    }

    public final void OooO0O0(Context context) {
        mx1 mx1VarOooO0oO = mx1.OooO0oO();
        hf0 hf0Var = this.OooO0o0;
        mx1VarOooO0oO.OooO0O0 = context;
        mx1VarOooO0oO.OooO00o = hf0Var;
        lw1.OooO0O0().OooO00o = this.OooO0o;
        fx1.OooO00o().OooO00o = this.OooO0oO;
        ((tw1) tw1.OooO0O0.OooO0O0()).OooO00o = this.OooO0oo;
        zw1.OooO00o().OooO00o = this.OooO;
        vv1.OooO00o().OooO00o = this.OooOO0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.OooO0Oo);
        parcel.writeStrongBinder(this.OooO0o0.asBinder());
        parcel.writeStrongBinder(this.OooO0o.asBinder());
        parcel.writeStrongBinder(this.OooO0oO.asBinder());
        parcel.writeStrongBinder(this.OooO0oo.asBinder());
        parcel.writeStrongBinder(this.OooO.asBinder());
        parcel.writeStrongBinder(this.OooOO0.asBinder());
    }
}
