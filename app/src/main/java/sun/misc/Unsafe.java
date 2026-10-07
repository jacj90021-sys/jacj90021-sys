package sun.misc;

/** Stub of sun.misc.Unsafe for Android (hidden runtime). */
public class Unsafe {
    public static final Unsafe theUnsafe = new Unsafe();
    public int arrayBaseOffset(Class<?> cls) { return 0; }
    public int arrayIndexScale(Class<?> cls) { return 1; }
    public long objectFieldOffset(java.lang.reflect.Field field) { return 0; }
    public Object getObject(Object o, long l) { return null; }
    public void putObject(Object o, long l, Object v) {}
    public void putInt(Object o, long l, int v) {}
    public int getInt(Object o, long l) { return 0; }
    public int getInt(long l) { return 0; }
    public long getLong(Object o, long l) { return 0; }
    public void putLong(Object o, long l, long v) {}
    public void putLong(long l, long v) {}
    public long getLong(long l) { return 0; }
    public boolean compareAndSwapObject(Object o, long l, Object e, Object x) { return false; }
    public boolean compareAndSwapInt(Object o, long l, int e, int x) { return false; }
    public void park(boolean b, long l) {}
    public void unpark(Object o) {}
    public void throwException(Throwable t) { /* swallow */ }
}
