package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.Continuation;

/** Recovered stub for coroutine debug probe impl (disabled). */
public final class DebugProbesImpl {
    public static final DebugProbesImpl INSTANCE = new DebugProbesImpl();
    private DebugProbesImpl() { }
    @SuppressWarnings("unchecked")
    public <T> Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(Continuation<? super T> continuation) { return (Continuation<T>) continuation; }
    public void probeCoroutineResumed$kotlinx_coroutines_core(Continuation<?> continuation) { }
    public void probeCoroutineSuspended$kotlinx_coroutines_core(Continuation<?> continuation) { }
}
