package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.cmaster.cloner.R;
import com.cmaster.cloner.d41;
import com.cmaster.cloner.e41;
import com.cmaster.cloner.e53;
import com.cmaster.cloner.e81;
import com.cmaster.cloner.f20;
import com.cmaster.cloner.i61;
import com.cmaster.cloner.k20;
import com.cmaster.cloner.k5;
import com.cmaster.cloner.m41;
import com.cmaster.cloner.n41;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.o00O00O;
import com.cmaster.cloner.o00OOO00;
import com.cmaster.cloner.o10;
import com.cmaster.cloner.q41;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.ra;
import com.cmaster.cloner.ym2;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public int OooO;
    public final Context OooO0Oo;
    public long OooO0o;
    public n41 OooO0o0;
    public boolean OooO0oO;
    public e81 OooO0oo;
    public CharSequence OooOO0;
    public CharSequence OooOO0O;
    public int OooOO0o;
    public final String OooOOO;
    public Drawable OooOOO0;
    public Intent OooOOOO;
    public final String OooOOOo;
    public final boolean OooOOo;
    public Bundle OooOOo0;
    public final boolean OooOOoo;
    public boolean OooOo;
    public final String OooOo0;
    public final boolean OooOo00;
    public final Object OooOo0O;
    public boolean OooOo0o;
    public final boolean OooOoO;
    public final boolean OooOoO0;
    public final boolean OooOoOO;
    public final boolean OooOoo;
    public final boolean OooOoo0;
    public final boolean OooOooO;
    public final boolean OooOooo;
    public m41 Oooo0;
    public final boolean Oooo000;
    public int Oooo00O;
    public final int Oooo00o;
    public ArrayList Oooo0O0;
    public PreferenceScreen Oooo0OO;
    public d41 Oooo0o;
    public boolean Oooo0o0;
    public e41 Oooo0oO;
    public final o00O00O Oooo0oo;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.OooO = Integer.MAX_VALUE;
        this.OooOOo = true;
        this.OooOOoo = true;
        this.OooOo00 = true;
        this.OooOo0o = true;
        this.OooOo = true;
        this.OooOoO0 = true;
        this.OooOoO = true;
        this.OooOoOO = true;
        this.OooOoo = true;
        this.Oooo000 = true;
        this.Oooo00O = R.layout.preference;
        this.Oooo0oo = new o00O00O(this, 3);
        this.OooO0Oo = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i61.OooO0oO, i, 0);
        this.OooOO0o = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.OooOOO = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.OooOO0 = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.OooOO0O = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.OooO = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.OooOOOo = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.Oooo00O = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.Oooo00o = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.OooOOo = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.OooOOoo = z;
        this.OooOo00 = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.OooOo0 = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.OooOoO = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z));
        this.OooOoOO = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.OooOo0O = OooOOO(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.OooOo0O = OooOOO(typedArrayObtainStyledAttributes, 11);
        }
        this.Oooo000 = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.OooOoo0 = zHasValue;
        if (zHasValue) {
            this.OooOoo = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.OooOooO = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.OooOoO0 = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.OooOooo = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void OooOo00(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                OooOo00(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void OooO() {
        PreferenceScreen preferenceScreen;
        String str = this.OooOo0;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        n41 n41Var = this.OooO0o0;
        Preference preferenceOooOoOO = null;
        if (n41Var != null && (preferenceScreen = n41Var.OooO0o0) != null) {
            preferenceOooOoOO = preferenceScreen.OooOoOO(str);
        }
        if (preferenceOooOoOO == null) {
            throw new IllegalStateException("Dependency \"" + str + "\" not found for preference \"" + this.OooOOO + "\" (title: \"" + ((Object) this.OooOO0) + "\"");
        }
        if (preferenceOooOoOO.Oooo0O0 == null) {
            preferenceOooOoOO.Oooo0O0 = new ArrayList();
        }
        preferenceOooOoOO.Oooo0O0.add(this);
        boolean zOooOo = preferenceOooOoOO.OooOo();
        if (this.OooOo0o == zOooOo) {
            this.OooOo0o = !zOooOo;
            OooO0oo(OooOo());
            OooO0oO();
        }
    }

    public void OooO00o(Bundle bundle) {
        Parcelable parcelable;
        String str = this.OooOOO;
        if (TextUtils.isEmpty(str) || (parcelable = bundle.getParcelable(str)) == null) {
            return;
        }
        this.Oooo0o0 = false;
        OooOOOO(parcelable);
        if (this.Oooo0o0) {
            return;
        }
        qa.OooO0o("Derived class did not call super.onRestoreInstanceState()");
    }

    public void OooO0O0(Bundle bundle) {
        String str = this.OooOOO;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.Oooo0o0 = false;
        Parcelable parcelableOooOOOo = OooOOOo();
        if (!this.Oooo0o0) {
            qa.OooO0o("Derived class did not call super.onSaveInstanceState()");
        } else if (parcelableOooOOOo != null) {
            bundle.putParcelable(str, parcelableOooOOOo);
        }
    }

    public long OooO0OO() {
        return this.OooO0o;
    }

    public final String OooO0Oo(String str) {
        return !OooOoO0() ? str : this.OooO0o0.OooO00o().getString(this.OooOOO, str);
    }

    public boolean OooO0o() {
        return this.OooOOo && this.OooOo0o && this.OooOo;
    }

    public CharSequence OooO0o0() {
        e41 e41Var = this.Oooo0oO;
        return e41Var != null ? e41Var.OooO(this) : this.OooOO0O;
    }

    public void OooO0oO() {
        int iIndexOf;
        m41 m41Var = this.Oooo0;
        if (m41Var == null || (iIndexOf = m41Var.OooO0o.indexOf(this)) == -1) {
            return;
        }
        m41Var.OooO00o.OooO0Oo(iIndexOf, 1, this);
    }

    public void OooO0oo(boolean z) {
        ArrayList arrayList = this.Oooo0O0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.OooOo0o == z) {
                preference.OooOo0o = !z;
                preference.OooO0oo(preference.OooOo());
                preference.OooO0oO();
            }
        }
    }

    public final void OooOO0(n41 n41Var) {
        long j;
        this.OooO0o0 = n41Var;
        if (!this.OooO0oO) {
            synchronized (n41Var) {
                j = n41Var.OooO0O0;
                n41Var.OooO0O0 = 1 + j;
            }
            this.OooO0o = j;
        }
        if (OooOoO0()) {
            n41 n41Var2 = this.OooO0o0;
            if ((n41Var2 != null ? n41Var2.OooO00o() : null).contains(this.OooOOO)) {
                OooOOo0(null);
                return;
            }
        }
        Object obj = this.OooOo0O;
        if (obj != null) {
            OooOOo0(obj);
        }
    }

    public void OooOO0O(q41 q41Var) {
        Integer numValueOf;
        View view = q41Var.OooO00o;
        view.setOnClickListener(this.Oooo0oo);
        view.setId(0);
        TextView textView = (TextView) q41Var.OooOOoo(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceOooO0o0 = OooO0o0();
            if (TextUtils.isEmpty(charSequenceOooO0o0)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceOooO0o0);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) q41Var.OooOOoo(android.R.id.title);
        boolean z = this.OooOOoo;
        if (textView2 != null) {
            CharSequence charSequence = this.OooOO0;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.OooOoo0) {
                    textView2.setSingleLine(this.OooOoo);
                }
                if (!z && OooO0o() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) q41Var.OooOOoo(android.R.id.icon);
        boolean z2 = this.OooOooO;
        if (imageView != null) {
            int i = this.OooOO0o;
            if (i != 0 || this.OooOOO0 != null) {
                if (this.OooOOO0 == null) {
                    this.OooOOO0 = ym2.OooO00o(this.OooO0Oo, i);
                }
                Drawable drawable = this.OooOOO0;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.OooOOO0 != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z2 ? 4 : 8);
            }
        }
        View viewOooOOoo = q41Var.OooOOoo(R.id.icon_frame);
        if (viewOooOOoo == null) {
            viewOooOOoo = q41Var.OooOOoo(android.R.id.icon_frame);
        }
        if (viewOooOOoo != null) {
            if (this.OooOOO0 != null) {
                viewOooOOoo.setVisibility(0);
            } else {
                viewOooOOoo.setVisibility(z2 ? 4 : 8);
            }
        }
        if (this.Oooo000) {
            OooOo00(view, OooO0o());
        } else {
            OooOo00(view, true);
        }
        view.setFocusable(z);
        view.setClickable(z);
        q41Var.OooOo = this.OooOoO;
        q41Var.OooOoO0 = this.OooOoOO;
        boolean z3 = this.OooOooo;
        if (z3 && this.Oooo0o == null) {
            this.Oooo0o = new d41(this);
        }
        view.setOnCreateContextMenuListener(z3 ? this.Oooo0o : null);
        view.setLongClickable(z3);
        if (!z3 || z) {
            return;
        }
        WeakHashMap weakHashMap = nt1.OooO00o;
        view.setBackground(null);
    }

    public void OooOO0o() {
    }

    public Object OooOOO(TypedArray typedArray, int i) {
        return null;
    }

    public void OooOOO0() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.OooOo0;
        if (str != null) {
            n41 n41Var = this.OooO0o0;
            Preference preferenceOooOoOO = null;
            if (n41Var != null && (preferenceScreen = n41Var.OooO0o0) != null) {
                preferenceOooOoOO = preferenceScreen.OooOoOO(str);
            }
            if (preferenceOooOoOO == null || (arrayList = preferenceOooOoOO.Oooo0O0) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public void OooOOOO(Parcelable parcelable) {
        this.Oooo0o0 = true;
        if (parcelable == AbsSavedState.EMPTY_STATE || parcelable == null) {
            return;
        }
        ra.OooOOO("Wrong state class -- expecting Preference State");
    }

    public Parcelable OooOOOo() {
        this.Oooo0o0 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void OooOOo(View view) {
        o10 o10Var;
        String str;
        if (OooO0o() && this.OooOOoo) {
            OooOO0o();
            e81 e81Var = this.OooO0oo;
            if (e81Var != null) {
                ((PreferenceGroup) e81Var.OooO0o0).OoooOO0 = Integer.MAX_VALUE;
                m41 m41Var = (m41) e81Var.OooO0o;
                Handler handler = m41Var.OooO0oo;
                o00OOO00 o00ooo00 = m41Var.OooO;
                handler.removeCallbacks(o00ooo00);
                handler.post(o00ooo00);
                return;
            }
            n41 n41Var = this.OooO0o0;
            if (n41Var == null || (o10Var = n41Var.OooO0o) == null || (str = this.OooOOOo) == null) {
                Intent intent = this.OooOOOO;
                if (intent != null) {
                    this.OooO0Oo.startActivity(intent);
                    return;
                }
                return;
            }
            for (o10 o10Var2 = o10Var; o10Var2 != null; o10Var2 = o10Var2.OooOo) {
            }
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            k20 k20VarOooOOO0 = o10Var.OooOOO0();
            if (this.OooOOo0 == null) {
                this.OooOOo0 = new Bundle();
            }
            Bundle bundle = this.OooOOo0;
            f20 f20VarOooOoo = k20VarOooOOO0.OooOoo();
            o10Var.Oooo0oO().getClassLoader();
            o10 o10VarOooO00o = f20VarOooOoo.OooO00o(str);
            o10VarOooO00o.OoooO0O(bundle);
            o10VarOooO00o.OoooOO0(o10Var);
            k5 k5Var = new k5(k20VarOooOOO0);
            int id = ((View) o10Var.OoooO00().getParent()).getId();
            if (id == 0) {
                ra.OooOOO("Must use non-zero containerViewId");
                return;
            }
            k5Var.OooO0o0(id, o10VarOooO00o, null, 2);
            if (!k5Var.OooO0oo) {
                qa.OooO0o("This FragmentTransaction is not allowed to be added to the back stack.");
                return;
            }
            k5Var.OooO0oO = true;
            k5Var.OooO = null;
            k5Var.OooO0Oo(false);
        }
    }

    public void OooOOo0(Object obj) {
    }

    public final void OooOOoo(String str) {
        if (OooOoO0() && !TextUtils.equals(str, OooO0Oo(null))) {
            SharedPreferences.Editor editorEdit = this.OooO0o0.OooO00o().edit();
            editorEdit.putString(this.OooOOO, str);
            this.OooO0o0.getClass();
            editorEdit.apply();
        }
    }

    public boolean OooOo() {
        return !OooO0o();
    }

    public final void OooOo0(Drawable drawable) {
        if (this.OooOOO0 != drawable) {
            this.OooOOO0 = drawable;
            this.OooOO0o = 0;
            OooO0oO();
        }
    }

    public void OooOo0O(CharSequence charSequence) {
        if (this.Oooo0oO != null) {
            qa.OooO0o("Preference already has a SummaryProvider set.");
        } else {
            if (TextUtils.equals(this.OooOO0O, charSequence)) {
                return;
            }
            this.OooOO0O = charSequence;
            OooO0oO();
        }
    }

    public final void OooOo0o(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.OooOO0)) {
            return;
        }
        this.OooOO0 = charSequence;
        OooO0oO();
    }

    public final boolean OooOoO0() {
        return (this.OooO0o0 == null || !this.OooOo00 || TextUtils.isEmpty(this.OooOOO)) ? false : true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.OooO;
        int i2 = preference2.OooO;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.OooOO0;
        CharSequence charSequence2 = preference2.OooOO0;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.OooOO0.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.OooOO0;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceOooO0o0 = OooO0o0();
        if (!TextUtils.isEmpty(charSequenceOooO0o0)) {
            sb.append(charSequenceOooO0o0);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e53.OooO00o(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
