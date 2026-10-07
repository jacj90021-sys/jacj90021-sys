package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class nt1 {
    public static WeakHashMap OooO00o;
    public static Field OooO0O0;
    public static boolean OooO0OO;
    public static final int[] OooO0Oo = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final at1 OooO0o0 = new at1();
    public static final ct1 OooO0o = new ct1();

    /* JADX WARN: Multi-variable type inference failed */
    public static ri OooO(View view, ri riVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + riVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return lt1.OooO0O0(view, riVar);
        }
        rm1 rm1Var = (rm1) view.getTag(R.id.tag_on_receive_content_listener);
        iz0 iz0Var = OooO0o0;
        if (rm1Var == null) {
            if (view instanceof iz0) {
                iz0Var = (iz0) view;
            }
            return iz0Var.OooO00o(riVar);
        }
        ri riVarOooO00o = rm1.OooO00o(view, riVar);
        if (riVarOooO00o == null) {
            return null;
        }
        if (view instanceof iz0) {
            iz0Var = (iz0) view;
        }
        return iz0Var.OooO00o(riVarOooO00o);
    }

    public static gu1 OooO00o(View view) {
        if (OooO00o == null) {
            OooO00o = new WeakHashMap();
        }
        gu1 gu1Var = (gu1) OooO00o.get(view);
        if (gu1Var != null) {
            return gu1Var;
        }
        gu1 gu1Var2 = new gu1(view);
        OooO00o.put(view, gu1Var2);
        return gu1Var2;
    }

    public static void OooO0O0(View view, qz1 qz1Var) {
        WindowInsets windowInsetsOooO0o = qz1Var.OooO0o();
        if (windowInsetsOooO0o != null) {
            WindowInsets windowInsetsOooO00o = Build.VERSION.SDK_INT >= 30 ? kt1.OooO00o(view, windowInsetsOooO0o) : dt1.OooO00o(view, windowInsetsOooO0o);
            if (windowInsetsOooO00o.equals(windowInsetsOooO0o)) {
                return;
            }
            qz1.OooO0oO(windowInsetsOooO00o, view);
        }
    }

    public static boolean OooO0OO(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = mt1.OooO0Oo;
        mt1 mt1Var = (mt1) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (mt1Var == null) {
            mt1Var = new mt1();
            mt1Var.OooO00o = null;
            mt1Var.OooO0O0 = null;
            mt1Var.OooO0OO = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, mt1Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = mt1Var.OooO00o;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = mt1.OooO0Oo;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (mt1Var.OooO00o == null) {
                            mt1Var.OooO00o = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = mt1.OooO0Oo;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                mt1Var.OooO00o.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    mt1Var.OooO00o.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewOooO00o = mt1Var.OooO00o(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewOooO00o != null && !KeyEvent.isModifierKey(keyCode)) {
                if (mt1Var.OooO0O0 == null) {
                    mt1Var.OooO0O0 = new SparseArray();
                }
                mt1Var.OooO0O0.put(keyCode, new WeakReference(viewOooO00o));
            }
        }
        return viewOooO00o != null;
    }

    public static View.AccessibilityDelegate OooO0Oo(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return jt1.OooO00o(view);
        }
        if (OooO0OO) {
            return null;
        }
        if (OooO0O0 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                OooO0O0 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                OooO0OO = true;
                return null;
            }
        }
        try {
            Object obj = OooO0O0.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            OooO0OO = true;
            return null;
        }
    }

    public static ArrayList OooO0o(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static CharSequence OooO0o0(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = it1.OooO00o(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static String[] OooO0oO(q qVar) {
        return Build.VERSION.SDK_INT >= 31 ? lt1.OooO00o(qVar) : (String[]) qVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void OooO0oo(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = OooO0o0(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(OooO0o0(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(OooO0o0(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static void OooOO0(View view, int i) {
        ArrayList arrayListOooO0o = OooO0o(view);
        for (int i2 = 0; i2 < arrayListOooO0o.size(); i2++) {
            if (((o000) arrayListOooO0o.get(i2)).OooO00o() == i) {
                arrayListOooO0o.remove(i2);
                return;
            }
        }
    }

    public static void OooOO0O(View view, o000 o000Var, o00 o00Var) {
        o000 o000Var2 = new o000(null, o000Var.OooO0O0, null, o00Var, o000Var.OooO0OO);
        View.AccessibilityDelegate accessibilityDelegateOooO0Oo = OooO0Oo(view);
        o0000O00 o0000o00 = accessibilityDelegateOooO0Oo == null ? null : accessibilityDelegateOooO0Oo instanceof o0000 ? ((o0000) accessibilityDelegateOooO0Oo).OooO00o : new o0000O00(accessibilityDelegateOooO0Oo);
        if (o0000o00 == null) {
            o0000o00 = new o0000O00();
        }
        OooOOO0(view, o0000o00);
        OooOO0(view, o000Var2.OooO00o());
        OooO0o(view).add(o000Var2);
        OooO0oo(view, 0);
    }

    public static void OooOO0o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            jt1.OooO0O0(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void OooOOO(View view, CharSequence charSequence) {
        new bt1(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).OooO0o(view, charSequence);
        ct1 ct1Var = OooO0o;
        if (charSequence == null) {
            ct1Var.OooO0Oo.remove(view);
            view.removeOnAttachStateChangeListener(ct1Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(ct1Var);
        } else {
            ct1Var.OooO0Oo.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(ct1Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(ct1Var);
            }
        }
    }

    public static void OooOOO0(View view, o0000O00 o0000o00) {
        if (o0000o00 == null && (OooO0Oo(view) instanceof o0000)) {
            o0000o00 = new o0000O00();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(o0000o00 == null ? null : o0000o00.OooO0O0);
    }
}
