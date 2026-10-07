package com.cmaster.cloner;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bi1 extends SpannableStringBuilder {
    public final Class OooO0Oo;
    public final ArrayList OooO0o0;

    public bi1(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.OooO0o0 = new ArrayList();
        fy2.OooO00o(cls, "watcherClass cannot be null");
        this.OooO0Oo = cls;
    }

    public final void OooO00o() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooO0o0;
            if (i >= arrayList.size()) {
                return;
            }
            ((ai1) arrayList.get(i)).OooO0o0.incrementAndGet();
            i++;
        }
    }

    public final void OooO0O0() {
        OooO0o0();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooO0o0;
            if (i >= arrayList.size()) {
                return;
            }
            ((ai1) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final ai1 OooO0OO(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooO0o0;
            if (i >= arrayList.size()) {
                return null;
            }
            ai1 ai1Var = (ai1) arrayList.get(i);
            if (ai1Var.OooO0Oo == obj) {
                return ai1Var;
            }
            i++;
        }
    }

    public final boolean OooO0Oo(Object obj) {
        if (obj != null) {
            return this.OooO0Oo == obj.getClass();
        }
        return false;
    }

    public final void OooO0o0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooO0o0;
            if (i >= arrayList.size()) {
                return;
            }
            ((ai1) arrayList.get(i)).OooO0o0.decrementAndGet();
            i++;
        }
    }



    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        ai1 ai1VarOooO0OO;
        if (OooO0Oo(obj) && (ai1VarOooO0OO = OooO0OO(obj)) != null) {
            obj = ai1VarOooO0OO;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        ai1 ai1VarOooO0OO;
        if (OooO0Oo(obj) && (ai1VarOooO0OO = OooO0OO(obj)) != null) {
            obj = ai1VarOooO0OO;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        ai1 ai1VarOooO0OO;
        if (OooO0Oo(obj) && (ai1VarOooO0OO = OooO0OO(obj)) != null) {
            obj = ai1VarOooO0OO;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.OooO0Oo != cls) {
            return super.getSpans(i, i2, cls);
        }
        ai1[] ai1VarArr = (ai1[]) super.getSpans(i, i2, ai1.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, ai1VarArr.length);
        for (int i3 = 0; i3 < ai1VarArr.length; i3++) {
            objArr[i3] = ai1VarArr[i3].OooO0Oo;
        }
        return objArr;
    }


    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.OooO0Oo == cls) {
            cls = ai1.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        ai1 ai1VarOooO0OO;
        if (OooO0Oo(obj)) {
            ai1VarOooO0OO = OooO0OO(obj);
            if (ai1VarOooO0OO != null) {
                obj = ai1VarOooO0OO;
            }
        } else {
            ai1VarOooO0OO = null;
        }
        super.removeSpan(obj);
        if (ai1VarOooO0OO != null) {
            this.OooO0o0.remove(ai1VarOooO0OO);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        OooO00o();
        super.replace(i, i2, charSequence);
        OooO0o0();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (OooO0Oo(obj)) {
            ai1 ai1Var = new ai1(obj);
            this.OooO0o0.add(ai1Var);
            obj = ai1Var;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new bi1(this.OooO0Oo, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }



    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }




    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        OooO00o();
        super.replace(i, i2, charSequence, i3, i4);
        OooO0o0();
        return this;
    }

    public bi1(Class cls, bi1 bi1Var, int i, int i2) {
        super(bi1Var, i, i2);
        this.OooO0o0 = new ArrayList();
        fy2.OooO00o(cls, "watcherClass cannot be null");
        this.OooO0Oo = cls;
    }
}
