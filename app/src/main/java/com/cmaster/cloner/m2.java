package com.cmaster.cloner;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m2 implements Parcelable {
    public static final Parcelable.Creator<m2> CREATOR = new o0O0000O(3);
    public ComponentName OooO;
    public int OooO0Oo;
    public ComponentName OooO0o;
    public Intent OooO0o0;
    public ComponentName OooO0oO;
    public ComponentName OooO0oo;
    public int OooOO0;
    public boolean OooOO0O;
    public ActivityInfo OooOO0o;

    public final void OooO00o(ActivityManager.RecentTaskInfo recentTaskInfo) {
        try {
            recentTaskInfo.topActivity = this.OooO0oO;
            recentTaskInfo.baseActivity = this.OooO0o;
        } catch (Throwable unused) {
        }
        try {
            recentTaskInfo.origActivity = this.OooO0oo;
            recentTaskInfo.baseIntent = this.OooO0o0;
        } catch (Throwable unused2) {
        }
        ComponentName componentName = this.OooO;
        l81 l81Var = o0O00.OooO00o;
        if (l81Var == null || componentName == null) {
            l81 l81Var2 = cm1.OooO0O0;
            if (l81Var2 != null && componentName != null) {
                l81Var2.OooO0oo(recentTaskInfo, componentName);
            }
        } else {
            l81Var.OooO0oo(recentTaskInfo, componentName);
        }
        ActivityInfo activityInfo = this.OooOO0o;
        l81 l81Var3 = o0O00.OooO0O0;
        if (l81Var3 == null || activityInfo == null) {
            l81 l81Var4 = cm1.OooO0OO;
            if (l81Var4 != null && activityInfo != null) {
                l81Var4.OooO0oo(recentTaskInfo, activityInfo);
            }
        } else {
            l81Var3.OooO0oo(recentTaskInfo, activityInfo);
        }
        recentTaskInfo.numActivities = this.OooOO0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.OooO0Oo);
        parcel.writeParcelable(this.OooO0o0, i);
        parcel.writeParcelable(this.OooO0o, i);
        parcel.writeParcelable(this.OooO0oO, i);
        parcel.writeParcelable(this.OooO, i);
        parcel.writeParcelable(this.OooOO0o, i);
        parcel.writeInt(this.OooOO0);
        parcel.writeByte(this.OooOO0O ? (byte) 1 : (byte) 0);
    }
}
