package com.cmaster.cloner;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ez {
    public final int OooO;
    public final cz OooO00o;
    public final az OooO0O0;
    public final int OooO0OO;
    public final Paint OooO0Oo;
    public final Paint OooO0o0;
    public final o00OOO00 OooOO0o;
    public final int OooOOO0;
    public final int OooOOOO;
    public final int OooOOOo;
    public boolean OooOOo;
    public int OooOOo0;
    public ValueAnimator OooOOoo;
    public int OooOo;
    public int OooOo0;
    public boolean OooOo00;
    public boolean OooOo0O;
    public int OooOo0o;
    public int OooOoO;
    public boolean OooOoO0;
    public final Rect OooO0o = new Rect();
    public final Rect OooO0oO = new Rect();
    public final Rect OooO0oo = new Rect();
    public final Point OooOO0 = new Point(-1, -1);
    public final Point OooOO0O = new Point(0, 0);
    public final RectF OooOOO = new RectF();

    public ez(Context context, cz czVar) {
        this.OooOo0 = 1500;
        this.OooOo0O = true;
        this.OooOo = 2030043136;
        Resources resources = context.getResources();
        this.OooO00o = czVar;
        az azVar = new az();
        azVar.OooO0o0 = new Path();
        azVar.OooO0o = new RectF();
        azVar.OooO0oo = -16777216;
        azVar.OooO = new Rect();
        azVar.OooOO0 = new Rect();
        Rect rect = new Rect();
        azVar.OooOO0O = rect;
        azVar.OooOOO = new Rect();
        azVar.OooOOOO = 1.0f;
        azVar.OooO0O0 = resources;
        azVar.OooO00o = czVar;
        Paint paint = new Paint(1);
        azVar.OooO0oO = paint;
        Paint paint2 = new Paint(1);
        azVar.OooOOO0 = paint2;
        paint2.setAlpha(0);
        paint2.setTextSize((int) TypedValue.applyDimension(2, 32.0f, resources.getDisplayMetrics()));
        czVar.invalidate(rect);
        int i = (int) (resources.getDisplayMetrics().density * 62.0f);
        azVar.OooO0OO = i;
        azVar.OooO0Oo = i / 2;
        czVar.invalidate(rect);
        this.OooO0O0 = azVar;
        this.OooO0OO = (int) (resources.getDisplayMetrics().density * 52.0f);
        int i2 = (int) (resources.getDisplayMetrics().density * 8.0f);
        this.OooOOOO = i2;
        int i3 = (int) (resources.getDisplayMetrics().density * 6.0f);
        this.OooOOOo = i3;
        this.OooO = (int) (resources.getDisplayMetrics().density * (-24.0f));
        Paint paint3 = new Paint(1);
        this.OooO0Oo = paint3;
        Paint paint4 = new Paint(1);
        this.OooO0o0 = paint4;
        this.OooOOO0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.OooOo0O = true;
        this.OooOo0 = 1500;
        this.OooOoO0 = true;
        this.OooOo0o = 2030043136;
        this.OooOo = 2030043136;
        int iApplyDimension = (int) TypedValue.applyDimension(2, 32.0f, resources.getDisplayMetrics());
        int i4 = (int) (resources.getDisplayMetrics().density * 62.0f);
        this.OooOOOO = i2;
        this.OooOOOo = i3;
        paint4.setColor(671088640);
        paint3.setColor(this.OooOoO0 ? this.OooOo : this.OooOo0o);
        azVar.OooO0oo = -16777216;
        paint.setColor(-16777216);
        czVar.invalidate(rect);
        paint2.setColor(-1);
        czVar.invalidate(rect);
        paint2.setTextSize(iApplyDimension);
        czVar.invalidate(rect);
        azVar.OooO0OO = i4;
        azVar.OooO0Oo = i4 / 2;
        czVar.invalidate(rect);
        azVar.OooOOo = 0;
        this.OooOO0o = new o00OOO00(this, 21);
        dz dzVar = new dz(this, 0);
        if (czVar.OoooooO == null) {
            czVar.OoooooO = new ArrayList();
        }
        czVar.OoooooO.add(dzVar);
        if (this.OooOo0O) {
            OooO0O0();
        }
    }

    public final void OooO00o(int i, int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int iO00oO0o;
        float fOooO00o;
        int i5;
        int action = motionEvent.getAction();
        int y = (int) motionEvent.getY();
        int i6 = this.OooO;
        int i7 = this.OooOOOo;
        Rect rect = this.OooO0o;
        int i8 = this.OooO0OO;
        Point point = this.OooOO0;
        if (action == 0) {
            int i9 = point.x;
            int i10 = point.y;
            rect.set(i9, i10, i7 + i9, i8 + i10);
            rect.inset(i6, i6);
            if (rect.contains(i, i2)) {
                this.OooOOo0 = i2 - point.y;
                return;
            }
            return;
        }
        Paint paint = this.OooO0Oo;
        az azVar = this.OooO0O0;
        if (action != 1) {
            if (action == 2) {
                boolean z = this.OooOOo;
                int i11 = this.OooOOO0;
                cz czVar = this.OooO00o;
                if (!z) {
                    int i12 = point.x;
                    int i13 = point.y;
                    rect.set(i12, i13, i7 + i12, i13 + i8);
                    rect.inset(i6, i6);
                    if (rect.contains(i, i2) && Math.abs(y - i2) > i11) {
                        czVar.getParent().requestDisallowInterceptTouchEvent(true);
                        this.OooOOo = true;
                        this.OooOOo0 = (i3 - i2) + this.OooOOo0;
                        azVar.OooO00o(true);
                        if (this.OooOoO0) {
                            paint.setColor(this.OooOo0o);
                        }
                    }
                }
                if (this.OooOOo) {
                    int i14 = this.OooOoO;
                    if (i14 == 0 || Math.abs(i14 - y) >= i11) {
                        this.OooOoO = y;
                        boolean zO0OOO0o = czVar.o0OOO0o();
                        float fMax = Math.max(0, Math.min(r2, y - this.OooOOo0)) / (czVar.getHeight() - i8);
                        if (zO0OOO0o) {
                            fMax = 1.0f - fMax;
                        }
                        du duVar = czVar.o00000o0;
                        int iOooO00o = czVar.getAdapter().OooO00o();
                        String strOooOOO = "";
                        if (iOooO00o != 0) {
                            if (czVar.getLayoutManager() instanceof GridLayoutManager) {
                                i4 = ((GridLayoutManager) czVar.getLayoutManager()).Oooo000;
                                iOooO00o = (int) Math.ceil(iOooO00o / i4);
                            } else {
                                i4 = 1;
                            }
                            czVar.o00ooo();
                            czVar.o0ooOOo(duVar);
                            if (czVar.getAdapter() instanceof s1) {
                                fOooO00o = czVar.o00oO0O(fMax);
                                int iO0ooOO0 = (int) (czVar.o0ooOO0(czVar.oo000o()) * fMax);
                                if (!(czVar.getAdapter() instanceof s1)) {
                                    qa.OooO0o("findMeasureAdapterFirstVisiblePosition() should only be called where the RecyclerView.Adapter is an instance of MeasurableAdapter");
                                    return;
                                }
                                s1 s1Var = (s1) czVar.getAdapter();
                                i5 = 0;
                                while (i5 < czVar.getAdapter().OooO00o()) {
                                    int iO00oO0o2 = czVar.o00oO0o(i5);
                                    int iOooOOOo = s1Var.OooOOOo(czVar, czVar.Oooo0O0(i5), i5, czVar.getAdapter().OooO0OO(i5)) + iO00oO0o2;
                                    if (i5 == czVar.getAdapter().OooO00o() - 1) {
                                        if (iO0ooOO0 < iO00oO0o2 || iO0ooOO0 > iOooOOOo) {
                                            i5++;
                                        } else {
                                            iO00oO0o = czVar.o00oO0o(i5) - iO0ooOO0;
                                        }
                                    } else if (iO0ooOO0 < iO00oO0o2 || iO0ooOO0 >= iOooOOOo) {
                                        i5++;
                                    } else {
                                        iO00oO0o = czVar.o00oO0o(i5) - iO0ooOO0;
                                    }
                                }
                                throw new IllegalStateException(String.format("Invalid passed height: %d, [low: %d, height: %d]", Integer.valueOf(iO0ooOO0), Integer.valueOf(czVar.o00oO0o(0)), Integer.valueOf(s1Var.OooOOOo(czVar, czVar.Oooo0O0(czVar.getAdapter().OooO00o() - 1), czVar.getAdapter().OooO00o() - 1, czVar.getAdapter().OooO0OO(czVar.getAdapter().OooO00o() - 1)) + czVar.o00oO0o(czVar.getAdapter().OooO00o() - 1))));
                            }
                            float fO00oO0O = czVar.o00oO0O(fMax);
                            int iO0ooOO02 = (int) (czVar.o0ooOO0(iOooO00o * duVar.OooO0OO) * fMax);
                            int i15 = duVar.OooO0OO;
                            int i16 = (i4 * iO0ooOO02) / i15;
                            iO00oO0o = -(iO0ooOO02 % i15);
                            fOooO00o = fO00oO0O;
                            i5 = i16;
                            ((LinearLayoutManager) czVar.getLayoutManager()).o0000OoO(i5, iO00oO0o);
                            if (czVar.getAdapter() instanceof qe) {
                                if (fMax == 1.0f) {
                                    fOooO00o = czVar.getAdapter().OooO00o() - 1;
                                }
                                strOooOOO = ((qe) czVar.getAdapter()).OooOOO((int) fOooO00o);
                            }
                        }
                        Rect rect2 = azVar.OooOOO;
                        Paint paint2 = azVar.OooOOO0;
                        if (!strOooOOO.equals(azVar.OooOO0o)) {
                            azVar.OooOO0o = strOooOOO;
                            paint2.getTextBounds(strOooOOO, 0, strOooOOO.length(), rect2);
                            rect2.right = (int) (paint2.measureText(strOooOOO) + rect2.left);
                        }
                        azVar.OooO00o(!strOooOOO.isEmpty());
                        int i17 = point.y;
                        Rect rect3 = azVar.OooOOO;
                        Rect rect4 = azVar.OooO;
                        Rect rect5 = azVar.OooOO0O;
                        rect4.set(rect5);
                        if (azVar.OooOOOO <= 0.0f || TextUtils.isEmpty(azVar.OooOO0o)) {
                            rect5.setEmpty();
                        } else {
                            int scrollBarWidth = czVar.getScrollBarWidth();
                            int iRound = Math.round((azVar.OooO0OO - rect3.height()) / 10.0f);
                            int i18 = azVar.OooO0OO;
                            int iMax = Math.max(i18, (iRound * 10) + rect3.width());
                            if (azVar.OooOOo == 1) {
                                int width = (czVar.getWidth() - iMax) / 2;
                                rect5.left = width;
                                rect5.right = width + iMax;
                                rect5.top = (czVar.getHeight() - i18) / 2;
                            } else {
                                if (azVar.OooO0O0.getConfiguration().getLayoutDirection() == 1) {
                                    int scrollBarWidth2 = czVar.getScrollBarWidth() * 2;
                                    rect5.left = scrollBarWidth2;
                                    rect5.right = scrollBarWidth2 + iMax;
                                } else {
                                    int width2 = czVar.getWidth() - (czVar.getScrollBarWidth() * 2);
                                    rect5.right = width2;
                                    rect5.left = width2 - iMax;
                                }
                                rect5.top = (czVar.getScrollBarThumbHeight() / 2) + (((czVar.getPaddingTop() - czVar.getPaddingBottom()) + i17) - i18);
                                rect5.top = Math.max(czVar.getPaddingTop() + scrollBarWidth, Math.min(rect5.top, ((czVar.getHeight() + czVar.getPaddingTop()) - scrollBarWidth) - i18));
                            }
                            rect5.bottom = rect5.top + i18;
                        }
                        rect4.union(rect5);
                        czVar.invalidate(rect4);
                        return;
                    }
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.OooOOo0 = 0;
        this.OooOoO = 0;
        if (this.OooOOo) {
            this.OooOOo = false;
            azVar.OooO00o(false);
        }
        if (this.OooOoO0) {
            paint.setColor(this.OooOo);
        }
    }

    public final void OooO0O0() {
        cz czVar = this.OooO00o;
        if (czVar != null) {
            o00OOO00 o00ooo00 = this.OooOO0o;
            if (czVar != null) {
                czVar.removeCallbacks(o00ooo00);
            }
            czVar.postDelayed(o00ooo00, this.OooOo0);
        }
    }

    public final void OooO0OO(int i) {
        Point point = this.OooOO0O;
        int i2 = point.y;
        int i3 = point.x;
        if (i3 == i) {
            return;
        }
        Point point2 = this.OooOO0;
        int i4 = point2.x + i3;
        int i5 = this.OooOOOo;
        cz czVar = this.OooO00o;
        int height = czVar.getHeight() + point.y;
        Rect rect = this.OooO0oO;
        rect.set(i4, i2, i4 + i5, height);
        point.set(i, i2);
        int i6 = point2.x + point.x;
        int height2 = czVar.getHeight() + point.y;
        Rect rect2 = this.OooO0oo;
        rect2.set(i6, point.y, i5 + i6, height2);
        rect.union(rect2);
        czVar.invalidate(rect);
    }

    public final void OooO0Oo(int i, int i2) {
        Point point = this.OooOO0;
        int i3 = point.x;
        if (i3 == i && point.y == i2) {
            return;
        }
        Point point2 = this.OooOO0O;
        int i4 = point2.x;
        int i5 = i3 + i4;
        int i6 = point2.y;
        int i7 = i3 + i4;
        int i8 = this.OooOOOo;
        cz czVar = this.OooO00o;
        int height = czVar.getHeight() + point2.y;
        Rect rect = this.OooO0oO;
        rect.set(i5, i6, i7 + i8, height);
        point.set(i, i2);
        int i9 = point.x;
        int i10 = point2.x;
        int i11 = i9 + i10;
        int i12 = point2.y;
        int i13 = i9 + i10 + i8;
        int height2 = czVar.getHeight() + point2.y;
        Rect rect2 = this.OooO0oo;
        rect2.set(i11, i12, i13, height2);
        rect.union(rect2);
        czVar.invalidate(rect);
    }
}
