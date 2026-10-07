package com.cmaster.cloner;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sq0 extends SharedElementCallback {
    public static WeakReference OooO0o0;
    public boolean OooO00o;
    public boolean OooO0O0;
    public Rect OooO0OO;
    public iu OooO0Oo;

    public static void OooO00o(Window window) {
        Drawable background = window.getDecorView().getBackground();
        if (background == null) {
            return;
        }
        Drawable drawableMutate = background.mutate();
        ColorFilter porterDuffColorFilter = null;
        if (Build.VERSION.SDK_INT >= 29) {
            Object objOooO0Oo = b2.OooO0Oo();
            if (objOooO0Oo != null) {
                porterDuffColorFilter = b2.OooO00o(objOooO0Oo);
            }
        } else {
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            if (mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(0, mode);
            }
        }
        drawableMutate.setColorFilter(porterDuffColorFilter);
    }

    @Override // android.app.SharedElementCallback
    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        OooO0o0 = new WeakReference(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
        WeakReference weakReference;
        KeyEvent.Callback callback;
        iu iuVar = this.OooO0Oo;
        View viewOnCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (viewOnCreateSnapshotView != null && (weakReference = OooO0o0) != null && iuVar != null && (callback = (View) weakReference.get()) != null) {
            iuVar.getClass();
            ag1 shapeAppearanceModel = callback instanceof lg1 ? ((lg1) callback).getShapeAppearanceModel() : null;
            if (shapeAppearanceModel != null) {
                viewOnCreateSnapshotView.setTag(R.id.mtrl_motion_snapshot_view, shapeAppearanceModel);
            }
        }
        return viewOnCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(List list, Map map) {
        View view;
        Activity activity;
        boolean z = this.OooO0O0;
        if (list.isEmpty() || map.isEmpty() || (view = (View) map.get(list.get(0))) == null) {
            return;
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            Window window = activity.getWindow();
            if (this.OooO00o) {
                Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
                if (sharedElementEnterTransition instanceof qq0) {
                    qq0 qq0Var = (qq0) sharedElementEnterTransition;
                    window.setSharedElementReenterTransition(null);
                    if (z) {
                        if (qq0Var.getDuration() >= 0) {
                            window.setTransitionBackgroundFadeDuration(qq0Var.getDuration());
                        }
                        qq0Var.addListener(new rq0(window, 0));
                        return;
                    }
                    return;
                }
                return;
            }
            Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
            if (sharedElementReturnTransition instanceof qq0) {
                qq0 qq0Var2 = (qq0) sharedElementReturnTransition;
                qq0Var2.OooO0Oo = true;
                qq0Var2.addListener(new rq0(activity, 2));
                if (z) {
                    if (qq0Var2.getDuration() >= 0) {
                        window.setTransitionBackgroundFadeDuration(qq0Var2.getDuration());
                    }
                    qq0Var2.addListener(new rq0(window, 1));
                }
            }
        }
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementEnd(List list, List list2, List list3) {
        if (!list2.isEmpty() && (((View) list2.get(0)).getTag(R.id.mtrl_motion_snapshot_view) instanceof View)) {
            ((View) list2.get(0)).setTag(R.id.mtrl_motion_snapshot_view, null);
        }
        if (!this.OooO00o && !list2.isEmpty()) {
            View view = (View) list2.get(0);
            RectF rectF = dp1.OooO00o;
            this.OooO0OO = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        this.OooO00o = false;
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementStart(List list, List list2, List list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            ((View) list2.get(0)).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (this.OooO00o || list2.isEmpty() || this.OooO0OO == null) {
            return;
        }
        View view = (View) list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.OooO0OO.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.OooO0OO.height(), 1073741824));
        Rect rect = this.OooO0OO;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }
}
