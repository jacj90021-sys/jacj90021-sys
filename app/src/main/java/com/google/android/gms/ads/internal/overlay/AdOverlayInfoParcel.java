package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/** No-op facade for stripped ads SDK. */
public class AdOverlayInfoParcel implements Parcelable {
    public com.google.android.gms.internal.ads.zzded OooOo;
    public int OooOOO;
    public Object OooO0o;
    public com.cmaster.cloner.e32 OooO0o0;
    public Factory OooO0oO;
    public com.cmaster.cloner.ib2 OooO0Oo;
    public com.cmaster.cloner.x32 OooOO0o;
    public String OooOo00;
    public Extra OooOOOo;
    public String OooOo0;

    public static class Factory {
        public Activity zzi() { return null; }
    }

    public static class Extra {
        public boolean OooO0oO;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }

    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new Parcelable.Creator<AdOverlayInfoParcel>() {
        @Override
        public AdOverlayInfoParcel createFromParcel(Parcel parcel) {
            return new AdOverlayInfoParcel();
        }

        @Override
        public AdOverlayInfoParcel[] newArray(int i) {
            return new AdOverlayInfoParcel[i];
        }
    };
}
