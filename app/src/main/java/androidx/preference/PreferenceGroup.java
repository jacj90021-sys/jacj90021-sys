package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import com.cmaster.cloner.gh1;
import com.cmaster.cloner.i61;
import com.cmaster.cloner.k41;
import com.cmaster.cloner.m41;
import com.cmaster.cloner.n41;
import com.cmaster.cloner.o00OOO00;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.ra;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final gh1 Oooo;
    public boolean OoooO;
    public boolean OoooO0;
    public final ArrayList OoooO00;
    public int OoooO0O;
    public int OoooOO0;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.Oooo = new gh1(0);
        new Handler(Looper.getMainLooper());
        this.OoooO0 = true;
        this.OoooO0O = 0;
        this.OoooO = false;
        this.OoooOO0 = Integer.MAX_VALUE;
        this.OoooO00 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i61.OooO, i, 0);
        this.OoooO0 = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE && TextUtils.isEmpty(this.OooOOO)) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.OoooOO0 = i3;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void OooO() {
        super.OooO();
        this.OoooO = true;
        int size = this.OoooO00.size();
        for (int i = 0; i < size; i++) {
            OooOoo0(i).OooO();
        }
    }

    @Override // androidx.preference.Preference
    public final void OooO00o(Bundle bundle) {
        super.OooO00o(bundle);
        int size = this.OoooO00.size();
        for (int i = 0; i < size; i++) {
            OooOoo0(i).OooO00o(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void OooO0O0(Bundle bundle) {
        super.OooO0O0(bundle);
        int size = this.OoooO00.size();
        for (int i = 0; i < size; i++) {
            OooOoo0(i).OooO0O0(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void OooO0oo(boolean z) {
        super.OooO0oo(z);
        int size = this.OoooO00.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceOooOoo0 = OooOoo0(i);
            if (preferenceOooOoo0.OooOo == z) {
                preferenceOooOoo0.OooOo = !z;
                preferenceOooOoo0.OooO0oo(preferenceOooOoo0.OooOo());
                preferenceOooOoo0.OooO0oO();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void OooOOO0() {
        super.OooOOO0();
        this.OoooO = false;
        int size = this.OoooO00.size();
        for (int i = 0; i < size; i++) {
            OooOoo0(i).OooOOO0();
        }
    }

    @Override // androidx.preference.Preference
    public final void OooOOOO(Parcelable parcelable) {
        if (!parcelable.getClass().equals(k41.class)) {
            super.OooOOOO(parcelable);
            return;
        }
        k41 k41Var = (k41) parcelable;
        this.OoooOO0 = k41Var.OooO0Oo;
        super.OooOOOO(k41Var.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable OooOOOo() {
        super.OooOOOo();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new k41(this.OoooOO0);
    }

    public final void OooOoO(Preference preference) {
        long jLongValue;
        if (this.OoooO00.contains(preference)) {
            return;
        }
        if (preference.OooOOO != null) {
            PreferenceGroup preferenceGroup = this;
            while (true) {
                PreferenceScreen preferenceScreen = preferenceGroup.Oooo0OO;
                if (preferenceScreen == null) {
                    break;
                } else {
                    preferenceGroup = preferenceScreen;
                }
            }
            String str = preference.OooOOO;
            if (preferenceGroup.OooOoOO(str) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        int i = preference.OooO;
        if (i == Integer.MAX_VALUE) {
            if (this.OoooO0) {
                int i2 = this.OoooO0O;
                this.OoooO0O = i2 + 1;
                if (i2 != i) {
                    preference.OooO = i2;
                    m41 m41Var = preference.Oooo0;
                    if (m41Var != null) {
                        Handler handler = m41Var.OooO0oo;
                        o00OOO00 o00ooo00 = m41Var.OooO;
                        handler.removeCallbacks(o00ooo00);
                        handler.post(o00ooo00);
                    }
                }
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).OoooO0 = this.OoooO0;
            }
        }
        int iBinarySearch = Collections.binarySearch(this.OoooO00, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        boolean zOooOo = OooOo();
        if (preference.OooOo == zOooOo) {
            preference.OooOo = !zOooOo;
            preference.OooO0oo(preference.OooOo());
            preference.OooO0oO();
        }
        synchronized (this) {
            this.OoooO00.add(iBinarySearch, preference);
        }
        n41 n41Var = this.OooO0o0;
        String str2 = preference.OooOOO;
        if (str2 == null || !this.Oooo.containsKey(str2)) {
            synchronized (n41Var) {
                jLongValue = n41Var.OooO0O0;
                n41Var.OooO0O0 = 1 + jLongValue;
            }
        } else {
            jLongValue = ((Long) this.Oooo.get(str2)).longValue();
            this.Oooo.remove(str2);
        }
        preference.OooO0o = jLongValue;
        preference.OooO0oO = true;
        try {
            preference.OooOO0(n41Var);
            preference.OooO0oO = false;
            if (preference.Oooo0OO != null) {
                qa.OooO0o("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                return;
            }
            preference.Oooo0OO = (PreferenceScreen) this;
            if (this.OoooO) {
                preference.OooO();
            }
            m41 m41Var2 = this.Oooo0;
            if (m41Var2 != null) {
                Handler handler2 = m41Var2.OooO0oo;
                o00OOO00 o00ooo002 = m41Var2.OooO;
                handler2.removeCallbacks(o00ooo002);
                handler2.post(o00ooo002);
            }
        } catch (Throwable th) {
            preference.OooO0oO = false;
            throw th;
        }
    }

    public final Preference OooOoOO(CharSequence charSequence) {
        Preference preferenceOooOoOO;
        if (charSequence == null) {
            ra.OooOOO("Key cannot be null");
            return null;
        }
        if (TextUtils.equals(this.OooOOO, charSequence)) {
            return this;
        }
        int size = this.OoooO00.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceOooOoo0 = OooOoo0(i);
            if (TextUtils.equals(preferenceOooOoo0.OooOOO, charSequence)) {
                return preferenceOooOoo0;
            }
            if ((preferenceOooOoo0 instanceof PreferenceGroup) && (preferenceOooOoOO = ((PreferenceGroup) preferenceOooOoo0).OooOoOO(charSequence)) != null) {
                return preferenceOooOoOO;
            }
        }
        return null;
    }

    public final Preference OooOoo0(int i) {
        return (Preference) this.OoooO00.get(i);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
