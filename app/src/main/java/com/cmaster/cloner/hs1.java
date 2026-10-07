package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hs1 extends yr1 {
    public static final PorterDuff.Mode OooOOO0 = PorterDuff.Mode.SRC_IN;
    public boolean OooO;
    public PorterDuffColorFilter OooO0o;
    public fs1 OooO0o0;
    public ColorFilter OooO0oO;
    public boolean OooO0oo;
    public final float[] OooOO0;
    public final Matrix OooOO0O;
    public final Rect OooOO0o;

    public hs1() {
        this.OooO = true;
        this.OooOO0 = new float[9];
        this.OooOO0O = new Matrix();
        this.OooOO0o = new Rect();
        fs1 fs1Var = new fs1();
        fs1Var.OooO0OO = null;
        fs1Var.OooO0Oo = OooOOO0;
        fs1Var.OooO0O0 = new es1();
        this.OooO0o0 = fs1Var;
    }

    public final PorterDuffColorFilter OooO00o(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.OooO0Oo;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.OooOO0o;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.OooO0oO;
        if (colorFilter == null) {
            colorFilter = this.OooO0o;
        }
        Matrix matrix = this.OooOO0O;
        canvas.getMatrix(matrix);
        float[] fArr = this.OooOO0;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        fs1 fs1Var = this.OooO0o0;
        Bitmap bitmap = fs1Var.OooO0o;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != fs1Var.OooO0o.getHeight()) {
            fs1Var.OooO0o = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            fs1Var.OooOO0O = true;
        }
        boolean z = this.OooO;
        fs1 fs1Var2 = this.OooO0o0;
        if (!z) {
            fs1Var2.OooO0o.eraseColor(0);
            Canvas canvas2 = new Canvas(fs1Var2.OooO0o);
            es1 es1Var = fs1Var2.OooO0O0;
            es1Var.OooO00o(es1Var.OooO0oO, es1.OooOOOo, canvas2, iMin, iMin2);
        } else if (fs1Var2.OooOO0O || fs1Var2.OooO0oO != fs1Var2.OooO0OO || fs1Var2.OooO0oo != fs1Var2.OooO0Oo || fs1Var2.OooOO0 != fs1Var2.OooO0o0 || fs1Var2.OooO != fs1Var2.OooO0O0.getRootAlpha()) {
            fs1 fs1Var3 = this.OooO0o0;
            fs1Var3.OooO0o.eraseColor(0);
            Canvas canvas3 = new Canvas(fs1Var3.OooO0o);
            es1 es1Var2 = fs1Var3.OooO0O0;
            es1Var2.OooO00o(es1Var2.OooO0oO, es1.OooOOOo, canvas3, iMin, iMin2);
            fs1 fs1Var4 = this.OooO0o0;
            fs1Var4.OooO0oO = fs1Var4.OooO0OO;
            fs1Var4.OooO0oo = fs1Var4.OooO0Oo;
            fs1Var4.OooO = fs1Var4.OooO0O0.getRootAlpha();
            fs1Var4.OooOO0 = fs1Var4.OooO0o0;
            fs1Var4.OooOO0O = false;
        }
        fs1 fs1Var5 = this.OooO0o0;
        if (fs1Var5.OooO0O0.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (fs1Var5.OooOO0o == null) {
                Paint paint2 = new Paint();
                fs1Var5.OooOO0o = paint2;
                paint2.setFilterBitmap(true);
            }
            fs1Var5.OooOO0o.setAlpha(fs1Var5.OooO0O0.getRootAlpha());
            fs1Var5.OooOO0o.setColorFilter(colorFilter);
            paint = fs1Var5.OooOO0o;
        }
        canvas.drawBitmap(fs1Var5.OooO0o, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.OooO0Oo;
        return drawable != null ? drawable.getAlpha() : this.OooO0o0.OooO0O0.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.OooO0o0.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.OooO0Oo;
        return drawable != null ? drawable.getColorFilter() : this.OooO0oO;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.OooO0Oo != null) {
            return new gs1(this.OooO0Oo.getConstantState());
        }
        this.OooO0o0.OooO00o = getChangingConfigurations();
        return this.OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.OooO0Oo;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.OooO0o0.OooO0O0.OooO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.OooO0Oo;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.OooO0o0.OooO0O0.OooO0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        char c;
        int i2;
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        fs1 fs1Var = this.OooO0o0;
        fs1Var.OooO0O0 = new es1();
        TypedArray typedArrayOooO0Oo = e53.OooO0Oo(resources, theme, attributeSet, oOO0O0O0.OooO00o);
        fs1 fs1Var2 = this.OooO0o0;
        es1 es1Var = fs1Var2.OooO0O0;
        int i3 = !e53.OooO0OO(xmlPullParser, "tintMode") ? -1 : typedArrayOooO0Oo.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        fs1Var2.OooO0Oo = mode;
        ColorStateList colorStateListOooO00o = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayOooO0Oo.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 < 28 || i5 > 31) {
                Resources resources2 = typedArrayOooO0Oo.getResources();
                int resourceId = typedArrayOooO0Oo.getResourceId(1, 0);
                ThreadLocal threadLocal = xe.OooO00o;
                try {
                    colorStateListOooO00o = xe.OooO00o(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateListOooO00o = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList = colorStateListOooO00o;
        if (colorStateList != null) {
            fs1Var2.OooO0OO = colorStateList;
        }
        boolean z = fs1Var2.OooO0o0;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayOooO0Oo.getBoolean(5, z);
        }
        fs1Var2.OooO0o0 = z;
        float f = es1Var.OooOO0;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayOooO0Oo.getFloat(7, f);
        }
        es1Var.OooOO0 = f;
        float f2 = es1Var.OooOO0O;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayOooO0Oo.getFloat(8, f2);
        }
        es1Var.OooOO0O = f2;
        if (es1Var.OooOO0 <= 0.0f) {
            throw new XmlPullParserException(typedArrayOooO0Oo.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayOooO0Oo.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        es1Var.OooO0oo = typedArrayOooO0Oo.getDimension(3, es1Var.OooO0oo);
        float dimension = typedArrayOooO0Oo.getDimension(2, es1Var.OooO);
        es1Var.OooO = dimension;
        if (es1Var.OooO0oo <= 0.0f) {
            throw new XmlPullParserException(typedArrayOooO0Oo.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayOooO0Oo.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = es1Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayOooO0Oo.getFloat(4, alpha);
        }
        es1Var.setAlpha(alpha);
        String string = typedArrayOooO0Oo.getString(0);
        if (string != null) {
            es1Var.OooOOO0 = string;
            es1Var.OooOOOO.put(string, es1Var);
        }
        typedArrayOooO0Oo.recycle();
        fs1Var.OooO00o = getChangingConfigurations();
        fs1Var.OooOO0O = true;
        fs1 fs1Var3 = this.OooO0o0;
        es1 es1Var2 = fs1Var3.OooO0O0;
        ArrayDeque arrayDeque = new ArrayDeque();
        bs1 bs1Var = es1Var2.OooO0oO;
        k3 k3Var = es1Var2.OooOOOO;
        arrayDeque.push(bs1Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                bs1 bs1Var2 = (bs1) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    as1 as1Var = new as1();
                    as1Var.OooO0o0 = 0.0f;
                    as1Var.OooO0oO = 1.0f;
                    as1Var.OooO0oo = 1.0f;
                    as1Var.OooO = 0.0f;
                    as1Var.OooOO0 = 1.0f;
                    as1Var.OooOO0O = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    as1Var.OooOO0o = cap;
                    Paint.Join join = Paint.Join.MITER;
                    as1Var.OooOOO0 = join;
                    as1Var.OooOOO = 4.0f;
                    TypedArray typedArrayOooO0Oo2 = e53.OooO0Oo(resources, theme, attributeSet, oOO0O0O0.OooO0OO);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayOooO0Oo2.getString(0);
                        if (string2 != null) {
                            as1Var.OooO0O0 = string2;
                        }
                        String string3 = typedArrayOooO0Oo2.getString(2);
                        if (string3 != null) {
                            as1Var.OooO00o = px2.OooO0O0(string3);
                        }
                        as1Var.OooO0o = e53.OooO0O0(typedArrayOooO0Oo2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = as1Var.OooO0oo;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = typedArrayOooO0Oo2.getFloat(12, f3);
                        }
                        as1Var.OooO0oo = f3;
                        int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayOooO0Oo2.getInt(8, -1) : -1;
                        as1Var.OooOO0o = i6 != 0 ? i6 != 1 ? i6 != 2 ? as1Var.OooOO0o : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayOooO0Oo2.getInt(9, -1) : -1;
                        as1Var.OooOOO0 = i7 != 0 ? i7 != 1 ? i7 != 2 ? as1Var.OooOOO0 : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = as1Var.OooOOO;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = typedArrayOooO0Oo2.getFloat(10, f4);
                        }
                        as1Var.OooOOO = f4;
                        as1Var.OooO0Oo = e53.OooO0O0(typedArrayOooO0Oo2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = as1Var.OooO0oO;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = typedArrayOooO0Oo2.getFloat(11, f5);
                        }
                        as1Var.OooO0oO = f5;
                        float f6 = as1Var.OooO0o0;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = typedArrayOooO0Oo2.getFloat(4, f6);
                        }
                        as1Var.OooO0o0 = f6;
                        float f7 = as1Var.OooOO0;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = typedArrayOooO0Oo2.getFloat(6, f7);
                        }
                        as1Var.OooOO0 = f7;
                        float f8 = as1Var.OooOO0O;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = typedArrayOooO0Oo2.getFloat(7, f8);
                        }
                        as1Var.OooOO0O = f8;
                        float f9 = as1Var.OooO;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = typedArrayOooO0Oo2.getFloat(5, f9);
                        }
                        as1Var.OooO = f9;
                        int i8 = as1Var.OooO0OO;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i8 = typedArrayOooO0Oo2.getInt(13, i8);
                        }
                        as1Var.OooO0OO = i8;
                    }
                    typedArrayOooO0Oo2.recycle();
                    bs1Var2.OooO0O0.add(as1Var);
                    if (as1Var.getPathName() != null) {
                        k3Var.put(as1Var.getPathName(), as1Var);
                    }
                    fs1Var3.OooO00o = fs1Var3.OooO00o;
                    z2 = false;
                    c = '\b';
                } else {
                    c = '\b';
                    if ("clip-path".equals(name)) {
                        zr1 zr1Var = new zr1();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayOooO0Oo3 = e53.OooO0Oo(resources, theme, attributeSet, oOO0O0O0.OooO0Oo);
                            String string4 = typedArrayOooO0Oo3.getString(0);
                            if (string4 != null) {
                                zr1Var.OooO0O0 = string4;
                            }
                            String string5 = typedArrayOooO0Oo3.getString(1);
                            if (string5 != null) {
                                zr1Var.OooO00o = px2.OooO0O0(string5);
                            }
                            zr1Var.OooO0OO = !e53.OooO0OO(xmlPullParser, "fillType") ? 0 : typedArrayOooO0Oo3.getInt(2, 0);
                            typedArrayOooO0Oo3.recycle();
                        }
                        bs1Var2.OooO0O0.add(zr1Var);
                        if (zr1Var.getPathName() != null) {
                            k3Var.put(zr1Var.getPathName(), zr1Var);
                        }
                        fs1Var3.OooO00o = fs1Var3.OooO00o;
                    } else if ("group".equals(name)) {
                        bs1 bs1Var3 = new bs1();
                        TypedArray typedArrayOooO0Oo4 = e53.OooO0Oo(resources, theme, attributeSet, oOO0O0O0.OooO0O0);
                        float f10 = bs1Var3.OooO0OO;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                            f10 = typedArrayOooO0Oo4.getFloat(5, f10);
                        }
                        bs1Var3.OooO0OO = f10;
                        bs1Var3.OooO0Oo = typedArrayOooO0Oo4.getFloat(1, bs1Var3.OooO0Oo);
                        bs1Var3.OooO0o0 = typedArrayOooO0Oo4.getFloat(2, bs1Var3.OooO0o0);
                        float f11 = bs1Var3.OooO0o;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = typedArrayOooO0Oo4.getFloat(3, f11);
                        }
                        bs1Var3.OooO0o = f11;
                        float f12 = bs1Var3.OooO0oO;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = typedArrayOooO0Oo4.getFloat(4, f12);
                        }
                        bs1Var3.OooO0oO = f12;
                        float f13 = bs1Var3.OooO0oo;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = typedArrayOooO0Oo4.getFloat(6, f13);
                        }
                        bs1Var3.OooO0oo = f13;
                        float f14 = bs1Var3.OooO;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = typedArrayOooO0Oo4.getFloat(7, f14);
                        }
                        bs1Var3.OooO = f14;
                        String string6 = typedArrayOooO0Oo4.getString(0);
                        if (string6 != null) {
                            bs1Var3.OooOO0O = string6;
                        }
                        bs1Var3.OooO0OO();
                        typedArrayOooO0Oo4.recycle();
                        bs1Var2.OooO0O0.add(bs1Var3);
                        arrayDeque.push(bs1Var3);
                        if (bs1Var3.getGroupName() != null) {
                            k3Var.put(bs1Var3.getGroupName(), bs1Var3);
                        }
                        fs1Var3.OooO00o = fs1Var3.OooO00o;
                    }
                }
                i2 = 1;
            } else {
                i = depth;
                c = '\b';
                i2 = 1;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i4 = i2;
            depth = i;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.OooO0o = OooO00o(fs1Var.OooO0OO, fs1Var.OooO0Oo);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.OooO0Oo;
        return drawable != null ? drawable.isAutoMirrored() : this.OooO0o0.OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        fs1 fs1Var = this.OooO0o0;
        if (fs1Var == null) {
            return false;
        }
        es1 es1Var = fs1Var.OooO0O0;
        if (es1Var.OooOOO == null) {
            es1Var.OooOOO = Boolean.valueOf(es1Var.OooO0oO.OooO00o());
        }
        if (es1Var.OooOOO.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.OooO0o0.OooO0OO;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.OooO0oo && super.mutate() == this) {
            fs1 fs1Var = this.OooO0o0;
            fs1 fs1Var2 = new fs1();
            fs1Var2.OooO0OO = null;
            fs1Var2.OooO0Oo = OooOOO0;
            if (fs1Var != null) {
                fs1Var2.OooO00o = fs1Var.OooO00o;
                es1 es1Var = new es1(fs1Var.OooO0O0);
                fs1Var2.OooO0O0 = es1Var;
                if (fs1Var.OooO0O0.OooO0o0 != null) {
                    es1Var.OooO0o0 = new Paint(fs1Var.OooO0O0.OooO0o0);
                }
                if (fs1Var.OooO0O0.OooO0Oo != null) {
                    fs1Var2.OooO0O0.OooO0Oo = new Paint(fs1Var.OooO0O0.OooO0Oo);
                }
                fs1Var2.OooO0OO = fs1Var.OooO0OO;
                fs1Var2.OooO0Oo = fs1Var.OooO0Oo;
                fs1Var2.OooO0o0 = fs1Var.OooO0o0;
            }
            this.OooO0o0 = fs1Var2;
            this.OooO0oo = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        fs1 fs1Var = this.OooO0o0;
        ColorStateList colorStateList = fs1Var.OooO0OO;
        if (colorStateList == null || (mode = fs1Var.OooO0Oo) == null) {
            z = false;
        } else {
            this.OooO0o = OooO00o(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        es1 es1Var = fs1Var.OooO0O0;
        if (es1Var.OooOOO == null) {
            es1Var.OooOOO = Boolean.valueOf(es1Var.OooO0oO.OooO00o());
        }
        if (es1Var.OooOOO.booleanValue()) {
            boolean zOooO0O0 = fs1Var.OooO0O0.OooO0oO.OooO0O0(iArr);
            fs1Var.OooOO0O |= zOooO0O0;
            if (zOooO0O0) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.OooO0o0.OooO0O0.getRootAlpha() != i) {
            this.OooO0o0.OooO0O0.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.OooO0o0.OooO0o0 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.OooO0oO = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        fs1 fs1Var = this.OooO0o0;
        if (fs1Var.OooO0OO != colorStateList) {
            fs1Var.OooO0OO = colorStateList;
            this.OooO0o = OooO00o(colorStateList, fs1Var.OooO0Oo);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        fs1 fs1Var = this.OooO0o0;
        if (fs1Var.OooO0Oo != mode) {
            fs1Var.OooO0Oo = mode;
            this.OooO0o = OooO00o(fs1Var.OooO0OO, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.OooO0Oo;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public hs1(fs1 fs1Var) {
        this.OooO = true;
        this.OooOO0 = new float[9];
        this.OooOO0O = new Matrix();
        this.OooOO0o = new Rect();
        this.OooO0o0 = fs1Var;
        this.OooO0o = OooO00o(fs1Var.OooO0OO, fs1Var.OooO0Oo);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
