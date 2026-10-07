package com.cmaster.cloner;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class as implements Closeable {
    public final long OooO;
    public final File OooO0Oo;
    public final File OooO0o;
    public final File OooO0o0;
    public final File OooO0oO;
    public BufferedWriter OooOO0o;
    public int OooOOO;
    public long OooOO0O = 0;
    public final LinkedHashMap OooOOO0 = new LinkedHashMap(0, 0.75f, true);
    public long OooOOOO = 0;
    public final ThreadPoolExecutor OooOOOo = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new yr());
    public final xr OooOOo0 = new xr(this, 0);
    public final int OooO0oo = 1;
    public final int OooOO0 = 1;

    public as(File file, long j) {
        this.OooO0Oo = file;
        this.OooO0o0 = new File(file, "journal");
        this.OooO0o = new File(file, "journal.tmp");
        this.OooO0oO = new File(file, "journal.bkp");
        this.OooO = j;
    }

    public static void OooO0OO(as asVar, km kmVar, boolean z) {
        synchronized (asVar) {
            zr zrVar = (zr) kmVar.OooO0O0;
            if (zrVar.OooO0o != kmVar) {
                throw new IllegalStateException();
            }
            if (z && !zrVar.OooO0o0) {
                for (int i = 0; i < asVar.OooOO0; i++) {
                    if (!((boolean[]) kmVar.OooO0OO)[i]) {
                        kmVar.OooO00o();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!zrVar.OooO0Oo[i].exists()) {
                        kmVar.OooO00o();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < asVar.OooOO0; i2++) {
                File file = zrVar.OooO0Oo[i2];
                if (!z) {
                    OooO0oo(file);
                } else if (file.exists()) {
                    File file2 = zrVar.OooO0OO[i2];
                    file.renameTo(file2);
                    long j = zrVar.OooO0O0[i2];
                    long length = file2.length();
                    zrVar.OooO0O0[i2] = length;
                    asVar.OooOO0O = (asVar.OooOO0O - j) + length;
                }
            }
            asVar.OooOOO++;
            zrVar.OooO0o = null;
            if (zrVar.OooO0o0 || z) {
                zrVar.OooO0o0 = true;
                asVar.OooOO0o.append((CharSequence) "CLEAN");
                asVar.OooOO0o.append(' ');
                asVar.OooOO0o.append((CharSequence) zrVar.OooO00o);
                asVar.OooOO0o.append((CharSequence) zrVar.OooO00o());
                asVar.OooOO0o.append('\n');
                if (z) {
                    asVar.OooOOOO++;
                }
            } else {
                asVar.OooOOO0.remove(zrVar.OooO00o);
                asVar.OooOO0o.append((CharSequence) "REMOVE");
                asVar.OooOO0o.append(' ');
                asVar.OooOO0o.append((CharSequence) zrVar.OooO00o);
                asVar.OooOO0o.append('\n');
            }
            OooOOO(asVar.OooOO0o);
            if (asVar.OooOO0O > asVar.OooO || asVar.OooOOo()) {
                asVar.OooOOOo.submit(asVar.OooOOo0);
            }
        }
    }

    public static void OooO0o(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void OooO0oo(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void OooOOO(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static as OooOOoo(File file, long j) throws IOException {
        if (j <= 0) {
            ra.OooOOO("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                OooOo(file2, file3, false);
            }
        }
        as asVar = new as(file, j);
        if (asVar.OooO0o0.exists()) {
            try {
                asVar.OooOo0();
                asVar.OooOo00();
                return asVar;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                asVar.close();
                rr1.OooO00o(asVar.OooO0Oo);
            }
        }
        file.mkdirs();
        as asVar2 = new as(file, j);
        asVar2.OooOo0o();
        return asVar2;
    }

    public static void OooOo(File file, File file2, boolean z) throws IOException {
        if (z) {
            OooO0oo(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final km OooO(String str) {
        synchronized (this) {
            try {
                if (this.OooOO0o == null) {
                    throw new IllegalStateException("cache is closed");
                }
                zr zrVar = (zr) this.OooOOO0.get(str);
                if (zrVar == null) {
                    zrVar = new zr(this, str);
                    this.OooOOO0.put(str, zrVar);
                } else if (zrVar.OooO0o != null) {
                    return null;
                }
                km kmVar = new km(this, zrVar);
                zrVar.OooO0o = kmVar;
                this.OooOO0o.append((CharSequence) "DIRTY");
                this.OooOO0o.append(' ');
                this.OooOO0o.append((CharSequence) str);
                this.OooOO0o.append('\n');
                OooOOO(this.OooOO0o);
                return kmVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized ay1 OooOOOO(String str) {
        if (this.OooOO0o == null) {
            throw new IllegalStateException("cache is closed");
        }
        zr zrVar = (zr) this.OooOOO0.get(str);
        if (zrVar == null) {
            return null;
        }
        if (!zrVar.OooO0o0) {
            return null;
        }
        for (File file : zrVar.OooO0OO) {
            if (!file.exists()) {
                return null;
            }
        }
        this.OooOOO++;
        this.OooOO0o.append((CharSequence) "READ");
        this.OooOO0o.append(' ');
        this.OooOO0o.append((CharSequence) str);
        this.OooOO0o.append('\n');
        if (OooOOo()) {
            this.OooOOOo.submit(this.OooOOo0);
        }
        return new ay1(zrVar.OooO0OO, 17);
    }

    public final boolean OooOOo() {
        int i = this.OooOOO;
        return i >= 2000 && i >= this.OooOOO0.size();
    }

    public final void OooOo0() {
        File file = this.OooO0o0;
        kj1 kj1Var = new kj1(new FileInputStream(file), rr1.OooO00o);
        try {
            String strOooO0OO = kj1Var.OooO0OO();
            String strOooO0OO2 = kj1Var.OooO0OO();
            String strOooO0OO3 = kj1Var.OooO0OO();
            String strOooO0OO4 = kj1Var.OooO0OO();
            String strOooO0OO5 = kj1Var.OooO0OO();
            if (!"libcore.io.DiskLruCache".equals(strOooO0OO) || !"1".equals(strOooO0OO2) || !Integer.toString(this.OooO0oo).equals(strOooO0OO3) || !Integer.toString(this.OooOO0).equals(strOooO0OO4) || !"".equals(strOooO0OO5)) {
                throw new IOException("unexpected journal header: [" + strOooO0OO + ", " + strOooO0OO2 + ", " + strOooO0OO4 + ", " + strOooO0OO5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    OooOo0O(kj1Var.OooO0OO());
                    i++;
                } catch (EOFException unused) {
                    this.OooOOO = i - this.OooOOO0.size();
                    if (kj1Var.OooO0oo == -1) {
                        OooOo0o();
                    } else {
                        this.OooOO0o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), rr1.OooO00o));
                    }
                    try {
                        kj1Var.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                kj1Var.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void OooOo00() throws IOException {
        OooO0oo(this.OooO0o);
        Iterator it = this.OooOOO0.values().iterator();
        while (it.hasNext()) {
            zr zrVar = (zr) it.next();
            km kmVar = zrVar.OooO0o;
            int i = this.OooOO0;
            int i2 = 0;
            if (kmVar == null) {
                while (i2 < i) {
                    this.OooOO0O += zrVar.OooO0O0[i2];
                    i2++;
                }
            } else {
                zrVar.OooO0o = null;
                while (i2 < i) {
                    OooO0oo(zrVar.OooO0OO[i2]);
                    OooO0oo(zrVar.OooO0Oo[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void OooOo0O(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            qa.OooOOOO("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.OooOOO0;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        zr zrVar = (zr) linkedHashMap.get(strSubstring);
        if (zrVar == null) {
            zrVar = new zr(this, strSubstring);
            linkedHashMap.put(strSubstring, zrVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                zrVar.OooO0o = new km(this, zrVar);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                qa.OooOOOO("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        zrVar.OooO0o0 = true;
        zrVar.OooO0o = null;
        if (strArrSplit.length != zrVar.OooO0oO.OooOO0) {
            sa.OooO0o0(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                zrVar.OooO0O0[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                sa.OooO0o0(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    public final synchronized void OooOo0o() {
        try {
            BufferedWriter bufferedWriter = this.OooOO0o;
            if (bufferedWriter != null) {
                OooO0o(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.OooO0o), rr1.OooO00o));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.OooO0oo));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.OooOO0));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (zr zrVar : this.OooOOO0.values()) {
                    if (zrVar.OooO0o != null) {
                        bufferedWriter2.write("DIRTY " + zrVar.OooO00o + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + zrVar.OooO00o + zrVar.OooO00o() + '\n');
                    }
                }
                OooO0o(bufferedWriter2);
                if (this.OooO0o0.exists()) {
                    OooOo(this.OooO0o0, this.OooO0oO, true);
                }
                OooOo(this.OooO0o, this.OooO0o0, false);
                this.OooO0oO.delete();
                this.OooOO0o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.OooO0o0, true), rr1.OooO00o));
            } catch (Throwable th) {
                OooO0o(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void OooOoO0() {
        while (this.OooOO0O > this.OooO) {
            String str = (String) ((Map.Entry) this.OooOOO0.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.OooOO0o == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    zr zrVar = (zr) this.OooOOO0.get(str);
                    if (zrVar != null && zrVar.OooO0o == null) {
                        for (int i = 0; i < this.OooOO0; i++) {
                            File file = zrVar.OooO0OO[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.OooOO0O;
                            long[] jArr = zrVar.OooO0O0;
                            this.OooOO0O = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.OooOOO++;
                        this.OooOO0o.append((CharSequence) "REMOVE");
                        this.OooOO0o.append(' ');
                        this.OooOO0o.append((CharSequence) str);
                        this.OooOO0o.append('\n');
                        this.OooOOO0.remove(str);
                        if (OooOOo()) {
                            this.OooOOOo.submit(this.OooOOo0);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.OooOO0o == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.OooOOO0.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                km kmVar = ((zr) obj).OooO0o;
                if (kmVar != null) {
                    kmVar.OooO00o();
                }
            }
            OooOoO0();
            OooO0o(this.OooOO0o);
            this.OooOO0o = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
