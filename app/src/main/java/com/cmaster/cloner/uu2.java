package com.cmaster.cloner;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class uu2 {
    public static boolean OooO00o;
    public static Method OooO0O0;
    public static boolean OooO0OO;
    public static Field OooO0Oo;

    public static boolean OooO00o(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = nt1.OooO00o;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = mt1.OooO0Oo;
            mt1 mt1Var = (mt1) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (mt1Var == null) {
                mt1Var = new mt1();
                mt1Var.OooO00o = null;
                mt1Var.OooO0O0 = null;
                mt1Var.OooO0OO = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, mt1Var);
            }
            WeakReference weakReference2 = mt1Var.OooO0OO;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                mt1Var.OooO0OO = new WeakReference(keyEvent);
                if (mt1Var.OooO0O0 == null) {
                    mt1Var.OooO0O0 = new SparseArray();
                }
                SparseArray sparseArray = mt1Var.OooO0O0;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    ra.OooOO0o();
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean OooO0O0(al0 al0Var, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (al0Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return al0Var.OooO0o0(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!OooO00o) {
                            try {
                                OooO0O0 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            OooO00o = true;
                        }
                        Method method = OooO0O0;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (nt1.OooO0OO(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!OooO0OO) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        OooO0Oo = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    OooO0OO = true;
                }
                Field field = OooO0Oo;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (nt1.OooO0OO(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && nt1.OooO0OO(view, keyEvent)) || al0Var.OooO0o0(keyEvent)) {
                return true;
            }
        }
        return false;
    }
}
