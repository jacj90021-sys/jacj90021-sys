package com.cmaster.cloner;

import android.database.Cursor;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pk1 extends rk1 {
    public double[] OooO;
    public int[] OooO0oO;
    public long[] OooO0oo;
    public String[] OooOO0;
    public byte[][] OooOO0O;
    public Cursor OooOO0o;

    public static void OooO(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            zy2.OooO0O0(25, "column index out of range");
            throw null;
        }
    }

    @Override // com.cmaster.cloner.rc1
    public final void OooO00o(int i, long j) {
        OooO0OO();
        OooO0o(1, i);
        this.OooO0oO[i] = 1;
        this.OooO0oo[i] = j;
    }

    @Override // com.cmaster.cloner.rc1
    public final void OooO0O0(int i) {
        OooO0OO();
        OooO0o(5, i);
        this.OooO0oO[i] = 5;
    }

    public final void OooO0o(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.OooO0oO;
        if (iArr.length < i3) {
            this.OooO0oO = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.OooO0oo;
            if (jArr.length < i3) {
                this.OooO0oo = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.OooO;
            if (dArr.length < i3) {
                this.OooO = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.OooOO0;
            if (strArr.length < i3) {
                this.OooOO0 = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.OooOO0O;
        if (bArr.length < i3) {
            this.OooOO0O = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // com.cmaster.cloner.rc1
    public final void OooO0oO(int i, String str) {
        str.getClass();
        OooO0OO();
        OooO0o(3, i);
        this.OooO0oO[i] = 3;
        this.OooOO0[i] = str;
    }

    public final void OooO0oo() {
        if (this.OooOO0o == null) {
            this.OooOO0o = this.OooO0Oo.OooOOoo(new o00OO000(this, 29));
        }
    }

    @Override // com.cmaster.cloner.rc1
    public final String OooOO0o(int i) {
        OooO0OO();
        Cursor cursor = this.OooOO0o;
        if (cursor == null) {
            zy2.OooO0O0(21, "no row");
            throw null;
        }
        OooO(cursor, i);
        String string = cursor.getString(i);
        string.getClass();
        return string;
    }

    @Override // com.cmaster.cloner.rc1
    public final boolean OooOOOo() {
        OooO0OO();
        OooO0oo();
        Cursor cursor = this.OooOO0o;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        qa.OooO0o("Required value was null.");
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.OooO0o) {
            OooO0OO();
            this.OooO0oO = new int[0];
            this.OooO0oo = new long[0];
            this.OooO = new double[0];
            this.OooOO0 = new String[0];
            this.OooOO0O = new byte[0][];
            reset();
        }
        this.OooO0o = true;
    }

    @Override // com.cmaster.cloner.rc1
    public final int getColumnCount() {
        OooO0OO();
        OooO0oo();
        Cursor cursor = this.OooOO0o;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // com.cmaster.cloner.rc1
    public final String getColumnName(int i) {
        OooO0OO();
        OooO0oo();
        Cursor cursor = this.OooOO0o;
        if (cursor == null) {
            qa.OooO0o("Required value was null.");
            return null;
        }
        OooO(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // com.cmaster.cloner.rc1
    public final long getLong(int i) {
        OooO0OO();
        Cursor cursor = this.OooOO0o;
        if (cursor != null) {
            OooO(cursor, i);
            return cursor.getLong(i);
        }
        zy2.OooO0O0(21, "no row");
        throw null;
    }

    @Override // com.cmaster.cloner.rc1
    public final boolean isNull(int i) {
        OooO0OO();
        Cursor cursor = this.OooOO0o;
        if (cursor != null) {
            OooO(cursor, i);
            return cursor.isNull(i);
        }
        zy2.OooO0O0(21, "no row");
        throw null;
    }

    @Override // com.cmaster.cloner.rc1
    public final void reset() {
        OooO0OO();
        Cursor cursor = this.OooOO0o;
        if (cursor != null) {
            cursor.close();
        }
        this.OooOO0o = null;
    }
}
