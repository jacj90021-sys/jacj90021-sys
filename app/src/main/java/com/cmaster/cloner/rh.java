package com.cmaster.cloner;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rh {
    public boolean OooO00o = false;
    public int OooO0O0;
    public int OooO0OO;
    public float OooO0Oo;
    public boolean OooO0o;
    public String OooO0o0;
    public int OooO0oO;

    public rh(rh rhVar, Object obj) {
        rhVar.getClass();
        this.OooO0O0 = rhVar.OooO0O0;
        OooO0O0(obj);
    }

    public static void OooO00o(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e61.OooO0Oo);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        boolean z = false;
        Object objValueOf = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (string != null && objValueOf != null) {
            rh rhVar = new rh();
            rhVar.OooO0O0 = i;
            rhVar.OooO00o = z;
            rhVar.OooO0O0(objValueOf);
            map.put(string, rhVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooO0O0(Object obj) {
        switch (rj.OooOOoo(this.OooO0O0)) {
            case 0:
            case 7:
                this.OooO0OO = ((Integer) obj).intValue();
                break;
            case 1:
                this.OooO0Oo = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.OooO0oO = ((Integer) obj).intValue();
                break;
            case 4:
                this.OooO0o0 = (String) obj;
                break;
            case 5:
                this.OooO0o = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.OooO0Oo = ((Float) obj).floatValue();
                break;
        }
    }
}
