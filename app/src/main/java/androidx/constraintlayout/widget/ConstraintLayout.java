package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.cmaster.cloner.a70;
import com.cmaster.cloner.aa;
import com.cmaster.cloner.b70;
import com.cmaster.cloner.e61;
import com.cmaster.cloner.e81;
import com.cmaster.cloner.fi;
import com.cmaster.cloner.hi;
import com.cmaster.cloner.ii;
import com.cmaster.cloner.ki;
import com.cmaster.cloner.sg1;
import com.cmaster.cloner.th;
import com.cmaster.cloner.uh;
import com.cmaster.cloner.vh;
import com.cmaster.cloner.vm0;
import com.cmaster.cloner.wh;
import com.cmaster.cloner.xh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static sg1 OooOo0;
    public int OooO;
    public final SparseArray OooO0Oo;
    public final ii OooO0o;
    public final ArrayList OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public boolean OooOO0O;
    public int OooOO0o;
    public e81 OooOOO;
    public fi OooOOO0;
    public int OooOOOO;
    public HashMap OooOOOo;
    public final wh OooOOo;
    public final SparseArray OooOOo0;
    public int OooOOoo;
    public int OooOo00;

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException, NumberFormatException {
        super(context);
        this.OooO0Oo = new SparseArray();
        this.OooO0o0 = new ArrayList(4);
        this.OooO0o = new ii();
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooO = Integer.MAX_VALUE;
        this.OooOO0 = Integer.MAX_VALUE;
        this.OooOO0O = true;
        this.OooOO0o = 257;
        this.OooOOO0 = null;
        this.OooOOO = null;
        this.OooOOOO = -1;
        this.OooOOOo = new HashMap();
        this.OooOOo0 = new SparseArray();
        this.OooOOo = new wh(this, this);
        this.OooOOoo = 0;
        this.OooOo00 = 0;
        OooO(null, 0, 0);
    }

    public static vh OooO0oO() {
        vh vhVar = new vh(-2, -2);
        vhVar.OooO00o = -1;
        vhVar.OooO0O0 = -1;
        vhVar.OooO0OO = -1.0f;
        vhVar.OooO0Oo = -1;
        vhVar.OooO0o0 = -1;
        vhVar.OooO0o = -1;
        vhVar.OooO0oO = -1;
        vhVar.OooO0oo = -1;
        vhVar.OooO = -1;
        vhVar.OooOO0 = -1;
        vhVar.OooOO0O = -1;
        vhVar.OooOO0o = -1;
        vhVar.OooOOO0 = -1;
        vhVar.OooOOO = -1;
        vhVar.OooOOOO = -1;
        vhVar.OooOOOo = 0;
        vhVar.OooOOo0 = 0.0f;
        vhVar.OooOOo = -1;
        vhVar.OooOOoo = -1;
        vhVar.OooOo00 = -1;
        vhVar.OooOo0 = -1;
        vhVar.OooOo0O = Integer.MIN_VALUE;
        vhVar.OooOo0o = Integer.MIN_VALUE;
        vhVar.OooOo = Integer.MIN_VALUE;
        vhVar.OooOoO0 = Integer.MIN_VALUE;
        vhVar.OooOoO = Integer.MIN_VALUE;
        vhVar.OooOoOO = Integer.MIN_VALUE;
        vhVar.OooOoo0 = Integer.MIN_VALUE;
        vhVar.OooOoo = 0;
        vhVar.OooOooO = 0.5f;
        vhVar.OooOooo = 0.5f;
        vhVar.Oooo000 = null;
        vhVar.Oooo00O = -1.0f;
        vhVar.Oooo00o = -1.0f;
        vhVar.Oooo0 = 0;
        vhVar.Oooo0O0 = 0;
        vhVar.Oooo0OO = 0;
        vhVar.Oooo0o0 = 0;
        vhVar.Oooo0o = 0;
        vhVar.Oooo0oO = 0;
        vhVar.Oooo0oo = 0;
        vhVar.Oooo = 0;
        vhVar.OoooO00 = 1.0f;
        vhVar.OoooO0 = 1.0f;
        vhVar.OoooO0O = -1;
        vhVar.OoooO = -1;
        vhVar.OoooOO0 = -1;
        vhVar.o000oOoO = false;
        vhVar.OoooOOO = false;
        vhVar.OoooOOo = null;
        vhVar.OoooOo0 = 0;
        vhVar.OoooOoO = true;
        vhVar.OoooOoo = true;
        vhVar.Ooooo00 = false;
        vhVar.Ooooo0o = false;
        vhVar.OooooO0 = false;
        vhVar.OooooOO = -1;
        vhVar.OooooOo = -1;
        vhVar.Oooooo0 = -1;
        vhVar.Oooooo = -1;
        vhVar.OoooooO = Integer.MIN_VALUE;
        vhVar.Ooooooo = Integer.MIN_VALUE;
        vhVar.o0OoOo0 = 0.5f;
        vhVar.o00Ooo = new hi();
        return vhVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static sg1 getSharedValues() {
        if (OooOo0 == null) {
            sg1 sg1Var = new sg1();
            new SparseIntArray();
            new HashMap();
            OooOo0 = sg1Var;
        }
        return OooOo0;
    }

    public final void OooO(AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        ii iiVar = this.OooO0o;
        iiVar.OooooO0 = this;
        wh whVar = this.OooOOo;
        iiVar.o00oO0o = whVar;
        iiVar.o00ooo.OooO0o = whVar;
        this.OooO0Oo.put(getId(), this);
        this.OooOOO0 = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e61.OooO0O0, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.OooO0oO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.OooO0oO);
                } else if (index == 17) {
                    this.OooO0oo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.OooO0oo);
                } else if (index == 14) {
                    this.OooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.OooO);
                } else if (index == 15) {
                    this.OooOO0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.OooOO0);
                } else if (index == 112) {
                    this.OooOO0o = typedArrayObtainStyledAttributes.getInt(index, this.OooOO0o);
                } else if (index == 55) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            OooOO0(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.OooOOO = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        fi fiVar = new fi();
                        this.OooOOO0 = fiVar;
                        fiVar.OooO0Oo(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.OooOOO0 = null;
                    }
                    this.OooOOOO = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        iiVar.o0O0O00 = this.OooOO0o;
        vm0.OooOOOo = iiVar.Oooo0oO(512);
    }

    public final hi OooO0oo(View view) {
        if (view == this) {
            return this.OooO0o;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof vh) {
            return ((vh) view.getLayoutParams()).o00Ooo;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof vh) {
            return ((vh) view.getLayoutParams()).o00Ooo;
        }
        return null;
    }

    public final void OooOO0(int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        String str;
        Context context = getContext();
        e81 e81Var = new e81(10, false);
        e81Var.OooO0o0 = new SparseArray();
        e81Var.OooO0o = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            aa aaVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                e81Var.OooOo00(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                aaVar = new aa(context, xml);
                                ((SparseArray) e81Var.OooO0o0).put(aaVar.OooO0Oo, aaVar);
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                xh xhVar = new xh(context, xml);
                                if (aaVar != null) {
                                    ((ArrayList) aaVar.OooO0o).add(xhVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        this.OooOOO = e81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x046d  */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOO0O(com.cmaster.cloner.ii r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.OooOO0O(com.cmaster.cloner.ii, int, int, int):void");
    }

    public final void OooOO0o(hi hiVar, vh vhVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.OooO0Oo.get(i);
        hi hiVar2 = (hi) sparseArray.get(i);
        if (hiVar2 == null || view == null || !(view.getLayoutParams() instanceof vh)) {
            return;
        }
        vhVar.Ooooo00 = true;
        if (i2 == 6) {
            vh vhVar2 = (vh) view.getLayoutParams();
            vhVar2.Ooooo00 = true;
            vhVar2.o00Ooo.OooOooO = true;
        }
        hiVar.OooO0oO(6).OooO00o(hiVar2.OooO0oO(i2), vhVar.OooOoo, vhVar.OooOoo0);
        hiVar.OooOooO = true;
        hiVar.OooO0oO(3).OooO0oO();
        hiVar.OooO0oO(5).OooO0oO();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof vh;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.OooO0o0;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((th) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.OooOO0O = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return OooO0oO();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        vh vhVar = new vh(context, attributeSet);
        vhVar.OooO00o = -1;
        vhVar.OooO0O0 = -1;
        vhVar.OooO0OO = -1.0f;
        vhVar.OooO0Oo = -1;
        vhVar.OooO0o0 = -1;
        vhVar.OooO0o = -1;
        vhVar.OooO0oO = -1;
        vhVar.OooO0oo = -1;
        vhVar.OooO = -1;
        vhVar.OooOO0 = -1;
        vhVar.OooOO0O = -1;
        vhVar.OooOO0o = -1;
        vhVar.OooOOO0 = -1;
        vhVar.OooOOO = -1;
        vhVar.OooOOOO = -1;
        vhVar.OooOOOo = 0;
        vhVar.OooOOo0 = 0.0f;
        vhVar.OooOOo = -1;
        vhVar.OooOOoo = -1;
        vhVar.OooOo00 = -1;
        vhVar.OooOo0 = -1;
        vhVar.OooOo0O = Integer.MIN_VALUE;
        vhVar.OooOo0o = Integer.MIN_VALUE;
        vhVar.OooOo = Integer.MIN_VALUE;
        vhVar.OooOoO0 = Integer.MIN_VALUE;
        vhVar.OooOoO = Integer.MIN_VALUE;
        vhVar.OooOoOO = Integer.MIN_VALUE;
        vhVar.OooOoo0 = Integer.MIN_VALUE;
        vhVar.OooOoo = 0;
        vhVar.OooOooO = 0.5f;
        vhVar.OooOooo = 0.5f;
        vhVar.Oooo000 = null;
        vhVar.Oooo00O = -1.0f;
        vhVar.Oooo00o = -1.0f;
        vhVar.Oooo0 = 0;
        vhVar.Oooo0O0 = 0;
        vhVar.Oooo0OO = 0;
        vhVar.Oooo0o0 = 0;
        vhVar.Oooo0o = 0;
        vhVar.Oooo0oO = 0;
        vhVar.Oooo0oo = 0;
        vhVar.Oooo = 0;
        vhVar.OoooO00 = 1.0f;
        vhVar.OoooO0 = 1.0f;
        vhVar.OoooO0O = -1;
        vhVar.OoooO = -1;
        vhVar.OoooOO0 = -1;
        vhVar.o000oOoO = false;
        vhVar.OoooOOO = false;
        vhVar.OoooOOo = null;
        vhVar.OoooOo0 = 0;
        vhVar.OoooOoO = true;
        vhVar.OoooOoo = true;
        vhVar.Ooooo00 = false;
        vhVar.Ooooo0o = false;
        vhVar.OooooO0 = false;
        vhVar.OooooOO = -1;
        vhVar.OooooOo = -1;
        vhVar.Oooooo0 = -1;
        vhVar.Oooooo = -1;
        vhVar.OoooooO = Integer.MIN_VALUE;
        vhVar.Ooooooo = Integer.MIN_VALUE;
        vhVar.o0OoOo0 = 0.5f;
        vhVar.o00Ooo = new hi();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e61.OooO0O0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = uh.OooO00o.get(index);
            switch (i2) {
                case 1:
                    vhVar.OoooOO0 = typedArrayObtainStyledAttributes.getInt(index, vhVar.OoooOO0);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooOOOO);
                    vhVar.OooOOOO = resourceId;
                    if (resourceId == -1) {
                        vhVar.OooOOOO = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    vhVar.OooOOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, vhVar.OooOOOo);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, vhVar.OooOOo0) % 360.0f;
                    vhVar.OooOOo0 = f;
                    if (f < 0.0f) {
                        vhVar.OooOOo0 = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    vhVar.OooO00o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, vhVar.OooO00o);
                    break;
                case 6:
                    vhVar.OooO0O0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, vhVar.OooO0O0);
                    break;
                case 7:
                    vhVar.OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, vhVar.OooO0OO);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooO0Oo);
                    vhVar.OooO0Oo = resourceId2;
                    if (resourceId2 == -1) {
                        vhVar.OooO0Oo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooO0o0);
                    vhVar.OooO0o0 = resourceId3;
                    if (resourceId3 == -1) {
                        vhVar.OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooO0o);
                    vhVar.OooO0o = resourceId4;
                    if (resourceId4 == -1) {
                        vhVar.OooO0o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooO0oO);
                    vhVar.OooO0oO = resourceId5;
                    if (resourceId5 == -1) {
                        vhVar.OooO0oO = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooO0oo);
                    vhVar.OooO0oo = resourceId6;
                    if (resourceId6 == -1) {
                        vhVar.OooO0oo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooO);
                    vhVar.OooO = resourceId7;
                    if (resourceId7 == -1) {
                        vhVar.OooO = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooOO0);
                    vhVar.OooOO0 = resourceId8;
                    if (resourceId8 == -1) {
                        vhVar.OooOO0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooOO0O);
                    vhVar.OooOO0O = resourceId9;
                    if (resourceId9 == -1) {
                        vhVar.OooOO0O = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooOO0o);
                    vhVar.OooOO0o = resourceId10;
                    if (resourceId10 == -1) {
                        vhVar.OooOO0o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooOOo);
                    vhVar.OooOOo = resourceId11;
                    if (resourceId11 == -1) {
                        vhVar.OooOOo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooOOoo);
                    vhVar.OooOOoo = resourceId12;
                    if (resourceId12 == -1) {
                        vhVar.OooOOoo = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooOo00);
                    vhVar.OooOo00 = resourceId13;
                    if (resourceId13 == -1) {
                        vhVar.OooOo00 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooOo0);
                    vhVar.OooOo0 = resourceId14;
                    if (resourceId14 == -1) {
                        vhVar.OooOo0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    vhVar.OooOo0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, vhVar.OooOo0O);
                    break;
                case 22:
                    vhVar.OooOo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, vhVar.OooOo0o);
                    break;
                case 23:
                    vhVar.OooOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, vhVar.OooOo);
                    break;
                case 24:
                    vhVar.OooOoO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, vhVar.OooOoO0);
                    break;
                case 25:
                    vhVar.OooOoO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, vhVar.OooOoO);
                    break;
                case 26:
                    vhVar.OooOoOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, vhVar.OooOoOO);
                    break;
                case 27:
                    vhVar.o000oOoO = typedArrayObtainStyledAttributes.getBoolean(index, vhVar.o000oOoO);
                    break;
                case 28:
                    vhVar.OoooOOO = typedArrayObtainStyledAttributes.getBoolean(index, vhVar.OoooOOO);
                    break;
                case 29:
                    vhVar.OooOooO = typedArrayObtainStyledAttributes.getFloat(index, vhVar.OooOooO);
                    break;
                case 30:
                    vhVar.OooOooo = typedArrayObtainStyledAttributes.getFloat(index, vhVar.OooOooo);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    vhVar.Oooo0OO = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    vhVar.Oooo0o0 = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        vhVar.Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, vhVar.Oooo0o);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, vhVar.Oooo0o) == -2) {
                            vhVar.Oooo0o = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        vhVar.Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, vhVar.Oooo0oo);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, vhVar.Oooo0oo) == -2) {
                            vhVar.Oooo0oo = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    vhVar.OoooO00 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, vhVar.OoooO00));
                    vhVar.Oooo0OO = 2;
                    break;
                case 36:
                    try {
                        vhVar.Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, vhVar.Oooo0oO);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, vhVar.Oooo0oO) == -2) {
                            vhVar.Oooo0oO = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        vhVar.Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, vhVar.Oooo);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, vhVar.Oooo) == -2) {
                            vhVar.Oooo = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    vhVar.OoooO0 = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, vhVar.OoooO0));
                    vhVar.Oooo0o0 = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            fi.OooO0oO(vhVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            vhVar.Oooo00O = typedArrayObtainStyledAttributes.getFloat(index, vhVar.Oooo00O);
                            break;
                        case 46:
                            vhVar.Oooo00o = typedArrayObtainStyledAttributes.getFloat(index, vhVar.Oooo00o);
                            break;
                        case 47:
                            vhVar.Oooo0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            vhVar.Oooo0O0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            vhVar.OoooO0O = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, vhVar.OoooO0O);
                            break;
                        case 50:
                            vhVar.OoooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, vhVar.OoooO);
                            break;
                        case 51:
                            vhVar.OoooOOo = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooOOO0);
                            vhVar.OooOOO0 = resourceId15;
                            if (resourceId15 == -1) {
                                vhVar.OooOOO0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, vhVar.OooOOO);
                            vhVar.OooOOO = resourceId16;
                            if (resourceId16 == -1) {
                                vhVar.OooOOO = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            vhVar.OooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, vhVar.OooOoo);
                            break;
                        case 55:
                            vhVar.OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, vhVar.OooOoo0);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    fi.OooO0o(vhVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    fi.OooO0o(vhVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    vhVar.OoooOo0 = typedArrayObtainStyledAttributes.getInt(index, vhVar.OoooOo0);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        vhVar.OooO00o();
        return vhVar;
    }

    public int getMaxHeight() {
        return this.OooOO0;
    }

    public int getMaxWidth() {
        return this.OooO;
    }

    public int getMinHeight() {
        return this.OooO0oo;
    }

    public int getMinWidth() {
        return this.OooO0oO;
    }

    public int getOptimizationLevel() {
        return this.OooO0o.o0O0O00;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            vh vhVar = (vh) childAt.getLayoutParams();
            hi hiVar = vhVar.o00Ooo;
            if (childAt.getVisibility() != 8 || vhVar.Ooooo0o || vhVar.OooooO0 || zIsInEditMode) {
                int iOooOOO0 = hiVar.OooOOO0();
                int iOooOOO = hiVar.OooOOO();
                childAt.layout(iOooOOO0, iOooOOO, hiVar.OooOO0o() + iOooOOO0, hiVar.OooO() + iOooOOO);
            }
        }
        ArrayList arrayList = this.OooO0o0;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((th) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:292:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0960  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r34, int r35) throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 2616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        hi hiVarOooO0oo = OooO0oo(view);
        if ((view instanceof a70) && !(hiVarOooO0oo instanceof b70)) {
            vh vhVar = (vh) view.getLayoutParams();
            b70 b70Var = new b70();
            vhVar.o00Ooo = b70Var;
            vhVar.Ooooo0o = true;
            b70Var.Oooo0O0(vhVar.OoooOO0);
        }
        if (view instanceof th) {
            th thVar = (th) view;
            thVar.OooO0o0();
            ((vh) view.getLayoutParams()).OooooO0 = true;
            ArrayList arrayList = this.OooO0o0;
            if (!arrayList.contains(thVar)) {
                arrayList.add(thVar);
            }
        }
        this.OooO0Oo.put(view.getId(), view);
        this.OooOO0O = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.OooO0Oo.remove(view.getId());
        hi hiVarOooO0oo = OooO0oo(view);
        this.OooO0o.o00Ooo.remove(hiVarOooO0oo);
        hiVarOooO0oo.OooOo();
        this.OooO0o0.remove(view);
        this.OooOO0O = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.OooOO0O = true;
        super.requestLayout();
    }

    public void setConstraintSet(fi fiVar) {
        this.OooOOO0 = fiVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.OooO0Oo;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.OooOO0) {
            return;
        }
        this.OooOO0 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.OooO) {
            return;
        }
        this.OooO = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.OooO0oo) {
            return;
        }
        this.OooO0oo = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.OooO0oO) {
            return;
        }
        this.OooO0oO = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(ki kiVar) {
        e81 e81Var = this.OooOOO;
        if (e81Var != null) {
            e81Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.OooOO0o = i;
        ii iiVar = this.OooO0o;
        iiVar.o0O0O00 = i;
        vm0.OooOOOo = iiVar.Oooo0oO(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.OooO0Oo = new SparseArray();
        this.OooO0o0 = new ArrayList(4);
        this.OooO0o = new ii();
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooO = Integer.MAX_VALUE;
        this.OooOO0 = Integer.MAX_VALUE;
        this.OooOO0O = true;
        this.OooOO0o = 257;
        this.OooOOO0 = null;
        this.OooOOO = null;
        this.OooOOOO = -1;
        this.OooOOOo = new HashMap();
        this.OooOOo0 = new SparseArray();
        this.OooOOo = new wh(this, this);
        this.OooOOoo = 0;
        this.OooOo00 = 0;
        OooO(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i);
        this.OooO0Oo = new SparseArray();
        this.OooO0o0 = new ArrayList(4);
        this.OooO0o = new ii();
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooO = Integer.MAX_VALUE;
        this.OooOO0 = Integer.MAX_VALUE;
        this.OooOO0O = true;
        this.OooOO0o = 257;
        this.OooOOO0 = null;
        this.OooOOO = null;
        this.OooOOOO = -1;
        this.OooOOOo = new HashMap();
        this.OooOOo0 = new SparseArray();
        this.OooOOo = new wh(this, this);
        this.OooOOoo = 0;
        this.OooOo00 = 0;
        OooO(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i, i2);
        this.OooO0Oo = new SparseArray();
        this.OooO0o0 = new ArrayList(4);
        this.OooO0o = new ii();
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooO = Integer.MAX_VALUE;
        this.OooOO0 = Integer.MAX_VALUE;
        this.OooOO0O = true;
        this.OooOO0o = 257;
        this.OooOOO0 = null;
        this.OooOOO = null;
        this.OooOOOO = -1;
        this.OooOOOo = new HashMap();
        this.OooOOo0 = new SparseArray();
        this.OooOOo = new wh(this, this);
        this.OooOOoo = 0;
        this.OooOo00 = 0;
        OooO(attributeSet, i, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        vh vhVar = new vh(layoutParams);
        vhVar.OooO00o = -1;
        vhVar.OooO0O0 = -1;
        vhVar.OooO0OO = -1.0f;
        vhVar.OooO0Oo = -1;
        vhVar.OooO0o0 = -1;
        vhVar.OooO0o = -1;
        vhVar.OooO0oO = -1;
        vhVar.OooO0oo = -1;
        vhVar.OooO = -1;
        vhVar.OooOO0 = -1;
        vhVar.OooOO0O = -1;
        vhVar.OooOO0o = -1;
        vhVar.OooOOO0 = -1;
        vhVar.OooOOO = -1;
        vhVar.OooOOOO = -1;
        vhVar.OooOOOo = 0;
        vhVar.OooOOo0 = 0.0f;
        vhVar.OooOOo = -1;
        vhVar.OooOOoo = -1;
        vhVar.OooOo00 = -1;
        vhVar.OooOo0 = -1;
        vhVar.OooOo0O = Integer.MIN_VALUE;
        vhVar.OooOo0o = Integer.MIN_VALUE;
        vhVar.OooOo = Integer.MIN_VALUE;
        vhVar.OooOoO0 = Integer.MIN_VALUE;
        vhVar.OooOoO = Integer.MIN_VALUE;
        vhVar.OooOoOO = Integer.MIN_VALUE;
        vhVar.OooOoo0 = Integer.MIN_VALUE;
        vhVar.OooOoo = 0;
        vhVar.OooOooO = 0.5f;
        vhVar.OooOooo = 0.5f;
        vhVar.Oooo000 = null;
        vhVar.Oooo00O = -1.0f;
        vhVar.Oooo00o = -1.0f;
        vhVar.Oooo0 = 0;
        vhVar.Oooo0O0 = 0;
        vhVar.Oooo0OO = 0;
        vhVar.Oooo0o0 = 0;
        vhVar.Oooo0o = 0;
        vhVar.Oooo0oO = 0;
        vhVar.Oooo0oo = 0;
        vhVar.Oooo = 0;
        vhVar.OoooO00 = 1.0f;
        vhVar.OoooO0 = 1.0f;
        vhVar.OoooO0O = -1;
        vhVar.OoooO = -1;
        vhVar.OoooOO0 = -1;
        vhVar.o000oOoO = false;
        vhVar.OoooOOO = false;
        vhVar.OoooOOo = null;
        vhVar.OoooOo0 = 0;
        vhVar.OoooOoO = true;
        vhVar.OoooOoo = true;
        vhVar.Ooooo00 = false;
        vhVar.Ooooo0o = false;
        vhVar.OooooO0 = false;
        vhVar.OooooOO = -1;
        vhVar.OooooOo = -1;
        vhVar.Oooooo0 = -1;
        vhVar.Oooooo = -1;
        vhVar.OoooooO = Integer.MIN_VALUE;
        vhVar.Ooooooo = Integer.MIN_VALUE;
        vhVar.o0OoOo0 = 0.5f;
        vhVar.o00Ooo = new hi();
        return vhVar;
    }
}
