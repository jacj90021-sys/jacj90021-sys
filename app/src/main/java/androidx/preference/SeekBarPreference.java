package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import com.cmaster.cloner.R;
import com.cmaster.cloner.i61;
import com.cmaster.cloner.je1;
import com.cmaster.cloner.ke1;
import com.cmaster.cloner.le1;
import com.cmaster.cloner.q41;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int Oooo;
    public boolean OoooO;
    public int OoooO0;
    public int OoooO00;
    public int OoooO0O;
    public SeekBar OoooOO0;
    public final boolean OoooOOO;
    public final boolean OoooOOo;
    public final boolean OoooOo0;
    public final je1 OoooOoO;
    public final ke1 OoooOoo;
    public TextView o000oOoO;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        this.OoooOoO = new je1(this);
        this.OoooOoo = new ke1(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i61.OooOO0O, R.attr.seekBarPreferenceStyle, 0);
        this.OoooO00 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.OoooO00;
        i = i < i2 ? i2 : i;
        if (i != this.OoooO0) {
            this.OoooO0 = i;
            OooO0oO();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.OoooO0O) {
            this.OoooO0O = Math.min(this.OoooO0 - this.OoooO00, Math.abs(i3));
            OooO0oO();
        }
        this.OoooOOO = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.OoooOOo = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.OoooOo0 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void OooOO0O(q41 q41Var) {
        super.OooOO0O(q41Var);
        q41Var.OooO00o.setOnKeyListener(this.OoooOoo);
        this.OoooOO0 = (SeekBar) q41Var.OooOOoo(R.id.seekbar);
        TextView textView = (TextView) q41Var.OooOOoo(R.id.seekbar_value);
        this.o000oOoO = textView;
        if (this.OoooOOo) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.o000oOoO = null;
        }
        SeekBar seekBar = this.OoooOO0;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.OoooOoO);
        this.OoooOO0.setMax(this.OoooO0 - this.OoooO00);
        int i = this.OoooO0O;
        SeekBar seekBar2 = this.OoooOO0;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.OoooO0O = seekBar2.getKeyProgressIncrement();
        }
        this.OoooOO0.setProgress(this.Oooo - this.OoooO00);
        int i2 = this.Oooo;
        TextView textView2 = this.o000oOoO;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.OoooOO0.setEnabled(OooO0o());
    }

    @Override // androidx.preference.Preference
    public final Object OooOOO(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void OooOOOO(Parcelable parcelable) {
        if (!parcelable.getClass().equals(le1.class)) {
            super.OooOOOO(parcelable);
            return;
        }
        le1 le1Var = (le1) parcelable;
        super.OooOOOO(le1Var.getSuperState());
        this.Oooo = le1Var.OooO0Oo;
        this.OoooO00 = le1Var.OooO0o0;
        this.OoooO0 = le1Var.OooO0o;
        OooO0oO();
    }

    @Override // androidx.preference.Preference
    public final Parcelable OooOOOo() {
        super.OooOOOo();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.OooOo00) {
            return absSavedState;
        }
        le1 le1Var = new le1();
        le1Var.OooO0Oo = this.Oooo;
        le1Var.OooO0o0 = this.OoooO00;
        le1Var.OooO0o = this.OoooO0;
        return le1Var;
    }

    @Override // androidx.preference.Preference
    public final void OooOOo0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (OooOoO0()) {
            iIntValue = this.OooO0o0.OooO00o().getInt(this.OooOOO, iIntValue);
        }
        OooOoO(iIntValue, true);
    }

    public final void OooOoO(int i, boolean z) {
        int i2 = this.OoooO00;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.OoooO0;
        if (i > i3) {
            i = i3;
        }
        if (i != this.Oooo) {
            this.Oooo = i;
            TextView textView = this.o000oOoO;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (OooOoO0()) {
                int i4 = ~i;
                boolean zOooOoO0 = OooOoO0();
                String str = this.OooOOO;
                if (zOooOoO0) {
                    i4 = this.OooO0o0.OooO00o().getInt(str, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor editorEdit = this.OooO0o0.OooO00o().edit();
                    editorEdit.putInt(str, i);
                    this.OooO0o0.getClass();
                    editorEdit.apply();
                }
            }
            if (z) {
                OooO0oO();
            }
        }
    }
}
