package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.cmaster.cloner.ep;
import com.cmaster.cloner.ra;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode OooOO0O = PorterDuff.Mode.SRC_IN;
    public int OooO00o;
    public Object OooO0O0;
    public String OooOO0;
    public byte[] OooO0OO = null;
    public Parcelable OooO0Oo = null;
    public int OooO0o0 = 0;
    public int OooO0o = 0;
    public ColorStateList OooO0oO = null;
    public PorterDuff.Mode OooO0oo = OooOO0O;
    public String OooO = null;

    public IconCompat() {
    }

    public IconCompat(int i) {
        this.OooO00o = i;
    }

    public static Bitmap OooO00o(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat OooO0O0(int i) {
        if (i == 0) {
            ra.OooOOO("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.OooO0o0 = i;
        iconCompat.OooO0O0 = "";
        iconCompat.OooOO0 = "";
        return iconCompat;
    }

    public final int OooO0OO() {
        int i = this.OooO00o;
        if (i != -1) {
            if (i == 2) {
                return this.OooO0o0;
            }
            ra.OooO0o0(this, "called getResId() on ");
            return 0;
        }
        Object obj = this.OooO0O0;
        if (Build.VERSION.SDK_INT >= 28) {
            return ep.OooO0Oo(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    public final String OooO0Oo() {
        int i = this.OooO00o;
        if (i != -1) {
            if (i == 2) {
                String str = this.OooOO0;
                return (str == null || TextUtils.isEmpty(str)) ? ((String) this.OooO0O0).split(":", -1)[0] : this.OooOO0;
            }
            ra.OooO0o0(this, "called getResPackage() on ");
            return null;
        }
        Object obj = this.OooO0O0;
        if (Build.VERSION.SDK_INT >= 28) {
            return ep.OooO0o0(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    public final Uri OooO0o() {
        int i = this.OooO00o;
        if (i != -1) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.OooO0O0);
            }
            ra.OooO0o0(this, "called getUri() on ");
            return null;
        }
        Object obj = this.OooO0O0;
        if (Build.VERSION.SDK_INT >= 28) {
            return ep.OooOOO0(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    public final int OooO0o0() {
        int i = this.OooO00o;
        if (i != -1) {
            return i;
        }
        Object obj = this.OooO0O0;
        if (Build.VERSION.SDK_INT >= 28) {
            return ep.OooOO0o(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e3);
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Icon OooO0oO(android.content.Context r8) throws java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.OooO0oO(android.content.Context):android.graphics.drawable.Icon");
    }

    public final String toString() {
        String str;
        if (this.OooO00o == -1) {
            return String.valueOf(this.OooO0O0);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.OooO00o) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.OooO00o) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.OooO0O0).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.OooO0O0).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.OooOO0);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(OooO0OO())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.OooO0o0);
                if (this.OooO0o != 0) {
                    sb.append(" off=");
                    sb.append(this.OooO0o);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.OooO0O0);
                break;
        }
        if (this.OooO0oO != null) {
            sb.append(" tint=");
            sb.append(this.OooO0oO);
        }
        if (this.OooO0oo != OooOO0O) {
            sb.append(" mode=");
            sb.append(this.OooO0oo);
        }
        sb.append(")");
        return sb.toString();
    }
}
