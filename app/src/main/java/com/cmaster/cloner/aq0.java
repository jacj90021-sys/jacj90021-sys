package com.cmaster.cloner;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class aq0 extends PathMotion {
    @Override // android.transition.PathMotion
    public final Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF pointF = f2 > f4 ? new PointF(f3, f2) : new PointF(f, f4);
        path.quadTo(pointF.x, pointF.y, f3, f4);
        return path;
    }
}
