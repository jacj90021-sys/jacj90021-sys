package android.content.pm;

import android.content.pm.PackageParser;
import java.io.File;

/** Recovered framework hidden API stub. */
public class PackageParser {
    public interface Callback {
        boolean onCheckSignatures(String var1, String var2, int var3, int var4, boolean var5);
        boolean onSigningDetailsFetched(PackageParser.SigningDetails var1, String var2, SigningDetails var3, int var4, int var5, boolean var6);
    }

    public static class Package { }
    public static class SigningDetails { }
    public static class Component<IntentFilter> { }
    public static class Activity extends Component { }
    public static class Service extends Component { }
    public static class Provider extends Component { }

    public Package parsePackage(File file, int i) { return null; }
}
