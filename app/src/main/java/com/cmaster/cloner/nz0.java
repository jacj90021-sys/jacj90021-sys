package com.cmaster.cloner;

import android.app.Application;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzcak;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nz0 implements qs0, h51, ju0, zv, o00, o00OO00O, fr1, sz0, jy1, i6, b91, hc3, lg2, dg2, zzaqh, av2, hj {
    public final /* synthetic */ int OooO0Oo;
    public Object OooO0o0;

    public nz0(int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 20:
                this.OooO0o0 = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
            default:
                this.OooO0o0 = ByteBuffer.allocate(4);
                break;
        }
    }

    public static void OooOO0o(c30 c30Var) throws SQLException {
        SQLiteDatabase sQLiteDatabase = c30Var.OooO0Oo;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static ub1 OooOOO(c30 c30Var) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new nl1(1, "work_spec_id", "TEXT", null, true, 1));
        map.put("prerequisite_id", new nl1(2, "prerequisite_id", "TEXT", null, true, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new ol1("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new ol1("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new pl1("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
        hashSet2.add(new pl1("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
        ql1 ql1Var = new ql1("Dependency", map, hashSet, hashSet2);
        ql1 ql1VarOooO00o = ql1.OooO00o(c30Var, "Dependency");
        if (!ql1Var.equals(ql1VarOooO00o)) {
            return new ub1("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + ql1Var + "\n Found:\n" + ql1VarOooO00o, false);
        }
        HashMap map2 = new HashMap(25);
        map2.put("id", new nl1(1, "id", "TEXT", null, true, 1));
        map2.put("state", new nl1(0, "state", "INTEGER", null, true, 1));
        map2.put("worker_class_name", new nl1(0, "worker_class_name", "TEXT", null, true, 1));
        map2.put("input_merger_class_name", new nl1(0, "input_merger_class_name", "TEXT", null, false, 1));
        map2.put("input", new nl1(0, "input", "BLOB", null, true, 1));
        map2.put("output", new nl1(0, "output", "BLOB", null, true, 1));
        map2.put("initial_delay", new nl1(0, "initial_delay", "INTEGER", null, true, 1));
        map2.put("interval_duration", new nl1(0, "interval_duration", "INTEGER", null, true, 1));
        map2.put("flex_duration", new nl1(0, "flex_duration", "INTEGER", null, true, 1));
        map2.put("run_attempt_count", new nl1(0, "run_attempt_count", "INTEGER", null, true, 1));
        map2.put("backoff_policy", new nl1(0, "backoff_policy", "INTEGER", null, true, 1));
        map2.put("backoff_delay_duration", new nl1(0, "backoff_delay_duration", "INTEGER", null, true, 1));
        map2.put("period_start_time", new nl1(0, "period_start_time", "INTEGER", null, true, 1));
        map2.put("minimum_retention_duration", new nl1(0, "minimum_retention_duration", "INTEGER", null, true, 1));
        map2.put("schedule_requested_at", new nl1(0, "schedule_requested_at", "INTEGER", null, true, 1));
        map2.put("run_in_foreground", new nl1(0, "run_in_foreground", "INTEGER", null, true, 1));
        map2.put("out_of_quota_policy", new nl1(0, "out_of_quota_policy", "INTEGER", null, true, 1));
        map2.put("required_network_type", new nl1(0, "required_network_type", "INTEGER", null, false, 1));
        map2.put("requires_charging", new nl1(0, "requires_charging", "INTEGER", null, true, 1));
        map2.put("requires_device_idle", new nl1(0, "requires_device_idle", "INTEGER", null, true, 1));
        map2.put("requires_battery_not_low", new nl1(0, "requires_battery_not_low", "INTEGER", null, true, 1));
        map2.put("requires_storage_not_low", new nl1(0, "requires_storage_not_low", "INTEGER", null, true, 1));
        map2.put("trigger_content_update_delay", new nl1(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
        map2.put("trigger_max_content_delay", new nl1(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
        map2.put("content_uri_triggers", new nl1(0, "content_uri_triggers", "BLOB", null, false, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new pl1("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
        hashSet4.add(new pl1("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
        ql1 ql1Var2 = new ql1("WorkSpec", map2, hashSet3, hashSet4);
        ql1 ql1VarOooO00o2 = ql1.OooO00o(c30Var, "WorkSpec");
        if (!ql1Var2.equals(ql1VarOooO00o2)) {
            return new ub1("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + ql1Var2 + "\n Found:\n" + ql1VarOooO00o2, false);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new nl1(1, "tag", "TEXT", null, true, 1));
        map3.put("work_spec_id", new nl1(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new ol1("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new pl1("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
        ql1 ql1Var3 = new ql1("WorkTag", map3, hashSet5, hashSet6);
        ql1 ql1VarOooO00o3 = ql1.OooO00o(c30Var, "WorkTag");
        if (!ql1Var3.equals(ql1VarOooO00o3)) {
            return new ub1("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + ql1Var3 + "\n Found:\n" + ql1VarOooO00o3, false);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new nl1(1, "work_spec_id", "TEXT", null, true, 1));
        map4.put("system_id", new nl1(0, "system_id", "INTEGER", null, true, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new ol1("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        ql1 ql1Var4 = new ql1("SystemIdInfo", map4, hashSet7, new HashSet(0));
        ql1 ql1VarOooO00o4 = ql1.OooO00o(c30Var, "SystemIdInfo");
        if (!ql1Var4.equals(ql1VarOooO00o4)) {
            return new ub1("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + ql1Var4 + "\n Found:\n" + ql1VarOooO00o4, false);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new nl1(1, "name", "TEXT", null, true, 1));
        map5.put("work_spec_id", new nl1(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new ol1("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new pl1("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
        ql1 ql1Var5 = new ql1("WorkName", map5, hashSet8, hashSet9);
        ql1 ql1VarOooO00o5 = ql1.OooO00o(c30Var, "WorkName");
        if (!ql1Var5.equals(ql1VarOooO00o5)) {
            return new ub1("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + ql1Var5 + "\n Found:\n" + ql1VarOooO00o5, false);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new nl1(1, "work_spec_id", "TEXT", null, true, 1));
        map6.put("progress", new nl1(0, "progress", "BLOB", null, true, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new ol1("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        ql1 ql1Var6 = new ql1("WorkProgress", map6, hashSet10, new HashSet(0));
        ql1 ql1VarOooO00o6 = ql1.OooO00o(c30Var, "WorkProgress");
        if (!ql1Var6.equals(ql1VarOooO00o6)) {
            return new ub1("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + ql1Var6 + "\n Found:\n" + ql1VarOooO00o6, false);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new nl1(1, "key", "TEXT", null, true, 1));
        map7.put("long_value", new nl1(0, "long_value", "INTEGER", null, false, 1));
        ql1 ql1Var7 = new ql1("Preference", map7, new HashSet(0), new HashSet(0));
        ql1 ql1VarOooO00o7 = ql1.OooO00o(c30Var, "Preference");
        if (ql1Var7.equals(ql1VarOooO00o7)) {
            return new ub1(null, true);
        }
        return new ub1("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + ql1Var7 + "\n Found:\n" + ql1VarOooO00o7, false);
    }

    private final void OooOOO0(ss0 ss0Var) {
    }

    @Override // com.cmaster.cloner.jy1
    public String[] OooO() {
        return ((WebViewProviderFactoryBoundaryInterface) this.OooO0o0).getSupportedFeatures();
    }

    @Override // com.cmaster.cloner.o00
    public boolean OooO00o(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.OooO0o0;
        if (!swipeDismissBehavior.OooOo0o(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.OooO0o0;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = nt1.OooO00o;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        ay1 ay1Var = swipeDismissBehavior.OooO0O0;
        if (ay1Var != null) {
            ay1Var.OooOOoo(view);
        }
        return true;
    }

    @Override // com.cmaster.cloner.h51
    public void OooO0O0() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // com.cmaster.cloner.fr1
    public in OooO0OO(Uri uri) {
        return new p3((ContentResolver) this.OooO0o0, uri, 1);
    }

    @Override // com.cmaster.cloner.qs0
    public boolean OooO0Oo(ss0 ss0Var, MenuItem menuItem) {
        switch (this.OooO0Oo) {
            case 1:
                v31 v31Var = (v31) ((ho1) this.OooO0o0).OooO0oo;
                if (v31Var == null) {
                    return false;
                }
                v31Var.onMenuItemClick(menuItem);
                return true;
            default:
                return false;
        }
    }

    @Override // com.cmaster.cloner.sz0
    public void OooO0o0(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.OooO0o0)) {
            ((ByteBuffer) this.OooO0o0).position(0);
            messageDigest.update(((ByteBuffer) this.OooO0o0).putInt(num.intValue()).array());
        }
    }

    @Override // com.cmaster.cloner.av2
    public void OooO0oO(JsonWriter jsonWriter) throws NoSuchAlgorithmException, IOException {
        Object obj = fx2.OooO0O0;
        jsonWriter.name("params").beginObject();
        byte[] bArr = (byte[]) this.OooO0o0;
        int length = bArr.length;
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(strEncodeToString);
        } else {
            String strOooO0Oo = zj2.OooO0Oo(strEncodeToString, "MD5");
            if (strOooO0Oo != null) {
                jsonWriter.name("bodydigest").value(strOooO0Oo);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    @Override // com.cmaster.cloner.h51
    public void OooO0oo(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.OooO0o0).setResultCode(i);
    }

    @Override // com.cmaster.cloner.qs0
    public void OooOO0(ss0 ss0Var) {
        switch (this.OooO0Oo) {
            case 1:
                break;
            default:
                sn1 sn1Var = (sn1) this.OooO0o0;
                boolean zOooOOOO = sn1Var.OooO00o.OooO00o.OooOOOO();
                Window.Callback callback = sn1Var.OooO0O0;
                if (!zOooOOOO) {
                    if (callback.onPreparePanel(0, null, ss0Var)) {
                        callback.onMenuOpened(108, ss0Var);
                        break;
                    }
                } else {
                    callback.onPanelClosed(108, ss0Var);
                    break;
                }
                break;
        }
    }

    @Override // com.cmaster.cloner.zv
    public boolean OooOO0O(Object obj, File file, xz0 xz0Var) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        jp0 jp0Var = (jp0) this.OooO0o0;
        byte[] bArr = (byte[]) jp0Var.OooO0OO(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        jp0Var.OooO0oO(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        jp0Var.OooO0oO(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                jp0Var.OooO0oO(bArr);
                return true;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        switch (this.OooO0Oo) {
            case 3:
                return new t3((Resources) this.OooO0o0, ho1Var.OooOO0O(Uri.class, AssetFileDescriptor.class));
            default:
                return new gr1(this);
        }
    }

    @Override // com.cmaster.cloner.b91
    public void accept(Object obj, Object obj2) {
        yl1 yl1Var = (yl1) obj2;
        p22 p22Var = (p22) ((u22) obj).getService();
        gm1 gm1Var = (gm1) this.OooO0o0;
        p22Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(p22Var.OooO0o);
        y12.OooO0OO(parcelObtain, gm1Var);
        try {
            p22Var.OooO0o0.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            yl1Var.OooO0O0(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // com.cmaster.cloner.jy1
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) g9.OooO00o(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.OooO0o0).createWebView(webView));
    }

    @Override // com.cmaster.cloner.jy1
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) g9.OooO00o(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.OooO0o0).getStatics());
    }

    @Override // com.cmaster.cloner.i6
    public void onConnected(Bundle bundle) {
        ((f60) this.OooO0o0).o0000o0O();
    }

    @Override // com.cmaster.cloner.i6
    public void onConnectionSuspended(int i) {
        ((f60) this.OooO0o0).onConnectionSuspended(i);
    }

    @Override // com.cmaster.cloner.hj
    public Object then(xl1 xl1Var) {
        er1 er1Var = (er1) this.OooO0o0;
        if (!xl1Var.OooO0o() && !((ac3) xl1Var).OooO0Oo) {
            Exception excOooO0OO = xl1Var.OooO0OO();
            if (excOooO0OO instanceof oOO00) {
                int i = ((oOO00) excOooO0OO).OooO0Oo.OooO0Oo;
                if (i == 43001 || i == 43002 || i == 43003 || i == 17) {
                    return ((hx2) er1Var.OooO0o).OooO00o();
                }
                if (i == 43000) {
                    return m43.OooO0O0(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (i == 15) {
                    return m43.OooO0O0(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return xl1Var;
    }

    @Override // com.cmaster.cloner.hc3, com.cmaster.cloner.lg2
    public o00Oo00 zza() {
        yn1 yn1Var = new yn1();
        d63 d63Var = z62.OooO0OO() ? d63.TYPE_THICK : d63.TYPE_THIN;
        e63 e63Var = (e63) this.OooO0o0;
        yn1Var.OooO0Oo = d63Var;
        na1 na1Var = new na1(18);
        na1Var.OooO0o0 = e63Var;
        yn1Var.OooO0oo = new t63(na1Var);
        return new o00Oo00(yn1Var, 0);
    }

    public /* synthetic */ nz0(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    public /* synthetic */ nz0(int i, boolean z) {
        this.OooO0Oo = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public void zza(zzaqm zzaqmVar) {
        ((zzcak) this.OooO0o0).zzd(zzaqmVar);
    }
}
