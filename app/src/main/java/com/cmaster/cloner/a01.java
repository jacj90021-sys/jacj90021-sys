package com.cmaster.cloner;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a01 extends pu {
    public final /* synthetic */ int OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a01(i71 i71Var, int i) {
        super(i71Var);
        this.OooO0Oo = i;
    }

    @Override // com.cmaster.cloner.pu
    public final int OooO() {
        int i;
        int iOooo000;
        int i2 = this.OooO0Oo;
        Object obj = this.OooO0O0;
        switch (i2) {
            case 0:
                i71 i71Var = (i71) obj;
                i = i71Var.OooOOO;
                iOooo000 = i71Var.Oooo000();
                break;
            default:
                i71 i71Var2 = (i71) obj;
                i = i71Var2.OooOOOO;
                iOooo000 = i71Var2.OooOooO();
                break;
        }
        return i - iOooo000;
    }

    @Override // com.cmaster.cloner.pu
    public final int OooO0Oo(View view) {
        int right;
        int i;
        int i2 = this.OooO0Oo;
        Object obj = this.OooO0O0;
        switch (i2) {
            case 0:
                j71 j71Var = (j71) view.getLayoutParams();
                ((i71) obj).getClass();
                right = view.getRight() + ((j71) view.getLayoutParams()).OooO0O0.right;
                i = ((ViewGroup.MarginLayoutParams) j71Var).rightMargin;
                break;
            default:
                j71 j71Var2 = (j71) view.getLayoutParams();
                ((i71) obj).getClass();
                right = view.getBottom() + ((j71) view.getLayoutParams()).OooO0O0.bottom;
                i = ((ViewGroup.MarginLayoutParams) j71Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // com.cmaster.cloner.pu
    public final int OooO0o(View view) {
        int iOooOoO;
        int i;
        int i2 = this.OooO0Oo;
        Object obj = this.OooO0O0;
        switch (i2) {
            case 0:
                j71 j71Var = (j71) view.getLayoutParams();
                ((i71) obj).getClass();
                iOooOoO = i71.OooOoO(view) + ((ViewGroup.MarginLayoutParams) j71Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) j71Var).bottomMargin;
                break;
            default:
                j71 j71Var2 = (j71) view.getLayoutParams();
                ((i71) obj).getClass();
                iOooOoO = i71.OooOoOO(view) + ((ViewGroup.MarginLayoutParams) j71Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) j71Var2).rightMargin;
                break;
        }
        return iOooOoO + i;
    }

    @Override // com.cmaster.cloner.pu
    public final int OooO0o0(View view) {
        int iOooOoOO;
        int i;
        int i2 = this.OooO0Oo;
        Object obj = this.OooO0O0;
        switch (i2) {
            case 0:
                j71 j71Var = (j71) view.getLayoutParams();
                ((i71) obj).getClass();
                iOooOoOO = i71.OooOoOO(view) + ((ViewGroup.MarginLayoutParams) j71Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) j71Var).rightMargin;
                break;
            default:
                j71 j71Var2 = (j71) view.getLayoutParams();
                ((i71) obj).getClass();
                iOooOoOO = i71.OooOoO(view) + ((ViewGroup.MarginLayoutParams) j71Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) j71Var2).bottomMargin;
                break;
        }
        return iOooOoOO + i;
    }

    @Override // com.cmaster.cloner.pu
    public final int OooO0oO(View view) {
        int left;
        int i;
        int i2 = this.OooO0Oo;
        Object obj = this.OooO0O0;
        switch (i2) {
            case 0:
                j71 j71Var = (j71) view.getLayoutParams();
                ((i71) obj).getClass();
                left = view.getLeft() - ((j71) view.getLayoutParams()).OooO0O0.left;
                i = ((ViewGroup.MarginLayoutParams) j71Var).leftMargin;
                break;
            default:
                j71 j71Var2 = (j71) view.getLayoutParams();
                ((i71) obj).getClass();
                left = i71.OooOoo0(view);
                i = ((ViewGroup.MarginLayoutParams) j71Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // com.cmaster.cloner.pu
    public final int OooO0oo() {
        switch (this.OooO0Oo) {
            case 0:
                return ((i71) this.OooO0O0).OooOOO;
            default:
                return ((i71) this.OooO0O0).OooOOOO;
        }
    }

    @Override // com.cmaster.cloner.pu
    public final int OooOO0() {
        switch (this.OooO0Oo) {
            case 0:
                return ((i71) this.OooO0O0).Oooo000();
            default:
                return ((i71) this.OooO0O0).OooOooO();
        }
    }

    @Override // com.cmaster.cloner.pu
    public final int OooOO0O() {
        switch (this.OooO0Oo) {
            case 0:
                return ((i71) this.OooO0O0).OooOO0o;
            default:
                return ((i71) this.OooO0O0).OooOOO0;
        }
    }

    @Override // com.cmaster.cloner.pu
    public final int OooOO0o() {
        switch (this.OooO0Oo) {
            case 0:
                return ((i71) this.OooO0O0).OooOOO0;
            default:
                return ((i71) this.OooO0O0).OooOO0o;
        }
    }

    @Override // com.cmaster.cloner.pu
    public final int OooOOO() {
        int iOooOooo;
        int iOooo000;
        int i = this.OooO0Oo;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                i71 i71Var = (i71) obj;
                iOooOooo = i71Var.OooOOO - i71Var.OooOooo();
                iOooo000 = i71Var.Oooo000();
                break;
            default:
                i71 i71Var2 = (i71) obj;
                iOooOooo = i71Var2.OooOOOO - i71Var2.Oooo00O();
                iOooo000 = i71Var2.OooOooO();
                break;
        }
        return iOooOooo - iOooo000;
    }

    @Override // com.cmaster.cloner.pu
    public final int OooOOO0() {
        switch (this.OooO0Oo) {
            case 0:
                return ((i71) this.OooO0O0).OooOooo();
            default:
                return ((i71) this.OooO0O0).Oooo00O();
        }
    }

    @Override // com.cmaster.cloner.pu
    public final int OooOOOO(View view) {
        int i = this.OooO0Oo;
        Object obj = this.OooO0OO;
        Object obj2 = this.OooO0O0;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((i71) obj2).Oooo0OO(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((i71) obj2).Oooo0OO(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // com.cmaster.cloner.pu
    public final int OooOOOo(View view) {
        int i = this.OooO0Oo;
        Object obj = this.OooO0OO;
        Object obj2 = this.OooO0O0;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((i71) obj2).Oooo0OO(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((i71) obj2).Oooo0OO(view, rect2);
                return rect2.top;
        }
    }

    @Override // com.cmaster.cloner.pu
    public final void OooOOo0(int i) {
        switch (this.OooO0Oo) {
            case 0:
                ((i71) this.OooO0O0).OoooO00(i);
                break;
            default:
                ((i71) this.OooO0O0).OoooO0(i);
                break;
        }
    }
}
