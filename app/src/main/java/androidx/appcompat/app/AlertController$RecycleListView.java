package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import com.cmaster.cloner.l61;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int OooO0Oo;
    public final int OooO0o0;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l61.OooOo00);
        this.OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.OooO0Oo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }
}
