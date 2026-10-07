package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.widget.ContentLoadingProgressBar;
import com.cmaster.cloner.ti;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    public static final /* synthetic */ int OooO0o = 0;
    public final ti OooO0Oo;
    public final ti OooO0o0;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.cmaster.cloner.ti] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.cmaster.cloner.ti] */
    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i = 0;
        this.OooO0Oo = new Runnable(this) { // from class: com.cmaster.cloner.ti
            public final /* synthetic */ ContentLoadingProgressBar OooO0o0;

            {
                this.OooO0o0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ContentLoadingProgressBar contentLoadingProgressBar = this.OooO0o0;
                switch (i2) {
                    case 0:
                        int i3 = ContentLoadingProgressBar.OooO0o;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i4 = ContentLoadingProgressBar.OooO0o;
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.OooO0o0 = new Runnable(this) { // from class: com.cmaster.cloner.ti
            public final /* synthetic */ ContentLoadingProgressBar OooO0o0;

            {
                this.OooO0o0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ContentLoadingProgressBar contentLoadingProgressBar = this.OooO0o0;
                switch (i22) {
                    case 0:
                        int i3 = ContentLoadingProgressBar.OooO0o;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i4 = ContentLoadingProgressBar.OooO0o;
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.OooO0Oo);
        removeCallbacks(this.OooO0o0);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.OooO0Oo);
        removeCallbacks(this.OooO0o0);
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }
}
