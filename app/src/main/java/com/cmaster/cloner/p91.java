package com.cmaster.cloner;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p91 extends w6 {
    public q40 OooOo;
    public final x91 OooOo0;
    public final Context OooOo00;
    public final Class OooOo0O;
    public final j50 OooOo0o;
    public ArrayList OooOoO;
    public Object OooOoO0;
    public p91 OooOoOO;
    public final boolean OooOoo = true;
    public p91 OooOoo0;
    public boolean OooOooO;
    public boolean OooOooo;

    static {
    }

    public p91(com.bumptech.glide.OooO00o oooO00o, x91 x91Var, Class cls, Context context) {
        aa1 aa1Var;
        this.OooOo0 = x91Var;
        this.OooOo0O = cls;
        this.OooOo00 = context;
        k3 k3Var = x91Var.OooO0Oo.OooO0o.OooO0o;
        q40 q40Var = (q40) k3Var.get(cls);
        if (q40Var == null) {
            Iterator it = ((qb2) k3Var.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    q40Var = (q40) entry.getValue();
                }
            }
        }
        this.OooOo = q40Var == null ? j50.OooOO0O : q40Var;
        this.OooOo0o = oooO00o.OooO0o;
        Iterator it2 = x91Var.OooOO0o.iterator();
        while (it2.hasNext()) {
            OooOo00((t91) it2.next());
        }
        synchronized (x91Var) {
            aa1Var = x91Var.OooOOO0;
        }
        OooO00o(aa1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOo(android.widget.ImageView r5) {
        /*
            r4 = this;
            com.cmaster.cloner.pr1.OooO00o()
            com.cmaster.cloner.zx2.OooO0O0(r5)
            r0 = 2048(0x800, float:2.87E-42)
            int r1 = r4.OooO0Oo
            boolean r0 = com.cmaster.cloner.w6.OooO0oO(r1, r0)
            r1 = 1
            if (r0 != 0) goto L6d
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L6d
            int[] r0 = com.cmaster.cloner.o91.OooO00o
            android.widget.ImageView$ScaleType r2 = r5.getScaleType()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            switch(r0) {
                case 1: goto L5d;
                case 2: goto L4b;
                case 3: goto L39;
                case 4: goto L39;
                case 5: goto L39;
                case 6: goto L27;
                default: goto L26;
            }
        L26:
            goto L6d
        L27:
            com.cmaster.cloner.p91 r0 = r4.clone()
            com.cmaster.cloner.ss r2 = com.cmaster.cloner.ss.OooO0OO
            com.cmaster.cloner.ec r3 = new com.cmaster.cloner.ec
            r3.<init>()
            com.cmaster.cloner.w6 r0 = r0.OooO0oo(r2, r3)
            r0.OooOOo = r1
            goto L6e
        L39:
            com.cmaster.cloner.p91 r0 = r4.clone()
            com.cmaster.cloner.ss r2 = com.cmaster.cloner.ss.OooO0O0
            com.cmaster.cloner.d00 r3 = new com.cmaster.cloner.d00
            r3.<init>()
            com.cmaster.cloner.w6 r0 = r0.OooO0oo(r2, r3)
            r0.OooOOo = r1
            goto L6e
        L4b:
            com.cmaster.cloner.p91 r0 = r4.clone()
            com.cmaster.cloner.ss r2 = com.cmaster.cloner.ss.OooO0OO
            com.cmaster.cloner.ec r3 = new com.cmaster.cloner.ec
            r3.<init>()
            com.cmaster.cloner.w6 r0 = r0.OooO0oo(r2, r3)
            r0.OooOOo = r1
            goto L6e
        L5d:
            com.cmaster.cloner.p91 r0 = r4.clone()
            com.cmaster.cloner.ss r2 = com.cmaster.cloner.ss.OooO0Oo
            com.cmaster.cloner.dc r3 = new com.cmaster.cloner.dc
            r3.<init>()
            com.cmaster.cloner.w6 r0 = r0.OooO0oo(r2, r3)
            goto L6e
        L6d:
            r0 = r4
        L6e:
            com.cmaster.cloner.j50 r2 = r4.OooOo0o
            com.cmaster.cloner.gu0 r2 = r2.OooO0OO
            r2.getClass()
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            java.lang.Class r3 = r4.OooOo0O
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L86
            com.cmaster.cloner.i8 r1 = new com.cmaster.cloner.i8
            r2 = 0
            r1.<init>(r5, r2)
            goto L94
        L86:
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L9b
            com.cmaster.cloner.i8 r2 = new com.cmaster.cloner.i8
            r2.<init>(r5, r1)
            r1 = r2
        L94:
            r5 = 0
            com.cmaster.cloner.oo00 r2 = com.cmaster.cloner.y52.OooO00o
            r4.OooOoO0(r1, r5, r0, r2)
            return
        L9b:
            java.lang.String r4 = "Unhandled class: "
            java.lang.String r5 = ", try .as*(Class).transcode(ResourceTranscoder)"
            com.cmaster.cloner.sa.OooO0o(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.p91.OooOo(android.widget.ImageView):void");
    }

    @Override // com.cmaster.cloner.w6
    /* renamed from: OooOo0, reason: merged with bridge method [inline-methods] */
    public final p91 OooO00o(w6 w6Var) {
        zx2.OooO0O0(w6Var);
        return (p91) super.OooO00o(w6Var);
    }

    public final p91 OooOo00(t91 t91Var) {
        if (this.OooOOo0) {
            return clone().OooOo00(t91Var);
        }
        if (t91Var != null) {
            if (this.OooOoO == null) {
                this.OooOoO = new ArrayList();
            }
            this.OooOoO.add(t91Var);
        }
        OooOO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m91 OooOo0O(Object obj, sl1 sl1Var, t91 t91Var, r91 r91Var, q40 q40Var, t41 t41Var, int i, int i2, w6 w6Var, Executor executor) {
        r91 r91Var2;
        r91 vwVar;
        w6 w6Var2;
        kh1 kh1Var;
        t41 t41Var2;
        if (this.OooOoo0 != null) {
            vwVar = new vw(obj, r91Var);
            r91Var2 = vwVar;
        } else {
            r91Var2 = null;
            vwVar = r91Var;
        }
        p91 p91Var = this.OooOoOO;
        if (p91Var == null) {
            Context context = this.OooOo00;
            j50 j50Var = this.OooOo0o;
            w6Var2 = w6Var;
            kh1Var = new kh1(context, j50Var, obj, this.OooOoO0, this.OooOo0O, w6Var2, i, i2, t41Var, sl1Var, t91Var, this.OooOoO, vwVar, j50Var.OooO0oO, q40Var.OooO0Oo, executor);
        } else {
            if (this.OooOooo) {
                qa.OooO0o("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            q40 q40Var2 = p91Var.OooOoo ? q40Var : p91Var.OooOo;
            if (w6.OooO0oO(p91Var.OooO0Oo, 8)) {
                t41Var2 = this.OooOoOO.OooO0o;
            } else {
                int iOrdinal = t41Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    t41Var2 = t41.OooO0Oo;
                } else if (iOrdinal == 2) {
                    t41Var2 = t41.OooO0o0;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.OooO0o);
                    }
                    t41Var2 = t41.OooO0o;
                }
            }
            t41 t41Var3 = t41Var2;
            p91 p91Var2 = this.OooOoOO;
            int i3 = p91Var2.OooOO0;
            int i4 = p91Var2.OooO;
            if (pr1.OooO(i, i2)) {
                p91 p91Var3 = this.OooOoOO;
                if (!pr1.OooO(p91Var3.OooOO0, p91Var3.OooO)) {
                    i3 = w6Var.OooOO0;
                    i4 = w6Var.OooO;
                }
            }
            int i5 = i4;
            int i6 = i3;
            en1 en1Var = new en1(obj, vwVar);
            Context context2 = this.OooOo00;
            j50 j50Var2 = this.OooOo0o;
            en1 en1Var2 = en1Var;
            kh1 kh1Var2 = new kh1(context2, j50Var2, obj, this.OooOoO0, this.OooOo0O, w6Var, i, i2, t41Var, sl1Var, t91Var, this.OooOoO, en1Var2, j50Var2.OooO0oO, q40Var.OooO0Oo, executor);
            this.OooOooo = true;
            p91 p91Var4 = this.OooOoOO;
            m91 m91VarOooOo0O = p91Var4.OooOo0O(obj, sl1Var, t91Var, en1Var2, q40Var2, t41Var3, i6, i5, p91Var4, executor);
            this.OooOooo = false;
            en1Var2.OooO0OO = kh1Var2;
            en1Var2.OooO0Oo = m91VarOooOo0O;
            w6Var2 = w6Var;
            kh1Var = en1Var2;
        }
        if (r91Var2 == null) {
            return kh1Var;
        }
        p91 p91Var5 = this.OooOoo0;
        int i7 = p91Var5.OooOO0;
        int i8 = p91Var5.OooO;
        if (pr1.OooO(i, i2)) {
            p91 p91Var6 = this.OooOoo0;
            if (!pr1.OooO(p91Var6.OooOO0, p91Var6.OooO)) {
                i7 = w6Var2.OooOO0;
                i8 = w6Var2.OooO;
            }
        }
        p91 p91Var7 = this.OooOoo0;
        vw vwVar2 = r91Var2;
        m91 m91VarOooOo0O2 = p91Var7.OooOo0O(obj, sl1Var, t91Var, vwVar2, p91Var7.OooOo, p91Var7.OooO0o, i7, i8, p91Var7, executor);
        vwVar2.OooO0OO = kh1Var;
        vwVar2.OooO0Oo = m91VarOooOo0O2;
        return vwVar2;
    }

    @Override // com.cmaster.cloner.w6
    /* renamed from: OooOo0o, reason: merged with bridge method [inline-methods] */
    public final p91 clone() {
        p91 p91Var = (p91) super.clone();
        p91Var.OooOo = p91Var.OooOo.clone();
        if (p91Var.OooOoO != null) {
            p91Var.OooOoO = new ArrayList(p91Var.OooOoO);
        }
        p91 p91Var2 = p91Var.OooOoOO;
        if (p91Var2 != null) {
            p91Var.OooOoOO = p91Var2.clone();
        }
        p91 p91Var3 = p91Var.OooOoo0;
        if (p91Var3 != null) {
            p91Var.OooOoo0 = p91Var3.clone();
        }
        return p91Var;
    }

    public final p91 OooOoO(Object obj) {
        if (this.OooOOo0) {
            return clone().OooOoO(obj);
        }
        this.OooOoO0 = obj;
        this.OooOooO = true;
        OooOO0o();
        return this;
    }

    public final void OooOoO0(sl1 sl1Var, t91 t91Var, w6 w6Var, Executor executor) {
        zx2.OooO0O0(sl1Var);
        if (!this.OooOooO) {
            ra.OooOOO("You must call #load() before calling #into()");
            return;
        }
        m91 m91VarOooOo0O = OooOo0O(new Object(), sl1Var, t91Var, null, this.OooOo, w6Var.OooO0o, w6Var.OooOO0, w6Var.OooO, w6Var, executor);
        m91 m91VarOooO0oO = sl1Var.OooO0oO();
        if (m91VarOooOo0O.OooOO0O(m91VarOooO0oO) && (w6Var.OooO0oo || !m91VarOooO0oO.OooOO0())) {
            zx2.OooO0OO(m91VarOooO0oO, "Argument must not be null");
            if (m91VarOooO0oO.isRunning()) {
                return;
            }
            m91VarOooO0oO.OooO0oo();
            return;
        }
        this.OooOo0.OooOO0O(sl1Var);
        sl1Var.OooO00o(m91VarOooOo0O);
        x91 x91Var = this.OooOo0;
        synchronized (x91Var) {
            x91Var.OooO.OooO0Oo.add(sl1Var);
            oh1 oh1Var = x91Var.OooO0oO;
            ((Set) oh1Var.OooO0o).add(m91VarOooOo0O);
            if (oh1Var.OooO0o0) {
                m91VarOooOo0O.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) oh1Var.OooO0oO).add(m91VarOooOo0O);
            } else {
                m91VarOooOo0O.OooO0oo();
            }
        }
    }

    @Override // com.cmaster.cloner.w6
    public final boolean equals(Object obj) {
        if (!(obj instanceof p91)) {
            return false;
        }
        p91 p91Var = (p91) obj;
        return super.equals(p91Var) && Objects.equals(this.OooOo0O, p91Var.OooOo0O) && this.OooOo.equals(p91Var.OooOo) && Objects.equals(this.OooOoO0, p91Var.OooOoO0) && Objects.equals(this.OooOoO, p91Var.OooOoO) && Objects.equals(this.OooOoOO, p91Var.OooOoOO) && Objects.equals(this.OooOoo0, p91Var.OooOoo0) && this.OooOoo == p91Var.OooOoo && this.OooOooO == p91Var.OooOooO;
    }

    @Override // com.cmaster.cloner.w6
    public final int hashCode() {
        return pr1.OooO0oO(this.OooOooO ? 1 : 0, pr1.OooO0oO(this.OooOoo ? 1 : 0, pr1.OooO0oo(pr1.OooO0oo(pr1.OooO0oo(pr1.OooO0oo(pr1.OooO0oo(pr1.OooO0oo(pr1.OooO0oo(super.hashCode(), this.OooOo0O), this.OooOo), this.OooOoO0), this.OooOoO), this.OooOoOO), this.OooOoo0), null)));
    }
}
