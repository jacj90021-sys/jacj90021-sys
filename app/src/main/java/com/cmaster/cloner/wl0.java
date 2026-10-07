package com.cmaster.cloner;

public enum wl0 {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public final xl0 OooO00o() {
        switch (vl0.OooO00o[ordinal()]) {
            case 1:
            case 2:
                return xl0.OooO0o;
            case 3:
            case 4:
                return xl0.OooO0oO;
            case 5:
                return xl0.OooO0oo;
            case 6:
                return xl0.OooO0Oo;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new tf();
        }
    }
}