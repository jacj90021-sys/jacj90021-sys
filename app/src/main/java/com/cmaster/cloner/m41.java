package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m41 extends a71 {
    public final PreferenceGroup OooO0Oo;
    public ArrayList OooO0o;
    public ArrayList OooO0o0;
    public final ArrayList OooO0oO;
    public final o00OOO00 OooO = new o00OOO00(this, 28);
    public final Handler OooO0oo = new Handler(Looper.getMainLooper());

    public m41(PreferenceGroup preferenceGroup) {
        this.OooO0Oo = preferenceGroup;
        preferenceGroup.Oooo0 = this;
        this.OooO0o0 = new ArrayList();
        this.OooO0o = new ArrayList();
        this.OooO0oO = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            boolean z = ((PreferenceScreen) preferenceGroup).o000oOoO;
            if (this.OooO00o.OooO00o()) {
                qa.OooO0o("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
                throw null;
            }
            this.OooO0O0 = z;
        } else {
            if (this.OooO00o.OooO00o()) {
                qa.OooO0o("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
                throw null;
            }
            this.OooO0O0 = true;
        }
        OooOOOO();
    }

    @Override // com.cmaster.cloner.a71
    public final int OooO00o() {
        return this.OooO0o.size();
    }

    @Override // com.cmaster.cloner.a71
    public final long OooO0O0(int i) {
        if (this.OooO0O0) {
            return OooOOO(i).OooO0OO();
        }
        return -1L;
    }

    @Override // com.cmaster.cloner.a71
    public final int OooO0OO(int i) {
        l41 l41Var = new l41(OooOOO(i));
        ArrayList arrayList = this.OooO0oO;
        int iIndexOf = arrayList.indexOf(l41Var);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(l41Var);
        return size;
    }

    @Override // com.cmaster.cloner.a71
    public final void OooO0o0(y71 y71Var, int i) {
        q41 q41Var = (q41) y71Var;
        Preference preferenceOooOOO = OooOOO(i);
        ColorStateList colorStateList = q41Var.OooOo0O;
        View view = q41Var.OooO00o;
        Drawable background = view.getBackground();
        Drawable drawable = q41Var.OooOo0;
        if (background != drawable) {
            WeakHashMap weakHashMap = nt1.OooO00o;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) q41Var.OooOOoo(android.R.id.title);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceOooOOO.OooOO0O(q41Var);
    }

    @Override // com.cmaster.cloner.a71
    public final y71 OooO0oO(ViewGroup viewGroup, int i) {
        l41 l41Var = (l41) this.OooO0oO.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, i61.OooO00o);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = ym2.OooO00o(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(l41Var.OooO00o, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap weakHashMap = nt1.OooO00o;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = l41Var.OooO0O0;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new q41(viewInflate);
    }

    public final ArrayList OooOO0o(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.OoooO00.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            CharSequence string = null;
            if (i >= size) {
                int i3 = preferenceGroup.OoooOO0;
                if (i3 != Integer.MAX_VALUE && i2 > i3) {
                    Context context = preferenceGroup.OooO0Oo;
                    long j = preferenceGroup.OooO0o;
                    ay ayVar = new ay(context, null);
                    ayVar.Oooo00O = R.layout.expand_button;
                    Context context2 = ayVar.OooO0Oo;
                    ayVar.OooOo0(ym2.OooO00o(context2, R.drawable.ic_arrow_down_24dp));
                    ayVar.OooOO0o = R.drawable.ic_arrow_down_24dp;
                    ayVar.OooOo0o(context2.getString(R.string.expand_button_title));
                    if (999 != ayVar.OooO) {
                        ayVar.OooO = 999;
                        m41 m41Var = ayVar.Oooo0;
                        if (m41Var != null) {
                            Handler handler = m41Var.OooO0oo;
                            o00OOO00 o00ooo00 = m41Var.OooO;
                            handler.removeCallbacks(o00ooo00);
                            handler.post(o00ooo00);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj = arrayList2.get(i4);
                        i4++;
                        Preference preference = (Preference) obj;
                        CharSequence charSequence = preference.OooOO0;
                        boolean z = preference instanceof PreferenceGroup;
                        if (z && !TextUtils.isEmpty(charSequence)) {
                            arrayList3.add((PreferenceGroup) preference);
                        }
                        if (arrayList3.contains(preference.Oooo0OO)) {
                            if (z) {
                                arrayList3.add((PreferenceGroup) preference);
                            }
                        } else if (!TextUtils.isEmpty(charSequence)) {
                            string = string == null ? charSequence : context2.getString(R.string.summary_collapsed_preference_list, string, charSequence);
                        }
                    }
                    ayVar.OooOo0O(string);
                    ayVar.Oooo = j + 1000000;
                    ayVar.OooO0oo = new e81(this, preferenceGroup, 24, false);
                    arrayList.add(ayVar);
                }
                return arrayList;
            }
            Preference preferenceOooOoo0 = preferenceGroup.OooOoo0(i);
            if (preferenceOooOoo0.OooOoO0) {
                int i5 = preferenceGroup.OoooOO0;
                if (i5 == Integer.MAX_VALUE || i2 < i5) {
                    arrayList.add(preferenceOooOoo0);
                } else {
                    arrayList2.add(preferenceOooOoo0);
                }
                if (preferenceOooOoo0 instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceOooOoo0;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.OoooOO0 != Integer.MAX_VALUE && preferenceGroup2.OoooOO0 != Integer.MAX_VALUE) {
                            qa.OooO0o("Nesting an expandable group inside of another expandable group is not supported!");
                            return null;
                        }
                        ArrayList arrayListOooOO0o = OooOO0o(preferenceGroup2);
                        int size3 = arrayListOooOO0o.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            Object obj2 = arrayListOooOO0o.get(i6);
                            i6++;
                            Preference preference2 = (Preference) obj2;
                            int i7 = preferenceGroup.OoooOO0;
                            if (i7 == Integer.MAX_VALUE || i2 < i7) {
                                arrayList.add(preference2);
                            } else {
                                arrayList2.add(preference2);
                            }
                            i2++;
                        }
                    }
                } else {
                    i2++;
                }
            }
            i++;
        }
    }

    public final Preference OooOOO(int i) {
        if (i < 0 || i >= this.OooO0o.size()) {
            return null;
        }
        return (Preference) this.OooO0o.get(i);
    }

    public final void OooOOO0(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.OoooO00);
        }
        int size = preferenceGroup.OoooO00.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceOooOoo0 = preferenceGroup.OooOoo0(i);
            arrayList.add(preferenceOooOoo0);
            l41 l41Var = new l41(preferenceOooOoo0);
            if (!this.OooO0oO.contains(l41Var)) {
                this.OooO0oO.add(l41Var);
            }
            if (preferenceOooOoo0 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceOooOoo0;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    OooOOO0(arrayList, preferenceGroup2);
                }
            }
            preferenceOooOoo0.Oooo0 = this;
        }
    }

    public final void OooOOOO() {
        ArrayList arrayList = this.OooO0o0;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Preference) obj).Oooo0 = null;
        }
        ArrayList arrayList2 = new ArrayList(this.OooO0o0.size());
        this.OooO0o0 = arrayList2;
        PreferenceGroup preferenceGroup = this.OooO0Oo;
        OooOOO0(arrayList2, preferenceGroup);
        this.OooO0o = OooOO0o(preferenceGroup);
        this.OooO00o.OooO0O0();
        ArrayList arrayList3 = this.OooO0o0;
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            ((Preference) obj2).getClass();
        }
    }
}
