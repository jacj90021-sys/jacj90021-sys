package com.cmaster.cloner;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nw0 {
    public ViewParent OooO00o;
    public ViewParent OooO0O0;
    public final ViewGroup OooO0OO;
    public boolean OooO0Oo;
    public int[] OooO0o0;

    public nw0(ViewGroup viewGroup) {
        this.OooO0OO = viewGroup;
    }

    public final boolean OooO00o(float f, float f2, boolean z) {
        ViewParent viewParentOooO0o0;
        if (this.OooO0Oo && (viewParentOooO0o0 = OooO0o0(0)) != null) {
            try {
                return viewParentOooO0o0.onNestedFling(this.OooO0OO, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0o0 + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    public final boolean OooO0O0(float f, float f2) {
        ViewParent viewParentOooO0o0;
        if (this.OooO0Oo && (viewParentOooO0o0 = OooO0o0(0)) != null) {
            try {
                return viewParentOooO0o0.onNestedPreFling(this.OooO0OO, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0o0 + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    public final boolean OooO0OO(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentOooO0o0;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.OooO0Oo || (viewParentOooO0o0 = OooO0o0(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.OooO0OO;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.OooO0o0 == null) {
                this.OooO0o0 = new int[2];
            }
            iArr3 = this.OooO0o0;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentOooO0o0 instanceof ow0) {
            ((ow0) viewParentOooO0o0).OooO0o(viewGroup, i, i2, iArr3, i3);
            viewGroup = viewGroup;
        } else if (i3 == 0) {
            try {
                viewParentOooO0o0.onNestedPreScroll(viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0o0 + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean OooO0Oo(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentOooO0o0;
        int i6;
        int i7;
        int[] iArr3;
        if (this.OooO0Oo && (viewParentOooO0o0 = OooO0o0(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.OooO0OO;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.OooO0o0 == null) {
                        this.OooO0o0 = new int[2];
                    }
                    int[] iArr4 = this.OooO0o0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentOooO0o0 instanceof pw0) {
                    ((pw0) viewParentOooO0o0).OooO00o(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentOooO0o0 instanceof ow0) {
                        ((ow0) viewParentOooO0o0).OooO0O0(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentOooO0o0.onNestedScroll(viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0o0 + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final boolean OooO0o(int i) {
        return OooO0o0(i) != null;
    }

    public final ViewParent OooO0o0(int i) {
        if (i == 0) {
            return this.OooO00o;
        }
        if (i != 1) {
            return null;
        }
        return this.OooO0O0;
    }

    public final boolean OooO0oO(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (!OooO0o(i2)) {
            if (this.OooO0Oo) {
                View view = this.OooO0OO;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof ow0;
                    if (z) {
                        zOnStartNestedScroll = ((ow0) parent).OooO0OO(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i2 == 0) {
                            this.OooO00o = parent;
                        } else if (i2 == 1) {
                            this.OooO0O0 = parent;
                        }
                        if (z) {
                            ((ow0) parent).OooO0Oo(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void OooO0oo(int i) {
        ViewParent viewParentOooO0o0 = OooO0o0(i);
        if (viewParentOooO0o0 != null) {
            boolean z = viewParentOooO0o0 instanceof ow0;
            ViewGroup viewGroup = this.OooO0OO;
            if (z) {
                ((ow0) viewParentOooO0o0).OooO0o0(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentOooO0o0.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentOooO0o0 + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.OooO00o = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.OooO0O0 = null;
            }
        }
    }
}
