package com.cmaster.cloner;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i51 {
    public final int OooO00o;
    public final int OooO0O0;
    public final long OooO0OO;
    public final long OooO0Oo;

    public i51(long j, int i, int i2, long j2) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = j;
        this.OooO0Oo = j2;
    }

    public static i51 OooO00o(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i51 i51Var = new i51(dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong());
            dataInputStream.close();
            return i51Var;
        } finally {
        }
    }

    public final void OooO0O0(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.OooO00o);
            dataOutputStream.writeInt(this.OooO0O0);
            dataOutputStream.writeLong(this.OooO0OO);
            dataOutputStream.writeLong(this.OooO0Oo);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof i51)) {
            i51 i51Var = (i51) obj;
            if (this.OooO0O0 == i51Var.OooO0O0 && this.OooO0OO == i51Var.OooO0OO && this.OooO00o == i51Var.OooO00o && this.OooO0Oo == i51Var.OooO0Oo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.OooO0O0), Long.valueOf(this.OooO0OO), Integer.valueOf(this.OooO00o), Long.valueOf(this.OooO0Oo));
    }
}
