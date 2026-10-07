package org.conscrypt;

import javax.net.ssl.SSLContext;
import java.security.Provider;

/** Recovered conscrypt stub. */
public final class Conscrypt {
    public static class Version {
        public final int major = 2;
        public final int minor = 1;
        public final int patch = 0;
        public static int major() { return 2; }
    }
    public static boolean isAvailable() { return false; }
    public static boolean isConscryptUsed() { return false; }
    public static Provider newProvider() { return null; }
    public static void setDefaultProvider() { }
    public static void setEngineSocketFactory(SSLContext context, Object factory) { }
    public static boolean shouldUseConscrypt() { return false; }
    public static Version version() { return new Version(); }
}
