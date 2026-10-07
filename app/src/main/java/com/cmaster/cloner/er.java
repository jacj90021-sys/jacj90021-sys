package com.cmaster.cloner;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class er extends o10 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final br OoooOoO;
    public final cr OoooOoo;
    public int Ooooo00;
    public int Ooooo0o;
    public boolean OooooO0;
    public boolean OooooOO;
    public int OooooOo;
    public final k1 Oooooo;
    public boolean Oooooo0;
    public Dialog OoooooO;
    public boolean Ooooooo;
    public boolean o00O0O;
    public boolean o0OoOo0;
    public boolean ooOO;

    public er() {
        new o00OOO00(this, 16);
        this.OoooOoO = new br(this, 0);
        this.OoooOoo = new cr(this);
        this.Ooooo00 = 0;
        this.Ooooo0o = 0;
        this.OooooO0 = true;
        this.OooooOO = true;
        this.OooooOo = -1;
        this.Oooooo = new k1(this, 7);
        this.o00O0O = false;
    }

    @Override // com.cmaster.cloner.o10
    public final ds2 OooO0o0() {
        return new dr(this, new m10(this));
    }

    @Override // com.cmaster.cloner.o10
    public final void OooOo(Context context) {
        super.OooOo(context);
        this.OoooO.OooO0oO(this.Oooooo);
        if (this.ooOO) {
            return;
        }
        this.o0OoOo0 = false;
    }

    @Override // com.cmaster.cloner.o10
    public final void OooOo0O() {
        this.Oooo00O = true;
    }

    @Override // com.cmaster.cloner.o10
    public void OooOoO0(Bundle bundle) {
        super.OooOoO0(bundle);
        new Handler();
        this.OooooOO = this.OooOoO == 0;
        if (bundle != null) {
            this.Ooooo00 = bundle.getInt("android:style", 0);
            this.Ooooo0o = bundle.getInt("android:theme", 0);
            this.OooooO0 = bundle.getBoolean("android:cancelable", true);
            this.OooooOO = bundle.getBoolean("android:showsDialog", this.OooooOO);
            this.OooooOo = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // com.cmaster.cloner.o10
    public final void OooOoo() {
        this.Oooo00O = true;
        Dialog dialog = this.OoooooO;
        if (dialog != null) {
            this.Ooooooo = true;
            dialog.setOnDismissListener(null);
            this.OoooooO.dismiss();
            if (!this.o0OoOo0) {
                onDismiss(this.OoooooO);
            }
            this.OoooooO = null;
            this.o00O0O = false;
        }
    }

    @Override // com.cmaster.cloner.o10
    public final void OooOooO() {
        this.Oooo00O = true;
        if (!this.ooOO && !this.o0OoOo0) {
            this.o0OoOo0 = true;
        }
        this.OoooO.OooOO0O(this.Oooooo);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0044, B:29:0x004e, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0066), top: B:49:0x001a }] */
    @Override // com.cmaster.cloner.o10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater OooOooo(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.OooOooo(r8)
            boolean r0 = r7.OooooOO
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L98
            boolean r3 = r7.Oooooo0
            if (r3 == 0) goto L11
            goto L98
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.o00O0O
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.Oooooo0 = r3     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.OoooOOO()     // Catch: java.lang.Throwable -> L4c
            r7.OoooooO = r4     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.OooooOO     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L66
            int r5 = r7.Ooooo00     // Catch: java.lang.Throwable -> L4c
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4c
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4c
        L3e:
            android.content.Context r4 = r7.OooOO0()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4e
            android.app.Dialog r5 = r7.OoooooO     // Catch: java.lang.Throwable -> L4c
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4c
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r8 = move-exception
            goto L6c
        L4e:
            android.app.Dialog r4 = r7.OoooooO     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.OooooO0     // Catch: java.lang.Throwable -> L4c
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.OoooooO     // Catch: java.lang.Throwable -> L4c
            com.cmaster.cloner.br r5 = r7.OoooOoO     // Catch: java.lang.Throwable -> L4c
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.OoooooO     // Catch: java.lang.Throwable -> L4c
            com.cmaster.cloner.cr r5 = r7.OoooOoo     // Catch: java.lang.Throwable -> L4c
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4c
            r7.o00O0O = r3     // Catch: java.lang.Throwable -> L4c
            goto L69
        L66:
            r3 = 0
            r7.OoooooO = r3     // Catch: java.lang.Throwable -> L4c
        L69:
            r7.Oooooo0 = r0
            goto L6f
        L6c:
            r7.Oooooo0 = r0
            throw r8
        L6f:
            boolean r0 = com.cmaster.cloner.k20.Oooo000(r2)
            if (r0 == 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8b:
            android.app.Dialog r7 = r7.OoooooO
            if (r7 == 0) goto Lc3
            android.content.Context r7 = r7.getContext()
            android.view.LayoutInflater r7 = r8.cloneInContext(r7)
            return r7
        L98:
            boolean r0 = com.cmaster.cloner.k20.Oooo000(r2)
            if (r0 == 0) goto Lc3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r7 = r7.OooooOO
            if (r7 != 0) goto Lba
            java.lang.String r7 = "mShowsDialog = false: "
            java.lang.String r7 = r7.concat(r0)
            android.util.Log.d(r1, r7)
            return r8
        Lba:
            java.lang.String r7 = "mCreatingDialog = true: "
            java.lang.String r7 = r7.concat(r0)
            android.util.Log.d(r1, r7)
        Lc3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.er.OooOooo(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // com.cmaster.cloner.o10
    public final void Oooo0() {
        this.Oooo00O = true;
        Dialog dialog = this.OoooooO;
        if (dialog != null) {
            this.Ooooooo = false;
            dialog.show();
            View decorView = this.OoooooO.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // com.cmaster.cloner.o10
    public void Oooo00o(Bundle bundle) {
        Dialog dialog = this.OoooooO;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.Ooooo00;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.Ooooo0o;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.OooooO0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.OooooOO;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.OooooOo;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // com.cmaster.cloner.o10
    public final void Oooo0O0() {
        this.Oooo00O = true;
        Dialog dialog = this.OoooooO;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // com.cmaster.cloner.o10
    public final void Oooo0o(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.Oooo0o(layoutInflater, viewGroup, bundle);
        if (this.Oooo0 != null || this.OoooooO == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.OoooooO.onRestoreInstanceState(bundle2);
    }

    @Override // com.cmaster.cloner.o10
    public final void Oooo0o0(Bundle bundle) {
        Bundle bundle2;
        this.Oooo00O = true;
        if (this.OoooooO == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.OoooooO.onRestoreInstanceState(bundle2);
    }

    public Dialog OoooOOO() {
        if (k20.Oooo000(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new gg(Oooo(), this.Ooooo0o);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.Ooooooo) {
            return;
        }
        if (k20.Oooo000(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.o0OoOo0) {
            return;
        }
        this.o0OoOo0 = true;
        this.ooOO = false;
        Dialog dialog = this.OoooooO;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.OoooooO.dismiss();
        }
        this.Ooooooo = true;
        if (this.OooooOo >= 0) {
            k20 k20VarOooOOO0 = OooOOO0();
            int i = this.OooooOo;
            if (i < 0) {
                ra.OooOOO(px0.OooOOO(i, "Bad id: "));
                return;
            } else {
                k20VarOooOOO0.OooOo0O(new j20(k20VarOooOOO0, i), true);
                this.OooooOo = -1;
                return;
            }
        }
        k5 k5Var = new k5(OooOOO0());
        k5Var.OooOOOo = true;
        k20 k20Var = this.OooOo0;
        if (k20Var == null || k20Var == k5Var.OooOOo0) {
            k5Var.OooO0O0(new v20(3, this));
            k5Var.OooO0Oo(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }
}
