package com.cmaster.cloner;

import android.accounts.Account;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.matrix.ui.qrcode.ActivityBarCodeHistory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o00Oo00 implements bl1 {
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o;
    public int OooO0o0;
    public Object OooO0oO;
    public static final tj0 OooO0oo = new tj0(0);
    public static final tj0 OooO = new tj0(1);

    public o00Oo00(int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 8:
                break;
            default:
                this.OooO0o = new Object[8];
                this.OooO0o0 = 0;
                break;
        }
    }

    public static void OooO0O0(y71 y71Var) {
        View view = y71Var.OooO00o;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = nt1.OooO00o;
            ft1.OooOO0(view, fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static int OooO0OO(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public static int OooO0Oo(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f7, code lost:
    
        if (r11 == 1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fa, code lost:
    
        if (r11 == 2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fc, code lost:
    
        r16 = (int[]) r0.OooO0o0;
        r17 = (float[]) r0.OooO0o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020a, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020c, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020e, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021b, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021e, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0221, code lost:
    
        r11 = new android.graphics.LinearGradient(r20, r21, r25, r26, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0224, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0226, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.OooO0o0, (float[]) r0.OooO0o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0238, code lost:
    
        if (r24 <= 0.0f) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x023a, code lost:
    
        r20 = (int[]) r0.OooO0o0;
        r21 = (float[]) r0.OooO0o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0249, code lost:
    
        if (r10 == 1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024b, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024c, code lost:
    
        if (r10 == 2) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x024e, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025c, code lost:
    
        r15 = 2;
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0260, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r24, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x026c, code lost:
    
        return new com.cmaster.cloner.o00Oo00(r11, null, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0274, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01dc, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01de, code lost:
    
        r0 = new com.cmaster.cloner.e81(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e4, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e5, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e9, code lost:
    
        if (r19 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01eb, code lost:
    
        r0 = new com.cmaster.cloner.e81(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f1, code lost:
    
        r0 = new com.cmaster.cloner.e81(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.cmaster.cloner.o00Oo00 OooO0o0(int r29, android.content.res.Resources.Theme r30, android.content.res.Resources r31) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.o00Oo00.OooO0o0(int, android.content.res.Resources$Theme, android.content.res.Resources):com.cmaster.cloner.o00Oo00");
    }

    public boolean OooO(o00Oo00 o00oo00) {
        int i = this.OooO0o0;
        int i2 = o00oo00.OooO0o0;
        if (i != i2 && i != -1 && i2 != -1) {
            return false;
        }
        Account account = (Account) o00oo00.OooO0o;
        boolean zEquals = account == null ? true : ((Account) this.OooO0o).equals(account);
        String str = (String) o00oo00.OooO0oO;
        return zEquals && (str == null ? true : ((String) this.OooO0oO).equals(str));
    }

    public void OooO00o() {
        in1 in1Var;
        ImageView imageView = (ImageView) this.OooO0o;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            ct.OooO00o(drawable);
        }
        if (drawable == null || (in1Var = (in1) this.OooO0oO) == null) {
            return;
        }
        n.OooO0o0(drawable, in1Var, imageView.getDrawableState());
    }

    public int OooO0o(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.OooO0o0 == -1) {
            this.OooO0o0 = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (OooO0oo.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (OooO.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.OooO0o0)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    public boolean OooO0oO() {
        ColorStateList colorStateList;
        return ((Shader) this.OooO0o) == null && (colorStateList = (ColorStateList) this.OooO0oO) != null && colorStateList.isStateful();
    }

    public void OooO0oo(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.OooO0o;
        Context context = imageView.getContext();
        int[] iArr = l61.OooO0o;
        a02 a02VarOooo0OO = a02.Oooo0OO(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) a02VarOooo0OO.OooO0o;
        nt1.OooOO0o(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) a02VarOooo0OO.OooO0o, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = ym2.OooO00o(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                ct.OooO00o(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(a02VarOooo0OO.OooOOOo(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(ct.OooO0OO(typedArray.getInt(3, -1), null));
            }
            a02VarOooo0OO.Oooo0oO();
        } catch (Throwable th) {
            a02VarOooo0OO.Oooo0oO();
            throw th;
        }
    }

    public void OooOO0(Canvas canvas, RecyclerView recyclerView, y71 y71Var, float f, float f2, int i, boolean z) {
        View view = y71Var.OooO00o;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = nt1.OooO00o;
            Float fValueOf = Float.valueOf(ft1.OooO0o0(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = nt1.OooO00o;
                    float fOooO0o0 = ft1.OooO0o0(childAt);
                    if (fOooO0o0 > f3) {
                        f3 = fOooO0o0;
                    }
                }
            }
            ft1.OooOO0(view, f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (i != 1 || f >= 0.0f) {
            return;
        }
        View view2 = y71Var.OooO00o;
        Paint paint = new Paint();
        paint.setColor(((ActivityBarCodeHistory) this.OooO0oO).getColor(R.color.colorPrimary));
        canvas.drawRect(new RectF((view2.getRight() + f) - 40.0f, view2.getTop(), view2.getRight(), view2.getBottom()), paint);
        paint.setColor(-1);
        paint.setTextSize(40.0f);
        paint.setAntiAlias(true);
        String strOooO00o = sn2.OooO00o("VQFuZ9jdupAJSi0=\n", "J2QDCK601Pc=\n");
        canvas.drawText(strOooO00o, (view2.getRight() - paint.measureText(strOooO00o)) - 40.0f, (view2.getHeight() / 2.0f) + view2.getTop() + 20.0f, paint);
    }

    @Override // com.cmaster.cloner.bl1
    public Object OooOO0O() {
        yn1 yn1Var = (yn1) this.OooO0o;
        ((a02) yn1Var.OooO0oO).OoooO00((g5) this.OooO0oO, this.OooO0o0 + 1, false);
        return null;
    }

    public va1 OooOO0o(ho1 ho1Var) {
        int i = this.OooO0o0;
        ArrayList arrayList = (ArrayList) this.OooO0oO;
        if (i >= arrayList.size()) {
            throw new AssertionError();
        }
        dj0 dj0Var = (dj0) arrayList.get(i);
        va1 va1VarOooO00o = dj0Var.OooO00o(new o00Oo00(i + 1, arrayList, ho1Var));
        if (va1VarOooO00o != null) {
            return va1VarOooO00o;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{47, -115, 103, -127, 72, 13, -113, -72, 50, -116, 97, -60}, new byte[]{70, -29, 19, -28, 58, 110, -22, -56}));
        sb.append(dj0Var);
        qa.OooOOO0(rj.OooO0oo(new byte[]{117, -41, -71, 80, 40, -77, 55, -28, 49, -123, -78, 81, 49, -83}, new byte[]{85, -91, -36, 36, 93, -63, 89, -127}, sb));
        return null;
    }

    public void OooOOO(String str, iz izVar) {
        int i = this.OooO0o0 + 1;
        Object[] objArr = (Object[]) this.OooO0o;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.OooO0o = Arrays.copyOf(objArr, i3);
        }
        Object[] objArr2 = (Object[]) this.OooO0o;
        int i4 = this.OooO0o0;
        int i5 = i4 + i4;
        objArr2[i5] = str;
        objArr2[i5 + 1] = izVar;
        this.OooO0o0 = i4 + 1;
    }

    public void OooOOO0(int i) {
        ImageView imageView = (ImageView) this.OooO0o;
        if (i != 0) {
            Drawable drawableOooO00o = ym2.OooO00o(imageView.getContext(), i);
            if (drawableOooO00o != null) {
                ct.OooO00o(drawableOooO00o);
            }
            imageView.setImageDrawable(drawableOooO00o);
        } else {
            imageView.setImageDrawable(null);
        }
        OooO00o();
    }

    public byte[] OooOOOO(int i) throws IOException {
        pk2 pk2Var;
        zx0 zx0Var;
        d83 d83Var = d83.OooO0oO;
        yn1 yn1Var = (yn1) this.OooO0o;
        ((ax2) this.OooO0oO).OooO0oo = Boolean.valueOf(1 == (i ^ 1));
        ax2 ax2Var = (ax2) this.OooO0oO;
        ax2Var.OooO0o = Boolean.FALSE;
        yn1Var.OooO0o0 = new ab3(ax2Var);
        try {
            qc3.OooO00o();
            if (i == 0) {
                g63 g63Var = new g63(yn1Var);
                uk0 uk0Var = new uk0();
                d83Var.OooO0oo(uk0Var);
                uk0Var.OooO0oO = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    wk0 wk0Var = new wk0(stringWriter, uk0Var.OooO0Oo, uk0Var.OooO0o0, uk0Var.OooO0o, uk0Var.OooO0oO);
                    wk0Var.OooO0o0(g63Var);
                    wk0Var.OooO0oO();
                    wk0Var.OooO0O0.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            g63 g63Var2 = new g63(yn1Var);
            hx2 hx2Var = new hx2(1);
            d83Var.OooO0oo(hx2Var);
            HashMap map = new HashMap((HashMap) hx2Var.OooO0o0);
            HashMap map2 = new HashMap((HashMap) hx2Var.OooO0o);
            rk0 rk0Var = (rk0) hx2Var.OooO0oO;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                pk2Var = new pk2(byteArrayOutputStream, map, map2, rk0Var);
                zx0Var = (zx0) map.get(g63.class);
            } catch (IOException unused2) {
            }
            if (zx0Var == null) {
                throw new ew("No encoder for ".concat(String.valueOf(g63.class)));
            }
            zx0Var.OooO00o(g63Var2, pk2Var);
            return byteArrayOutputStream.toByteArray();
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public String toString() {
        switch (this.OooO0Oo) {
            case 5:
                StringBuilder sb = new StringBuilder();
                Account account = (Account) this.OooO0o;
                sb.append(account == null ? u7.OooO00o(new byte[]{-29, -98, -10, 9, 106, -48, -10, -103}, new byte[]{-94, -46, -70, 41, 43, -109, -75, -54}) : account.name);
                sb.append(u7.OooO00o(new byte[]{-122}, new byte[]{-87, -32, -119, -2, 32, 18, -87, 32}));
                String strOooO00o = (String) this.OooO0oO;
                if (strOooO00o == null) {
                    strOooO00o = u7.OooO00o(new byte[]{46, -16, -82, -6, 17, 31, -68, -47}, new byte[]{111, -68, -30, -38, 65, 91, -18, -126});
                }
                sb.append(strOooO00o);
                sb.append(u7.OooO00o(new byte[]{18, 79}, new byte[]{40, 58, 52, 125, 31, -114, -8, 116}) + this.OooO0o0);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o00Oo00(Object obj, Object obj2, int i, int i2) {
        this.OooO0Oo = i2;
        this.OooO0o = obj;
        this.OooO0oO = obj2;
        this.OooO0o0 = i;
    }

    public o00Oo00(yn1 yn1Var, int i) {
        this.OooO0Oo = 9;
        this.OooO0oO = new ax2();
        this.OooO0o = yn1Var;
        qc3.OooO00o();
        this.OooO0o0 = i;
    }

    public o00Oo00(int i, ArrayList arrayList, ho1 ho1Var) {
        this.OooO0Oo = 4;
        this.OooO0oO = arrayList;
        this.OooO0o0 = i;
        this.OooO0o = ho1Var;
    }

    public o00Oo00(ImageView imageView) {
        this.OooO0Oo = 1;
        this.OooO0o0 = 0;
        this.OooO0o = imageView;
    }

    public o00Oo00(bj bjVar) {
        this.OooO0Oo = 3;
        this.OooO0oO = z52.OooO00o(150, new ay1(this, 18));
        this.OooO0o = bjVar;
    }

    public o00Oo00(ActivityBarCodeHistory activityBarCodeHistory, oo00oO oo00oo) {
        this.OooO0Oo = 0;
        this.OooO0oO = activityBarCodeHistory;
        this.OooO0o = oo00oo;
        this.OooO0o0 = -1;
    }
}
