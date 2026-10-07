package com.cmaster.cloner;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hc extends Property {
    public final /* synthetic */ int OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc(Class cls, String str, int i) {
        super(cls, str);
        this.OooO00o = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.OooO00o) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((hd) obj).OooOO0O);
            case 6:
                return Float.valueOf(((hd) obj).OooOO0o);
            case 7:
                return Float.valueOf(((jd) obj).OooOO0O);
            case 8:
                return Float.valueOf(((jd) obj).OooOO0o);
            case 9:
                return Float.valueOf(((et) obj).OooO0O0());
            case 10:
                return Float.valueOf(((SwitchCompat) obj).OooOoo);
            case 11:
                return Float.valueOf(mu1.OooO00o.OooO00o((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.OooO00o) {
            case 0:
                kc kcVar = (kc) obj;
                PointF pointF = (PointF) obj2;
                kcVar.getClass();
                kcVar.OooO00o = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                kcVar.OooO0O0 = iRound;
                int i = kcVar.OooO0o + 1;
                kcVar.OooO0o = i;
                if (i == kcVar.OooO0oO) {
                    mu1.OooO00o(kcVar.OooO0o0, kcVar.OooO00o, iRound, kcVar.OooO0OO, kcVar.OooO0Oo);
                    kcVar.OooO0o = 0;
                    kcVar.OooO0oO = 0;
                    break;
                }
                break;
            case 1:
                kc kcVar2 = (kc) obj;
                PointF pointF2 = (PointF) obj2;
                kcVar2.getClass();
                kcVar2.OooO0OO = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                kcVar2.OooO0Oo = iRound2;
                int i2 = kcVar2.OooO0oO + 1;
                kcVar2.OooO0oO = i2;
                if (kcVar2.OooO0o == i2) {
                    mu1.OooO00o(kcVar2.OooO0o0, kcVar2.OooO00o, kcVar2.OooO0O0, kcVar2.OooO0OO, iRound2);
                    kcVar2.OooO0o = 0;
                    kcVar2.OooO0oO = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                mu1.OooO00o(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                mu1.OooO00o(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                mu1.OooO00o(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                hd hdVar = (hd) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                hdVar.OooOO0O = fFloatValue;
                int i3 = (int) (fFloatValue * 5400.0f);
                yy yyVar = hdVar.OooO0oo;
                ArrayList arrayList = (ArrayList) hdVar.OooO0o0;
                ft ftVar = (ft) arrayList.get(0);
                float f = hdVar.OooOO0O * 1520.0f;
                ftVar.OooO00o = (-20.0f) + f;
                ftVar.OooO0O0 = f;
                for (int i4 = 0; i4 < 4; i4++) {
                    ftVar.OooO0O0 = (yyVar.getInterpolation(h.OooO0oo(i3, hd.OooOOO[i4], 667)) * 250.0f) + ftVar.OooO0O0;
                    ftVar.OooO00o = (yyVar.getInterpolation(h.OooO0oo(i3, hd.OooOOOO[i4], 667)) * 250.0f) + ftVar.OooO00o;
                }
                float f2 = ftVar.OooO00o;
                float f3 = ftVar.OooO0O0;
                ftVar.OooO00o = (((f3 - f2) * hdVar.OooOO0o) + f2) / 360.0f;
                ftVar.OooO0O0 = f3 / 360.0f;
                int i5 = 0;
                while (true) {
                    if (i5 < 4) {
                        float fOooO0oo = h.OooO0oo(i3, hd.OooOOOo[i5], 333);
                        if (fOooO0oo <= 0.0f || fOooO0oo >= 1.0f) {
                            i5++;
                        } else {
                            int i6 = i5 + hdVar.OooOO0;
                            int[] iArr = hdVar.OooO.OooO0o0;
                            int length = i6 % iArr.length;
                            int length2 = (length + 1) % iArr.length;
                            ((ft) arrayList.get(0)).OooO0OO = c3.OooO00o(yyVar.getInterpolation(fOooO0oo), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[length2])).intValue();
                        }
                    }
                }
                ((eg0) hdVar.OooO0Oo).invalidateSelf();
                break;
            case 6:
                ((hd) obj).OooOO0o = ((Float) obj2).floatValue();
                break;
            case 7:
                jd jdVar = (jd) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                jdVar.OooOO0O = fFloatValue2;
                int i7 = (int) (fFloatValue2 * 6000.0f);
                TimeInterpolator timeInterpolator = jdVar.OooO0oo;
                ArrayList arrayList2 = (ArrayList) jdVar.OooO0o0;
                ft ftVar2 = (ft) arrayList2.get(0);
                float f4 = jdVar.OooOO0O * 1080.0f;
                int[] iArr2 = jd.OooOOOO;
                float interpolation = 0.0f;
                for (int i8 : iArr2) {
                    interpolation += timeInterpolator.getInterpolation(h.OooO0oo(i7, i8, 500)) * 90.0f;
                }
                ftVar2.OooO0o = f4 + interpolation;
                float interpolation2 = timeInterpolator.getInterpolation(h.OooO0oo(i7, 0, 3000)) - timeInterpolator.getInterpolation(h.OooO0oo(i7, 3000, 3000));
                ftVar2.OooO00o = 0.0f;
                float[] fArr = jd.OooOOOo;
                float fOooO00o = aw2.OooO00o(fArr[0], fArr[1], interpolation2);
                ftVar2.OooO0O0 = fOooO00o;
                float f5 = jdVar.OooOO0o;
                if (f5 > 0.0f) {
                    ftVar2.OooO0O0 = (1.0f - f5) * fOooO00o;
                }
                int i9 = 0;
                while (true) {
                    if (i9 < iArr2.length) {
                        float fOooO0oo2 = h.OooO0oo(i7, iArr2[i9], 100);
                        if (fOooO0oo2 < 0.0f || fOooO0oo2 > 1.0f) {
                            i9++;
                        } else {
                            int i10 = i9 + jdVar.OooOO0;
                            int[] iArr3 = jdVar.OooO.OooO0o0;
                            int length3 = i10 % iArr3.length;
                            int length4 = (length3 + 1) % iArr3.length;
                            ((ft) arrayList2.get(0)).OooO0OO = c3.OooO00o(timeInterpolator.getInterpolation(fOooO0oo2), Integer.valueOf(iArr3[length3]), Integer.valueOf(iArr3[length4])).intValue();
                        }
                    }
                }
                ((eg0) jdVar.OooO0Oo).invalidateSelf();
                break;
            case 8:
                ((jd) obj).OooOO0o = ((Float) obj2).floatValue();
                break;
            case 9:
                et etVar = (et) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                if (etVar.OooOO0o != fFloatValue3) {
                    etVar.OooOO0o = fFloatValue3;
                    etVar.invalidateSelf();
                    break;
                }
                break;
            case 10:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 11:
                mu1.OooO00o.OooO0O0((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
