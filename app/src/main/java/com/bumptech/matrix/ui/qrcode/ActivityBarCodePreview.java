package com.bumptech.matrix.ui.qrcode;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.cmaster.cloner.R;
import com.cmaster.cloner.b6;
import com.cmaster.cloner.h1;
import com.cmaster.cloner.m1;
import com.cmaster.cloner.o00O00O;
import com.cmaster.cloner.o0O0o;
import com.cmaster.cloner.o0oOOo;
import com.cmaster.cloner.pi2;
import com.cmaster.cloner.sn2;
import com.cmaster.cloner.xa;
import com.google.android.gms.common.annotation.KeepName;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
@KeepName
/* loaded from: classes.dex */
public final class ActivityBarCodePreview extends m1 implements AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener {
    public static final String Oooo0OO = sn2.OooO00o("wOlJJmcW9xnR61orZhv8Xg==\n", "gog7RQhykjk=\n");
    public static final String Oooo0o0 = "ActivityBarCodePreview";
    public View Oooo0;
    public CameraSourcePreview Oooo00O;
    public GraphicOverlay Oooo00o;
    public xa Oooo000 = null;
    public String Oooo0O0 = sn2.OooO00o("rJHNf/5yDR29k95y/38GWg==\n", "7vC/HJEWaD0=\n");

    public final void OooOooo(String str) {
        if (this.Oooo000 == null) {
            this.Oooo000 = new xa(this, this.Oooo00o);
        }
        try {
            if (str.hashCode() == 1021577361 && str.equals(Oooo0OO)) {
                Log.i(Oooo0o0, sn2.OooO00o("K454++dTJj4Mnn7x5VMgOgqYcuHvAUQPDJJy8PMACy0=\n", "fv0RlYBzZF8=\n"));
                o0O0o o0o0o = new o0O0o(this);
                xa xaVar = this.Oooo000;
                b6 b6Var = new b6(this, o0o0o);
                synchronized (xaVar.OooOO0) {
                    try {
                        xaVar.OooO0oO.OooO0O0();
                        b6 b6Var2 = xaVar.OooOO0O;
                        if (b6Var2 != null) {
                            b6Var2.OooO0o0();
                        }
                        xaVar.OooOO0O = b6Var;
                    } finally {
                    }
                }
                return;
            }
            Log.e(Oooo0o0, sn2.OooO00o("8wtTm+9gaifLClyQ7C0k\n", "pmU49YAXBAc=\n").concat(str));
        } catch (RuntimeException e) {
            Log.e(Oooo0o0, sn2.OooO00o("VIj23e5XuA50m/2c9F3sR3qI/5igSL5BdIzrju9K9g4=\n", "F+mY/YA4zC4=\n") + str, e);
            Toast.makeText(getApplicationContext(), sn2.OooO00o("ARWDR3g17oghBogGYj+6wS8VigI2KujHIRGeFHkooIg=\n", "QnTtZxZamqg=\n") + e.getMessage(), 1).show();
        }
    }

    public final void Oooo000() {
        String str = Oooo0o0;
        if (this.Oooo000 != null) {
            try {
                if (this.Oooo00O == null) {
                    Log.d(str, sn2.OooO00o("MlouRgDIdtwQTThFBMg73ClMfV0YwSA=\n", "QD9dM22tTPw=\n"));
                }
                if (this.Oooo00o == null) {
                    Log.d(str, sn2.OooO00o("PHnSksfJxCwpbsCXwuOIaTxwwJ6KxY0sIGnNiw==\n", "Thyh56qs/gw=\n"));
                }
                CameraSourcePreview cameraSourcePreview = this.Oooo00O;
                xa xaVar = this.Oooo000;
                cameraSourcePreview.OooO = this.Oooo00o;
                cameraSourcePreview.OooO0oo = xaVar;
                if (xaVar != null) {
                    cameraSourcePreview.OooO0o = true;
                    cameraSourcePreview.OooO0O0();
                }
            } catch (IOException e) {
                Log.e(str, sn2.OooO00o("UTMEEqCm/AZrfRYErbGoUmc8CBW+ovwBaygXE6nt\n", "BF1lcMzD3HI=\n"), e);
                this.Oooo000.OooO0OO();
                this.Oooo000 = null;
            }
        }
    }

    @Override // com.cmaster.cloner.oOOO00, com.cmaster.cloner.fg, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 20001 && i2 == -1 && intent != null) {
            Uri data = intent.getData();
            Log.d(Oooo0o0, sn2.OooO00o("sMVDicrfX6mr0lCPzcNFtP/5R7vr83qUgPhWq+zidoee506v7O92g5DvR8o=\n", "36sC6r62KcA=\n") + data);
            h1.OooO0Oo.execute(new pi2((Object) this, (Object) data, 2, false));
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Log.d(Oooo0o0, sn2.OooO00o("d25WoPjAlqxKbA==\n", "JAsigJ6h9cU=\n"));
        xa xaVar = this.Oooo000;
        if (xaVar != null) {
            if (z) {
                xaVar.OooO0Oo(1);
            } else {
                xaVar.OooO0Oo(0);
            }
        }
        xa xaVar2 = this.Oooo00O.OooO0oo;
        if (xaVar2 != null) {
            xaVar2.OooO0o0();
        }
        Oooo000();
    }

    @Override // com.cmaster.cloner.m1, com.cmaster.cloner.oOOO00, com.cmaster.cloner.fg, com.cmaster.cloner.eg, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        String strOooO00o = sn2.OooO00o("ssfnPfSonkw=\n", "3amkT5HJ6ik=\n");
        String str = Oooo0o0;
        Log.d(str, strOooO00o);
        setContentView(R.layout.activity_qrcode_preview);
        OooOooO((Toolbar) findViewById(R.id.toolbar));
        int i = 1;
        if (OooOOO0() != null) {
            OooOOO0().OooOOOO(R.string.action_qrcode_scan);
            OooOOO0().OooOOO0(true);
        }
        CameraSourcePreview cameraSourcePreview = (CameraSourcePreview) findViewById(R.id.preview_view);
        this.Oooo00O = cameraSourcePreview;
        if (cameraSourcePreview == null) {
            Log.d(str, sn2.OooO00o("MQXGwbS50XMIBIPZqLDK\n", "YXejt93cplM=\n"));
        }
        GraphicOverlay graphicOverlay = (GraphicOverlay) findViewById(R.id.graphic_overlay);
        this.Oooo00o = graphicOverlay;
        if (graphicOverlay == null) {
            Log.d(str, sn2.OooO00o("VHx+p1tQDo9Fa227UkBNqUAucaJfVQ==\n", "Mw4f1zM5bcA=\n"));
        }
        View viewFindViewById = findViewById(R.id.iv_qrcode_gallery);
        this.Oooo0 = viewFindViewById;
        viewFindViewById.setOnClickListener(new o0oOOo(this, 0));
        findViewById(R.id.iv_qrcode_history).setOnClickListener(new o00O00O(this, i));
        if (checkSelfPermission(sn2.OooO00o("AdvzrlTJYkUQ0OWxUtN1Ag/buZ967UM5IQ==\n", "YLWX3DugBms=\n")) == 0) {
            OooOooo(this.Oooo0O0);
        } else {
            requestPermissions(new String[]{sn2.OooO00o("Nta/sZ2rGkAn3amum7ENBzjW9YCzjzs8Fg==\n", "V7jbw/LCfm4=\n")}, 10001);
        }
    }

    @Override // com.cmaster.cloner.oOOO00, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        xa xaVar = this.Oooo000;
        if (xaVar != null) {
            xaVar.OooO0OO();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final synchronized void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.Oooo0O0 = adapterView.getItemAtPosition(i).toString();
        Log.d(Oooo0o0, sn2.OooO00o("h2g0LBdB7k70YDctEVmxCg==\n", "1A1YSXQ1iyo=\n") + this.Oooo0O0);
        xa xaVar = this.Oooo00O.OooO0oo;
        if (xaVar != null) {
            xaVar.OooO0o0();
        }
        OooOooo(this.Oooo0O0);
        Oooo000();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            OooOO0().OooO00o();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.cmaster.cloner.oOOO00, android.app.Activity
    public final void onPause() {
        super.onPause();
        xa xaVar = this.Oooo00O.OooO0oo;
        if (xaVar != null) {
            xaVar.OooO0o0();
        }
    }

    @Override // com.cmaster.cloner.oOOO00, com.cmaster.cloner.fg, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10001) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                onBackPressed();
            } else {
                OooOooo(this.Oooo0O0);
            }
        }
    }

    @Override // com.cmaster.cloner.oOOO00, android.app.Activity
    public final void onResume() {
        super.onResume();
        Log.d(Oooo0o0, sn2.OooO00o("u4mQRik008o=\n", "1OfCI1pBvq8=\n"));
        if (checkSelfPermission(sn2.OooO00o("l0Oe/gTITmSGSIjhAtJZI5lD1M8q7G8Ytw==\n", "9i36jGuhKko=\n")) == 0) {
            OooOooo(this.Oooo0O0);
            Oooo000();
        }
    }
}
