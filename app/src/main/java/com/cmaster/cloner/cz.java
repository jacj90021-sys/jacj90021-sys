package com.cmaster.cloner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cz extends RecyclerView implements l71 {
    public int o0000;
    public final ez o00000Oo;
    public final du o00000o0;
    public final bz o00000oO;
    public boolean o00000oo;
    public int o0000O00;
    public final SparseIntArray o0000Ooo;
    public int o0000oo;

    public cz(Context context) {
        super(context, null, 0);
        this.o00000o0 = new du();
        this.o00000oo = true;
        this.o00000Oo = new ez(context, this);
        this.o00000oO = new bz(this, 0);
        this.o0000Ooo = new SparseIntArray();
        this.OooOo00.add(this);
    }

    @Override // com.cmaster.cloner.l71
    public final void OooO00o(MotionEvent motionEvent) {
        o0ooOoO(motionEvent);
    }

    @Override // com.cmaster.cloner.l71
    public final boolean OooO0O0(MotionEvent motionEvent) {
        return o0ooOoO(motionEvent);
    }

    @Override // com.cmaster.cloner.l71
    public final void OooO0OO(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        char c;
        boolean z;
        float[] fArr;
        int iO0ooOO0;
        int iO00oO0o;
        super.draw(canvas);
        if (this.o00000oo) {
            a71 adapter = getAdapter();
            ez ezVar = this.o00000Oo;
            if (adapter != null) {
                int iOooO00o = getAdapter().OooO00o();
                if (getLayoutManager() instanceof GridLayoutManager) {
                    iOooO00o = (int) Math.ceil(iOooO00o / ((GridLayoutManager) getLayoutManager()).Oooo000);
                }
                if (iOooO00o == 0) {
                    ezVar.OooO0Oo(-1, -1);
                } else {
                    du duVar = this.o00000o0;
                    o0ooOOo(duVar);
                    if (duVar.OooO00o < 0) {
                        ezVar.OooO0Oo(-1, -1);
                    } else {
                        if (getAdapter() instanceof s1) {
                            iO0ooOO0 = o0ooOO0(oo000o());
                            iO00oO0o = o00oO0o(duVar.OooO00o);
                        } else {
                            iO0ooOO0 = o0ooOO0(iOooO00o * duVar.OooO0OO);
                            iO00oO0o = duVar.OooO00o * duVar.OooO0OO;
                        }
                        int availableScrollBarHeight = getAvailableScrollBarHeight();
                        if (iO0ooOO0 <= 0) {
                            ezVar.OooO0Oo(-1, -1);
                        } else {
                            int iMin = Math.min(iO0ooOO0, getPaddingTop() + iO00oO0o);
                            boolean zO0OOO0o = o0OOO0o();
                            int i = duVar.OooO0O0;
                            int i2 = (int) (((zO0OOO0o ? (iMin + i) - availableScrollBarHeight : iMin - i) / iO0ooOO0) * availableScrollBarHeight);
                            ezVar.OooO0Oo(getResources().getConfiguration().getLayoutDirection() == 1 ? 0 : getWidth() - Math.max(ezVar.OooOOOo, ezVar.OooOOOO), o0OOO0o() ? getPaddingBottom() + (availableScrollBarHeight - i2) : i2 + getPaddingTop());
                        }
                    }
                }
            }
            cz czVar = ezVar.OooO00o;
            int i3 = ezVar.OooOOOo;
            int i4 = ezVar.OooOOOO;
            Point point = ezVar.OooOO0O;
            RectF rectF = ezVar.OooOOO;
            Point point2 = ezVar.OooOO0;
            if (point2.x < 0 || point2.y < 0) {
                return;
            }
            rectF.set(r10 + point.x + r11, czVar.getPaddingTop() + point.y, point2.x + point.x + i3 + r11, (czVar.getHeight() + point.y) - czVar.getPaddingBottom());
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, ezVar.OooO0o0);
            int i5 = point2.x + point.x;
            float f2 = (i4 - i3) / 2.0f;
            rectF.set(i5 + f2, point2.y + point.y, f2 + i5 + i4, r9 + ezVar.OooO0OO);
            float f3 = i4;
            canvas.drawRoundRect(rectF, f3, f3, ezVar.OooO0Oo);
            az azVar = ezVar.OooO0O0;
            Paint paint = azVar.OooO0oO;
            Rect rect = azVar.OooOOO;
            RectF rectF2 = azVar.OooO0o;
            Paint paint2 = azVar.OooOOO0;
            Path path = azVar.OooO0o0;
            Rect rect2 = azVar.OooOO0;
            Rect rect3 = azVar.OooOO0O;
            if (azVar.OooOOOO <= 0.0f || TextUtils.isEmpty(azVar.OooOO0o)) {
                return;
            }
            int iSave = canvas.save();
            canvas.translate(rect3.left, rect3.top);
            rect2.set(rect3);
            rect2.offsetTo(0, 0);
            path.reset();
            rectF2.set(rect2);
            if (azVar.OooOOo == 1) {
                float f4 = azVar.OooO0Oo;
                fArr = new float[]{f4, f4, f4, f4, f4, f4, f4, f4};
            } else {
                if (azVar.OooO0O0.getConfiguration().getLayoutDirection() == 1) {
                    z = true;
                    c = 1;
                } else {
                    c = 1;
                    z = false;
                }
                int i6 = azVar.OooO0Oo;
                if (z) {
                    float f5 = i6;
                    fArr = new float[8];
                    fArr[0] = f5;
                    fArr[c] = f5;
                    fArr[2] = f5;
                    fArr[3] = f5;
                    fArr[4] = f5;
                    fArr[5] = f5;
                    fArr[6] = 0.0f;
                    fArr[7] = 0.0f;
                } else {
                    float f6 = i6;
                    fArr = new float[8];
                    fArr[0] = f6;
                    fArr[c] = f6;
                    fArr[2] = f6;
                    fArr[3] = f6;
                    fArr[4] = 0.0f;
                    fArr[5] = 0.0f;
                    fArr[6] = f6;
                    fArr[7] = f6;
                }
            }
            path.addRoundRect(rectF2, fArr, Path.Direction.CW);
            paint.setAlpha((int) (Color.alpha(azVar.OooO0oo) * azVar.OooOOOO));
            paint2.setAlpha((int) (azVar.OooOOOO * 255.0f));
            canvas.drawPath(path, paint);
            canvas.drawText(azVar.OooOO0o, (rect3.width() - rect.width()) / 2.0f, (rect.height() + rect3.height()) / 2.0f, paint2);
            canvas.restoreToCount(iSave);
        }
    }

    public int getAvailableScrollBarHeight() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.o00000Oo.OooO0OO;
    }

    public int getScrollBarThumbHeight() {
        return this.o00000Oo.OooO0OO;
    }

    public int getScrollBarWidth() {
        ez ezVar = this.o00000Oo;
        return Math.max(ezVar.OooOOOo, ezVar.OooOOOO);
    }

    public final float o00oO0O(float f) {
        if (!(getAdapter() instanceof s1)) {
            return getAdapter().OooO00o() * f;
        }
        s1 s1Var = (s1) getAdapter();
        int iOo000o = (int) (oo000o() * f);
        for (int i = 0; i < getAdapter().OooO00o(); i++) {
            int iO00oO0o = o00oO0o(i);
            int iOooOOOo = s1Var.OooOOOo(this, Oooo0O0(i), i, getAdapter().OooO0OO(i)) + iO00oO0o;
            if (i == getAdapter().OooO00o() - 1) {
                if (iOo000o >= iO00oO0o && iOo000o <= iOooOOOo) {
                    return i;
                }
            } else if (iOo000o >= iO00oO0o && iOo000o < iOooOOOo) {
                return i;
            }
        }
        Log.w("cz", "Failed to find a view at the provided scroll fraction (" + f + ")");
        return f * getAdapter().OooO00o();
    }

    public final int o00oO0o(int i) {
        if (!(getAdapter() instanceof s1)) {
            qa.OooO0o("calculateScrollDistanceToPosition() should only be called where the RecyclerView.Adapter is an instance of MeasurableAdapter");
            return 0;
        }
        SparseIntArray sparseIntArray = this.o0000Ooo;
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return sparseIntArray.get(i);
        }
        s1 s1Var = (s1) getAdapter();
        int iOooOOOo = 0;
        for (int i2 = 0; i2 < i; i2++) {
            sparseIntArray.put(i2, iOooOOOo);
            iOooOOOo += s1Var.OooOOOo(this, Oooo0O0(i2), i2, getAdapter().OooO0OO(i2));
        }
        sparseIntArray.put(i, iOooOOOo);
        return iOooOOOo;
    }

    public final boolean o0OOO0o() {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).OooOo00;
        }
        return false;
    }

    public final int o0ooOO0(int i) {
        return (getPaddingBottom() + (getPaddingTop() + i)) - getHeight();
    }

    public final void o0ooOOo(du duVar) {
        duVar.OooO00o = -1;
        duVar.OooO0O0 = -1;
        duVar.OooO0OO = -1;
        if (getAdapter().OooO00o() == 0 || getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        y71 y71VarOooo0oo = RecyclerView.Oooo0oo(childAt);
        int iOooO0O0 = y71VarOooo0oo != null ? y71VarOooo0oo.OooO0O0() : -1;
        duVar.OooO00o = iOooO0O0;
        if (iOooO0O0 == -1) {
            return;
        }
        if (getLayoutManager() instanceof GridLayoutManager) {
            duVar.OooO00o /= ((GridLayoutManager) getLayoutManager()).Oooo000;
        }
        if (getAdapter() instanceof s1) {
            getLayoutManager().getClass();
            duVar.OooO0O0 = i71.OooOoo0(childAt);
            duVar.OooO0OO = ((s1) getAdapter()).OooOOOo(this, Oooo0O0(duVar.OooO00o), duVar.OooO00o, getAdapter().OooO0OO(duVar.OooO00o));
            return;
        }
        getLayoutManager().getClass();
        duVar.OooO0O0 = i71.OooOoo0(childAt);
        int height = childAt.getHeight();
        getLayoutManager().getClass();
        int i = height + ((j71) childAt.getLayoutParams()).OooO0O0.top;
        getLayoutManager().getClass();
        duVar.OooO0OO = i + ((j71) childAt.getLayoutParams()).OooO0O0.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o0ooOoO(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            float r1 = r5.getX()
            int r1 = (int) r1
            float r2 = r5.getY()
            int r2 = (int) r2
            com.cmaster.cloner.ez r3 = r4.o00000Oo
            if (r0 == 0) goto L30
            r1 = 1
            if (r0 == r1) goto L26
            r1 = 2
            if (r0 == r1) goto L1c
            r1 = 3
            if (r0 == r1) goto L26
            goto L39
        L1c:
            r4.o0000oo = r2
            int r0 = r4.o0000
            int r4 = r4.o0000O00
            r3.OooO00o(r0, r4, r2, r5)
            goto L39
        L26:
            int r0 = r4.o0000
            int r1 = r4.o0000O00
            int r4 = r4.o0000oo
            r3.OooO00o(r0, r1, r4, r5)
            goto L39
        L30:
            r4.o0000 = r1
            r4.o0000oo = r2
            r4.o0000O00 = r2
            r3.OooO00o(r1, r2, r2, r5)
        L39:
            boolean r4 = r3.OooOOo
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.cz.o0ooOoO(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
    }

    public final int oo000o() {
        if (getAdapter() instanceof s1) {
            return o00oO0o(getAdapter().OooO00o());
        }
        qa.OooO0o("calculateAdapterHeight() should only be called where the RecyclerView.Adapter is an instance of MeasurableAdapter");
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(a71 a71Var) {
        a71 adapter = getAdapter();
        bz bzVar = this.o00000oO;
        if (adapter != null) {
            getAdapter().OooO00o.unregisterObserver(bzVar);
        }
        if (a71Var != null) {
            a71Var.OooO00o.registerObserver(bzVar);
        }
        super.setAdapter(a71Var);
    }

    public void setAutoHideDelay(int i) {
        ez ezVar = this.o00000Oo;
        ezVar.OooOo0 = i;
        if (ezVar.OooOo0O) {
            ezVar.OooO0O0();
        }
    }

    public void setAutoHideEnabled(boolean z) {
        ez ezVar = this.o00000Oo;
        ezVar.OooOo0O = z;
        if (z) {
            ezVar.OooO0O0();
            return;
        }
        cz czVar = ezVar.OooO00o;
        if (czVar != null) {
            czVar.removeCallbacks(ezVar.OooOO0o);
        }
    }

    public void setFastScrollEnabled(boolean z) {
        this.o00000oo = z;
    }

    public void setOnFastScrollStateChangeListener(cz0 cz0Var) {
    }

    public void setPopUpTypeface(Typeface typeface) {
        az azVar = this.o00000Oo.OooO0O0;
        azVar.OooOOO0.setTypeface(typeface);
        azVar.OooO00o.invalidate(azVar.OooOO0O);
    }

    public void setPopupBgColor(int i) {
        az azVar = this.o00000Oo.OooO0O0;
        azVar.OooO0oo = i;
        azVar.OooO0oO.setColor(i);
        azVar.OooO00o.invalidate(azVar.OooOO0O);
    }

    public void setPopupPosition(int i) {
        this.o00000Oo.OooO0O0.OooOOo = i;
    }

    public void setPopupTextColor(int i) {
        az azVar = this.o00000Oo.OooO0O0;
        azVar.OooOOO0.setColor(i);
        azVar.OooO00o.invalidate(azVar.OooOO0O);
    }

    public void setPopupTextSize(int i) {
        az azVar = this.o00000Oo.OooO0O0;
        azVar.OooOOO0.setTextSize(i);
        azVar.OooO00o.invalidate(azVar.OooOO0O);
    }

    @Deprecated
    public void setStateChangeListener(cz0 cz0Var) {
        setOnFastScrollStateChangeListener(cz0Var);
    }

    public void setThumbColor(int i) {
        ez ezVar = this.o00000Oo;
        ezVar.OooOo0o = i;
        ezVar.OooO0Oo.setColor(i);
        ezVar.OooO00o.invalidate(ezVar.OooO0oO);
    }

    @Deprecated
    public void setThumbEnabled(boolean z) {
        setFastScrollEnabled(z);
    }

    @Deprecated
    public void setThumbInactiveColor(boolean z) {
        ez ezVar = this.o00000Oo;
        ezVar.OooOoO0 = z;
        ezVar.OooO0Oo.setColor(z ? ezVar.OooOo : ezVar.OooOo0o);
    }

    public void setTrackColor(int i) {
        ez ezVar = this.o00000Oo;
        ezVar.OooO0o0.setColor(i);
        ezVar.OooO00o.invalidate(ezVar.OooO0oO);
    }

    public void setThumbInactiveColor(int i) {
        ez ezVar = this.o00000Oo;
        ezVar.OooOo = i;
        ezVar.OooOoO0 = true;
        ezVar.OooO0Oo.setColor(i);
    }
}
