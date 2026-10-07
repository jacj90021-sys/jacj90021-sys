package com.cmaster.cloner;

import android.content.ClipDescription;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ay1 implements WebMessageListenerBoundaryInterface, oy0, ht0, o0O0oo0o, nj0, ju0, jy, l50, ez0 {
    public static final Object OooO0o = new Object();
    public static ay1 OooO0oO;
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o0;

    public ay1(int i) {
        Handler handler;
        Object objOooO00o;
        this.OooO0Oo = i;
        Object objOooO00o2 = null;
        switch (i) {
            case 15:
                this.OooO0o0 = new s60();
                return;
            case 16:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = ep.OooO0O0(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e) {
                        e = e;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        this.OooO0o0 = handler;
                        return;
                    } catch (InstantiationException e2) {
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e2);
                        handler = new Handler(mainLooper);
                        this.OooO0o0 = handler;
                        return;
                    } catch (NoSuchMethodException e3) {
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e3);
                        handler = new Handler(mainLooper);
                        this.OooO0o0 = handler;
                        return;
                    } catch (InvocationTargetException e4) {
                        Throwable cause = e4.getCause();
                        if (cause instanceof RuntimeException) {
                            throw ((RuntimeException) cause);
                        }
                        if (cause instanceof Error) {
                            throw ((Error) cause);
                        }
                        sa.OooOO0(cause);
                        throw null;
                    }
                }
                this.OooO0o0 = handler;
                return;
            case 22:
                this.OooO0o0 = null;
                return;
            default:
                u4 u4Var = tl1.OooO00o;
                hv0 hv0Var = new hv0(new TreeMap(yz0.OooO0O0));
                this.OooO0o0 = hv0Var;
                u4 u4Var2 = tl1.OooO0O0;
                try {
                    objOooO00o = hv0Var.OooO00o(u4Var2);
                } catch (IllegalArgumentException unused) {
                    objOooO00o = null;
                }
                Class cls = (Class) objOooO00o;
                if (cls != null && !cls.equals(za.class)) {
                    ra.OooO0oo("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                hv0 hv0Var2 = (hv0) this.OooO0o0;
                hv0Var2.OooO0O0(u4Var2, za.class);
                try {
                    objOooO00o2 = hv0Var2.OooO00o(u4Var);
                } catch (IllegalArgumentException unused2) {
                }
                if (objOooO00o2 == null) {
                    hv0Var2.OooO0O0(u4Var, za.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    public static ay1 OooOOO0() {
        ay1 ay1Var;
        synchronized (OooO0o) {
            try {
                if (OooO0oO == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    OooO0oO = new ay1(handlerThread.getLooper());
                }
                ay1Var = OooO0oO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ay1Var;
    }

    public static ac3 OooOo0(Callable callable) {
        yl1 yl1Var = new yl1();
        qo2.OooO0Oo.execute(new bf1(callable, yl1Var, 19, false));
        return yl1Var.OooO00o;
    }

    public void OooO(int i, int i2) {
        u3 u3Var = (u3) this.OooO0o0;
        Object obj = u3Var.OooO0Oo.get(i);
        Object obj2 = u3Var.OooO0o0.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        Object obj3 = u3Var.OooO0oo.OooO0O0.OooO0oO;
    }

    @Override // com.cmaster.cloner.l50
    public Class OooO00o() {
        return InputStream.class;
    }

    @Override // com.cmaster.cloner.l50
    public void OooO0O0(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // com.cmaster.cloner.ht0
    public void OooO0OO(ss0 ss0Var, boolean z) {
        ((k) this.OooO0o0).OooOOo(ss0Var);
    }

    @Override // com.cmaster.cloner.nj0
    public void OooO0Oo() {
        gy0 gy0Var;
        switch (this.OooO0Oo) {
            case 8:
                j2 j2Var = (j2) this.OooO0o0;
                String string = j2Var.OooOoO0.getText().toString();
                gy0 gy0Var2 = j2Var.OooOo0o;
                if (gy0Var2 != null) {
                    gy0Var2.OooO0Oo(string);
                    break;
                }
                break;
            default:
                w10 w10Var = (w10) this.OooO0o0;
                String string2 = w10Var.OooOoo0.getText().toString();
                kq kqVar = w10Var.OooOo;
                if (kqVar != null && (gy0Var = kqVar.OooOO0o) != null) {
                    gy0Var.OooO0Oo(string2);
                    break;
                }
                break;
        }
    }

    public boolean OooO0o(int i, int i2) {
        u3 u3Var = (u3) this.OooO0o0;
        Object obj = u3Var.OooO0Oo.get(i);
        Object obj2 = u3Var.OooO0o0.get(i2);
        if (obj == null || obj2 == null) {
            if (obj == null && obj2 == null) {
                return true;
            }
            throw new AssertionError();
        }
        Object obj3 = u3Var.OooO0oo.OooO0O0.OooO0oO;
        return true;
    }

    @Override // com.cmaster.cloner.o0O0oo0o
    public void OooO0o0(Object obj) {
        switch (this.OooO0Oo) {
            case 7:
                m1 m1Var = (m1) this.OooO0o0;
                cf1 cf1Var = m1Var.OooOoo;
                o0OoOoOo o0oooooo = (o0OoOoOo) cf1Var.OooO0Oo();
                if (o0oooooo != null) {
                    o0oooooo.OooOOo0(m1Var, obj);
                    cf1Var.OooOOo0(o0oooooo);
                    break;
                }
                break;
            default:
                Map map = (Map) obj;
                k20 k20Var = (k20) this.OooO0o0;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                h20 h20Var = (h20) k20Var.OooOoo.pollFirst();
                if (h20Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = h20Var.OooO0Oo;
                    if (k20Var.OooO0OO.OooOOo(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.cmaster.cloner.jy
    public Object OooO0oO() {
        o00Oo00 o00oo00 = (o00Oo00) this.OooO0o0;
        return new vn((bj) o00oo00.OooO0o, (hx2) o00oo00.OooO0oO);
    }

    public boolean OooO0oo(int i, int i2) {
        u3 u3Var = (u3) this.OooO0o0;
        Object obj = u3Var.OooO0Oo.get(i);
        Object obj2 = u3Var.OooO0o0.get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        Object obj3 = u3Var.OooO0oo.OooO0O0.OooO0oO;
        cc ccVar = (cc) obj;
        cc ccVar2 = (cc) obj2;
        if (ccVar == ccVar2) {
            return true;
        }
        return ccVar.equals(ccVar2);
    }

    @Override // com.cmaster.cloner.ez0
    public void OooOO0(View view, xj0 xj0Var) {
        m80 m80Var = (m80) this.OooO0o0;
        cc ccVar = xj0Var.OooOo0O;
        if (!(ccVar instanceof o2)) {
            if (ccVar != null) {
                ccVar.OooOO0(view, xj0Var);
            }
        } else {
            PackageInfo packageInfo = ((o2) ccVar).OooO0o0;
            Intent intent = new Intent();
            intent.putExtra(sn2.OooO00o("7Aq4SeUJXA==\n", "nGvbIoRuOQM=\n"), packageInfo);
            m80Var.Oooo0oO().setResult(-1, intent);
            m80Var.Oooo0oO().finish();
        }
    }

    public int OooOO0O(oh ohVar) {
        gg0 gg0Var;
        nq nqVar = (nq) this.OooO0o0;
        if (ohVar instanceof ml) {
            o51 o51Var = nqVar.OooO0o0;
            o51Var.OooO0oO();
            gg0Var = (gg0) ((TreeMap) o51Var.OooO0oO).get((ml) ohVar);
            if (gg0Var == null) {
                ra.OooOOO(u7.OooO00o(new byte[]{6, -29, -3, 103, 114, -121, -40, -122, 12}, new byte[]{104, -116, -119, 71, 20, -24, -83, -24}));
                return 0;
            }
        } else if (ohVar instanceof nl) {
            o51 o51Var2 = nqVar.OooO0o;
            o51Var2.OooO0oO();
            gg0Var = (gg0) ((TreeMap) o51Var2.OooO0oO).get(((nl) ohVar).OooO0Oo);
            if (gg0Var == null) {
                ra.OooO0OO(u7.OooO00o(new byte[]{-45, -62, -95, 76, 83, -79, -6, 50, -39, -105, -11}, new byte[]{-67, -83, -43, 108, 53, -34, -113, 92}), ohVar);
                return 0;
            }
        } else if (ohVar instanceof jl) {
            vt0 vt0Var = nqVar.OooO;
            vt0Var.OooO0oO();
            gg0Var = (gg0) vt0Var.OooO0o.get((jl) ohVar);
            if (gg0Var == null) {
                ra.OooOOO(u7.OooO00o(new byte[]{54, 87, 22, 69, -9, -55, -2, -54, 60}, new byte[]{88, 56, 98, 101, -111, -90, -117, -92}));
                return 0;
            }
        } else if (ohVar instanceof yk) {
            mz mzVar = nqVar.OooO0oo;
            mzVar.OooO0oO();
            gg0Var = (gg0) mzVar.OooO0o.get((yk) ohVar);
            if (gg0Var == null) {
                ra.OooOOO(u7.OooO00o(new byte[]{123, -120, 86, -43, 32, -66, 3, 24, 113}, new byte[]{21, -25, 34, -11, 70, -47, 118, 118}));
                return 0;
            }
        } else {
            nqVar.getClass();
            gg0Var = null;
        }
        if (gg0Var == null) {
            return -1;
        }
        return gg0Var.OooO0o0();
    }

    @Override // com.cmaster.cloner.l50
    public Object OooOO0o(Resources resources, ApplicationInfo applicationInfo) {
        return resources.openRawResource(applicationInfo.icon);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.oy0
    public qz1 OooOOO(View view, qz1 qz1Var) {
        int i = 0;
        switch (this.OooO0Oo) {
            case 5:
                AppBarLayout appBarLayout = (AppBarLayout) this.OooO0o0;
                qz1 qz1Var2 = appBarLayout.getFitsSystemWindows() ? qz1Var : null;
                if (!Objects.equals(appBarLayout.OooOO0, qz1Var2)) {
                    appBarLayout.OooOO0 = qz1Var2;
                    if (appBarLayout.OooOoO != null && appBarLayout.getTopInset() > 0) {
                        i = 1;
                    }
                    appBarLayout.setWillNotDraw(i ^ 1);
                    appBarLayout.requestLayout();
                    break;
                }
                break;
            case 11:
                sl slVar = (sl) this.OooO0o0;
                c9 c9Var = slVar.OooOOOo;
                if (c9Var != null) {
                    slVar.OooO.OoooOo0.remove(c9Var);
                }
                c9 c9Var2 = new c9(slVar.OooOO0o, qz1Var);
                slVar.OooOOOo = c9Var2;
                c9Var2.OooO0o0(slVar.getWindow());
                BottomSheetBehavior bottomSheetBehavior = slVar.OooO;
                c9 c9Var3 = slVar.OooOOOo;
                ArrayList arrayList = bottomSheetBehavior.OoooOo0;
                if (!arrayList.contains(c9Var3)) {
                    arrayList.add(c9Var3);
                    break;
                }
                break;
            default:
                mz1 mz1Var = qz1Var.OooO00o;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.OooO0o0;
                if (!Objects.equals(coordinatorLayout.OooOOo0, qz1Var)) {
                    coordinatorLayout.OooOOo0 = qz1Var;
                    boolean z = qz1Var.OooO0Oo() > 0;
                    coordinatorLayout.OooOOo = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!mz1Var.OooOOO0()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = nt1.OooO00o;
                            if (!childAt.getFitsSystemWindows() || ((oj) childAt.getLayoutParams()).OooO00o == null || !mz1Var.OooOOO0()) {
                                i++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                    break;
                }
                break;
        }
        return qz1Var;
    }

    @Override // com.cmaster.cloner.ht0
    public boolean OooOOOO(ss0 ss0Var) {
        Window.Callback callback = ((k) this.OooO0o0).OooOOOO.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, ss0Var);
        return true;
    }

    public int OooOOOo() {
        return ((u3) this.OooO0o0).OooO0o0.size();
    }

    public void OooOOo() {
        ((q10) this.OooO0o0).OooO0oO.Oooo0o0();
    }

    public int OooOOo0() {
        return ((u3) this.OooO0o0).OooO0Oo.size();
    }

    public void OooOOoo(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((f7) this.OooO0o0).OooO00o(0);
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        switch (this.OooO0Oo) {
            case 15:
                return new s9((s60) this.OooO0o0, 1);
            default:
                return new t3((App) this.OooO0o0, this);
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPostMessage(android.webkit.WebView r9, java.lang.reflect.InvocationHandler r10, android.net.Uri r11, boolean r12, java.lang.reflect.InvocationHandler r13) {
        /*
            r8 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r10 = com.cmaster.cloner.g9.OooO00o(r0, r10)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r10 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r10
            java.lang.reflect.InvocationHandler[] r0 = r10.getPorts()
            int r1 = r0.length
            com.cmaster.cloner.na1[] r1 = new com.cmaster.cloner.na1[r1]
            r2 = 0
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L2a
            com.cmaster.cloner.na1 r3 = new com.cmaster.cloner.na1
            r4 = r0[r2]
            r5 = 6
            r3.<init>(r5)
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r5 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r4 = com.cmaster.cloner.g9.OooO00o(r5, r4)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r4 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r4
            r3.OooO0o0 = r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L2a:
            com.cmaster.cloner.oOO00OO r0 = com.cmaster.cloner.hy1.OooO00o
            boolean r0 = r0.OooO0O0()
            r1 = 1
            if (r0 == 0) goto L5f
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r10 = r10.getMessagePayload()
            java.lang.Object r10 = com.cmaster.cloner.g9.OooO00o(r0, r10)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r10 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r10
            int r0 = r10.getType()
            if (r0 == 0) goto L55
            if (r0 == r1) goto L4a
            r10 = 0
            r4 = r10
            goto L69
        L4a:
            com.cmaster.cloner.zx1 r0 = new com.cmaster.cloner.zx1
            byte[] r10 = r10.getAsArrayBuffer()
            r0.<init>(r10)
        L53:
            r4 = r0
            goto L69
        L55:
            com.cmaster.cloner.zx1 r0 = new com.cmaster.cloner.zx1
            java.lang.String r10 = r10.getAsString()
            r0.<init>(r10)
            goto L53
        L5f:
            com.cmaster.cloner.zx1 r0 = new com.cmaster.cloner.zx1
            java.lang.String r10 = r10.getData()
            r0.<init>(r10)
            goto L53
        L69:
            if (r4 == 0) goto L8a
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r10 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r10 = com.cmaster.cloner.g9.OooO00o(r10, r13)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r10 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r10
            com.cmaster.cloner.xr r13 = new com.cmaster.cloner.xr
            r13.<init>(r10, r1)
            java.lang.Object r10 = r10.getOrCreatePeer(r13)
            r7 = r10
            com.cmaster.cloner.bk0 r7 = (com.cmaster.cloner.bk0) r7
            java.lang.Object r8 = r8.OooO0o0
            r2 = r8
            com.cmaster.cloner.dy1 r2 = (com.cmaster.cloner.dy1) r2
            r3 = r9
            r5 = r11
            r6 = r12
            r2.onPostMessage(r3, r4, r5, r6, r7)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ay1.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    public /* synthetic */ ay1(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    public ay1(Looper looper) {
        this.OooO0Oo = 1;
        xi1 xi1Var = new xi1(looper, 3, false);
        Looper.getMainLooper();
        this.OooO0o0 = xi1Var;
    }

    public /* synthetic */ ay1(int i, boolean z) {
        this.OooO0Oo = i;
    }

    public ay1(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.OooO0Oo = 26;
        if (Build.VERSION.SDK_INT >= 25) {
            this.OooO0o0 = new sg0(uri, clipDescription, uri2);
        } else {
            this.OooO0o0 = new hx2(uri, clipDescription, uri2, 11);
        }
    }
}
