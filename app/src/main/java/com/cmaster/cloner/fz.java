package com.cmaster.cloner;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fz extends g71 implements l71 {
    public static final int[] Oooo000 = {android.R.attr.state_pressed};
    public static final int[] Oooo00O = new int[0];
    public final int OooO;
    public final int OooO0Oo;
    public final StateListDrawable OooO0o;
    public final int OooO0o0;
    public final Drawable OooO0oO;
    public final int OooO0oo;
    public final StateListDrawable OooOO0;
    public final Drawable OooOO0O;
    public final int OooOO0o;
    public int OooOOO;
    public final int OooOOO0;
    public int OooOOOO;
    public float OooOOOo;
    public int OooOOo;
    public int OooOOo0;
    public float OooOOoo;
    public final RecyclerView OooOo0O;
    public final ValueAnimator OooOoo;
    public int OooOooO;
    public final o00OOO00 OooOooo;
    public int OooOo00 = 0;
    public int OooOo0 = 0;
    public boolean OooOo0o = false;
    public boolean OooOo = false;
    public int OooOoO0 = 0;
    public int OooOoO = 0;
    public final int[] OooOoOO = new int[2];
    public final int[] OooOoo0 = new int[2];

    public fz(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.OooOoo = valueAnimatorOfFloat;
        this.OooOooO = 0;
        o00OOO00 o00ooo00 = new o00OOO00(this, 22);
        this.OooOooo = o00ooo00;
        dz dzVar = new dz(this, 1);
        this.OooO0o = stateListDrawable;
        this.OooO0oO = drawable;
        this.OooOO0 = stateListDrawable2;
        this.OooOO0O = drawable2;
        this.OooO0oo = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.OooO = Math.max(i, drawable.getIntrinsicWidth());
        this.OooOO0o = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.OooOOO0 = Math.max(i, drawable2.getIntrinsicWidth());
        this.OooO0Oo = i2;
        this.OooO0o0 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new hy(this));
        valueAnimatorOfFloat.addUpdateListener(new u8(this, 4));
        RecyclerView recyclerView2 = this.OooOo0O;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.OooooOo(this);
            RecyclerView recyclerView3 = this.OooOo0O;
            recyclerView3.OooOo00.remove(this);
            if (recyclerView3.OooOo0 == this) {
                recyclerView3.OooOo0 = null;
            }
            ArrayList arrayList = this.OooOo0O.OoooooO;
            if (arrayList != null) {
                arrayList.remove(dzVar);
            }
            this.OooOo0O.removeCallbacks(o00ooo00);
        }
        this.OooOo0O = recyclerView;
        recyclerView.OooOO0O(this);
        this.OooOo0O.OooOo00.add(this);
        RecyclerView recyclerView4 = this.OooOo0O;
        if (recyclerView4.OoooooO == null) {
            recyclerView4.OoooooO = new ArrayList();
        }
        recyclerView4.OoooooO.add(dzVar);
    }

    public static int OooO(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // com.cmaster.cloner.l71
    public final void OooO00o(MotionEvent motionEvent) {
        if (this.OooOoO0 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zOooO0oo = OooO0oo(motionEvent.getX(), motionEvent.getY());
            boolean zOooO0oO = OooO0oO(motionEvent.getX(), motionEvent.getY());
            if (zOooO0oo || zOooO0oO) {
                if (zOooO0oO) {
                    this.OooOoO = 1;
                    this.OooOOoo = (int) motionEvent.getX();
                } else if (zOooO0oo) {
                    this.OooOoO = 2;
                    this.OooOOOo = (int) motionEvent.getY();
                }
                OooOO0(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.OooOoO0 == 2) {
            this.OooOOOo = 0.0f;
            this.OooOOoo = 0.0f;
            OooOO0(1);
            this.OooOoO = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.OooOoO0 == 2) {
            OooOO0O();
            int i = this.OooOoO;
            RecyclerView recyclerView = this.OooOo0O;
            int i2 = this.OooO0o0;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.OooOoo0;
                iArr[0] = i2;
                int i3 = this.OooOo00 - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.OooOOo - fMax) >= 2.0f) {
                    int iOooO = OooO(this.OooOOoo, fMax, iArr, recyclerView.computeHorizontalScrollRange(), recyclerView.computeHorizontalScrollOffset(), this.OooOo00);
                    if (iOooO != 0) {
                        recyclerView.scrollBy(iOooO, 0);
                    }
                    this.OooOOoo = fMax;
                }
            }
            if (this.OooOoO == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.OooOoOO;
                iArr2[0] = i2;
                int i4 = this.OooOo0 - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.OooOOOO - fMax2) < 2.0f) {
                    return;
                }
                int iOooO2 = OooO(this.OooOOOo, fMax2, iArr2, recyclerView.computeVerticalScrollRange(), recyclerView.computeVerticalScrollOffset(), this.OooOo0);
                if (iOooO2 != 0) {
                    recyclerView.scrollBy(0, iOooO2);
                }
                this.OooOOOo = fMax2;
            }
        }
    }

    @Override // com.cmaster.cloner.l71
    public final boolean OooO0O0(MotionEvent motionEvent) {
        int i = this.OooOoO0;
        if (i != 1) {
            return i == 2;
        }
        boolean zOooO0oo = OooO0oo(motionEvent.getX(), motionEvent.getY());
        boolean zOooO0oO = OooO0oO(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zOooO0oo && !zOooO0oO) {
            return false;
        }
        if (zOooO0oO) {
            this.OooOoO = 1;
            this.OooOOoo = (int) motionEvent.getX();
        } else if (zOooO0oo) {
            this.OooOoO = 2;
            this.OooOOOo = (int) motionEvent.getY();
        }
        OooOO0(2);
        return true;
    }

    @Override // com.cmaster.cloner.l71
    public final void OooO0OO(boolean z) {
    }

    @Override // com.cmaster.cloner.g71
    public final void OooO0o(Canvas canvas, RecyclerView recyclerView) {
        int i = this.OooOo00;
        RecyclerView recyclerView2 = this.OooOo0O;
        if (i != recyclerView2.getWidth() || this.OooOo0 != recyclerView2.getHeight()) {
            this.OooOo00 = recyclerView2.getWidth();
            this.OooOo0 = recyclerView2.getHeight();
            OooOO0(0);
            return;
        }
        if (this.OooOooO != 0) {
            if (this.OooOo0o) {
                int i2 = this.OooOo00;
                int i3 = this.OooO0oo;
                int i4 = i2 - i3;
                int i5 = this.OooOOOO;
                int i6 = this.OooOOO;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.OooO0o;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.OooO;
                int i9 = this.OooOo0;
                Drawable drawable = this.OooO0oO;
                drawable.setBounds(0, 0, i8, i9);
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.OooOo) {
                int i10 = this.OooOo0;
                int i11 = this.OooOO0o;
                int i12 = i10 - i11;
                int i13 = this.OooOOo;
                int i14 = this.OooOOo0;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.OooOO0;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.OooOo00;
                int i17 = this.OooOOO0;
                Drawable drawable2 = this.OooOO0O;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean OooO0oO(float f, float f2) {
        if (f2 < this.OooOo0 - this.OooOO0o) {
            return false;
        }
        int i = this.OooOOo;
        int i2 = this.OooOOo0;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final boolean OooO0oo(float f, float f2) {
        int layoutDirection = this.OooOo0O.getLayoutDirection();
        int i = this.OooO0oo;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.OooOo00 - i) {
            return false;
        }
        int i2 = this.OooOOOO;
        int i3 = this.OooOOO / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void OooOO0(int i) {
        RecyclerView recyclerView = this.OooOo0O;
        o00OOO00 o00ooo00 = this.OooOooo;
        StateListDrawable stateListDrawable = this.OooO0o;
        if (i == 2 && this.OooOoO0 != 2) {
            stateListDrawable.setState(Oooo000);
            recyclerView.removeCallbacks(o00ooo00);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            OooOO0O();
        }
        if (this.OooOoO0 == 2 && i != 2) {
            stateListDrawable.setState(Oooo00O);
            recyclerView.removeCallbacks(o00ooo00);
            recyclerView.postDelayed(o00ooo00, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(o00ooo00);
            recyclerView.postDelayed(o00ooo00, 1500L);
        }
        this.OooOoO0 = i;
    }

    public final void OooOO0O() {
        int i = this.OooOooO;
        ValueAnimator valueAnimator = this.OooOoo;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.OooOooO = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
