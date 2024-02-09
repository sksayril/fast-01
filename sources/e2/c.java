package e2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import h2.p;

public class c extends DialogFragment {

    /* renamed from: m  reason: collision with root package name */
    private Dialog f8332m;

    /* renamed from: n  reason: collision with root package name */
    private DialogInterface.OnCancelListener f8333n;

    /* renamed from: o  reason: collision with root package name */
    private Dialog f8334o;

    public static c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        c cVar = new c();
        Dialog dialog2 = (Dialog) p.k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.f8332m = dialog2;
        if (onCancelListener != null) {
            cVar.f8333n = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f8333n;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f8332m;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f8334o == null) {
            this.f8334o = new AlertDialog.Builder((Context) p.j(getActivity())).create();
        }
        return this.f8334o;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
