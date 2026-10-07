package com.cmaster.cloner;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e22 extends q12 implements f60, g60 {
    public static final m12 OooOO0o = g22.OooO00o;
    public final oO0Ooooo OooO;
    public final Handler OooO0o;
    public final Context OooO0o0;
    public final m12 OooO0oO;
    public final Set OooO0oo;
    public bh1 OooOO0;
    public u12 OooOO0O;

    public e22(Context context, xi1 xi1Var, oO0Ooooo oo0ooooo) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.OooO0o0 = context;
        this.OooO0o = xi1Var;
        this.OooO = oo0ooooo;
        this.OooO0oo = (Set) oo0ooooo.OooO0o0;
        this.OooO0oO = OooOO0o;
    }

    @Override // com.cmaster.cloner.f60
    public final void o0000o0O() throws NumberFormatException {
        GoogleSignInAccount googleSignInAccountOooO00o;
        bh1 bh1Var = this.OooOO0;
        bh1Var.getClass();
        try {
            bh1Var.OooO0o.getClass();
            Account account = new Account(m6.DEFAULT_ACCOUNT, "com.google");
            if (m6.DEFAULT_ACCOUNT.equals(account.name)) {
                Context context = bh1Var.getContext();
                ReentrantLock reentrantLock = ej1.OooO0OO;
                by2.OooO0oo(context);
                ReentrantLock reentrantLock2 = ej1.OooO0OO;
                reentrantLock2.lock();
                try {
                    if (ej1.OooO0Oo == null) {
                        ej1.OooO0Oo = new ej1(context.getApplicationContext());
                    }
                    ej1 ej1Var = ej1.OooO0Oo;
                    reentrantLock2.unlock();
                    String strOooO00o = ej1Var.OooO00o("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strOooO00o)) {
                        String strOooO00o2 = ej1Var.OooO00o("googleSignInAccount:" + strOooO00o);
                        if (strOooO00o2 != null) {
                            try {
                                googleSignInAccountOooO00o = GoogleSignInAccount.OooO00o(strOooO00o2);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    googleSignInAccountOooO00o = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountOooO00o = null;
            }
            Integer num = bh1Var.OooO0oo;
            by2.OooO0oo(num);
            w22 w22Var = new w22(2, account, num.intValue(), googleSignInAccountOooO00o);
            j22 j22Var = (j22) bh1Var.getService();
            q22 q22Var = new q22(1, w22Var);
            j22Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(j22Var.OooO0o);
            y12.OooO0OO(parcelObtain, q22Var);
            parcelObtain.writeStrongBinder(this);
            j22Var.o0000o0O(12, parcelObtain);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.OooO0o.post(new bf1(this, new r22(1, new gh(8, null), null), 7));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.cmaster.cloner.q12
    public final boolean o000oooo(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                y12.OooO0O0(parcel);
                break;
            case 4:
                y12.OooO0O0(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                y12.OooO0O0(parcel);
                break;
            case 7:
                y12.OooO0O0(parcel);
                break;
            case 8:
                r22 r22Var = (r22) y12.OooO00o(parcel, r22.CREATOR);
                y12.OooO0O0(parcel);
                this.OooO0o.post(new bf1(this, r22Var, 7));
                break;
            case 9:
                y12.OooO0O0(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.cmaster.cloner.g60
    public final void onConnectionFailed(gh ghVar) {
        this.OooOO0O.OooO00o(ghVar);
    }

    @Override // com.cmaster.cloner.f60
    public final void onConnectionSuspended(int i) {
        u12 u12Var = this.OooOO0O;
        s12 s12Var = (s12) ((h60) u12Var.OooO).OooOOO0.get((oOO0O0) u12Var.OooO0o);
        if (s12Var != null) {
            if (s12Var.OooOO0o) {
                s12Var.OooOOO0(new gh(17));
            } else {
                s12Var.onConnectionSuspended(i);
            }
        }
    }
}
