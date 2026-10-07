package com.cmaster.cloner;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f extends h {
    public final /* synthetic */ int OooO0o = 0;
    public final /* synthetic */ k OooO0oO;
    public final Object OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, Context context) {
        super(kVar);
        this.OooO0oO = kVar;
        this.OooO0oo = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // com.cmaster.cloner.h
    public final IntentFilter OooO0o() {
        switch (this.OooO0o) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // com.cmaster.cloner.h
    public final int OooO0oO() {
        Location location;
        boolean z;
        long j;
        int i = this.OooO0o;
        Object obj = this.OooO0oo;
        switch (i) {
            case 0:
                if (!a.OooO00o((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                hx2 hx2Var = (hx2) obj;
                tp1 tp1Var = (tp1) hx2Var.OooO0oO;
                LocationManager locationManager = (LocationManager) hx2Var.OooO0o;
                if (tp1Var.OooO0O0 > System.currentTimeMillis()) {
                    z = tp1Var.OooO00o;
                } else {
                    Context context = (Context) hx2Var.OooO0o0;
                    Location lastKnownLocation = null;
                    if (tx2.OooO00o(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (tx2.OooO00o(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (sp1.OooO0Oo == null) {
                            sp1.OooO0Oo = new sp1();
                        }
                        sp1 sp1Var = sp1.OooO0Oo;
                        sp1Var.OooO00o(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        sp1Var.OooO00o(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = sp1Var.OooO0OO == 1;
                        long j2 = sp1Var.OooO0O0;
                        long j3 = sp1Var.OooO00o;
                        sp1Var.OooO00o(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = sp1Var.OooO0O0;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        tp1Var.OooO00o = z;
                        tp1Var.OooO0O0 = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    break;
                }
                break;
        }
        return 1;
    }

    @Override // com.cmaster.cloner.h
    public final void OooOO0O() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        int i = this.OooO0o;
        k kVar = this.OooO0oO;
        switch (i) {
            case 0:
                kVar.OooOOO(true, true);
                break;
            default:
                kVar.OooOOO(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, hx2 hx2Var) {
        super(kVar);
        this.OooO0oO = kVar;
        this.OooO0oo = hx2Var;
    }
}
