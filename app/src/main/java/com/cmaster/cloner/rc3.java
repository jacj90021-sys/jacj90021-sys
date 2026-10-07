package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rc3 {
    public boolean OooO;
    public int OooO00o;
    public float OooO0O0;
    public float OooO0OO;
    public boolean OooO0Oo;
    public float OooO0o;
    public float OooO0o0;
    public long OooO0oO;
    public long OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public short OooOO0o;

    public final sc3 OooO00o() {
        if (this.OooOO0o == 4095) {
            return new sc3(this.OooO00o, this.OooO0O0, this.OooO0OO, this.OooO0Oo, this.OooO0o0, this.OooO0o, this.OooO0oO, this.OooO0oo, this.OooO, this.OooOO0, this.OooOO0O);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.OooOO0o & 1) == 0) {
            sb.append(" recentFramesToCheck");
        }
        if ((this.OooOO0o & 2) == 0) {
            sb.append(" recentFramesContainingPredictedArea");
        }
        if ((this.OooOO0o & 4) == 0) {
            sb.append(" recentFramesIou");
        }
        if ((this.OooOO0o & 8) == 0) {
            sb.append(" maxCoverage");
        }
        if ((this.OooOO0o & 16) == 0) {
            sb.append(" useConfidenceScore");
        }
        if ((this.OooOO0o & 32) == 0) {
            sb.append(" lowerConfidenceScore");
        }
        if ((this.OooOO0o & 64) == 0) {
            sb.append(" higherConfidenceScore");
        }
        if ((this.OooOO0o & 128) == 0) {
            sb.append(" zoomIntervalInMillis");
        }
        if ((this.OooOO0o & 256) == 0) {
            sb.append(" resetIntervalInMillis");
        }
        if ((this.OooOO0o & 512) == 0) {
            sb.append(" enableZoomThreshold");
        }
        if ((this.OooOO0o & 1024) == 0) {
            sb.append(" zoomInThreshold");
        }
        if ((this.OooOO0o & 2048) == 0) {
            sb.append(" zoomOutThreshold");
        }
        qa.OooO0o("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
