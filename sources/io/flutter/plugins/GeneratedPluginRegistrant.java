package io.flutter.plugins;

import androidx.annotation.Keep;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import h1.c;
import io.flutter.embedding.engine.a;
import io.flutter.plugins.camera.x;
import io.flutter.plugins.firebase.core.i;
import io.flutter.plugins.firebase.crashlytics.n;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.pathprovider.j;
import k1.q;
import n9.m;
import p6.d;
import s6.c0;
import v6.f;
import x6.b;

@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(a aVar) {
        try {
            aVar.q().a(new m());
        } catch (Exception e10) {
            b.c(TAG, "Error registering plugin audioplayers_android, xyz.luan.audioplayers.AudioplayersPlugin", e10);
        }
        try {
            aVar.q().a(new q6.a());
        } catch (Exception e11) {
            b.c(TAG, "Error registering plugin aws3_bucket, com.lonwolf.aws3_bucket.Aws3BucketPlugin", e11);
        }
        try {
            aVar.q().a(new com.almoullim.background_location.a());
        } catch (Exception e12) {
            b.c(TAG, "Error registering plugin background_location, com.almoullim.background_location.BackgroundLocationPlugin", e12);
        }
        try {
            aVar.q().a(new x());
        } catch (Exception e13) {
            b.c(TAG, "Error registering plugin camera_android, io.flutter.plugins.camera.CameraPlugin", e13);
        }
        try {
            aVar.q().a(new f());
        } catch (Exception e14) {
            b.c(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e14);
        }
        try {
            aVar.q().a(new w6.a());
        } catch (Exception e15) {
            b.c(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e15);
        }
        try {
            aVar.q().a(new i());
        } catch (Exception e16) {
            b.c(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e16);
        }
        try {
            aVar.q().a(new n());
        } catch (Exception e17) {
            b.c(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e17);
        }
        try {
            aVar.q().a(new o6.a());
        } catch (Exception e18) {
            b.c(TAG, "Error registering plugin flutter_keyboard_visibility, com.jrai.flutter_keyboard_visibility.FlutterKeyboardVisibilityPlugin", e18);
        }
        try {
            aVar.q().a(new FlutterLocalNotificationsPlugin());
        } catch (Exception e19) {
            b.c(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e19);
        }
        try {
            aVar.q().a(new b8.a());
        } catch (Exception e20) {
            b.c(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e20);
        }
        try {
            aVar.q().a(new e8.a());
        } catch (Exception e21) {
            b.c(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e21);
        }
        try {
            aVar.q().a(new z0.b());
        } catch (Exception e22) {
            b.c(TAG, "Error registering plugin geocoding_android, com.baseflow.geocoding.GeocodingPlugin", e22);
        }
        try {
            aVar.q().a(new com.baseflow.geolocator.a());
        } catch (Exception e23) {
            b.c(TAG, "Error registering plugin geolocator_android, com.baseflow.geolocator.GeolocatorPlugin", e23);
        }
        try {
            aVar.q().a(new io.flutter.plugins.googlemaps.n());
        } catch (Exception e24) {
            b.c(TAG, "Error registering plugin google_maps_flutter_android, io.flutter.plugins.googlemaps.GoogleMapsPlugin", e24);
        }
        try {
            aVar.q().a(new ImagePickerPlugin());
        } catch (Exception e25) {
            b.c(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e25);
        }
        try {
            aVar.q().a(new com.lyokone.location.b());
        } catch (Exception e26) {
            b.c(TAG, "Error registering plugin location, com.lyokone.location.LocationPlugin", e26);
        }
        try {
            aVar.q().a(new x0.a());
        } catch (Exception e27) {
            b.c(TAG, "Error registering plugin map_launcher, com.alexmiller.map_launcher.MapLauncherPlugin", e27);
        }
        try {
            aVar.q().a(new i1.a());
        } catch (Exception e28) {
            b.c(TAG, "Error registering plugin open_filex, com.crazecoder.openfile.OpenFilePlugin", e28);
        }
        try {
            aVar.q().a(new j());
        } catch (Exception e29) {
            b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e29);
        }
        try {
            aVar.q().a(new g1.m());
        } catch (Exception e30) {
            b.c(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e30);
        }
        try {
            aVar.q().a(new m9.b());
        } catch (Exception e31) {
            b.c(TAG, "Error registering plugin qr_code_scanner, net.touchcapture.qr.flutterqr.FlutterQrPlugin", e31);
        }
        try {
            aVar.q().a(new d());
        } catch (Exception e32) {
            b.c(TAG, "Error registering plugin record, com.llfbandit.record.RecordPlugin", e32);
        }
        try {
            aVar.q().a(new q());
        } catch (Exception e33) {
            b.c(TAG, "Error registering plugin speech_to_text, com.csdcorp.speech_to_text.SpeechToTextPlugin", e33);
        }
        try {
            aVar.q().a(new c0());
        } catch (Exception e34) {
            b.c(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e34);
        }
        try {
            aVar.q().a(new c8.i());
        } catch (Exception e35) {
            b.c(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e35);
        }
        try {
            aVar.q().a(new c());
        } catch (Exception e36) {
            b.c(TAG, "Error registering plugin vibration, com.benjaminabel.vibration.VibrationPlugin", e36);
        }
    }
}
