package com.cmaster.cloner;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vj0 extends g71 {
    public float OooO;
    public float OooO0oO;
    public float OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public float OooOO0o;
    public float OooOOO;
    public float OooOOO0;
    public final o00Oo00 OooOOOo;
    public int OooOOo;
    public ArrayList OooOo;
    public RecyclerView OooOo0;
    public int OooOo00;
    public VelocityTracker OooOo0o;
    public ArrayList OooOoO0;
    public GestureDetector OooOoOO;
    public uj0 OooOoo0;
    public Rect OooOooO;
    public long OooOooo;
    public final ArrayList OooO0Oo = new ArrayList();
    public final float[] OooO0o0 = new float[2];
    public y71 OooO0o = null;
    public int OooOOOO = -1;
    public int OooOOo0 = 0;
    public final ArrayList OooOOoo = new ArrayList();
    public final o00OOO00 OooOo0O = new o00OOO00(this, 24);
    public View OooOoO = null;
    public final rj0 OooOoo = new rj0(this);

    public vj0(o00Oo00 o00oo00) {
        this.OooOOOo = o00oo00;
    }

    public static boolean OooOOO0(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public final int OooO(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.OooOO0o > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.OooOo0o;
        o00Oo00 o00oo00 = this.OooOOOo;
        if (velocityTracker != null && this.OooOOOO > -1) {
            float f = this.OooOO0;
            o00oo00.getClass();
            velocityTracker.computeCurrentVelocity(zzbcj.zzq.zzf, f);
            float xVelocity = this.OooOo0o.getXVelocity(this.OooOOOO);
            float yVelocity = this.OooOo0o.getYVelocity(this.OooOOOO);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.OooO && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.OooOo0.getHeight();
        o00oo00.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.OooOO0o) <= f2) {
            return 0;
        }
        return i2;
    }

    @Override // com.cmaster.cloner.g71
    public final void OooO0Oo(Rect rect, View view, RecyclerView recyclerView) {
        rect.setEmpty();
    }

    @Override // com.cmaster.cloner.g71
    public final void OooO0o(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.OooO0o != null) {
            float[] fArr = this.OooO0o0;
            OooOO0o(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        y71 y71Var = this.OooO0o;
        this.OooOOOo.getClass();
        ArrayList arrayList = this.OooOOoo;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sj0 sj0Var = (sj0) arrayList.get(i);
            int iSave = canvas.save();
            View view = sj0Var.OooO0o0.OooO00o;
            canvas.restoreToCount(iSave);
        }
        if (y71Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            sj0 sj0Var2 = (sj0) arrayList.get(i2);
            boolean z2 = sj0Var2.OooOO0o;
            if (z2 && !sj0Var2.OooO0oo) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    @Override // com.cmaster.cloner.g71
    public final void OooO0o0(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.OooO0o != null) {
            float[] fArr = this.OooO0o0;
            OooOO0o(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        y71 y71Var = this.OooO0o;
        int i = this.OooOOo0;
        o00Oo00 o00oo00 = this.OooOOOo;
        o00oo00.getClass();
        ArrayList arrayList = this.OooOOoo;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sj0 sj0Var = (sj0) arrayList.get(i2);
            y71 y71Var2 = sj0Var.OooO0o0;
            float f4 = sj0Var.OooO00o;
            float f5 = sj0Var.OooO0OO;
            if (f4 == f5) {
                sj0Var.OooO = y71Var2.OooO00o.getTranslationX();
            } else {
                sj0Var.OooO = ((f5 - f4) * sj0Var.OooOOO0) + f4;
            }
            float f6 = sj0Var.OooO0O0;
            float f7 = sj0Var.OooO0Oo;
            if (f6 == f7) {
                sj0Var.OooOO0 = y71Var2.OooO00o.getTranslationY();
            } else {
                sj0Var.OooOO0 = ((f7 - f6) * sj0Var.OooOOO0) + f6;
            }
            int iSave = canvas.save();
            y71 y71Var3 = sj0Var.OooO0o0;
            float f8 = sj0Var.OooO;
            float f9 = sj0Var.OooOO0;
            int i3 = sj0Var.OooO0o;
            o00Oo00 o00oo002 = o00oo00;
            o00oo002.OooOO0(canvas, recyclerView, y71Var3, f8, f9, i3, false);
            canvas.restoreToCount(iSave);
            i2++;
            o00oo00 = o00oo002;
        }
        o00Oo00 o00oo003 = o00oo00;
        if (y71Var != null) {
            int iSave2 = canvas.save();
            o00oo003.OooOO0(canvas, recyclerView, y71Var, f2, f, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    public final int OooO0oO(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.OooOO0O > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.OooOo0o;
        o00Oo00 o00oo00 = this.OooOOOo;
        if (velocityTracker != null && this.OooOOOO > -1) {
            float f = this.OooOO0;
            o00oo00.getClass();
            velocityTracker.computeCurrentVelocity(zzbcj.zzq.zzf, f);
            float xVelocity = this.OooOo0o.getXVelocity(this.OooOOOO);
            float yVelocity = this.OooOo0o.getYVelocity(this.OooOOOO);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.OooO && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.OooOo0.getWidth();
        o00oo00.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.OooOO0O) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void OooO0oo(int i, int i2, MotionEvent motionEvent) {
        int iOooO0OO;
        View viewOooOO0O;
        if (this.OooO0o == null && i == 2 && this.OooOOo0 != 2) {
            this.OooOOOo.getClass();
            if (this.OooOo0.getScrollState() == 1) {
                return;
            }
            i71 layoutManager = this.OooOo0.getLayoutManager();
            int i3 = this.OooOOOO;
            y71 y71VarOooo0oO = null;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(iFindPointerIndex) - this.OooO0oO;
                float y = motionEvent.getY(iFindPointerIndex) - this.OooO0oo;
                float fAbs = Math.abs(x);
                float fAbs2 = Math.abs(y);
                float f = this.OooOo00;
                if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.OooO0Oo()) && ((fAbs2 <= fAbs || !layoutManager.OooO0o0()) && (viewOooOO0O = OooOO0O(motionEvent)) != null))) {
                    y71VarOooo0oO = this.OooOo0.Oooo0oO(viewOooOO0O);
                }
            }
            if (y71VarOooo0oO == null || (iOooO0OO = (o00Oo00.OooO0OO(1028, this.OooOo0.getLayoutDirection()) & 65280) >> 8) == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.OooO0oO;
            float f3 = y2 - this.OooO0oo;
            float fAbs3 = Math.abs(f2);
            float fAbs4 = Math.abs(f3);
            float f4 = this.OooOo00;
            if (fAbs3 >= f4 || fAbs4 >= f4) {
                if (fAbs3 > fAbs4) {
                    if (f2 < 0.0f && (iOooO0OO & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (iOooO0OO & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < 0.0f && (iOooO0OO & 1) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (iOooO0OO & 2) == 0) {
                        return;
                    }
                }
                this.OooOO0o = 0.0f;
                this.OooOO0O = 0.0f;
                this.OooOOOO = motionEvent.getPointerId(0);
                OooOOOO(y71VarOooo0oO, 1);
            }
        }
    }

    public final void OooOO0(y71 y71Var, boolean z) {
        ArrayList arrayList = this.OooOOoo;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sj0 sj0Var = (sj0) arrayList.get(size);
            if (sj0Var.OooO0o0 == y71Var) {
                sj0Var.OooOO0O |= z;
                if (!sj0Var.OooOO0o) {
                    sj0Var.OooO0oO.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View OooOO0O(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        y71 y71Var = this.OooO0o;
        if (y71Var != null) {
            View view = y71Var.OooO00o;
            if (OooOOO0(view, x, y, this.OooOOO0 + this.OooOO0O, this.OooOOO + this.OooOO0o)) {
                return view;
            }
        }
        ArrayList arrayList = this.OooOOoo;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sj0 sj0Var = (sj0) arrayList.get(size);
            View view2 = sj0Var.OooO0o0.OooO00o;
            if (OooOOO0(view2, x, y, sj0Var.OooO, sj0Var.OooOO0)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.OooOo0;
        for (int iOooOO0 = recyclerView.OooO.OooOO0() - 1; iOooOO0 >= 0; iOooOO0--) {
            View viewOooO = recyclerView.OooO.OooO(iOooOO0);
            float translationX = viewOooO.getTranslationX();
            float translationY = viewOooO.getTranslationY();
            if (x >= viewOooO.getLeft() + translationX && x <= viewOooO.getRight() + translationX && y >= viewOooO.getTop() + translationY && y <= viewOooO.getBottom() + translationY) {
                return viewOooO;
            }
        }
        return null;
    }

    public final void OooOO0o(float[] fArr) {
        if ((this.OooOOo & 12) != 0) {
            fArr[0] = (this.OooOOO0 + this.OooOO0O) - this.OooO0o.OooO00o.getLeft();
        } else {
            fArr[0] = this.OooO0o.OooO00o.getTranslationX();
        }
        if ((this.OooOOo & 3) != 0) {
            fArr[1] = (this.OooOOO + this.OooOO0o) - this.OooO0o.OooO00o.getTop();
        } else {
            fArr[1] = this.OooO0o.OooO00o.getTranslationY();
        }
    }

    public final void OooOOO(y71 y71Var) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i;
        int i2;
        if (this.OooOo0.isLayoutRequested()) {
            return;
        }
        char c = 2;
        if (this.OooOOo0 != 2) {
            return;
        }
        this.OooOOOo.getClass();
        int i3 = (int) (this.OooOOO0 + this.OooOO0O);
        int i4 = (int) (this.OooOOO + this.OooOO0o);
        View view = y71Var.OooO00o;
        if (Math.abs(i4 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i3 - view.getLeft()) >= view.getWidth() * 0.5f) {
            ArrayList arrayList = this.OooOo;
            if (arrayList == null) {
                this.OooOo = new ArrayList();
                this.OooOoO0 = new ArrayList();
            } else {
                arrayList.clear();
                this.OooOoO0.clear();
            }
            int iRound = Math.round(this.OooOOO0 + this.OooOO0O);
            int iRound2 = Math.round(this.OooOOO + this.OooOO0o);
            int width = view.getWidth() + iRound;
            int height = view.getHeight() + iRound2;
            int i5 = (iRound + width) / 2;
            int i6 = (iRound2 + height) / 2;
            i71 layoutManager = this.OooOo0.getLayoutManager();
            int iOooOo0O = layoutManager.OooOo0O();
            int i7 = 0;
            while (i7 < iOooOo0O) {
                char c2 = c;
                View viewOooOo0 = layoutManager.OooOo0(i7);
                if (viewOooOo0 != view && viewOooOo0.getBottom() >= iRound2 && viewOooOo0.getTop() <= height && viewOooOo0.getRight() >= iRound && viewOooOo0.getLeft() <= width) {
                    y71 y71VarOooo0oO = this.OooOo0.Oooo0oO(viewOooOo0);
                    int iAbs5 = Math.abs(i5 - ((viewOooOo0.getRight() + viewOooOo0.getLeft()) / 2));
                    int iAbs6 = Math.abs(i6 - ((viewOooOo0.getBottom() + viewOooOo0.getTop()) / 2));
                    int i8 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                    i = i3;
                    int size = this.OooOo.size();
                    i2 = i4;
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < size) {
                        int i11 = size;
                        if (i8 <= ((Integer) this.OooOoO0.get(i9)).intValue()) {
                            break;
                        }
                        i10++;
                        i9++;
                        size = i11;
                    }
                    this.OooOo.add(i10, y71VarOooo0oO);
                    this.OooOoO0.add(i10, Integer.valueOf(i8));
                } else {
                    i = i3;
                    i2 = i4;
                }
                i7++;
                c = c2;
                i3 = i;
                i4 = i2;
            }
            int i12 = i3;
            int i13 = i4;
            ArrayList arrayList2 = this.OooOo;
            if (arrayList2.size() == 0) {
                return;
            }
            int width2 = view.getWidth() + i12;
            int height2 = view.getHeight() + i13;
            int left2 = i12 - view.getLeft();
            int top2 = i13 - view.getTop();
            int size2 = arrayList2.size();
            y71 y71Var2 = null;
            int i14 = -1;
            for (int i15 = 0; i15 < size2; i15++) {
                y71 y71Var3 = (y71) arrayList2.get(i15);
                if (left2 > 0 && (right = y71Var3.OooO00o.getRight() - width2) < 0 && y71Var3.OooO00o.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i14) {
                    y71Var2 = y71Var3;
                    i14 = iAbs4;
                }
                if (left2 < 0 && (left = y71Var3.OooO00o.getLeft() - i12) > 0 && y71Var3.OooO00o.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i14) {
                    y71Var2 = y71Var3;
                    i14 = iAbs3;
                }
                if (top2 < 0 && (top = y71Var3.OooO00o.getTop() - i13) > 0 && y71Var3.OooO00o.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i14) {
                    y71Var2 = y71Var3;
                    i14 = iAbs2;
                }
                if (top2 > 0 && (bottom = y71Var3.OooO00o.getBottom() - height2) < 0 && y71Var3.OooO00o.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i14) {
                    y71Var2 = y71Var3;
                    i14 = iAbs;
                }
            }
            if (y71Var2 == null) {
                this.OooOo.clear();
                this.OooOoO0.clear();
            } else {
                y71Var2.OooO0O0();
                y71Var.OooO0O0();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOOO(com.cmaster.cloner.y71 r21, int r22) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.vj0.OooOOOO(com.cmaster.cloner.y71, int):void");
    }

    public final void OooOOOo(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.OooO0oO;
        this.OooOO0O = f;
        this.OooOO0o = y - this.OooO0oo;
        if ((i & 4) == 0) {
            this.OooOO0O = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.OooOO0O = Math.min(0.0f, this.OooOO0O);
        }
        if ((i & 1) == 0) {
            this.OooOO0o = Math.max(0.0f, this.OooOO0o);
        }
        if ((i & 2) == 0) {
            this.OooOO0o = Math.min(0.0f, this.OooOO0o);
        }
    }
}
