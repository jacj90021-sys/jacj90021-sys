package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.cmaster.cloner.R;
import com.cmaster.cloner.a02;
import com.cmaster.cloner.ae1;
import com.cmaster.cloner.be1;
import com.cmaster.cloner.ce1;
import com.cmaster.cloner.de1;
import com.cmaster.cloner.ee1;
import com.cmaster.cloner.f0;
import com.cmaster.cloner.fe1;
import com.cmaster.cloner.fw;
import com.cmaster.cloner.ge1;
import com.cmaster.cloner.l61;
import com.cmaster.cloner.me;
import com.cmaster.cloner.nt1;
import com.cmaster.cloner.oOOO00Oo;
import com.cmaster.cloner.pm0;
import com.cmaster.cloner.pt;
import com.cmaster.cloner.pu0;
import com.cmaster.cloner.ql;
import com.cmaster.cloner.r43;
import com.cmaster.cloner.s8;
import com.cmaster.cloner.yj1;
import com.cmaster.cloner.zd1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class SearchView extends pm0 implements me {
    public static final pu0 OoooooO;
    public final SearchAutoComplete OooOOoo;
    public final ImageView OooOo;
    public final View OooOo0;
    public final View OooOo00;
    public final View OooOo0O;
    public final ImageView OooOo0o;
    public final ImageView OooOoO;
    public final ImageView OooOoO0;
    public final View OooOoOO;
    public final Rect OooOoo;
    public ge1 OooOoo0;
    public final Rect OooOooO;
    public final int[] OooOooo;
    public View.OnClickListener Oooo;
    public final int Oooo0;
    public final int[] Oooo000;
    public final ImageView Oooo00O;
    public final Drawable Oooo00o;
    public final int Oooo0O0;
    public final Intent Oooo0OO;
    public final CharSequence Oooo0o;
    public final Intent Oooo0o0;
    public de1 Oooo0oO;
    public View.OnFocusChangeListener Oooo0oo;
    public boolean OoooO;
    public boolean OoooO0;
    public boolean OoooO00;
    public ql OoooO0O;
    public CharSequence OoooOO0;
    public boolean OoooOOO;
    public int OoooOOo;
    public boolean OoooOo0;
    public String OoooOoO;
    public CharSequence OoooOoo;
    public boolean Ooooo00;
    public int Ooooo0o;
    public SearchableInfo OooooO0;
    public Bundle OooooOO;
    public final zd1 OooooOo;
    public final WeakHashMap Oooooo;
    public final zd1 Oooooo0;
    public boolean o000oOoO;

    static {
        pu0 pu0Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            pu0 pu0Var2 = new pu0();
            pu0Var2.OooO00o = null;
            pu0Var2.OooO0O0 = null;
            pu0Var2.OooO0OO = null;
            pu0.OooO00o();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                pu0Var2.OooO00o = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                pu0Var2.OooO0O0 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                pu0Var2.OooO0OO = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            pu0Var = pu0Var2;
        }
        OoooooO = pu0Var;
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OooOoo = new Rect();
        this.OooOooO = new Rect();
        this.OooOooo = new int[2];
        this.Oooo000 = new int[2];
        this.OooooOo = new zd1(this, 0);
        this.Oooooo0 = new zd1(this, 1);
        this.Oooooo = new WeakHashMap();
        OooO00o oooO00o = new OooO00o(this);
        OooO0O0 oooO0O0 = new OooO0O0(this);
        be1 be1Var = new be1(this);
        f0 f0Var = new f0(this, 3);
        pt ptVar = new pt(this, 2);
        fw fwVar = new fw(this, 1);
        int[] iArr = l61.OooOo0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        a02 a02Var = new a02(context, typedArrayObtainStyledAttributes);
        nt1.OooOO0o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.OooOOoo = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.OooOo00 = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.OooOo0 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.OooOo0O = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.OooOo0o = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.OooOo = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.OooOoO0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.OooOoO = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.Oooo00O = imageView5;
        viewFindViewById.setBackground(a02Var.OooOOo(20));
        viewFindViewById2.setBackground(a02Var.OooOOo(25));
        imageView.setImageDrawable(a02Var.OooOOo(23));
        imageView2.setImageDrawable(a02Var.OooOOo(15));
        imageView3.setImageDrawable(a02Var.OooOOo(12));
        imageView4.setImageDrawable(a02Var.OooOOo(28));
        imageView5.setImageDrawable(a02Var.OooOOo(23));
        this.Oooo00o = a02Var.OooOOo(22);
        r43.OooO00o(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.Oooo0 = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.Oooo0O0 = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(oooO00o);
        imageView3.setOnClickListener(oooO00o);
        imageView2.setOnClickListener(oooO00o);
        imageView4.setOnClickListener(oooO00o);
        searchAutoComplete.setOnClickListener(oooO00o);
        searchAutoComplete.addTextChangedListener(fwVar);
        searchAutoComplete.setOnEditorActionListener(be1Var);
        searchAutoComplete.setOnItemClickListener(f0Var);
        searchAutoComplete.setOnItemSelectedListener(ptVar);
        searchAutoComplete.setOnKeyListener(oooO0O0);
        searchAutoComplete.setOnFocusChangeListener(new ae1(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.Oooo0o = typedArrayObtainStyledAttributes.getText(14);
        this.OoooOO0 = typedArrayObtainStyledAttributes.getText(21);
        int i2 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        a02Var.Oooo0oO();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.Oooo0OO = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.Oooo0o0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.OooOoOO = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new s8(this, 1));
        }
        OooOo0o(this.OoooO00);
        OooOo00();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.OooOOoo;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent OooO(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.OoooOoo);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.OooooOO;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.OooooO0.getSearchActivity());
        return intent;
    }

    public final Intent OooOO0(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.OooooOO;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void OooOO0O() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.OooOOoo;
        if (i >= 29) {
            OooO0OO.OooO00o(searchAutoComplete);
            return;
        }
        pu0 pu0Var = OoooooO;
        pu0Var.getClass();
        pu0.OooO00o();
        Method method = pu0Var.OooO00o;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        pu0Var.getClass();
        pu0.OooO00o();
        Method method2 = pu0Var.OooO0O0;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void OooOO0o() {
        SearchAutoComplete searchAutoComplete = this.OooOOoo;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.OoooO00) {
            clearFocus();
            OooOo0o(true);
        }
    }

    public final void OooOOO(int i) {
        Editable text = this.OooOOoo.getText();
        Cursor cursor = this.OoooO0O.OooO0o;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strOooO0OO = this.OoooO0O.OooO0OO(cursor);
        if (strOooO0OO != null) {
            setQuery(strOooO0OO);
        } else {
            setQuery(text);
        }
    }

    public final void OooOOO0(int i) {
        int position;
        String strOooO0oO;
        Cursor cursor = this.OoooO0O.OooO0o;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentOooO = null;
            try {
                int i2 = yj1.OooOoOO;
                String strOooO0oO2 = yj1.OooO0oO(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strOooO0oO2 == null) {
                    strOooO0oO2 = this.OooooO0.getSuggestIntentAction();
                }
                if (strOooO0oO2 == null) {
                    strOooO0oO2 = "android.intent.action.SEARCH";
                }
                String strOooO0oO3 = yj1.OooO0oO(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strOooO0oO3 == null) {
                    strOooO0oO3 = this.OooooO0.getSuggestIntentData();
                }
                if (strOooO0oO3 != null && (strOooO0oO = yj1.OooO0oO(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strOooO0oO3 = strOooO0oO3 + "/" + Uri.encode(strOooO0oO);
                }
                intentOooO = OooO(strOooO0oO2, strOooO0oO3 == null ? null : Uri.parse(strOooO0oO3), yj1.OooO0oO(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), yj1.OooO0oO(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentOooO != null) {
                try {
                    getContext().startActivity(intentOooO);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intentOooO, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.OooOOoo;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void OooOOOO(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void OooOOOo() {
        SearchAutoComplete searchAutoComplete = this.OooOOoo;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.Oooo0oO != null) {
            text.toString();
            return;
        }
        if (this.OooooO0 != null) {
            getContext().startActivity(OooO("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void OooOOo() {
        boolean zIsEmpty = TextUtils.isEmpty(this.OooOOoo.getText());
        int i = (!zIsEmpty || (this.OoooO00 && !this.Ooooo00)) ? 0 : 8;
        ImageView imageView = this.OooOoO0;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void OooOOo0(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.OooOOoo;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.OoooOoo = charSequence;
        }
    }

    public final void OooOOoo() {
        int[] iArr = this.OooOOoo.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.OooOo0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.OooOo0O.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void OooOo0() {
        this.OooOo0O.setVisibility(((this.OoooO || this.OoooOo0) && !this.OoooO0 && (this.OooOo.getVisibility() == 0 || this.OooOoO.getVisibility() == 0)) ? 0 : 8);
    }

    public final void OooOo00() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.OoooO00;
        SearchAutoComplete searchAutoComplete = this.OooOOoo;
        if (z && (drawable = this.Oooo00o) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void OooOo0O(boolean z) {
        boolean z2 = this.OoooO;
        this.OooOo.setVisibility((!z2 || !(z2 || this.OoooOo0) || this.OoooO0 || !hasFocus() || (!z && this.OoooOo0)) ? 8 : 0);
    }

    public final void OooOo0o(boolean z) {
        this.OoooO0 = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.OooOOoo.getText());
        this.OooOo0o.setVisibility(i2);
        OooOo0O(!zIsEmpty);
        this.OooOo00.setVisibility(z ? 8 : 0);
        ImageView imageView = this.Oooo00O;
        imageView.setVisibility((imageView.getDrawable() == null || this.OoooO00) ? 8 : 0);
        OooOOo();
        if (this.OoooOo0 && !this.OoooO0 && zIsEmpty) {
            this.OooOo.setVisibility(8);
            i = 0;
        }
        this.OooOoO.setVisibility(i);
        OooOo0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.OoooOOO = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.OooOOoo;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.OoooOOO = false;
    }

    public int getImeOptions() {
        return this.OooOOoo.getImeOptions();
    }

    public int getInputType() {
        return this.OooOOoo.getInputType();
    }

    public int getMaxWidth() {
        return this.OoooOOo;
    }

    public CharSequence getQuery() {
        return this.OooOOoo.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.OoooOO0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.OooooO0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.Oooo0o : getContext().getText(this.OooooO0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.Oooo0O0;
    }

    public int getSuggestionRowLayout() {
        return this.Oooo0;
    }

    public ql getSuggestionsAdapter() {
        return this.OoooO0O;
    }

    @Override // com.cmaster.cloner.me
    public final void onActionViewCollapsed() {
        OooOOo0("");
        clearFocus();
        OooOo0o(true);
        this.OooOOoo.setImeOptions(this.Ooooo0o);
        this.Ooooo00 = false;
    }

    @Override // com.cmaster.cloner.me
    public final void onActionViewExpanded() {
        if (this.Ooooo00) {
            return;
        }
        this.Ooooo00 = true;
        SearchAutoComplete searchAutoComplete = this.OooOOoo;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.Ooooo0o = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.OooooOo);
        post(this.Oooooo0);
        super.onDetachedFromWindow();
    }

    @Override // com.cmaster.cloner.pm0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.OooOOoo;
            int[] iArr = this.OooOooo;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.Oooo000;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.OooOoo;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.OooOooO;
            rect2.set(i7, 0, i8, i9);
            ge1 ge1Var = this.OooOoo0;
            if (ge1Var == null) {
                ge1 ge1Var2 = new ge1(searchAutoComplete, rect2, rect);
                this.OooOoo0 = ge1Var2;
                setTouchDelegate(ge1Var2);
            } else {
                ge1Var.OooO0O0.set(rect2);
                Rect rect3 = ge1Var.OooO0Oo;
                rect3.set(rect2);
                int i10 = -ge1Var.OooO0o0;
                rect3.inset(i10, i10);
                ge1Var.OooO0OO.set(rect);
            }
        }
    }

    @Override // com.cmaster.cloner.pm0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.OoooO0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.OoooOOo;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.OoooOOo;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.OoooOOo) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fe1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fe1 fe1Var = (fe1) parcelable;
        super.onRestoreInstanceState(fe1Var.OooO0Oo);
        OooOo0o(fe1Var.OooO0o);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        fe1 fe1Var = new fe1(super.onSaveInstanceState());
        fe1Var.OooO0o = this.OoooO0;
        return fe1Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.OooooOo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.OoooOOO || !isFocusable()) {
            return false;
        }
        if (this.OoooO0) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.OooOOoo.requestFocus(i, rect);
        if (zRequestFocus) {
            OooOo0o(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.OooooOO = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            OooOO0o();
            return;
        }
        OooOo0o(false);
        SearchAutoComplete searchAutoComplete = this.OooOOoo;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.Oooo;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.OoooO00 == z) {
            return;
        }
        this.OoooO00 = z;
        OooOo0o(z);
        OooOo00();
    }

    public void setImeOptions(int i) {
        this.OooOOoo.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.OooOOoo.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.OoooOOo = i;
        requestLayout();
    }

    public void setOnCloseListener(ce1 ce1Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.Oooo0oo = onFocusChangeListener;
    }

    public void setOnQueryTextListener(de1 de1Var) {
        this.Oooo0oO = de1Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.Oooo = onClickListener;
    }

    public void setOnSuggestionListener(ee1 ee1Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.OoooOO0 = charSequence;
        OooOo00();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.o000oOoO = z;
        ql qlVar = this.OoooO0O;
        if (qlVar instanceof yj1) {
            ((yj1) qlVar).OooOOoo = z ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.OooooO0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.OooOOoo
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.OooooO0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.OooooO0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.OooooO0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            com.cmaster.cloner.ql r7 = r6.OoooO0O
            if (r7 == 0) goto L3b
            r7.OooO0O0(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.OooooO0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            com.cmaster.cloner.yj1 r7 = new com.cmaster.cloner.yj1
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.OooooO0
            java.util.WeakHashMap r5 = r6.Oooooo
            r7.<init>(r3, r6, r4, r5)
            r6.OoooO0O = r7
            r2.setAdapter(r7)
            com.cmaster.cloner.ql r7 = r6.OoooO0O
            com.cmaster.cloner.yj1 r7 = (com.cmaster.cloner.yj1) r7
            boolean r3 = r6.o000oOoO
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.OooOOoo = r3
        L62:
            r6.OooOo00()
        L65:
            android.app.SearchableInfo r7 = r6.OooooO0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.OooooO0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.Oooo0OO
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.OooooO0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.Oooo0o0
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.OoooOo0 = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.OoooO0
            r6.OooOo0o(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.OoooO = z;
        OooOo0o(this.OoooO0);
    }

    public void setSuggestionsAdapter(ql qlVar) {
        this.OoooO0O = qlVar;
        this.OooOOoo.setAdapter(qlVar);
    }

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static class SearchAutoComplete extends oOOO00Oo {
        public SearchView OooO;
        public int OooO0oo;
        public boolean OooOO0;
        public final OooO0o OooOO0O;

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.OooOO0O = new OooO0o(this);
            this.OooO0oo = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void OooO00o() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 29) {
                OooO0OO.OooO0O0(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            pu0 pu0Var = SearchView.OoooooO;
            pu0Var.getClass();
            pu0.OooO00o();
            Method method = pu0Var.OooO0OO;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.OooO0oo <= 0 || super.enoughToFilter();
        }

        @Override // com.cmaster.cloner.oOOO00Oo, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.OooOO0) {
                OooO0o oooO0o = this.OooOO0O;
                removeCallbacks(oooO0o);
                post(oooO0o);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.OooO;
            searchView.OooOo0o(searchView.OoooO0);
            searchView.post(searchView.OooooOo);
            if (searchView.OooOOoo.hasFocus()) {
                searchView.OooOO0O();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.OooO.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z);
            if (z && this.OooO.hasFocus() && getVisibility() == 0) {
                this.OooOO0 = true;
                Context context = getContext();
                pu0 pu0Var = SearchView.OoooooO;
                if (context.getResources().getConfiguration().orientation == 2) {
                    OooO00o();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            OooO0o oooO0o = this.OooOO0O;
            if (!z) {
                this.OooOO0 = false;
                removeCallbacks(oooO0o);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.OooOO0 = true;
                    return;
                }
                this.OooOO0 = false;
                removeCallbacks(oooO0o);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.OooO = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.OooO0oo = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
