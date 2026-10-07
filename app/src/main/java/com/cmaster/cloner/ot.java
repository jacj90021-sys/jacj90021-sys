package com.cmaster.cloner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ot extends ListView {
    public int OooO;
    public final Rect OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public mt OooOO0;
    public boolean OooOO0O;
    public final boolean OooOO0o;
    public mn0 OooOOO;
    public boolean OooOOO0;
    public o00OOO00 OooOOOO;

    public ot(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.OooO0Oo = new Rect();
        this.OooO0o0 = 0;
        this.OooO0o = 0;
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooOO0o = z;
        setCacheColorHint(0);
    }

    public final int OooO00o(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooO0O0(android.view.MotionEvent r18, int r19) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ot.OooO0O0(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.OooO0Oo;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.OooOOOO != null) {
            return;
        }
        super.drawableStateChanged();
        mt mtVar = this.OooOO0;
        if (mtVar != null) {
            mtVar.OooO0o0 = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.OooOOO0 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.OooOO0o || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.OooOO0o || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.OooOO0o || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.OooOO0o && this.OooOO0O) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.OooOOOO = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.OooOOOO == null) {
            o00OOO00 o00ooo00 = new o00OOO00(this, 17);
            this.OooOOOO = o00ooo00;
            post(o00ooo00);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !kt.OooO0Oo) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        kt.OooO00o.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        kt.OooO0O0.invoke(this, Integer.valueOf(iPointToPosition));
                        kt.OooO0OO.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.OooOOO0 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.OooO = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        o00OOO00 o00ooo00 = this.OooOOOO;
        if (o00ooo00 != null) {
            ot otVar = (ot) o00ooo00.OooO0o0;
            otVar.OooOOOO = null;
            otVar.removeCallbacks(o00ooo00);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.OooOO0O = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        mt mtVar = null;
        if (drawable != null) {
            mt mtVar2 = new mt();
            Drawable drawable2 = mtVar2.OooO0Oo;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            mtVar2.OooO0Oo = drawable;
            drawable.setCallback(mtVar2);
            mtVar2.OooO0o0 = true;
            mtVar = mtVar2;
        }
        this.OooOO0 = mtVar;
        super.setSelector(mtVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.OooO0o0 = rect.left;
        this.OooO0o = rect.top;
        this.OooO0oO = rect.right;
        this.OooO0oo = rect.bottom;
    }
}
