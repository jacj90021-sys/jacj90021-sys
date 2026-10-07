package com.cmaster.cloner;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b7 extends o0000O00 {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ b7(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // com.cmaster.cloner.o0000O00
    public void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.OooO0Oo) {
            case 2:
                super.OooO0OO(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.OooO0o0).OooO0oO);
                break;
            default:
                super.OooO0OO(view, accessibilityEvent);
                break;
        }
    }

    @Override // com.cmaster.cloner.o0000O00
    public final void OooO0Oo(View view, o000O00O o000o00o) {
        int i = this.OooO0Oo;
        View.AccessibilityDelegate accessibilityDelegate = this.OooO00o;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = o000o00o.OooO00o;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.addAction(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = o000o00o.OooO00o;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (!((sl) obj).OooOOO0) {
                    accessibilityNodeInfo2.setDismissable(false);
                    break;
                } else {
                    accessibilityNodeInfo2.addAction(1048576);
                    accessibilityNodeInfo2.setDismissable(true);
                    break;
                }
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = o000o00o.OooO00o;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.OooO0oo);
                accessibilityNodeInfo3.setChecked(checkableImageButton.OooO0oO);
                break;
            default:
                o41 o41Var = (o41) obj;
                o41Var.OooO0oO.OooO0Oo(view, o000o00o);
                RecyclerView recyclerView = o41Var.OooO0o;
                recyclerView.getClass();
                y71 y71VarOooo0oo = RecyclerView.Oooo0oo(view);
                int iOooO0O0 = y71VarOooo0oo != null ? y71VarOooo0oo.OooO0O0() : -1;
                a71 adapter = recyclerView.getAdapter();
                if (adapter instanceof m41) {
                    ((m41) adapter).OooOOO(iOooO0O0);
                    break;
                }
                break;
        }
    }

    @Override // com.cmaster.cloner.o0000O00
    public boolean OooO0oO(View view, int i, Bundle bundle) {
        int i2 = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i2) {
            case 0:
                if (i != 1048576) {
                    return super.OooO0oO(view, i, bundle);
                }
                ((th1) ((f7) obj)).OooO00o(3);
                return true;
            case 1:
                if (i == 1048576) {
                    sl slVar = (sl) obj;
                    if (slVar.OooOOO0) {
                        slVar.cancel();
                        return true;
                    }
                }
                return super.OooO0oO(view, i, bundle);
            case 2:
            default:
                return super.OooO0oO(view, i, bundle);
            case 3:
                return ((o41) obj).OooO0oO.OooO0oO(view, i, bundle);
        }
    }
}
