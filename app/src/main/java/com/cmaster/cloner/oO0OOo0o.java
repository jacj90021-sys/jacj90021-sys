package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.zzbcj;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO0OOo0o {
    public int OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;
    public Object OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;

    public oO0OOo0o(StringWriter stringWriter, int i, int i2, String str) {
        if (stringWriter == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{1, -23, -64, -13, -58, 112, 68, -22, 27, -16, -40}, new byte[]{110, -100, -76, -45, -5, 77, 100, -124}));
            throw null;
        }
        if (i < 1) {
            ra.OooOOO(u7.OooO00o(new byte[]{-88, -64, -114, 67, -7, -32, 103, -38, -84, -123, -44, 23, -97}, new byte[]{-60, -91, -24, 55, -82, -119, 3, -82}));
            throw null;
        }
        if (i2 < 1) {
            ra.OooOOO(u7.OooO00o(new byte[]{64, 13, 110, -78, -98, 2, 64, -121, 70, 12, 41, -26, -54, 100}, new byte[]{50, 100, 9, -38, -22, 85, 41, -29}));
            throw null;
        }
        StringWriter stringWriter2 = new StringWriter(zzbcj.zzq.zzf);
        StringWriter stringWriter3 = new StringWriter(zzbcj.zzq.zzf);
        this.OooO0O0 = stringWriter;
        this.OooO00o = i;
        this.OooO0OO = stringWriter2.getBuffer();
        this.OooO0Oo = stringWriter3.getBuffer();
        this.OooO0o0 = new dg0(stringWriter2, i, "");
        this.OooO0o = new dg0(stringWriter3, i2, str);
    }

    public static void OooO00o(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }

    public ColorStateList OooO() {
        in1 in1Var = (in1) this.OooO0o0;
        if (in1Var != null) {
            return in1Var.OooO00o;
        }
        return null;
    }

    public void OooO0O0() {
        View view = (View) this.OooO0O0;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((in1) this.OooO0Oo) != null) {
                if (((in1) this.OooO0o) == null) {
                    this.OooO0o = new in1();
                }
                in1 in1Var = (in1) this.OooO0o;
                in1Var.OooO00o = null;
                in1Var.OooO0Oo = false;
                in1Var.OooO0O0 = null;
                in1Var.OooO0OO = false;
                WeakHashMap weakHashMap = nt1.OooO00o;
                ColorStateList colorStateListOooO0OO = ft1.OooO0OO(view);
                if (colorStateListOooO0OO != null) {
                    in1Var.OooO0Oo = true;
                    in1Var.OooO00o = colorStateListOooO0OO;
                }
                PorterDuff.Mode modeOooO0Oo = ft1.OooO0Oo(view);
                if (modeOooO0Oo != null) {
                    in1Var.OooO0OO = true;
                    in1Var.OooO0O0 = modeOooO0Oo;
                }
                if (in1Var.OooO0Oo || in1Var.OooO0OO) {
                    n.OooO0o0(background, in1Var, view.getDrawableState());
                    return;
                }
            }
            in1 in1Var2 = (in1) this.OooO0o0;
            if (in1Var2 != null) {
                n.OooO0o0(background, in1Var2, view.getDrawableState());
                return;
            }
            in1 in1Var3 = (in1) this.OooO0Oo;
            if (in1Var3 != null) {
                n.OooO0o0(background, in1Var3, view.getDrawableState());
            }
        }
    }

    public boolean OooO0OO(int i) {
        ArrayList arrayList = (ArrayList) this.OooO0Oo;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ooOOOOoo oooooooo = (ooOOOOoo) arrayList.get(i2);
            int i3 = oooooooo.OooO00o;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = oooooooo.OooO0O0;
                    int i5 = oooooooo.OooO0Oo + i4;
                    while (i4 < i5) {
                        if (OooO0oo(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (OooO0oo(oooooooo.OooO0Oo, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void OooO0Oo() {
        ArrayList arrayList = (ArrayList) this.OooO0Oo;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((y61) this.OooO0o0).OooO00o((ooOOOOoo) arrayList.get(i));
        }
        OooOOoo(arrayList);
        this.OooO00o = 0;
    }

    public void OooO0o(ooOOOOoo oooooooo) {
        int i;
        s31 s31Var = (s31) this.OooO0O0;
        int i2 = oooooooo.OooO00o;
        if (i2 == 1 || i2 == 8) {
            ra.OooOOO("should not dispatch add or move for pre layout");
            return;
        }
        int iOooOo0o = OooOo0o(oooooooo.OooO0O0, i2);
        int i3 = oooooooo.OooO0O0;
        int i4 = oooooooo.OooO00o;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                sa.OooOO0o(oooooooo, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < oooooooo.OooO0Oo; i6++) {
            int iOooOo0o2 = OooOo0o((i * i6) + oooooooo.OooO0O0, oooooooo.OooO00o);
            int i7 = oooooooo.OooO00o;
            if (i7 == 2 ? iOooOo0o2 != iOooOo0o : !(i7 == 4 && iOooOo0o2 == iOooOo0o + 1)) {
                ooOOOOoo ooooooooOooOOO0 = OooOOO0(i7, iOooOo0o, i5, oooooooo.OooO0OO);
                OooO0oO(ooooooooOooOOO0, i3);
                ooooooooOooOOO0.OooO0OO = null;
                s31Var.OooO0O0(ooooooooOooOOO0);
                if (oooooooo.OooO00o == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iOooOo0o = iOooOo0o2;
            } else {
                i5++;
            }
        }
        Object obj = oooooooo.OooO0OO;
        oooooooo.OooO0OO = null;
        s31Var.OooO0O0(oooooooo);
        if (i5 > 0) {
            ooOOOOoo ooooooooOooOOO02 = OooOOO0(oooooooo.OooO00o, iOooOo0o, i5, obj);
            OooO0oO(ooooooooOooOOO02, i3);
            ooooooooOooOOO02.OooO0OO = null;
            s31Var.OooO0O0(ooooooooOooOOO02);
        }
    }

    public void OooO0o0() {
        y61 y61Var = (y61) this.OooO0o0;
        OooO0Oo();
        ArrayList arrayList = (ArrayList) this.OooO0OO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ooOOOOoo oooooooo = (ooOOOOoo) arrayList.get(i);
            int i2 = oooooooo.OooO00o;
            if (i2 == 1) {
                y61Var.OooO00o(oooooooo);
                y61Var.OooO0Oo(oooooooo.OooO0O0, oooooooo.OooO0Oo);
            } else if (i2 == 2) {
                y61Var.OooO00o(oooooooo);
                int i3 = oooooooo.OooO0O0;
                int i4 = oooooooo.OooO0Oo;
                RecyclerView recyclerView = y61Var.OooO00o;
                recyclerView.OoooOO0(i3, i4, true);
                recyclerView.Ooooooo = true;
                recyclerView.Oooooo0.OooO0OO += i4;
            } else if (i2 == 4) {
                y61Var.OooO00o(oooooooo);
                y61Var.OooO0OO(oooooooo.OooO0O0, oooooooo.OooO0Oo, oooooooo.OooO0OO);
            } else if (i2 == 8) {
                y61Var.OooO00o(oooooooo);
                y61Var.OooO0o0(oooooooo.OooO0O0, oooooooo.OooO0Oo);
            }
        }
        OooOOoo(arrayList);
        this.OooO00o = 0;
    }

    public void OooO0oO(ooOOOOoo oooooooo, int i) {
        y61 y61Var = (y61) this.OooO0o0;
        y61Var.OooO00o(oooooooo);
        int i2 = oooooooo.OooO00o;
        if (i2 != 2) {
            if (i2 == 4) {
                y61Var.OooO0OO(i, oooooooo.OooO0Oo, oooooooo.OooO0OO);
                return;
            } else {
                ra.OooOOO("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = oooooooo.OooO0Oo;
        RecyclerView recyclerView = y61Var.OooO00o;
        recyclerView.OoooOO0(i, i3, true);
        recyclerView.Ooooooo = true;
        recyclerView.Oooooo0.OooO0OO += i3;
    }

    public int OooO0oo(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.OooO0Oo;
        int size = arrayList.size();
        while (i2 < size) {
            ooOOOOoo oooooooo = (ooOOOOoo) arrayList.get(i2);
            int i3 = oooooooo.OooO00o;
            int i4 = oooooooo.OooO0O0;
            if (i3 == 8) {
                if (i4 == i) {
                    i = oooooooo.OooO0Oo;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (oooooooo.OooO0Oo <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = oooooooo.OooO0Oo;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += oooooooo.OooO0Oo;
            }
            i2++;
        }
        return i;
    }

    public PorterDuff.Mode OooOO0() {
        in1 in1Var = (in1) this.OooO0o0;
        if (in1Var != null) {
            return in1Var.OooO0O0;
        }
        return null;
    }

    public boolean OooOO0O() {
        return ((ArrayList) this.OooO0OO).size() > 0;
    }

    public void OooOO0o(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListOooO0oO;
        View view = (View) this.OooO0O0;
        Context context = view.getContext();
        int[] iArr = l61.OooOoOO;
        a02 a02VarOooo0OO = a02.Oooo0OO(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) a02VarOooo0OO.OooO0o;
        View view2 = (View) this.OooO0O0;
        nt1.OooOO0o(view2, view2.getContext(), iArr, attributeSet, (TypedArray) a02VarOooo0OO.OooO0o, i);
        try {
            if (typedArray.hasValue(0)) {
                this.OooO00o = typedArray.getResourceId(0, -1);
                n nVar = (n) this.OooO0OO;
                Context context2 = view.getContext();
                int i2 = this.OooO00o;
                synchronized (nVar) {
                    colorStateListOooO0oO = nVar.OooO00o.OooO0oO(context2, i2);
                }
                if (colorStateListOooO0oO != null) {
                    OooOo00(colorStateListOooO0oO);
                }
            }
            if (typedArray.hasValue(1)) {
                ft1.OooO0oo(view, a02VarOooo0OO.OooOOOo(1));
            }
            if (typedArray.hasValue(2)) {
                ft1.OooO(view, ct.OooO0OO(typedArray.getInt(2, -1), null));
            }
            a02VarOooo0OO.Oooo0oO();
        } catch (Throwable th) {
            a02VarOooo0OO.Oooo0oO();
            throw th;
        }
    }

    public void OooOOO() {
        this.OooO00o = -1;
        OooOo00(null);
        OooO0O0();
    }

    public ooOOOOoo OooOOO0(int i, int i2, int i3, Object obj) {
        ooOOOOoo oooooooo = (ooOOOOoo) ((s31) this.OooO0O0).OooO0oo();
        if (oooooooo != null) {
            oooooooo.OooO00o = i;
            oooooooo.OooO0O0 = i2;
            oooooooo.OooO0Oo = i3;
            oooooooo.OooO0OO = obj;
            return oooooooo;
        }
        ooOOOOoo oooooooo2 = new ooOOOOoo();
        oooooooo2.OooO00o = i;
        oooooooo2.OooO0O0 = i2;
        oooooooo2.OooO0Oo = i3;
        oooooooo2.OooO0OO = obj;
        return oooooooo2;
    }

    public void OooOOOO(int i) {
        ColorStateList colorStateListOooO0oO;
        this.OooO00o = i;
        n nVar = (n) this.OooO0OO;
        if (nVar != null) {
            Context context = ((View) this.OooO0O0).getContext();
            synchronized (nVar) {
                colorStateListOooO0oO = nVar.OooO00o.OooO0oO(context, i);
            }
        } else {
            colorStateListOooO0oO = null;
        }
        OooOo00(colorStateListOooO0oO);
        OooO0O0();
    }

    public void OooOOOo() throws IOException {
        int iIndexOf;
        StringBuffer stringBuffer = (StringBuffer) this.OooO0Oo;
        StringBuffer stringBuffer2 = (StringBuffer) this.OooO0OO;
        Writer writer = (Writer) this.OooO0O0;
        while (true) {
            int iIndexOf2 = stringBuffer2.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = stringBuffer.indexOf("\n")) < 0) {
                return;
            }
            if (iIndexOf2 != 0) {
                writer.write(stringBuffer2.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                for (int i = this.OooO00o - iIndexOf2; i > 0; i--) {
                    writer.write(32);
                }
                writer.write(stringBuffer.substring(0, iIndexOf));
            }
            writer.write(10);
            stringBuffer2.delete(0, iIndexOf2 + 1);
            stringBuffer.delete(0, iIndexOf + 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooOOo() {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.oO0OOo0o.OooOOo():void");
    }

    public void OooOOo0(ooOOOOoo oooooooo) {
        y61 y61Var = (y61) this.OooO0o0;
        ((ArrayList) this.OooO0Oo).add(oooooooo);
        int i = oooooooo.OooO00o;
        if (i == 1) {
            y61Var.OooO0Oo(oooooooo.OooO0O0, oooooooo.OooO0Oo);
            return;
        }
        if (i == 2) {
            int i2 = oooooooo.OooO0O0;
            int i3 = oooooooo.OooO0Oo;
            RecyclerView recyclerView = y61Var.OooO00o;
            recyclerView.OoooOO0(i2, i3, false);
            recyclerView.Ooooooo = true;
            return;
        }
        if (i == 4) {
            y61Var.OooO0OO(oooooooo.OooO0O0, oooooooo.OooO0Oo, oooooooo.OooO0OO);
        } else if (i == 8) {
            y61Var.OooO0o0(oooooooo.OooO0O0, oooooooo.OooO0Oo);
        } else {
            sa.OooOO0o(oooooooo, "Unknown update op type for ");
        }
    }

    public void OooOOoo(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ooOOOOoo oooooooo = (ooOOOOoo) arrayList.get(i);
            oooooooo.OooO0OO = null;
            ((s31) this.OooO0O0).OooO0O0(oooooooo);
        }
        arrayList.clear();
    }

    public void OooOo0(ColorStateList colorStateList) {
        if (((in1) this.OooO0o0) == null) {
            this.OooO0o0 = new in1();
        }
        in1 in1Var = (in1) this.OooO0o0;
        in1Var.OooO00o = colorStateList;
        in1Var.OooO0Oo = true;
        OooO0O0();
    }

    public void OooOo00(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((in1) this.OooO0Oo) == null) {
                this.OooO0Oo = new in1();
            }
            in1 in1Var = (in1) this.OooO0Oo;
            in1Var.OooO00o = colorStateList;
            in1Var.OooO0Oo = true;
        } else {
            this.OooO0Oo = null;
        }
        OooO0O0();
    }

    public void OooOo0O(PorterDuff.Mode mode) {
        if (((in1) this.OooO0o0) == null) {
            this.OooO0o0 = new in1();
        }
        in1 in1Var = (in1) this.OooO0o0;
        in1Var.OooO0O0 = mode;
        in1Var.OooO0OO = true;
        OooO0O0();
    }

    public int OooOo0o(int i, int i2) {
        int i3;
        int i4;
        s31 s31Var = (s31) this.OooO0O0;
        ArrayList arrayList = (ArrayList) this.OooO0Oo;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ooOOOOoo oooooooo = (ooOOOOoo) arrayList.get(size);
            int i5 = oooooooo.OooO00o;
            int i6 = oooooooo.OooO0O0;
            if (i5 == 8) {
                int i7 = oooooooo.OooO0Oo;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            oooooooo.OooO0O0 = i6 + 1;
                            oooooooo.OooO0Oo = i7 + 1;
                        } else if (i2 == 2) {
                            oooooooo.OooO0O0 = i6 - 1;
                            oooooooo.OooO0Oo = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        oooooooo.OooO0Oo = i7 + 1;
                    } else if (i2 == 2) {
                        oooooooo.OooO0Oo = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        oooooooo.OooO0O0 = i6 + 1;
                    } else if (i2 == 2) {
                        oooooooo.OooO0O0 = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= oooooooo.OooO0Oo;
                } else if (i5 == 2) {
                    i += oooooooo.OooO0Oo;
                }
            } else if (i2 == 1) {
                oooooooo.OooO0O0 = i6 + 1;
            } else if (i2 == 2) {
                oooooooo.OooO0O0 = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ooOOOOoo oooooooo2 = (ooOOOOoo) arrayList.get(size2);
            int i8 = oooooooo2.OooO00o;
            int i9 = oooooooo2.OooO0Oo;
            if (i8 == 8) {
                if (i9 == oooooooo2.OooO0O0 || i9 < 0) {
                    arrayList.remove(size2);
                    oooooooo2.OooO0OO = null;
                    s31Var.OooO0O0(oooooooo2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                oooooooo2.OooO0OO = null;
                s31Var.OooO0O0(oooooooo2);
            }
        }
        return i;
    }

    public oO0OOo0o(y61 y61Var) {
        this.OooO0O0 = new s31(30);
        this.OooO0OO = new ArrayList();
        this.OooO0Oo = new ArrayList();
        this.OooO00o = 0;
        this.OooO0o0 = y61Var;
        this.OooO0o = new nz0(this, 0);
    }

    public oO0OOo0o(View view) {
        this.OooO00o = -1;
        this.OooO0O0 = view;
        this.OooO0OO = n.OooO00o();
    }
}
