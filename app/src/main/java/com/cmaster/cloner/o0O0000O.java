package com.cmaster.cloner;

import android.content.AttributionSource;
import android.content.AttributionSourceState;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.internal.ads.zzbcj;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0O0000O implements Parcelable.Creator {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ o0O0000O(int i) {
        this.OooO00o = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        int i;
        ArrayList arrayList = null;
        int i2 = 0;
        switch (this.OooO00o) {
            case 0:
                o0O000 o0o000 = new o0O000();
                o0o000.OooO0Oo = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
                o0o000.OooO0o0 = parcel.readString();
                o0o000.OooO0o = parcel.readStrongBinder();
                o0o000.OooO0oO = parcel.readString();
                o0o000.OooO0oo = parcel.readInt();
                o0o000.OooO = parcel.readInt();
                o0o000.OooOO0 = parcel.readBundle();
                return o0o000;
            case 1:
                return new o0oO0O0o(parcel);
            case 2:
                i0 i0Var = new i0(parcel);
                i0Var.OooO0Oo = parcel.readByte() != 0;
                return i0Var;
            case 3:
                m2 m2Var = new m2();
                m2Var.OooO0Oo = parcel.readInt();
                m2Var.OooO0o0 = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
                m2Var.OooO0o = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
                m2Var.OooO0oO = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
                m2Var.OooO = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
                m2Var.OooOO0o = (ActivityInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
                m2Var.OooOO0 = parcel.readInt();
                m2Var.OooOO0O = parcel.readByte() > 0;
                return m2Var;
            case 4:
                p2 p2Var = new p2();
                p2Var.OooO0Oo = parcel.readStrongBinder();
                p2Var.OooO0o0 = (ApplicationInfo) parcel.readParcelable(ApplicationInfo.class.getClassLoader());
                p2Var.OooO0o = parcel.createTypedArrayList(ProviderInfo.CREATOR);
                p2Var.OooO0oO = parcel.readInt();
                p2Var.OooO0oo = parcel.readInt();
                p2Var.OooO = parcel.readInt();
                p2Var.OooOO0 = parcel.readInt() == 1;
                p2Var.OooOO0O = parcel.readString();
                p2Var.OooOO0o = parcel.readString();
                p2Var.OooOOO0 = parcel.readString();
                p2Var.OooOOO = parcel.readString();
                p2Var.OooOOOO = parcel.readInt();
                return p2Var;
            case 5:
                return new l5(parcel);
            case 6:
                return new m5(parcel);
            case 7:
                s5 s5Var = new s5();
                s5Var.OooO0Oo = parcel.readString();
                s5Var.OooO0o0 = parcel.readLong();
                s5Var.OooO0o = parcel.readInt();
                return s5Var;
            case 8:
                ce ceVar = new ce();
                ClassLoader classLoader = ce.class.getClassLoader();
                int i3 = parcel.readInt();
                if (i3 >= 0) {
                    arrayList = new ArrayList(i3);
                    while (i2 < i3) {
                        arrayList.add(parcel.readParcelable(classLoader));
                        i2++;
                    }
                }
                ceVar.OooO0Oo = arrayList;
                return ceVar;
            case 9:
                return new vi(parcel);
            case 10:
                return new aq(parcel);
            case 11:
                return new ju(parcel);
            case 12:
                xb1 xb1Var = e4.OooO0O0;
                xb1Var.getClass();
                try {
                    objNewInstance = ((Constructor) xb1Var.OooO0o0).newInstance(null);
                } catch (Exception unused) {
                    objNewInstance = null;
                }
                AttributionSourceState attributionSourceState = (AttributionSourceState) objNewInstance;
                attributionSourceState.readFromParcel(parcel);
                xb1 xb1Var2 = d4.OooO00o;
                return t8.OooO(xb1Var2 != null ? xb1Var2.Oooo000(attributionSourceState) : null);
            case 13:
                AttributionSourceState attributionSourceState2 = (AttributionSourceState) e4.OooO0O0.Oooo000(dx1.OooO0Oo);
                attributionSourceState2.readFromParcel(parcel);
                int callingUid = Binder.getCallingUid();
                if (callingUid != -1 && callingUid != 0 && callingUid != 1000 && callingUid != (i = attributionSourceState2.uid) && i != -1) {
                    attributionSourceState2.uid = callingUid;
                }
                return attributionSourceState2;
            case 14:
                h20 h20Var = new h20();
                h20Var.OooO0Oo = parcel.readString();
                h20Var.OooO0o0 = parcel.readInt();
                return h20Var;
            case 15:
                l20 l20Var = new l20();
                l20Var.OooO0oo = null;
                l20Var.OooO = new ArrayList();
                l20Var.OooOO0 = new ArrayList();
                l20Var.OooO0Oo = parcel.createStringArrayList();
                l20Var.OooO0o0 = parcel.createStringArrayList();
                l20Var.OooO0o = (l5[]) parcel.createTypedArray(l5.CREATOR);
                l20Var.OooO0oO = parcel.readInt();
                l20Var.OooO0oo = parcel.readString();
                l20Var.OooO = parcel.createStringArrayList();
                l20Var.OooOO0 = parcel.createTypedArrayList(m5.CREATOR);
                l20Var.OooOO0O = parcel.createTypedArrayList(h20.CREATOR);
                return l20Var;
            case 16:
                return new q20(parcel);
            case 17:
                o80 o80Var = new o80();
                o80Var.OooO0Oo = parcel.readInt();
                o80Var.OooO0o0 = parcel.readString();
                o80Var.OooO0o = parcel.readString();
                return o80Var;
            case 18:
                zi0 zi0Var = new zi0();
                zi0Var.OooO0Oo = parcel.readString();
                zi0Var.OooO0o0 = parcel.readStrongBinder();
                zi0Var.OooO0o = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
                zi0Var.OooO0oO = parcel.readInt();
                zi0Var.OooO0oo = parcel.readInt();
                zi0Var.OooO = parcel.readInt();
                zi0Var.OooOO0 = parcel.readInt();
                return zi0Var;
            case 19:
                aj0 aj0Var = new aj0();
                aj0Var.OooO0Oo = parcel.readStrongBinder();
                aj0Var.OooO0o0 = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
                aj0Var.OooO0o = parcel.readStrongBinder();
                aj0Var.OooO0oO = parcel.readString();
                aj0Var.OooO0oo = parcel.readInt();
                aj0Var.OooO = parcel.readBundle();
                aj0Var.OooOO0 = parcel.readInt();
                aj0Var.OooOO0O = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    aj0Var.OooOO0o = o0O0oo00.o0000o0O(strongBinder);
                }
                return aj0Var;
            case 20:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new cj0((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case zzbcj.zzt.zzm /* 21 */:
                tm0 tm0Var = new tm0();
                tm0Var.OooO0Oo = parcel.readInt();
                tm0Var.OooO0o0 = parcel.readInt();
                tm0Var.OooO0o = parcel.readInt() == 1;
                return tm0Var;
            case 22:
                return new in0(parcel);
            case 23:
                mq0 mq0Var = new mq0(parcel);
                mq0Var.OooO0Oo = ((Integer) parcel.readValue(mq0.class.getClassLoader())).intValue();
                return mq0Var;
            case 24:
                return new av0(parcel);
            case 25:
                lw0 lw0Var = new lw0(parcel);
                lw0Var.OooO0Oo = parcel.readInt();
                return lw0Var;
            case 26:
                return new fy0(parcel.readInt() == 1);
            case 27:
                i01 i01Var = new i01();
                i01Var.OooO0Oo = parcel.readLong();
                return i01Var;
            case 28:
                g21 g21Var = new g21();
                g21Var.OooOO0 = -1;
                g21Var.OooO0Oo = parcel.readByte() != 0;
                g21Var.OooO0o0 = parcel.readByte() != 0;
                g21Var.OooO0o = parcel.readByte() != 0;
                g21Var.OooO0oO = parcel.readByte() != 0;
                g21Var.OooO0oo = parcel.readInt();
                g21Var.OooO = parcel.readByte() != 0;
                g21Var.OooOO0 = parcel.readInt();
                g21Var.OooOO0O = parcel.readString();
                g21Var.OooOO0o = new HashSet();
                int i4 = parcel.readInt();
                for (int i5 = 0; i5 < i4; i5++) {
                    g21Var.OooOO0o.add(parcel.readString());
                }
                g21Var.OooOOO0 = new HashSet();
                int i6 = parcel.readInt();
                while (i2 < i6) {
                    g21Var.OooOOO0.add(parcel.readString());
                    i2++;
                }
                return g21Var;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.OooO00o) {
            case 0:
                return new o0O000[i];
            case 1:
                return new o0oO0O0o[i];
            case 2:
                return new i0[i];
            case 3:
                return new m2[i];
            case 4:
                return new p2[i];
            case 5:
                return new l5[i];
            case 6:
                return new m5[i];
            case 7:
                return new s5[i];
            case 8:
                return new ce[i];
            case 9:
                return new vi[i];
            case 10:
                return new aq[i];
            case 11:
                return new ju[i];
            case 12:
                return new AttributionSource[i];
            case 13:
                return new AttributionSourceState[i];
            case 14:
                return new h20[i];
            case 15:
                return new l20[i];
            case 16:
                return new q20[i];
            case 17:
                return new o80[i];
            case 18:
                return new zi0[i];
            case 19:
                return new aj0[i];
            case 20:
                return new cj0[i];
            case zzbcj.zzt.zzm /* 21 */:
                return new tm0[i];
            case 22:
                return new in0[i];
            case 23:
                return new mq0[i];
            case 24:
                return new av0[i];
            case 25:
                return new lw0[i];
            case 26:
                return new fy0[i];
            case 27:
                return new i01[i];
            case 28:
                return new g21[i];
            default:
                return new ParcelImpl[i];
        }
    }
}
