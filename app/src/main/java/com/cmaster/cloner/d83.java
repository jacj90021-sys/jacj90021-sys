package com.cmaster.cloner;

import android.database.Cursor;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class d83 implements oc1, r9, uj, x20, tz, zv, wd1, ju0, ig, bz0 {
    public static d83 OooO0o0;
    public final /* synthetic */ int OooO0Oo;
    public static final d83 OooO0o = new d83(1);
    public static final d83 OooO0oO = new d83(2);

    public /* synthetic */ d83(int i) {
        this.OooO0Oo = i;
    }

    @Override // com.cmaster.cloner.r9, com.cmaster.cloner.tz
    public Class OooO00o() {
        switch (this.OooO0Oo) {
            case 3:
                return ByteBuffer.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.cmaster.cloner.tz
    public void OooO0O0(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // com.cmaster.cloner.x20
    public void OooO0OO(oOOO00 oooo00) {
    }

    @Override // com.cmaster.cloner.wd1
    public void OooO0Oo(boolean z, int i, int i2, int i3) {
    }

    @Override // com.cmaster.cloner.ig
    public Object OooO0o0(ab1 ab1Var) {
        switch (this.OooO0Oo) {
            case 15:
                return new cu0();
            default:
                vd vdVar = new vd();
                oOOoOOO0 ooooooo0 = new oOOoOOO0(8);
                ReferenceQueue referenceQueue = vdVar.OooO00o;
                Set set = vdVar.OooO0O0;
                set.add(new ie2(vdVar, referenceQueue, set, ooooooo0));
                Thread thread = new Thread(new bf1(referenceQueue, set, 10, false), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return vdVar;
        }
    }

    @Override // com.cmaster.cloner.r9
    public Object OooO0oO(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    public void OooO0oo(aw awVar) {
        awVar.OooO0oO(g63.class, vw2.OooO00o);
        awVar.OooO0oO(ab3.class, b33.OooO00o);
        awVar.OooO0oO(h63.class, xw2.OooO00o);
        awVar.OooO0oO(k63.class, bx2.OooO00o);
        awVar.OooO0oO(i63.class, zw2.OooO00o);
        awVar.OooO0oO(j63.class, cx2.OooO00o);
        awVar.OooO0oO(m43.class, du2.OooO00o);
        awVar.OooO0oO(l43.class, bu2.OooO00o);
        awVar.OooO0oO(m53.class, zv2.OooO00o);
        awVar.OooO0oO(ga3.class, e23.OooO00o);
        awVar.OooO0oO(k43.class, zt2.OooO00o);
        awVar.OooO0oO(j43.class, xt2.OooO00o);
        awVar.OooO0oO(c83.class, a03.OooO00o);
        awVar.OooO0oO(bc3.class, mv2.OooO00o);
        awVar.OooO0oO(i53.class, rv2.OooO00o);
        awVar.OooO0oO(f53.class, kv2.OooO00o);
        awVar.OooO0oO(e83.class, b03.OooO00o);
        awVar.OooO0oO(da3.class, b23.OooO00o);
        awVar.OooO0oO(ea3.class, c23.OooO00o);
        awVar.OooO0oO(ca3.class, a23.OooO00o);
        awVar.OooO0oO(s63.class, wx2.OooO00o);
        awVar.OooO0oO(ub3.class, ns2.OooO00o);
        awVar.OooO0oO(t63.class, yx2.OooO00o);
        awVar.OooO0oO(s83.class, m03.OooO00o);
        awVar.OooO0oO(v83.class, r03.OooO00o);
        awVar.OooO0oO(u83.class, q03.OooO00o);
        awVar.OooO0oO(t83.class, o03.OooO00o);
        awVar.OooO0oO(e93.class, j13.OooO00o);
        awVar.OooO0oO(f93.class, k13.OooO00o);
        awVar.OooO0oO(h93.class, m13.OooO00o);
        awVar.OooO0oO(g93.class, l13.OooO00o);
        awVar.OooO0oO(o63.class, ux2.OooO00o);
        awVar.OooO0oO(i93.class, n13.OooO00o);
        awVar.OooO0oO(j93.class, o13.OooO00o);
        awVar.OooO0oO(k93.class, p13.OooO00o);
        awVar.OooO0oO(l93.class, q13.OooO00o);
        awVar.OooO0oO(w93.class, t13.OooO00o);
        awVar.OooO0oO(v93.class, u13.OooO00o);
        awVar.OooO0oO(d93.class, y03.OooO00o);
        awVar.OooO0oO(q53.class, jw2.OooO00o);
        awVar.OooO0oO(b93.class, h13.OooO00o);
        awVar.OooO0oO(a93.class, z03.OooO00o);
        awVar.OooO0oO(c93.class, i13.OooO00o);
        awVar.OooO0oO(fa3.class, d23.OooO00o);
        awVar.OooO0oO(gb3.class, h33.OooO00o);
        awVar.OooO0oO(z33.class, bt2.OooO00o);
        awVar.OooO0oO(w33.class, rs2.OooO00o);
        awVar.OooO0oO(v33.class, qs2.OooO00o);
        awVar.OooO0oO(x33.class, zs2.OooO00o);
        awVar.OooO0oO(b43.class, ft2.OooO00o);
        awVar.OooO0oO(a43.class, dt2.OooO00o);
        awVar.OooO0oO(c43.class, ht2.OooO00o);
        awVar.OooO0oO(ol0.class, jt2.OooO00o);
        awVar.OooO0oO(d43.class, lt2.OooO00o);
        awVar.OooO0oO(f43.class, nt2.OooO00o);
        awVar.OooO0oO(pj1.class, pt2.OooO00o);
        awVar.OooO0oO(ap2.class, gs2.OooO00o);
        awVar.OooO0oO(dp2.class, ks2.OooO00o);
        awVar.OooO0oO(cp2.class, is2.OooO00o);
        awVar.OooO0oO(o53.class, fw2.OooO00o);
        awVar.OooO0oO(n43.class, fu2.OooO00o);
        awVar.OooO0oO(dl2.class, hp2.OooO00o);
        awVar.OooO0oO(al2.class, jp2.OooO00o);
        awVar.OooO0oO(d53.class, gv2.OooO00o);
        awVar.OooO0oO(il2.class, lp2.OooO00o);
        awVar.OooO0oO(fl2.class, np2.OooO00o);
        awVar.OooO0oO(dn2.class, jq2.OooO00o);
        awVar.OooO0oO(bn2.class, lq2.OooO00o);
        awVar.OooO0oO(ul2.class, pp2.OooO00o);
        awVar.OooO0oO(pl2.class, rp2.OooO00o);
        awVar.OooO0oO(on2.class, yq2.OooO00o);
        awVar.OooO0oO(mn2.class, ar2.OooO00o);
        awVar.OooO0oO(wn2.class, gr2.OooO00o);
        awVar.OooO0oO(un2.class, ir2.OooO00o);
        awVar.OooO0oO(yo2.class, cs2.OooO00o);
        awVar.OooO0oO(wo2.class, es2.OooO00o);
        awVar.OooO0oO(ao2.class, kr2.OooO00o);
        awVar.OooO0oO(yn2.class, mr2.OooO00o);
        awVar.OooO0oO(eo2.class, or2.OooO00o);
        awVar.OooO0oO(co2.class, qr2.OooO00o);
        awVar.OooO0oO(ob3.class, o23.OooO00o);
        awVar.OooO0oO(hb3.class, hu2.OooO00o);
        awVar.OooO0oO(lb3.class, sx2.OooO00o);
        awVar.OooO0oO(kb3.class, qx2.OooO00o);
        awVar.OooO0oO(ib3.class, ov2.OooO00o);
        awVar.OooO0oO(nb3.class, g23.OooO00o);
        awVar.OooO0oO(mb3.class, f23.OooO00o);
        awVar.OooO0oO(pb3.class, p23.OooO00o);
        awVar.OooO0oO(jb3.class, bw2.OooO00o);
        awVar.OooO0oO(sb3.class, j33.OooO00o);
        awVar.OooO0oO(rb3.class, k33.OooO00o);
        awVar.OooO0oO(qb3.class, i33.OooO00o);
        awVar.OooO0oO(ia3.class, r23.OooO00o);
        awVar.OooO0oO(n53.class, dw2.OooO00o);
        awVar.OooO0oO(r53.class, lw2.OooO00o);
        awVar.OooO0oO(m33.class, os2.OooO00o);
        awVar.OooO0oO(j53.class, tv2.OooO00o);
        awVar.OooO0oO(p53.class, hw2.OooO00o);
        awVar.OooO0oO(e53.class, iv2.OooO00o);
        awVar.OooO0oO(p43.class, lu2.OooO00o);
        awVar.OooO0oO(q43.class, nu2.OooO00o);
        awVar.OooO0oO(o43.class, ju2.OooO00o);
        awVar.OooO0oO(r43.class, pu2.OooO00o);
        awVar.OooO0oO(m63.class, ox2.OooO00o);
        awVar.OooO0oO(l63.class, mx2.OooO00o);
        awVar.OooO0oO(yk2.class, fp2.OooO00o);
        awVar.OooO0oO(db3.class, e33.OooO00o);
        awVar.OooO0oO(fb3.class, g33.OooO00o);
        awVar.OooO0oO(eb3.class, f33.OooO00o);
        awVar.OooO0oO(l33.class, ms2.OooO00o);
        awVar.OooO0oO(i43.class, vt2.OooO00o);
        awVar.OooO0oO(h43.class, tt2.OooO00o);
        awVar.OooO0oO(g43.class, rt2.OooO00o);
        awVar.OooO0oO(x73.class, vz2.OooO00o);
        awVar.OooO0oO(a83.class, yz2.OooO00o);
        awVar.OooO0oO(z73.class, xz2.OooO00o);
        awVar.OooO0oO(ym2.class, fq2.OooO00o);
        awVar.OooO0oO(um2.class, hq2.OooO00o);
        awVar.OooO0oO(f83.class, d03.OooO00o);
        awVar.OooO0oO(o83.class, h03.OooO00o);
        awVar.OooO0oO(g83.class, e03.OooO00o);
        awVar.OooO0oO(h83.class, f03.OooO00o);
        awVar.OooO0oO(o3.class, nq2.OooO00o);
        awVar.OooO0oO(fn2.class, pq2.OooO00o);
        awVar.OooO0oO(na3.class, w23.OooO00o);
        awVar.OooO0oO(ma3.class, v23.OooO00o);
        awVar.OooO0oO(bb3.class, c33.OooO00o);
        awVar.OooO0oO(cb3.class, d33.OooO00o);
        awVar.OooO0oO(w83.class, s03.OooO00o);
        awVar.OooO0oO(z83.class, x03.OooO00o);
        awVar.OooO0oO(x83.class, u03.OooO00o);
        awVar.OooO0oO(y83.class, w03.OooO00o);
        awVar.OooO0oO(l53.class, xv2.OooO00o);
        awVar.OooO0oO(sn2.class, cr2.OooO00o);
        awVar.OooO0oO(qn2.class, er2.OooO00o);
        awVar.OooO0oO(k53.class, vv2.OooO00o);
        awVar.OooO0oO(g53.class, qv2.OooO00o);
        awVar.OooO0oO(p83.class, i03.OooO00o);
        awVar.OooO0oO(r83.class, l03.OooO00o);
        awVar.OooO0oO(q83.class, j03.OooO00o);
        awVar.OooO0oO(kn2.class, rq2.OooO00o);
        awVar.OooO0oO(in2.class, tq2.OooO00o);
        awVar.OooO0oO(m73.class, az2.OooO00o);
        awVar.OooO0oO(n73.class, cz2.OooO00o);
        awVar.OooO0oO(o73.class, dz2.OooO00o);
        awVar.OooO0oO(o0O0O0o0.class, xp2.OooO00o);
        awVar.OooO0oO(cm2.class, zp2.OooO00o);
        awVar.OooO0oO(i73.class, uy2.OooO00o);
        awVar.OooO0oO(j73.class, wy2.OooO00o);
        awVar.OooO0oO(k73.class, yy2.OooO00o);
        awVar.OooO0oO(zl2.class, tp2.OooO00o);
        awVar.OooO0oO(xl2.class, vp2.OooO00o);
        awVar.OooO0oO(p73.class, fz2.OooO00o);
        awVar.OooO0oO(q73.class, gz2.OooO00o);
        awVar.OooO0oO(r73.class, hz2.OooO00o);
        awVar.OooO0oO(s73.class, qz2.OooO00o);
        awVar.OooO0oO(m12.class, bq2.OooO00o);
        awVar.OooO0oO(rm2.class, dq2.OooO00o);
        awVar.OooO0oO(ka3.class, s23.OooO00o);
        awVar.OooO0oO(ja3.class, t23.OooO00o);
        awVar.OooO0oO(s53.class, nw2.OooO00o);
        awVar.OooO0oO(u53.class, rw2.OooO00o);
        awVar.OooO0oO(t53.class, pw2.OooO00o);
        awVar.OooO0oO(v53.class, tw2.OooO00o);
        awVar.OooO0oO(x93.class, v13.OooO00o);
        awVar.OooO0oO(y93.class, w13.OooO00o);
        awVar.OooO0oO(mo2.class, wr2.OooO00o);
        awVar.OooO0oO(ko2.class, xr2.OooO00o);
        awVar.OooO0oO(oa3.class, x23.OooO00o);
        awVar.OooO0oO(m93.class, r13.OooO00o);
        awVar.OooO0oO(n93.class, s13.OooO00o);
        awVar.OooO0oO(io2.class, sr2.OooO00o);
        awVar.OooO0oO(go2.class, ur2.OooO00o);
        awVar.OooO0oO(la3.class, u23.OooO00o);
        awVar.OooO0oO(h73.class, cy2.OooO00o);
        awVar.OooO0oO(p52.class, sy2.OooO00o);
        awVar.OooO0oO(e73.class, my2.OooO00o);
        awVar.OooO0oO(z63.class, ky2.OooO00o);
        awVar.OooO0oO(f73.class, oy2.OooO00o);
        awVar.OooO0oO(g73.class, qy2.OooO00o);
        awVar.OooO0oO(y63.class, iy2.OooO00o);
        awVar.OooO0oO(v63.class, ay2.OooO00o);
        awVar.OooO0oO(x63.class, gy2.OooO00o);
        awVar.OooO0oO(w63.class, ey2.OooO00o);
        awVar.OooO0oO(v73.class, tz2.OooO00o);
        awVar.OooO0oO(u43.class, vu2.OooO00o);
        awVar.OooO0oO(u73.class, rz2.OooO00o);
        awVar.OooO0oO(w73.class, uz2.OooO00o);
        awVar.OooO0oO(t43.class, tu2.OooO00o);
        awVar.OooO0oO(c53.class, xu2.OooO00o);
        awVar.OooO0oO(ha3.class, q23.OooO00o);
        awVar.OooO0oO(z93.class, x13.OooO00o);
        awVar.OooO0oO(za3.class, a33.OooO00o);
        awVar.OooO0oO(ba3.class, z13.OooO00o);
        awVar.OooO0oO(aa3.class, y13.OooO00o);
        awVar.OooO0oO(pa3.class, y23.OooO00o);
        awVar.OooO0oO(te.class, zr2.OooO00o);
        awVar.OooO0oO(oo2.class, as2.OooO00o);
        awVar.OooO0oO(qa3.class, z23.OooO00o);
        awVar.OooO0oO(s43.class, ru2.OooO00o);
    }

    @Override // com.cmaster.cloner.tz
    public Object OooOO0(File file) {
        return new FileInputStream(file);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.cmaster.cloner.zv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean OooOO0O(java.lang.Object r4, java.io.File r5, com.cmaster.cloner.xz0 r6) throws java.lang.Throwable {
        /*
            r3 = this;
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            r3 = 0
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4c
            java.lang.String r0 = r5.getParent()     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4c
            java.lang.String r2 = r5.getName()     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4c
            r1.append(r2)     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4c
            java.lang.String r2 = ".glide"
            r1.append(r2)     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4c
            r6.<init>(r0, r1)     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4c
            java.io.File r0 = r6.getParentFile()     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4c
            r0.mkdirs()     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4c
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4c
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L48 java.io.FileNotFoundException -> L4c
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L46
            r1 = 100
            boolean r3 = r4.compress(r3, r1, r0)     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L46
            r5.delete()     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L46
            r6.renameTo(r5)     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L46
            r0.close()     // Catch: java.io.IOException -> L3f
            return r3
        L3f:
            r4 = move-exception
            r4.printStackTrace()
            goto L5d
        L44:
            r3 = move-exception
            goto L5e
        L46:
            r3 = move-exception
            goto L4f
        L48:
            r4 = move-exception
            r0 = r3
            r3 = r4
            goto L5e
        L4c:
            r4 = move-exception
            r0 = r3
            r3 = r4
        L4f:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L5c
            r0.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r3 = move-exception
            r3.printStackTrace()
        L5c:
            r3 = 0
        L5d:
            return r3
        L5e:
            if (r0 == 0) goto L68
            r0.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r4 = move-exception
            r4.printStackTrace()
        L68:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.d83.OooOO0O(java.lang.Object, java.io.File, com.cmaster.cloner.xz0):boolean");
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        return new nj1(ho1Var.OooOO0O(s50.class, InputStream.class), 1);
    }

    @Override // com.cmaster.cloner.oc1
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        dw dwVar = qc1.OooO0oo;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            byte[] bArrDecode = null;
            if (string == null) {
                qa.OooOOO0("Null backendName");
                return null;
            }
            s41 s41VarOooO0O0 = v41.OooO0O0(cursor.getInt(2));
            String string2 = cursor.getString(3);
            if (string2 != null) {
                bArrDecode = Base64.decode(string2, 0);
            }
            arrayList.add(new g5(string, bArrDecode, s41VarOooO0O0));
        }
        return arrayList;
    }

    @Override // com.cmaster.cloner.bz0
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // com.cmaster.cloner.wd1
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
