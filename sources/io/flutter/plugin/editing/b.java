package io.flutter.plugin.editing;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.systemchannels.q;
import io.flutter.plugin.editing.c;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class b extends BaseInputConnection implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final View f9996a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9997b;

    /* renamed from: c  reason: collision with root package name */
    private final q f9998c;

    /* renamed from: d  reason: collision with root package name */
    private final c f9999d;

    /* renamed from: e  reason: collision with root package name */
    private final EditorInfo f10000e;

    /* renamed from: f  reason: collision with root package name */
    private ExtractedTextRequest f10001f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10002g;

    /* renamed from: h  reason: collision with root package name */
    private CursorAnchorInfo.Builder f10003h;

    /* renamed from: i  reason: collision with root package name */
    private ExtractedText f10004i;

    /* renamed from: j  reason: collision with root package name */
    private InputMethodManager f10005j;

    /* renamed from: k  reason: collision with root package name */
    private final Layout f10006k;

    /* renamed from: l  reason: collision with root package name */
    private a f10007l;

    /* renamed from: m  reason: collision with root package name */
    private final a f10008m;

    /* renamed from: n  reason: collision with root package name */
    private int f10009n;

    public interface a {
        boolean b(KeyEvent keyEvent);
    }

    public b(View view, int i10, q qVar, a aVar, c cVar, EditorInfo editorInfo) {
        this(view, i10, qVar, aVar, cVar, editorInfo, new FlutterJNI());
    }

    public b(View view, int i10, q qVar, a aVar, c cVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f10002g = false;
        this.f10004i = new ExtractedText();
        this.f10009n = 0;
        this.f9996a = view;
        this.f9997b = i10;
        this.f9998c = qVar;
        this.f9999d = cVar;
        cVar.a(this);
        this.f10000e = editorInfo;
        this.f10008m = aVar;
        this.f10007l = new a(flutterJNI);
        this.f10006k = new DynamicLayout(cVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f10005j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    private boolean b(int i10) {
        if (i10 == 16908319) {
            setSelection(0, this.f9999d.length());
            return true;
        } else if (i10 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f9999d);
            int selectionEnd = Selection.getSelectionEnd(this.f9999d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f9996a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f9999d.subSequence(min, max)));
                this.f9999d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        } else if (i10 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f9999d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f9999d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f9996a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f9999d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        } else if (i10 != 16908322) {
            return false;
        } else {
            ClipData primaryClip = ((ClipboardManager) this.f9996a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f9996a.getContext());
                int max2 = Math.max(0, Selection.getSelectionStart(this.f9999d));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.f9999d));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.f9999d.delete(min2, max4);
                }
                this.f9999d.insert(min2, coerceToText);
                int length = min2 + coerceToText.length();
                setSelection(length, length);
            }
            return true;
        }
    }

    private CursorAnchorInfo c() {
        CursorAnchorInfo.Builder builder = this.f10003h;
        if (builder == null) {
            this.f10003h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f10003h.setSelectionRange(this.f9999d.i(), this.f9999d.h());
        int g10 = this.f9999d.g();
        int f10 = this.f9999d.f();
        if (g10 < 0 || f10 <= g10) {
            this.f10003h.setComposingText(-1, "");
        } else {
            this.f10003h.setComposingText(g10, this.f9999d.toString().subSequence(g10, f10));
        }
        return this.f10003h.build();
    }

    private ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f10004i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f9999d.i();
        this.f10004i.selectionEnd = this.f9999d.h();
        this.f10004i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f9999d.toString() : this.f9999d;
        return this.f10004i;
    }

    private boolean e(boolean z9, boolean z10) {
        int selectionStart = Selection.getSelectionStart(this.f9999d);
        int selectionEnd = Selection.getSelectionEnd(this.f9999d);
        boolean z11 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z9 ? Math.max(this.f10007l.b(this.f9999d, selectionEnd), 0) : Math.min(this.f10007l.a(this.f9999d, selectionEnd), this.f9999d.length());
        if (selectionStart == selectionEnd && !z10) {
            z11 = true;
        }
        if (z11) {
            setSelection(max, max);
        } else {
            setSelection(selectionStart, max);
        }
        return true;
    }

    private boolean g(boolean z9, boolean z10) {
        int selectionStart = Selection.getSelectionStart(this.f9999d);
        int selectionEnd = Selection.getSelectionEnd(this.f9999d);
        boolean z11 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z10) {
            z11 = true;
        }
        beginBatchEdit();
        if (z11) {
            if (z9) {
                Selection.moveUp(this.f9999d, this.f10006k);
            } else {
                Selection.moveDown(this.f9999d, this.f10006k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f9999d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z9) {
                Selection.extendUp(this.f9999d, this.f10006k);
            } else {
                Selection.extendDown(this.f9999d, this.f10006k);
            }
            setSelection(Selection.getSelectionStart(this.f9999d), Selection.getSelectionEnd(this.f9999d));
        }
        endBatchEdit();
        return true;
    }

    private byte[] h(InputStream inputStream, int i10) {
        int i11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i10];
        while (true) {
            try {
                i11 = inputStream.read(bArr);
            } catch (IOException unused) {
                i11 = -1;
            }
            if (i11 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i11);
        }
    }

    public void a(boolean z9, boolean z10, boolean z11) {
        this.f10005j.updateSelection(this.f9996a, this.f9999d.i(), this.f9999d.h(), this.f9999d.g(), this.f9999d.f());
        ExtractedTextRequest extractedTextRequest = this.f10001f;
        if (extractedTextRequest != null) {
            this.f10005j.updateExtractedText(this.f9996a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.f10002g) {
            this.f10005j.updateCursorAnchorInfo(this.f9996a, c());
        }
    }

    public boolean beginBatchEdit() {
        this.f9999d.b();
        this.f10009n++;
        return super.beginBatchEdit();
    }

    public boolean clearMetaKeyStates(int i10) {
        return super.clearMetaKeyStates(i10);
    }

    public void closeConnection() {
        super.closeConnection();
        this.f9999d.l(this);
        while (this.f10009n > 0) {
            endBatchEdit();
            this.f10009n--;
        }
    }

    @TargetApi(25)
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f9996a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] h10 = h(openInputStream, 65536);
                                HashMap hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put("data", h10);
                                hashMap.put("uri", contentUri.toString());
                                this.f9998c.b(this.f9997b, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public boolean commitText(CharSequence charSequence, int i10) {
        return super.commitText(charSequence, i10);
    }

    public boolean deleteSurroundingText(int i10, int i11) {
        if (this.f9999d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i10, i11);
    }

    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return super.deleteSurroundingTextInCodePoints(i10, i11);
    }

    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f10009n--;
        this.f9999d.d();
        return endBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f10000e;
                if ((131072 & editorInfo.inputType) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f9999d);
            int selectionEnd = Selection.getSelectionEnd(this.f9999d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (min != max) {
                    this.f9999d.delete(min, max);
                }
                this.f9999d.insert(min, String.valueOf((char) unicodeChar));
                int i10 = min + 1;
                setSelection(i10, i10);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    public Editable getEditable() {
        return this.f9999d;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z9 = true;
        boolean z10 = (i10 & 1) != 0;
        if (this.f10001f != null) {
            z9 = false;
        }
        if (z10 == z9) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z10 ? "on" : "off");
            x6.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f10001f = z10 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    public boolean performContextMenuAction(int i10) {
        beginBatchEdit();
        boolean b10 = b(i10);
        endBatchEdit();
        return b10;
    }

    public boolean performEditorAction(int i10) {
        if (i10 == 0) {
            this.f9998c.p(this.f9997b);
        } else if (i10 == 1) {
            this.f9998c.g(this.f9997b);
        } else if (i10 == 2) {
            this.f9998c.f(this.f9997b);
        } else if (i10 == 3) {
            this.f9998c.m(this.f9997b);
        } else if (i10 == 4) {
            this.f9998c.n(this.f9997b);
        } else if (i10 == 5) {
            this.f9998c.h(this.f9997b);
        } else if (i10 != 7) {
            this.f9998c.e(this.f9997b);
        } else {
            this.f9998c.k(this.f9997b);
        }
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f9998c.j(this.f9997b, str, bundle);
        return true;
    }

    public boolean requestCursorUpdates(int i10) {
        if ((i10 & 1) != 0) {
            this.f10005j.updateCursorAnchorInfo(this.f9996a, c());
        }
        boolean z9 = (i10 & 2) != 0;
        if (z9 != this.f10002g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z9 ? "on" : "off");
            x6.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f10002g = z9;
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f10008m.b(keyEvent);
    }

    public boolean setComposingRegion(int i10, int i11) {
        return super.setComposingRegion(i10, i11);
    }

    public boolean setComposingText(CharSequence charSequence, int i10) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i10) : super.setComposingText(charSequence, i10);
        endBatchEdit();
        return commitText;
    }

    public boolean setSelection(int i10, int i11) {
        beginBatchEdit();
        boolean selection = super.setSelection(i10, i11);
        endBatchEdit();
        return selection;
    }
}
