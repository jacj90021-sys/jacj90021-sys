package com.cmaster.cloner;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fk1 extends MenuInflater {
    public static final Class[] OooO0o;
    public static final Class[] OooO0o0;
    public final Object[] OooO00o;
    public final Object[] OooO0O0;
    public final Context OooO0OO;
    public Object OooO0Oo;

    static {
        Class[] clsArr = {Context.class};
        OooO0o0 = clsArr;
        OooO0o = clsArr;
    }

    public fk1(Context context) {
        super(context);
        this.OooO0OO = context;
        Object[] objArr = {context};
        this.OooO00o = objArr;
        this.OooO0O0 = objArr;
    }

    public static Object OooO00o(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? OooO00o(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void OooO0O0(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        ek1 ek1Var = new ek1(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    ra.OooOOO0("Expecting menu, got ".concat(name));
                    return;
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                ra.OooOOO0("Unexpected end of document");
                return;
            }
            Menu menu2 = ek1Var.OooO00o;
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z = z;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            ek1Var.OooO0O0 = 0;
                            ek1Var.OooO0OO = 0;
                            ek1Var.OooO0Oo = 0;
                            ek1Var.OooO0o0 = 0;
                            ek1Var.OooO0o = true;
                            ek1Var.OooO0oO = true;
                        } else if (name2.equals("item")) {
                            if (!ek1Var.OooO0oo) {
                                ws0 ws0Var = ek1Var.OooOoO;
                                if (ws0Var == null || !ws0Var.OooO0O0.hasSubMenu()) {
                                    ek1Var.OooO0oo = true;
                                    ek1Var.OooO0O0(menu2.add(ek1Var.OooO0O0, ek1Var.OooO, ek1Var.OooOO0, ek1Var.OooOO0O));
                                } else {
                                    ek1Var.OooO0oo = true;
                                    ek1Var.OooO0O0(menu2.addSubMenu(ek1Var.OooO0O0, ek1Var.OooO, ek1Var.OooOO0, ek1Var.OooOO0O).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z = z;
                    }
                }
                eventType = xmlPullParser2.next();
                i = 2;
                z = z;
                z2 = z2;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.OooO0OO;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l61.OooOOOo);
                        ek1Var.OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        ek1Var.OooO0OO = typedArrayObtainStyledAttributes.getInt(3, 0);
                        ek1Var.OooO0Oo = typedArrayObtainStyledAttributes.getInt(4, 0);
                        ek1Var.OooO0o0 = typedArrayObtainStyledAttributes.getInt(5, 0);
                        ek1Var.OooO0o = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        ek1Var.OooO0oO = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, l61.OooOOo0);
                            ek1Var.OooO = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            ek1Var.OooOO0 = (typedArrayObtainStyledAttributes2.getInt(5, ek1Var.OooO0OO) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, ek1Var.OooO0Oo) & 65535);
                            ek1Var.OooOO0O = typedArrayObtainStyledAttributes2.getText(7);
                            ek1Var.OooOO0o = typedArrayObtainStyledAttributes2.getText(8);
                            ek1Var.OooOOO0 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            ek1Var.OooOOO = string == null ? (char) 0 : string.charAt(0);
                            ek1Var.OooOOOO = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            ek1Var.OooOOOo = string2 == null ? (char) 0 : string2.charAt(0);
                            ek1Var.OooOOo0 = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                ek1Var.OooOOo = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                ek1Var.OooOOo = ek1Var.OooO0o0;
                            }
                            ek1Var.OooOOoo = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            ek1Var.OooOo00 = typedArrayObtainStyledAttributes2.getBoolean(4, ek1Var.OooO0o);
                            ek1Var.OooOo0 = typedArrayObtainStyledAttributes2.getBoolean(1, ek1Var.OooO0oO);
                            ek1Var.OooOo0O = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            ek1Var.OooOoO0 = typedArrayObtainStyledAttributes2.getString(12);
                            ek1Var.OooOo0o = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            ek1Var.OooOo = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && ek1Var.OooOo0o == 0 && ek1Var.OooOo == null) {
                                ek1Var.OooOoO = (ws0) ek1Var.OooO00o(string3, OooO0o, this.OooO0O0);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                ek1Var.OooOoO = null;
                            }
                            ek1Var.OooOoOO = typedArrayObtainStyledAttributes2.getText(17);
                            ek1Var.OooOoo0 = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                ek1Var.OooOooO = ct.OooO0OO(typedArrayObtainStyledAttributes2.getInt(19, -1), ek1Var.OooOooO);
                            } else {
                                ek1Var.OooOooO = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = ep2.OooO0O0(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                ek1Var.OooOoo = colorStateList;
                            } else {
                                ek1Var.OooOoo = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            ek1Var.OooO0oo = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            ek1Var.OooO0oo = true;
                            SubMenu subMenuAddSubMenu = menu2.addSubMenu(ek1Var.OooO0O0, ek1Var.OooO, ek1Var.OooOO0, ek1Var.OooOO0O);
                            ek1Var.OooO0O0(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            OooO0O0(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof ss0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.OooO0OO.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof ss0) {
                    ss0 ss0Var = (ss0) menu;
                    if (!ss0Var.OooOOoo) {
                        ss0Var.OooOo0o();
                        z = true;
                    }
                }
                OooO0O0(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((ss0) menu).OooOo0O();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((ss0) menu).OooOo0O();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
