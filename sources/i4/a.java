package i4;

import com.google.firebase.crashlytics.internal.common.i;
import g4.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
import z3.g;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final File f9455a;

    public a(f fVar) {
        this.f9455a = fVar.e("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f9455a;
    }

    public JSONObject b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        g.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a10 = a();
            if (a10.exists()) {
                fileInputStream = new FileInputStream(a10);
                try {
                    jSONObject = new JSONObject(i.A(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e10) {
                    e = e10;
                    try {
                        g.f().e("Failed to fetch cached settings", e);
                        i.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        i.f(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                g.f().i("Settings file does not exist.");
                jSONObject = null;
            }
            i.f(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
            g.f().e("Failed to fetch cached settings", e);
            i.f(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            i.f(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j10, JSONObject jSONObject) {
        g.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j10);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    i.f(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    try {
                        g.f().e("Failed to cache settings", e);
                        i.f(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        i.f(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    i.f(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                g.f().e("Failed to cache settings", e);
                i.f(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
