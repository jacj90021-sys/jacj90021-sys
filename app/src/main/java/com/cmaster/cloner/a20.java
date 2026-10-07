package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a20 implements LayoutInflater.Factory2 {
    public final k20 OooO0Oo;

    public a20(k20 k20Var) {
        this.OooO0Oo = k20Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        r20 r20VarOooO0o;
        boolean zEquals = s10.class.getName().equals(str);
        k20 k20Var = this.OooO0Oo;
        if (zEquals) {
            return new s10(context, attributeSet, k20Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h61.OooO00o);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = o10.class.isAssignableFrom(f20.OooO0O0(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    o10 o10VarOooOoO = resourceId != -1 ? k20Var.OooOoO(resourceId) : null;
                    if (o10VarOooOoO == null && string != null) {
                        o10VarOooOoO = k20Var.OooOoOO(string);
                    }
                    if (o10VarOooOoO == null && id != -1) {
                        o10VarOooOoO = k20Var.OooOoO(id);
                    }
                    if (o10VarOooOoO == null) {
                        f20 f20VarOooOoo = k20Var.OooOoo();
                        context.getClassLoader();
                        o10VarOooOoO = f20VarOooOoo.OooO00o(attributeValue);
                        o10VarOooOoO.OooOOOo = true;
                        o10VarOooOoO.OooOoO0 = resourceId != 0 ? resourceId : id;
                        o10VarOooOoO.OooOoO = id;
                        o10VarOooOoO.OooOoOO = string;
                        o10VarOooOoO.OooOOo0 = true;
                        o10VarOooOoO.OooOo0 = k20Var;
                        q10 q10Var = k20Var.OooOo00;
                        o10VarOooOoO.OooOo0O = q10Var;
                        oOOO00 oooo00 = q10Var.OooO0o0;
                        o10VarOooOoO.Oooo00O = true;
                        if ((q10Var == null ? null : q10Var.OooO0Oo) != null) {
                            o10VarOooOoO.Oooo00O = true;
                        }
                        r20VarOooO0o = k20Var.OooO00o(o10VarOooOoO);
                        if (k20.Oooo000(2)) {
                            Log.v("FragmentManager", "Fragment " + o10VarOooOoO + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (o10VarOooOoO.OooOOo0) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        o10VarOooOoO.OooOOo0 = true;
                        o10VarOooOoO.OooOo0 = k20Var;
                        q10 q10Var2 = k20Var.OooOo00;
                        o10VarOooOoO.OooOo0O = q10Var2;
                        oOOO00 oooo002 = q10Var2.OooO0o0;
                        o10VarOooOoO.Oooo00O = true;
                        if ((q10Var2 == null ? null : q10Var2.OooO0Oo) != null) {
                            o10VarOooOoO.Oooo00O = true;
                        }
                        r20VarOooO0o = k20Var.OooO0o(o10VarOooOoO);
                        if (k20.Oooo000(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + o10VarOooOoO + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    s20 s20Var = t20.OooO00o;
                    t20.OooO0O0(new u20(o10VarOooOoO, viewGroup, 0));
                    t20.OooO00o(o10VarOooOoO).getClass();
                    o10VarOooOoO.Oooo00o = viewGroup;
                    r20VarOooO0o.OooOO0O();
                    r20VarOooO0o.OooOO0();
                    View view2 = o10VarOooOoO.Oooo0;
                    if (view2 == null) {
                        qa.OooO0o(px0.OooOOOO("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (o10VarOooOoO.Oooo0.getTag() == null) {
                        o10VarOooOoO.Oooo0.setTag(string);
                    }
                    o10VarOooOoO.Oooo0.addOnAttachStateChangeListener(new z10(this, r20VarOooO0o));
                    return o10VarOooOoO.Oooo0;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
