package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.cmaster.cloner.up1;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean Oooo;
    public boolean OoooO;
    public CharSequence OoooO0;
    public CharSequence OoooO00;
    public boolean OoooO0O;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final void OooOO0o() {
        OooOoO(!this.Oooo);
    }

    @Override // androidx.preference.Preference
    public final Object OooOOO(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public final void OooOOOO(Parcelable parcelable) {
        if (!parcelable.getClass().equals(up1.class)) {
            super.OooOOOO(parcelable);
            return;
        }
        up1 up1Var = (up1) parcelable;
        super.OooOOOO(up1Var.getSuperState());
        OooOoO(up1Var.OooO0Oo);
    }

    @Override // androidx.preference.Preference
    public final Parcelable OooOOOo() {
        super.OooOOOo();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.OooOo00) {
            return absSavedState;
        }
        up1 up1Var = new up1();
        up1Var.OooO0Oo = this.Oooo;
        return up1Var;
    }

    @Override // androidx.preference.Preference
    public final void OooOOo0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (OooOoO0()) {
            zBooleanValue = this.OooO0o0.OooO00o().getBoolean(this.OooOOO, zBooleanValue);
        }
        OooOoO(zBooleanValue);
    }

    @Override // androidx.preference.Preference
    public final boolean OooOo() {
        boolean z = this.OoooO;
        boolean z2 = this.Oooo;
        if (!z) {
            z2 = !z2;
        }
        return z2 || super.OooOo();
    }

    public final void OooOoO(boolean z) {
        boolean z2 = this.Oooo != z;
        if (z2 || !this.OoooO0O) {
            this.Oooo = z;
            this.OoooO0O = true;
            if (OooOoO0()) {
                boolean z3 = !z;
                boolean zOooOoO0 = OooOoO0();
                String str = this.OooOOO;
                if (zOooOoO0) {
                    z3 = this.OooO0o0.OooO00o().getBoolean(str, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor editorEdit = this.OooO0o0.OooO00o().edit();
                    editorEdit.putBoolean(str, z);
                    this.OooO0o0.getClass();
                    editorEdit.apply();
                }
            }
            if (z2) {
                OooO0oo(OooOo());
                OooO0oO();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOoOO(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r3.Oooo
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r3.OoooO00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r3.OoooO00
            r4.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r3.Oooo
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r3.OoooO0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r3.OoooO0
            r4.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r3 = r3.OooO0o0()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L3e
            r4.setText(r3)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r3 = r4.getVisibility()
            if (r1 == r3) goto L4c
            r4.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.OooOoOO(android.view.View):void");
    }
}
