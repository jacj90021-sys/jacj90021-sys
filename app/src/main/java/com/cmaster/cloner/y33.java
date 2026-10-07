package com.cmaster.cloner;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y33 {
    public static /* bridge */ /* synthetic */ MediaMetricsManager OooO0OO(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ NetworkEvent.Builder OooO0Oo() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder OooO0oo() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ PlaybackMetrics.Builder OooOO0() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder OooOOO() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder OooOOo0(int i) {
        return new TrackChangeEvent.Builder(i);
    }
}
