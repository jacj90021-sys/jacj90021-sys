package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.Continuation;

/** Recovered stub for coroutine debug probes (disabled). */
public final class DebugProbesKt {
    private DebugProbesKt() { }
    public static Object probeCoroutineCreated(Continuation brainContinuation) { return brainContinuation; }
    public static void probeCoroutineResumed(Continuation brainContinuation) { }
    public static void probeCoroutineSuspended(Continuation brainContinuation) { }
}
