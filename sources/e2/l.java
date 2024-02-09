package e2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.d;
import androidx.fragment.app.n;
import h2.p;

public class l extends d {
    private Dialog D0;
    private DialogInterface.OnCancelListener E0;
    private Dialog F0;

    public static l Q1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        l lVar = new l();
        Dialog dialog2 = (Dialog) p.k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        lVar.D0 = dialog2;
        if (onCancelListener != null) {
            lVar.E0 = onCancelListener;
        }
        return lVar;
    }

    public Dialog J1(Bundle bundle) {
        Dialog dialog = this.D0;
        if (dialog != null) {
            return dialog;
        }
        N1(false);
        if (this.F0 == null) {
            this.F0 = new AlertDialog.Builder((Context) p.j(t())).create();
        }
        return this.F0;
    }

    public void P1(n nVar, String str) {
        super.P1(nVar, str);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.E0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
