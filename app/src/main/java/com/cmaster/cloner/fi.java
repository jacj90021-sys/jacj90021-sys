package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.ads.zzbcj;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fi {
    public static final int[] OooO0Oo = {0, 4, 8};
    public static final SparseIntArray OooO0o;
    public static final SparseIntArray OooO0o0;
    public final HashMap OooO00o = new HashMap();
    public final boolean OooO0O0 = true;
    public final HashMap OooO0OO = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        OooO0o0 = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        OooO0o = sparseIntArray2;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(101, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(105, 13);
        sparseIntArray.append(108, 16);
        sparseIntArray.append(106, 14);
        sparseIntArray.append(103, 11);
        sparseIntArray.append(107, 15);
        sparseIntArray.append(104, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(120, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(121, 67);
        sparseIntArray.append(112, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(111, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(110, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(113, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(122, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(115, 82);
        sparseIntArray.append(119, 83);
        sparseIntArray.append(118, 84);
        sparseIntArray.append(117, 85);
        sparseIntArray.append(116, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(104, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(105, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(106, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(103, 83);
        sparseIntArray2.append(102, 84);
        sparseIntArray2.append(101, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int[] OooO0O0(d6 d6Var, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = d6Var.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = c61.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && d6Var.isInEditMode() && (d6Var.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) d6Var.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.OooOOOo;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.OooOOOo.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static ai OooO0OO(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        ai aiVar = new ai();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? e61.OooO0OO : e61.OooO00o);
        di diVar = aiVar.OooO0O0;
        ei eiVar = aiVar.OooO0o0;
        ci ciVar = aiVar.OooO0OO;
        bi biVar = aiVar.OooO0Oo;
        int[] iArr = OooO0Oo;
        String[] strArr = em1.OooO00o;
        SparseIntArray sparseIntArray = OooO0o0;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            zh zhVar = new zh();
            zhVar.OooO00o = new int[10];
            zhVar.OooO0O0 = new int[10];
            zhVar.OooO0OO = 0;
            zhVar.OooO0Oo = new int[10];
            zhVar.OooO0o0 = new float[10];
            zhVar.OooO0o = 0;
            zhVar.OooO0oO = new int[5];
            zhVar.OooO0oo = new String[5];
            zhVar.OooO = 0;
            zhVar.OooOO0 = new int[4];
            zhVar.OooOO0O = new boolean[4];
            zhVar.OooOO0o = 0;
            ciVar.getClass();
            biVar.getClass();
            eiVar.getClass();
            int i3 = 0;
            while (i3 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = indexCount;
                switch (OooO0o.get(index)) {
                    case 2:
                        i2 = i3;
                        zhVar.OooO0O0(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.Oooo00o));
                        continue;
                        i3 = i2 + 1;
                        indexCount = i4;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = i3;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = i3;
                        zhVar.OooO0OO(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i2 + 1;
                        indexCount = i4;
                    case 6:
                        i2 = i3;
                        zhVar.OooO0O0(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, biVar.OooOoo0));
                        break;
                    case 7:
                        i2 = i3;
                        zhVar.OooO0O0(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, biVar.OooOoo));
                        break;
                    case 8:
                        i2 = i3;
                        zhVar.OooO0O0(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.Oooo0));
                        break;
                    case 11:
                        i2 = i3;
                        zhVar.OooO0O0(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.Oooo0oo));
                        break;
                    case 12:
                        i2 = i3;
                        zhVar.OooO0O0(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.Oooo));
                        break;
                    case 13:
                        i2 = i3;
                        zhVar.OooO0O0(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.Oooo0o0));
                        break;
                    case 14:
                        i2 = i3;
                        zhVar.OooO0O0(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.Oooo0oO));
                        break;
                    case 15:
                        i2 = i3;
                        zhVar.OooO0O0(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.OoooO00));
                        break;
                    case 16:
                        i2 = i3;
                        zhVar.OooO0O0(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.Oooo0o));
                        break;
                    case 17:
                        i2 = i3;
                        zhVar.OooO0O0(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, biVar.OooO0Oo));
                        break;
                    case 18:
                        i2 = i3;
                        zhVar.OooO0O0(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, biVar.OooO0o0));
                        break;
                    case 19:
                        i2 = i3;
                        zhVar.OooO00o(19, typedArrayObtainStyledAttributes.getFloat(index, biVar.OooO0o));
                        break;
                    case 20:
                        i2 = i3;
                        zhVar.OooO00o(20, typedArrayObtainStyledAttributes.getFloat(index, biVar.OooOo0O));
                        break;
                    case zzbcj.zzt.zzm /* 21 */:
                        i2 = i3;
                        zhVar.OooO0O0(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, biVar.OooO0OO));
                        break;
                    case 22:
                        i2 = i3;
                        zhVar.OooO0O0(22, iArr[typedArrayObtainStyledAttributes.getInt(index, diVar.OooO00o)]);
                        break;
                    case 23:
                        i2 = i3;
                        zhVar.OooO0O0(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, biVar.OooO0O0));
                        break;
                    case 24:
                        i2 = i3;
                        zhVar.OooO0O0(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.OooOooo));
                        break;
                    case 27:
                        i2 = i3;
                        zhVar.OooO0O0(27, typedArrayObtainStyledAttributes.getInt(index, biVar.OooOooO));
                        break;
                    case 28:
                        i2 = i3;
                        zhVar.OooO0O0(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.Oooo000));
                        break;
                    case 31:
                        i2 = i3;
                        zhVar.OooO0O0(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.Oooo0O0));
                        break;
                    case 34:
                        i2 = i3;
                        zhVar.OooO0O0(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.Oooo00O));
                        break;
                    case 37:
                        i2 = i3;
                        zhVar.OooO00o(37, typedArrayObtainStyledAttributes.getFloat(index, biVar.OooOo0o));
                        break;
                    case 38:
                        i2 = i3;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, aiVar.OooO00o);
                        aiVar.OooO00o = resourceId;
                        zhVar.OooO0O0(38, resourceId);
                        break;
                    case 39:
                        i2 = i3;
                        zhVar.OooO00o(39, typedArrayObtainStyledAttributes.getFloat(index, biVar.OoooO));
                        break;
                    case 40:
                        i2 = i3;
                        zhVar.OooO00o(40, typedArrayObtainStyledAttributes.getFloat(index, biVar.OoooO0O));
                        break;
                    case 41:
                        i2 = i3;
                        zhVar.OooO0O0(41, typedArrayObtainStyledAttributes.getInt(index, biVar.OoooOO0));
                        break;
                    case 42:
                        i2 = i3;
                        zhVar.OooO0O0(42, typedArrayObtainStyledAttributes.getInt(index, biVar.o000oOoO));
                        break;
                    case 43:
                        i2 = i3;
                        zhVar.OooO00o(43, typedArrayObtainStyledAttributes.getFloat(index, diVar.OooO0OO));
                        break;
                    case 44:
                        i2 = i3;
                        zhVar.OooO0Oo(44, true);
                        zhVar.OooO00o(44, typedArrayObtainStyledAttributes.getDimension(index, eiVar.OooOOO0));
                        break;
                    case 45:
                        i2 = i3;
                        zhVar.OooO00o(45, typedArrayObtainStyledAttributes.getFloat(index, eiVar.OooO0O0));
                        break;
                    case 46:
                        i2 = i3;
                        zhVar.OooO00o(46, typedArrayObtainStyledAttributes.getFloat(index, eiVar.OooO0OO));
                        break;
                    case 47:
                        i2 = i3;
                        zhVar.OooO00o(47, typedArrayObtainStyledAttributes.getFloat(index, eiVar.OooO0Oo));
                        break;
                    case 48:
                        i2 = i3;
                        zhVar.OooO00o(48, typedArrayObtainStyledAttributes.getFloat(index, eiVar.OooO0o0));
                        break;
                    case 49:
                        i2 = i3;
                        zhVar.OooO00o(49, typedArrayObtainStyledAttributes.getDimension(index, eiVar.OooO0o));
                        break;
                    case 50:
                        i2 = i3;
                        zhVar.OooO00o(50, typedArrayObtainStyledAttributes.getDimension(index, eiVar.OooO0oO));
                        break;
                    case 51:
                        i2 = i3;
                        zhVar.OooO00o(51, typedArrayObtainStyledAttributes.getDimension(index, eiVar.OooO));
                        break;
                    case 52:
                        i2 = i3;
                        zhVar.OooO00o(52, typedArrayObtainStyledAttributes.getDimension(index, eiVar.OooOO0));
                        break;
                    case 53:
                        i2 = i3;
                        zhVar.OooO00o(53, typedArrayObtainStyledAttributes.getDimension(index, eiVar.OooOO0O));
                        break;
                    case 54:
                        i2 = i3;
                        zhVar.OooO0O0(54, typedArrayObtainStyledAttributes.getInt(index, biVar.OoooOOO));
                        break;
                    case 55:
                        i2 = i3;
                        zhVar.OooO0O0(55, typedArrayObtainStyledAttributes.getInt(index, biVar.OoooOOo));
                        break;
                    case 56:
                        i2 = i3;
                        zhVar.OooO0O0(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.OoooOo0));
                        break;
                    case 57:
                        i2 = i3;
                        zhVar.OooO0O0(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.OoooOoO));
                        break;
                    case 58:
                        i2 = i3;
                        zhVar.OooO0O0(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.OoooOoo));
                        break;
                    case 59:
                        i2 = i3;
                        zhVar.OooO0O0(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.Ooooo00));
                        break;
                    case 60:
                        i2 = i3;
                        zhVar.OooO00o(60, typedArrayObtainStyledAttributes.getFloat(index, eiVar.OooO00o));
                        break;
                    case 62:
                        i2 = i3;
                        zhVar.OooO0O0(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.OooOoO));
                        break;
                    case 63:
                        i2 = i3;
                        zhVar.OooO00o(63, typedArrayObtainStyledAttributes.getFloat(index, biVar.OooOoOO));
                        break;
                    case 64:
                        i2 = i3;
                        zhVar.OooO0O0(64, OooO0o0(typedArrayObtainStyledAttributes, index, ciVar.OooO00o));
                        break;
                    case 65:
                        i2 = i3;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            zhVar.OooO0OO(65, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        } else {
                            zhVar.OooO0OO(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        i2 = i3;
                        zhVar.OooO0O0(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = i3;
                        zhVar.OooO00o(67, typedArrayObtainStyledAttributes.getFloat(index, ciVar.OooO0o0));
                        break;
                    case 68:
                        i2 = i3;
                        zhVar.OooO00o(68, typedArrayObtainStyledAttributes.getFloat(index, diVar.OooO0Oo));
                        break;
                    case 69:
                        i2 = i3;
                        zhVar.OooO00o(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = i3;
                        zhVar.OooO00o(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = i3;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = i3;
                        zhVar.OooO0O0(72, typedArrayObtainStyledAttributes.getInt(index, biVar.OooooOO));
                        break;
                    case 73:
                        i2 = i3;
                        zhVar.OooO0O0(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.OooooOo));
                        break;
                    case 74:
                        i2 = i3;
                        zhVar.OooO0OO(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = i3;
                        zhVar.OooO0Oo(75, typedArrayObtainStyledAttributes.getBoolean(index, biVar.o00O0O));
                        break;
                    case 76:
                        i2 = i3;
                        zhVar.OooO0O0(76, typedArrayObtainStyledAttributes.getInt(index, ciVar.OooO0OO));
                        break;
                    case 77:
                        i2 = i3;
                        zhVar.OooO0OO(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = i3;
                        zhVar.OooO0O0(78, typedArrayObtainStyledAttributes.getInt(index, diVar.OooO0O0));
                        break;
                    case 79:
                        i2 = i3;
                        zhVar.OooO00o(79, typedArrayObtainStyledAttributes.getFloat(index, ciVar.OooO0Oo));
                        break;
                    case 80:
                        i2 = i3;
                        zhVar.OooO0Oo(80, typedArrayObtainStyledAttributes.getBoolean(index, biVar.o0OoOo0));
                        break;
                    case 81:
                        i2 = i3;
                        zhVar.OooO0Oo(81, typedArrayObtainStyledAttributes.getBoolean(index, biVar.ooOO));
                        break;
                    case 82:
                        i2 = i3;
                        zhVar.OooO0O0(82, typedArrayObtainStyledAttributes.getInteger(index, ciVar.OooO0O0));
                        break;
                    case 83:
                        i2 = i3;
                        zhVar.OooO0O0(83, OooO0o0(typedArrayObtainStyledAttributes, index, eiVar.OooO0oo));
                        break;
                    case 84:
                        i2 = i3;
                        zhVar.OooO0O0(84, typedArrayObtainStyledAttributes.getInteger(index, ciVar.OooO0oO));
                        break;
                    case 85:
                        i2 = i3;
                        zhVar.OooO00o(85, typedArrayObtainStyledAttributes.getFloat(index, ciVar.OooO0o));
                        break;
                    case 86:
                        i2 = i3;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            ciVar.OooO = resourceId2;
                            zhVar.OooO0O0(89, resourceId2);
                            if (ciVar.OooO != -1) {
                                zhVar.OooO0O0(88, -2);
                                break;
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            ciVar.OooO0oo = string;
                            zhVar.OooO0OO(90, string);
                            if (ciVar.OooO0oo.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                ciVar.OooO = resourceId3;
                                zhVar.OooO0O0(89, resourceId3);
                                zhVar.OooO0O0(88, -2);
                                break;
                            } else {
                                zhVar.OooO0O0(88, -1);
                                break;
                            }
                        } else {
                            zhVar.OooO0O0(88, typedArrayObtainStyledAttributes.getInteger(index, ciVar.OooO));
                            break;
                        }
                        break;
                    case 87:
                        i2 = i3;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = i3;
                        zhVar.OooO0O0(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.Oooo0OO));
                        break;
                    case 94:
                        i2 = i3;
                        zhVar.OooO0O0(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, biVar.OoooO0));
                        break;
                    case 95:
                        i2 = i3;
                        OooO0o(zhVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = i3;
                        OooO0o(zhVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = i3;
                        zhVar.OooO0O0(97, typedArrayObtainStyledAttributes.getInt(index, biVar.o00Oo0));
                        break;
                    case 98:
                        i2 = i3;
                        int i6 = qu0.OooOo0O;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            aiVar.OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, aiVar.OooO00o);
                            break;
                        }
                }
                i3 = i2 + 1;
                indexCount = i4;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        ciVar.getClass();
                        biVar.getClass();
                        eiVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        biVar.OooOOOO = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooOOOO);
                        continue;
                        i7++;
                    case 2:
                        i = indexCount2;
                        biVar.Oooo00o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.Oooo00o);
                        continue;
                        i7++;
                    case 3:
                        i = indexCount2;
                        biVar.OooOOO = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooOOO);
                        continue;
                        i7++;
                    case 4:
                        i = indexCount2;
                        biVar.OooOOO0 = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooOOO0);
                        continue;
                        i7++;
                    case 5:
                        i = indexCount2;
                        biVar.OooOo = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                    case 6:
                        i = indexCount2;
                        biVar.OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, biVar.OooOoo0);
                        continue;
                        i7++;
                    case 7:
                        i = indexCount2;
                        biVar.OooOoo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, biVar.OooOoo);
                        continue;
                        i7++;
                    case 8:
                        i = indexCount2;
                        biVar.Oooo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.Oooo0);
                        continue;
                        i7++;
                    case 9:
                        i = indexCount2;
                        biVar.OooOo0 = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooOo0);
                        continue;
                        i7++;
                    case 10:
                        i = indexCount2;
                        biVar.OooOo00 = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooOo00);
                        continue;
                        i7++;
                    case 11:
                        i = indexCount2;
                        biVar.Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.Oooo0oo);
                        continue;
                        i7++;
                    case 12:
                        i = indexCount2;
                        biVar.Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.Oooo);
                        continue;
                        i7++;
                    case 13:
                        i = indexCount2;
                        biVar.Oooo0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.Oooo0o0);
                        continue;
                        i7++;
                    case 14:
                        i = indexCount2;
                        biVar.Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.Oooo0oO);
                        continue;
                        i7++;
                    case 15:
                        i = indexCount2;
                        biVar.OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.OoooO00);
                        continue;
                        i7++;
                    case 16:
                        i = indexCount2;
                        biVar.Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.Oooo0o);
                        continue;
                        i7++;
                    case 17:
                        i = indexCount2;
                        biVar.OooO0Oo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, biVar.OooO0Oo);
                        continue;
                        i7++;
                    case 18:
                        i = indexCount2;
                        biVar.OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, biVar.OooO0o0);
                        continue;
                        i7++;
                    case 19:
                        i = indexCount2;
                        biVar.OooO0o = typedArrayObtainStyledAttributes.getFloat(index2, biVar.OooO0o);
                        continue;
                        i7++;
                    case 20:
                        i = indexCount2;
                        biVar.OooOo0O = typedArrayObtainStyledAttributes.getFloat(index2, biVar.OooOo0O);
                        continue;
                        i7++;
                    case zzbcj.zzt.zzm /* 21 */:
                        i = indexCount2;
                        biVar.OooO0OO = typedArrayObtainStyledAttributes.getLayoutDimension(index2, biVar.OooO0OO);
                        continue;
                        i7++;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, diVar.OooO00o);
                        diVar.OooO00o = i8;
                        diVar.OooO00o = iArr[i8];
                        continue;
                        i7++;
                    case 23:
                        i = indexCount2;
                        biVar.OooO0O0 = typedArrayObtainStyledAttributes.getLayoutDimension(index2, biVar.OooO0O0);
                        continue;
                        i7++;
                    case 24:
                        i = indexCount2;
                        biVar.OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.OooOooo);
                        continue;
                        i7++;
                    case 25:
                        i = indexCount2;
                        biVar.OooO0oO = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooO0oO);
                        continue;
                        i7++;
                    case 26:
                        i = indexCount2;
                        biVar.OooO0oo = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooO0oo);
                        continue;
                        i7++;
                    case 27:
                        i = indexCount2;
                        biVar.OooOooO = typedArrayObtainStyledAttributes.getInt(index2, biVar.OooOooO);
                        continue;
                        i7++;
                    case 28:
                        i = indexCount2;
                        biVar.Oooo000 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.Oooo000);
                        continue;
                        i7++;
                    case 29:
                        i = indexCount2;
                        biVar.OooO = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooO);
                        continue;
                        i7++;
                    case 30:
                        i = indexCount2;
                        biVar.OooOO0 = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooOO0);
                        continue;
                        i7++;
                    case 31:
                        i = indexCount2;
                        biVar.Oooo0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.Oooo0O0);
                        continue;
                        i7++;
                    case 32:
                        i = indexCount2;
                        biVar.OooOOo = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooOOo);
                        continue;
                        i7++;
                    case 33:
                        i = indexCount2;
                        biVar.OooOOoo = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooOOoo);
                        continue;
                        i7++;
                    case 34:
                        i = indexCount2;
                        biVar.Oooo00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.Oooo00O);
                        continue;
                        i7++;
                    case 35:
                        i = indexCount2;
                        biVar.OooOO0o = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooOO0o);
                        continue;
                        i7++;
                    case 36:
                        i = indexCount2;
                        biVar.OooOO0O = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooOO0O);
                        continue;
                        i7++;
                    case 37:
                        i = indexCount2;
                        biVar.OooOo0o = typedArrayObtainStyledAttributes.getFloat(index2, biVar.OooOo0o);
                        continue;
                        i7++;
                    case 38:
                        i = indexCount2;
                        aiVar.OooO00o = typedArrayObtainStyledAttributes.getResourceId(index2, aiVar.OooO00o);
                        continue;
                        i7++;
                    case 39:
                        i = indexCount2;
                        biVar.OoooO = typedArrayObtainStyledAttributes.getFloat(index2, biVar.OoooO);
                        continue;
                        i7++;
                    case 40:
                        i = indexCount2;
                        biVar.OoooO0O = typedArrayObtainStyledAttributes.getFloat(index2, biVar.OoooO0O);
                        continue;
                        i7++;
                    case 41:
                        i = indexCount2;
                        biVar.OoooOO0 = typedArrayObtainStyledAttributes.getInt(index2, biVar.OoooOO0);
                        continue;
                        i7++;
                    case 42:
                        i = indexCount2;
                        biVar.o000oOoO = typedArrayObtainStyledAttributes.getInt(index2, biVar.o000oOoO);
                        continue;
                        i7++;
                    case 43:
                        i = indexCount2;
                        diVar.OooO0OO = typedArrayObtainStyledAttributes.getFloat(index2, diVar.OooO0OO);
                        continue;
                        i7++;
                    case 44:
                        i = indexCount2;
                        eiVar.OooOO0o = true;
                        eiVar.OooOOO0 = typedArrayObtainStyledAttributes.getDimension(index2, eiVar.OooOOO0);
                        continue;
                        i7++;
                    case 45:
                        i = indexCount2;
                        eiVar.OooO0O0 = typedArrayObtainStyledAttributes.getFloat(index2, eiVar.OooO0O0);
                        continue;
                        i7++;
                    case 46:
                        i = indexCount2;
                        eiVar.OooO0OO = typedArrayObtainStyledAttributes.getFloat(index2, eiVar.OooO0OO);
                        continue;
                        i7++;
                    case 47:
                        i = indexCount2;
                        eiVar.OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index2, eiVar.OooO0Oo);
                        continue;
                        i7++;
                    case 48:
                        i = indexCount2;
                        eiVar.OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index2, eiVar.OooO0o0);
                        continue;
                        i7++;
                    case 49:
                        i = indexCount2;
                        eiVar.OooO0o = typedArrayObtainStyledAttributes.getDimension(index2, eiVar.OooO0o);
                        continue;
                        i7++;
                    case 50:
                        i = indexCount2;
                        eiVar.OooO0oO = typedArrayObtainStyledAttributes.getDimension(index2, eiVar.OooO0oO);
                        continue;
                        i7++;
                    case 51:
                        i = indexCount2;
                        eiVar.OooO = typedArrayObtainStyledAttributes.getDimension(index2, eiVar.OooO);
                        continue;
                        i7++;
                    case 52:
                        i = indexCount2;
                        eiVar.OooOO0 = typedArrayObtainStyledAttributes.getDimension(index2, eiVar.OooOO0);
                        continue;
                        i7++;
                    case 53:
                        i = indexCount2;
                        eiVar.OooOO0O = typedArrayObtainStyledAttributes.getDimension(index2, eiVar.OooOO0O);
                        continue;
                        i7++;
                    case 54:
                        i = indexCount2;
                        biVar.OoooOOO = typedArrayObtainStyledAttributes.getInt(index2, biVar.OoooOOO);
                        continue;
                        i7++;
                    case 55:
                        i = indexCount2;
                        biVar.OoooOOo = typedArrayObtainStyledAttributes.getInt(index2, biVar.OoooOOo);
                        continue;
                        i7++;
                    case 56:
                        i = indexCount2;
                        biVar.OoooOo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.OoooOo0);
                        continue;
                        i7++;
                    case 57:
                        i = indexCount2;
                        biVar.OoooOoO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.OoooOoO);
                        continue;
                        i7++;
                    case 58:
                        i = indexCount2;
                        biVar.OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.OoooOoo);
                        continue;
                        i7++;
                    case 59:
                        i = indexCount2;
                        biVar.Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.Ooooo00);
                        continue;
                        i7++;
                    case 60:
                        i = indexCount2;
                        eiVar.OooO00o = typedArrayObtainStyledAttributes.getFloat(index2, eiVar.OooO00o);
                        continue;
                        i7++;
                    case 61:
                        i = indexCount2;
                        biVar.OooOoO0 = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooOoO0);
                        continue;
                        i7++;
                    case 62:
                        i = indexCount2;
                        biVar.OooOoO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.OooOoO);
                        continue;
                        i7++;
                    case 63:
                        i = indexCount2;
                        biVar.OooOoOO = typedArrayObtainStyledAttributes.getFloat(index2, biVar.OooOoOO);
                        continue;
                        i7++;
                    case 64:
                        i = indexCount2;
                        ciVar.OooO00o = OooO0o0(typedArrayObtainStyledAttributes, index2, ciVar.OooO00o);
                        continue;
                        i7++;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            ciVar.getClass();
                            break;
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            ciVar.getClass();
                            i7++;
                        }
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        ciVar.getClass();
                        continue;
                        i7++;
                    case 67:
                        i = indexCount2;
                        ciVar.OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index2, ciVar.OooO0o0);
                        break;
                    case 68:
                        i = indexCount2;
                        diVar.OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index2, diVar.OooO0Oo);
                        break;
                    case 69:
                        i = indexCount2;
                        biVar.Ooooo0o = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        biVar.OooooO0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        biVar.OooooOO = typedArrayObtainStyledAttributes.getInt(index2, biVar.OooooOO);
                        break;
                    case 73:
                        i = indexCount2;
                        biVar.OooooOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.OooooOo);
                        break;
                    case 74:
                        i = indexCount2;
                        biVar.OoooooO = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        biVar.o00O0O = typedArrayObtainStyledAttributes.getBoolean(index2, biVar.o00O0O);
                        break;
                    case 76:
                        i = indexCount2;
                        ciVar.OooO0OO = typedArrayObtainStyledAttributes.getInt(index2, ciVar.OooO0OO);
                        break;
                    case 77:
                        i = indexCount2;
                        biVar.Ooooooo = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        diVar.OooO0O0 = typedArrayObtainStyledAttributes.getInt(index2, diVar.OooO0O0);
                        break;
                    case 79:
                        i = indexCount2;
                        ciVar.OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index2, ciVar.OooO0Oo);
                        break;
                    case 80:
                        i = indexCount2;
                        biVar.o0OoOo0 = typedArrayObtainStyledAttributes.getBoolean(index2, biVar.o0OoOo0);
                        break;
                    case 81:
                        i = indexCount2;
                        biVar.ooOO = typedArrayObtainStyledAttributes.getBoolean(index2, biVar.ooOO);
                        break;
                    case 82:
                        i = indexCount2;
                        ciVar.OooO0O0 = typedArrayObtainStyledAttributes.getInteger(index2, ciVar.OooO0O0);
                        break;
                    case 83:
                        i = indexCount2;
                        eiVar.OooO0oo = OooO0o0(typedArrayObtainStyledAttributes, index2, eiVar.OooO0oo);
                        break;
                    case 84:
                        i = indexCount2;
                        ciVar.OooO0oO = typedArrayObtainStyledAttributes.getInteger(index2, ciVar.OooO0oO);
                        break;
                    case 85:
                        i = indexCount2;
                        ciVar.OooO0o = typedArrayObtainStyledAttributes.getFloat(index2, ciVar.OooO0o);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            ciVar.OooO = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            ciVar.OooO0oo = string2;
                            if (string2.indexOf("/") > 0) {
                                ciVar.OooO = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, ciVar.OooO);
                            break;
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        biVar.OooOOOo = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooOOOo);
                        break;
                    case 92:
                        i = indexCount2;
                        biVar.OooOOo0 = OooO0o0(typedArrayObtainStyledAttributes, index2, biVar.OooOOo0);
                        break;
                    case 93:
                        i = indexCount2;
                        biVar.Oooo0OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.Oooo0OO);
                        break;
                    case 94:
                        i = indexCount2;
                        biVar.OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, biVar.OoooO0);
                        break;
                    case 95:
                        i = indexCount2;
                        OooO0o(biVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                    case 96:
                        i = indexCount2;
                        OooO0o(biVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        biVar.o00Oo0 = typedArrayObtainStyledAttributes.getInt(index2, biVar.o00Oo0);
                        break;
                }
                i7++;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OooO0o(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.fi.OooO0o(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static int OooO0o0(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public static void OooO0oO(vh vhVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        vhVar.Oooo000 = str;
    }

    public final void OooO00o(Context context, int i) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        fi fiVar = this;
        ConstraintLayout constraintLayout3 = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout3.getChildCount();
        HashMap map = fiVar.OooO0OO;
        map.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout3.getChildAt(i2);
            vh vhVar = (vh) childAt.getLayoutParams();
            int id = childAt.getId();
            if (fiVar.OooO0O0 && id == -1) {
                ra.OooOOO0("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new ai());
            }
            ai aiVar = (ai) map.get(Integer.valueOf(id));
            if (aiVar == null) {
                constraintLayout = constraintLayout3;
            } else {
                di diVar = aiVar.OooO0O0;
                bi biVar = aiVar.OooO0Oo;
                ei eiVar = aiVar.OooO0o0;
                HashMap map2 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map3 = fiVar.OooO00o;
                for (String str : map3.keySet()) {
                    rh rhVar = (rh) map3.get(str);
                    HashMap map4 = map3;
                    try {
                        if (str.equals("BackgroundColor")) {
                            constraintLayout2 = constraintLayout3;
                            try {
                                map2.put(str, new rh(rhVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                e.printStackTrace();
                                constraintLayout3 = constraintLayout2;
                                map3 = map4;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                e.printStackTrace();
                                constraintLayout3 = constraintLayout2;
                                map3 = map4;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                e.printStackTrace();
                                constraintLayout3 = constraintLayout2;
                                map3 = map4;
                            }
                        } else {
                            constraintLayout2 = constraintLayout3;
                            map2.put(str, new rh(rhVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        constraintLayout2 = constraintLayout3;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        constraintLayout2 = constraintLayout3;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        constraintLayout2 = constraintLayout3;
                    }
                    constraintLayout3 = constraintLayout2;
                    map3 = map4;
                }
                constraintLayout = constraintLayout3;
                aiVar.OooO0o = map2;
                aiVar.OooO00o = id;
                biVar.OooO0oO = vhVar.OooO0Oo;
                biVar.OooO0oo = vhVar.OooO0o0;
                biVar.OooO = vhVar.OooO0o;
                biVar.OooOO0 = vhVar.OooO0oO;
                biVar.OooOO0O = vhVar.OooO0oo;
                biVar.OooOO0o = vhVar.OooO;
                biVar.OooOOO0 = vhVar.OooOO0;
                biVar.OooOOO = vhVar.OooOO0O;
                biVar.OooOOOO = vhVar.OooOO0o;
                biVar.OooOOOo = vhVar.OooOOO0;
                biVar.OooOOo0 = vhVar.OooOOO;
                biVar.OooOOo = vhVar.OooOOo;
                biVar.OooOOoo = vhVar.OooOOoo;
                biVar.OooOo00 = vhVar.OooOo00;
                biVar.OooOo0 = vhVar.OooOo0;
                biVar.OooOo0O = vhVar.OooOooO;
                biVar.OooOo0o = vhVar.OooOooo;
                biVar.OooOo = vhVar.Oooo000;
                biVar.OooOoO0 = vhVar.OooOOOO;
                biVar.OooOoO = vhVar.OooOOOo;
                biVar.OooOoOO = vhVar.OooOOo0;
                biVar.OooOoo0 = vhVar.OoooO0O;
                biVar.OooOoo = vhVar.OoooO;
                biVar.OooOooO = vhVar.OoooOO0;
                biVar.OooO0o = vhVar.OooO0OO;
                biVar.OooO0Oo = vhVar.OooO00o;
                biVar.OooO0o0 = vhVar.OooO0O0;
                biVar.OooO0O0 = ((ViewGroup.MarginLayoutParams) vhVar).width;
                biVar.OooO0OO = ((ViewGroup.MarginLayoutParams) vhVar).height;
                biVar.OooOooo = ((ViewGroup.MarginLayoutParams) vhVar).leftMargin;
                biVar.Oooo000 = ((ViewGroup.MarginLayoutParams) vhVar).rightMargin;
                biVar.Oooo00O = ((ViewGroup.MarginLayoutParams) vhVar).topMargin;
                biVar.Oooo00o = ((ViewGroup.MarginLayoutParams) vhVar).bottomMargin;
                biVar.Oooo0OO = vhVar.OooOoo;
                biVar.OoooO0O = vhVar.Oooo00o;
                biVar.OoooO = vhVar.Oooo00O;
                biVar.o000oOoO = vhVar.Oooo0O0;
                biVar.OoooOO0 = vhVar.Oooo0;
                biVar.o0OoOo0 = vhVar.o000oOoO;
                biVar.ooOO = vhVar.OoooOOO;
                biVar.OoooOOO = vhVar.Oooo0OO;
                biVar.OoooOOo = vhVar.Oooo0o0;
                biVar.OoooOo0 = vhVar.Oooo0oo;
                biVar.OoooOoO = vhVar.Oooo;
                biVar.OoooOoo = vhVar.Oooo0o;
                biVar.Ooooo00 = vhVar.Oooo0oO;
                biVar.Ooooo0o = vhVar.OoooO00;
                biVar.OooooO0 = vhVar.OoooO0;
                biVar.Ooooooo = vhVar.OoooOOo;
                biVar.Oooo0o = vhVar.OooOo0o;
                biVar.Oooo0oo = vhVar.OooOoO0;
                biVar.Oooo0o0 = vhVar.OooOo0O;
                biVar.Oooo0oO = vhVar.OooOo;
                biVar.OoooO00 = vhVar.OooOoO;
                biVar.Oooo = vhVar.OooOoOO;
                biVar.OoooO0 = vhVar.OooOoo0;
                biVar.o00Oo0 = vhVar.OoooOo0;
                biVar.Oooo0 = vhVar.getMarginEnd();
                biVar.Oooo0O0 = vhVar.getMarginStart();
                diVar.OooO00o = childAt.getVisibility();
                diVar.OooO0OO = childAt.getAlpha();
                eiVar.OooO00o = childAt.getRotation();
                eiVar.OooO0O0 = childAt.getRotationX();
                eiVar.OooO0OO = childAt.getRotationY();
                eiVar.OooO0Oo = childAt.getScaleX();
                eiVar.OooO0o0 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eiVar.OooO0o = pivotX;
                    eiVar.OooO0oO = pivotY;
                }
                eiVar.OooO = childAt.getTranslationX();
                eiVar.OooOO0 = childAt.getTranslationY();
                eiVar.OooOO0O = childAt.getTranslationZ();
                if (eiVar.OooOO0o) {
                    eiVar.OooOOO0 = childAt.getElevation();
                }
                if (childAt instanceof d6) {
                    d6 d6Var = (d6) childAt;
                    biVar.o00O0O = d6Var.getAllowsGoneWidget();
                    biVar.Oooooo = d6Var.getReferencedIds();
                    biVar.OooooOO = d6Var.getType();
                    biVar.OooooOo = d6Var.getMargin();
                }
            }
            i2++;
            fiVar = this;
            constraintLayout3 = constraintLayout;
        }
    }

    public final void OooO0Oo(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    ai aiVarOooO0OO = OooO0OO(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aiVarOooO0OO.OooO0Oo.OooO00o = true;
                    }
                    this.OooO0OO.put(Integer.valueOf(aiVarOooO0OO.OooO00o), aiVarOooO0OO);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
