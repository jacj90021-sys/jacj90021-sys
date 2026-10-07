package com.cmaster.cloner;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class g03 implements r51 {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;

    public /* synthetic */ g03(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.cmaster.cloner.r51
    public final Object get() throws ClassNotFoundException {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                return ((hx2) obj).OooOOoo(new dw("json"), v03.OooO0o);
            case 1:
                return ((hx2) obj).OooOOoo(new dw("proto"), im2.OooO0o0);
            case 2:
                return ((hx2) obj).OooOOoo(new dw("json"), new s60());
            case 3:
                return ((hx2) obj).OooOOoo(new dw("proto"), new iu(18));
            default:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new jj0("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new jj0(px0.OooOOOO("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new jj0(px0.OooOOOO("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new jj0(rj.OooO0OO("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new jj0(rj.OooO0OO("Could not instantiate ", str), e4);
                }
        }
    }
}
