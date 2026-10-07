package com.cmaster.cloner;

import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbfc;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class f6 extends ViewGroup {
    public final zi2 OooO0Oo;

    public f6(Context context) {
        super(context);
        this.OooO0Oo = new zi2(this);
    }

    public final void OooO00o() {
        zzbde.zza(getContext());
        if (((Boolean) zzbfc.zze.zze()).booleanValue()) {
            if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlB)).booleanValue()) {
                f72.OooO0O0.execute(new je2(this, 1));
                return;
            }
        }
        zi2 zi2Var = this.OooO0Oo;
        zi2Var.getClass();
        try {
            sa2 sa2Var = zi2Var.OooO;
            if (sa2Var != null) {
                sa2Var.zzy();
            }
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
        }
    }

    public final void OooO0O0(oO000 oo000) {
        by2.OooO0Oo("#008 Must be called on the main UI thread.");
        zzbde.zza(getContext());
        if (((Boolean) zzbfc.zzf.zze()).booleanValue()) {
            if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlE)).booleanValue()) {
                f72.OooO0O0.execute(new bf1(this, oo000, 20, false));
                return;
            }
        }
        this.OooO0Oo.OooO0O0(oo000.OooO00o);
    }

    public final void OooO0OO() {
        zzbde.zza(getContext());
        if (((Boolean) zzbfc.zzg.zze()).booleanValue()) {
            if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlC)).booleanValue()) {
                f72.OooO0O0.execute(new je2(this, 2));
                return;
            }
        }
        zi2 zi2Var = this.OooO0Oo;
        zi2Var.getClass();
        try {
            sa2 sa2Var = zi2Var.OooO;
            if (sa2Var != null) {
                sa2Var.zzA();
            }
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
        }
    }

    public final void OooO0Oo() {
        zzbde.zza(getContext());
        if (((Boolean) zzbfc.zzh.zze()).booleanValue()) {
            if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlA)).booleanValue()) {
                f72.OooO0O0.execute(new je2(this, 0));
                return;
            }
        }
        zi2 zi2Var = this.OooO0Oo;
        zi2Var.getClass();
        try {
            sa2 sa2Var = zi2Var.OooO;
            if (sa2Var != null) {
                sa2Var.zzC();
            }
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
        }
    }

    public o0OOo000 getAdListener() {
        return this.OooO0Oo.OooO0o;
    }

    public oO000O0O getAdSize() {
        w53 w53VarZzh;
        zi2 zi2Var = this.OooO0Oo;
        zi2Var.getClass();
        try {
            sa2 sa2Var = zi2Var.OooO;
            if (sa2Var != null && (w53VarZzh = sa2Var.zzh()) != null) {
                return new oO000O0O(w53VarZzh.OooO0oo, w53VarZzh.OooO0o0, w53VarZzh.OooO0Oo);
            }
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
        }
        oO000O0O[] oo000o0oArr = zi2Var.OooO0oO;
        if (oo000o0oArr != null) {
            return oo000o0oArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        sa2 sa2Var;
        zi2 zi2Var = this.OooO0Oo;
        if (zi2Var.OooOO0O == null && (sa2Var = zi2Var.OooO) != null) {
            try {
                zi2Var.OooOO0O = sa2Var.zzs();
            } catch (RemoteException e) {
                uh2.OooOO0o("#007 Could not call remote method.", e);
            }
        }
        return zi2Var.OooOO0O;
    }

    public hz0 getOnPaidEventListener() {
        return this.OooO0Oo.OooOOO;
    }

    public long getPlacementId() {
        zi2 zi2Var = this.OooO0Oo;
        AtomicLong atomicLong = zi2Var.OooOOOO;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            sa2 sa2Var = zi2Var.OooO;
            if (sa2Var == null) {
                return 0L;
            }
            atomicLong.set(sa2Var.zzc());
            return atomicLong.get();
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
            return 0L;
        }
    }

    public ya1 getResponseInfo() {
        sa2 sa2Var;
        zi2 zi2Var = this.OooO0Oo;
        zi2Var.getClass();
        try {
            sa2Var = zi2Var.OooO;
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
        }
        yh2 yh2VarZzl = sa2Var != null ? sa2Var.zzl() : null;
        if (yh2VarZzl != null) {
            return new ya1(yh2VarZzl);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        oO000O0O adSize;
        int measuredHeight;
        int iOooO0O0;
        int iOooO0O02;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                uh2.OooO0oo("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int i3 = adSize.OooO00o;
                if (i3 == -3) {
                    iOooO0O0 = -1;
                } else if (i3 != -1) {
                    zj2 zj2Var = p72.OooO0o.OooO00o;
                    iOooO0O0 = zj2.OooO0O0(context, i3);
                } else {
                    iOooO0O0 = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i4 = adSize.OooO0O0;
                if (i4 == -4 || i4 == -3) {
                    iOooO0O02 = -1;
                } else if (i4 != -2) {
                    zj2 zj2Var2 = p72.OooO0o.OooO00o;
                    iOooO0O02 = zj2.OooO0O0(context, i4);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f = displayMetrics.heightPixels;
                    float f2 = displayMetrics.density;
                    int i5 = (int) (f / f2);
                    iOooO0O02 = (int) ((i5 <= 400 ? 32 : i5 <= 720 ? 50 : 90) * f2);
                }
                measuredHeight = iOooO0O02;
                measuredWidth = iOooO0O0;
            } else {
                measuredHeight = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(measuredHeight, getSuggestedMinimumHeight()), i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(o0OOo000 o0ooo000) {
        zi2 zi2Var = this.OooO0Oo;
        zi2Var.OooO0o = o0ooo000;
        xi2 xi2Var = zi2Var.OooO0Oo;
        synchronized (xi2Var.OooO0Oo) {
            xi2Var.OooO0o0 = o0ooo000;
        }
        if (o0ooo000 == 0) {
            zi2Var.OooO0OO(null);
            return;
        }
        if (o0ooo000 instanceof e32) {
            zi2Var.OooO0OO((e32) o0ooo000);
        }
        if (o0ooo000 instanceof e1) {
            zi2Var.OooO0o0((e1) o0ooo000);
        }
    }

    public void setAdSize(oO000O0O oo000o0o) {
        oO000O0O[] oo000o0oArr = {oo000o0o};
        zi2 zi2Var = this.OooO0Oo;
        if (zi2Var.OooO0oO == null) {
            zi2Var.OooO0Oo(oo000o0oArr);
        } else {
            qa.OooO0o("The ad size can only be set once on AdView.");
        }
    }

    public void setAdUnitId(String str) {
        zi2 zi2Var = this.OooO0Oo;
        if (zi2Var.OooOO0O == null) {
            zi2Var.OooOO0O = str;
        } else {
            qa.OooO0o("The ad unit ID can only be set once on AdView.");
        }
    }

    public void setOnPaidEventListener(hz0 hz0Var) {
        zi2 zi2Var = this.OooO0Oo;
        zi2Var.getClass();
        try {
            zi2Var.OooOOO = hz0Var;
            sa2 sa2Var = zi2Var.OooO;
            if (sa2Var != null) {
                sa2Var.zzQ(new tl2(hz0Var));
            }
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
        }
    }

    public void setPlacementId(long j) {
        zi2 zi2Var = this.OooO0Oo;
        zi2Var.OooOOOO.set(j);
        try {
            sa2 sa2Var = zi2Var.OooO;
            if (sa2Var != null) {
                sa2Var.zzR(j);
            }
        } catch (RemoteException e) {
            uh2.OooOO0o("#007 Could not call remote method.", e);
        }
    }
}
