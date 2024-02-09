package com.dexterous.flutterlocalnotifications;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.app.l;
import androidx.core.app.o;
import androidx.core.app.p;
import androidx.core.app.r;
import androidx.core.graphics.drawable.IconCompat;
import c7.a;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;
import com.dexterous.flutterlocalnotifications.models.DateTimeComponents;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelGroupDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationStyle;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import com.dexterous.flutterlocalnotifications.models.ScheduledNotificationRepeatFrequency;
import com.dexterous.flutterlocalnotifications.models.SoundSource;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.dexterous.flutterlocalnotifications.utils.BooleanUtils;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import com.google.gson.f;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k7.j;
import k7.k;
import k7.n;
import k7.p;

@Keep
public class FlutterLocalNotificationsPlugin implements k.c, n, p, c7.a, d7.a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ACTION_ID = "actionId";
    private static final String ARE_NOTIFICATIONS_ENABLED_METHOD = "areNotificationsEnabled";
    private static final String CALLBACK_HANDLE = "callback_handle";
    private static final String CANCEL_ALL_METHOD = "cancelAll";
    private static final String CANCEL_ID = "id";
    private static final String CANCEL_METHOD = "cancel";
    static final String CANCEL_NOTIFICATION = "cancelNotification";
    private static final String CANCEL_TAG = "tag";
    private static final String CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD = "canScheduleExactNotifications";
    private static final String CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD = "createNotificationChannelGroup";
    private static final String CREATE_NOTIFICATION_CHANNEL_METHOD = "createNotificationChannel";
    private static final String DEFAULT_ICON = "defaultIcon";
    private static final String DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD = "deleteNotificationChannelGroup";
    private static final String DELETE_NOTIFICATION_CHANNEL_METHOD = "deleteNotificationChannel";
    private static final String DISPATCHER_HANDLE = "dispatcher_handle";
    private static final String DRAWABLE = "drawable";
    private static final String EXACT_ALARMS_PERMISSION_ERROR_CODE = "exact_alarms_not_permitted";
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE = "Android version must be 6.0 or newer to use getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATIONS_METHOD = "getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE = "getActiveNotificationMessagingStyleError";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD = "getActiveNotificationMessagingStyle";
    private static final String GET_CALLBACK_HANDLE_METHOD = "getCallbackHandle";
    private static final String GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD = "getNotificationAppLaunchDetails";
    private static final String GET_NOTIFICATION_CHANNELS_ERROR_CODE = "getNotificationChannelsError";
    private static final String GET_NOTIFICATION_CHANNELS_METHOD = "getNotificationChannels";
    private static final String INITIALIZE_METHOD = "initialize";
    private static final String INPUT = "input";
    private static final String INPUT_RESULT = "FlutterLocalNotificationsPluginInputResult";
    private static final String INVALID_BIG_PICTURE_ERROR_CODE = "invalid_big_picture";
    private static final String INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a drawable resource to your Android head project.";
    private static final String INVALID_ICON_ERROR_CODE = "invalid_icon";
    private static final String INVALID_LARGE_ICON_ERROR_CODE = "invalid_large_icon";
    private static final String INVALID_LED_DETAILS_ERROR_CODE = "invalid_led_details";
    private static final String INVALID_LED_DETAILS_ERROR_MESSAGE = "Must specify both ledOnMs and ledOffMs to configure the blink cycle on older versions of Android before Oreo";
    private static final String INVALID_RAW_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a raw resource to your Android head project.";
    private static final String INVALID_SOUND_ERROR_CODE = "invalid_sound";
    private static final String METHOD_CHANNEL = "dexterous.com/flutter/local_notifications";
    static String NOTIFICATION_DETAILS = "notificationDetails";
    static final String NOTIFICATION_ID = "notificationId";
    private static final String NOTIFICATION_LAUNCHED_APP = "notificationLaunchedApp";
    static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 1;
    private static final String NOTIFICATION_RESPONSE_TYPE = "notificationResponseType";
    static final String PAYLOAD = "payload";
    private static final String PENDING_NOTIFICATION_REQUESTS_METHOD = "pendingNotificationRequests";
    private static final String PERIODICALLY_SHOW_METHOD = "periodicallyShow";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE = "permissionRequestInProgress";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE = "Another permission request is already in progress";
    private static final String REQUEST_PERMISSION_METHOD = "requestPermission";
    private static final String SCHEDULED_NOTIFICATIONS = "scheduled_notifications";
    private static final String SELECT_FOREGROUND_NOTIFICATION_ACTION = "SELECT_FOREGROUND_NOTIFICATION";
    private static final String SELECT_NOTIFICATION = "SELECT_NOTIFICATION";
    private static final String SHARED_PREFERENCES_KEY = "notification_plugin_cache";
    private static final String SHOW_METHOD = "show";
    private static final String START_FOREGROUND_SERVICE = "startForegroundService";
    private static final String STOP_FOREGROUND_SERVICE = "stopForegroundService";
    private static final String TAG = "FLTLocalNotifPlugin";
    private static final String UNSUPPORTED_OS_VERSION_ERROR_CODE = "unsupported_os_version";
    private static final String ZONED_SCHEDULE_METHOD = "zonedSchedule";
    static com.google.gson.e gson;
    private Context applicationContext;
    private c callback;
    private k channel;
    private Activity mainActivity;
    private boolean permissionRequestInProgress = false;

    class a extends m5.a<ArrayList<NotificationDetails>> {
        a() {
        }
    }

    class b implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f4844a;

        b(k.d dVar) {
            this.f4844a = dVar;
        }

        public void a(String str) {
            this.f4844a.b(FlutterLocalNotificationsPlugin.PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE, str, (Object) null);
        }

        public void b(boolean z9) {
            this.f4844a.a(Boolean.valueOf(z9));
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4846a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f4847b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f4848c;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|36|37|38|(3:39|40|42)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009c */
        static {
            /*
                com.dexterous.flutterlocalnotifications.models.NotificationStyle[] r0 = com.dexterous.flutterlocalnotifications.models.NotificationStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4848c = r0
                r1 = 1
                com.dexterous.flutterlocalnotifications.models.NotificationStyle r2 = com.dexterous.flutterlocalnotifications.models.NotificationStyle.BigPicture     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4848c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.dexterous.flutterlocalnotifications.models.NotificationStyle r3 = com.dexterous.flutterlocalnotifications.models.NotificationStyle.BigText     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f4848c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.dexterous.flutterlocalnotifications.models.NotificationStyle r4 = com.dexterous.flutterlocalnotifications.models.NotificationStyle.Inbox     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f4848c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.dexterous.flutterlocalnotifications.models.NotificationStyle r5 = com.dexterous.flutterlocalnotifications.models.NotificationStyle.Messaging     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f4848c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.dexterous.flutterlocalnotifications.models.NotificationStyle r6 = com.dexterous.flutterlocalnotifications.models.NotificationStyle.Media     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.dexterous.flutterlocalnotifications.models.IconSource[] r5 = com.dexterous.flutterlocalnotifications.models.IconSource.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f4847b = r5
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.DrawableResource     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r5 = f4847b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.BitmapFilePath     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r5 = f4847b     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.ContentUri     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r5 = f4847b     // Catch:{ NoSuchFieldError -> 0x006d }
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.FlutterBitmapAsset     // Catch:{ NoSuchFieldError -> 0x006d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r5 = f4847b     // Catch:{ NoSuchFieldError -> 0x0077 }
                com.dexterous.flutterlocalnotifications.models.IconSource r6 = com.dexterous.flutterlocalnotifications.models.IconSource.ByteArray     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                com.dexterous.flutterlocalnotifications.models.RepeatInterval[] r4 = com.dexterous.flutterlocalnotifications.models.RepeatInterval.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f4846a = r4
                com.dexterous.flutterlocalnotifications.models.RepeatInterval r5 = com.dexterous.flutterlocalnotifications.models.RepeatInterval.EveryMinute     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r1 = f4846a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.dexterous.flutterlocalnotifications.models.RepeatInterval r4 = com.dexterous.flutterlocalnotifications.models.RepeatInterval.Hourly     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = f4846a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.dexterous.flutterlocalnotifications.models.RepeatInterval r1 = com.dexterous.flutterlocalnotifications.models.RepeatInterval.Daily     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f4846a     // Catch:{ NoSuchFieldError -> 0x00a6 }
                com.dexterous.flutterlocalnotifications.models.RepeatInterval r1 = com.dexterous.flutterlocalnotifications.models.RepeatInterval.Weekly     // Catch:{ NoSuchFieldError -> 0x00a6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a6 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00a6 }
            L_0x00a6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin.c.<clinit>():void");
        }
    }

    private static class d extends e {
        public d() {
            super(FlutterLocalNotificationsPlugin.EXACT_ALARMS_PERMISSION_ERROR_CODE, "Exact alarms are not permitted");
        }
    }

    private static class e extends RuntimeException {

        /* renamed from: m  reason: collision with root package name */
        public final String f4849m;

        e(String str, String str2) {
            super(str2);
            this.f4849m = str;
        }
    }

    private static void applyGrouping(NotificationDetails notificationDetails, l.e eVar) {
        boolean z9;
        if (!StringUtils.isNullOrEmpty(notificationDetails.groupKey).booleanValue()) {
            eVar.x(notificationDetails.groupKey);
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (BooleanUtils.getValue(notificationDetails.setAsGroupSummary)) {
                eVar.z(true);
            }
            eVar.y(notificationDetails.groupAlertBehavior.intValue());
        }
    }

    private void areNotificationsEnabled(k.d dVar) {
        dVar.a(Boolean.valueOf(getNotificationManager(this.applicationContext).a()));
    }

    static com.google.gson.e buildGson() {
        if (gson == null) {
            gson = new f().c(ScheduleMode.class, new ScheduleMode.a()).d(RuntimeTypeAdapterFactory.of(StyleInformation.class).registerSubtype(DefaultStyleInformation.class).registerSubtype(BigTextStyleInformation.class).registerSubtype(BigPictureStyleInformation.class).registerSubtype(InboxStyleInformation.class).registerSubtype(MessagingStyleInformation.class)).b();
        }
        return gson;
    }

    private static androidx.core.app.p buildPerson(Context context, PersonDetails personDetails) {
        IconSource iconSource;
        if (personDetails == null) {
            return null;
        }
        p.b bVar = new p.b();
        bVar.b(BooleanUtils.getValue(personDetails.bot));
        Object obj = personDetails.icon;
        if (!(obj == null || (iconSource = personDetails.iconBitmapSource) == null)) {
            bVar.c(getIconFromSource(context, obj, iconSource));
        }
        bVar.d(BooleanUtils.getValue(personDetails.important));
        String str = personDetails.key;
        if (str != null) {
            bVar.e(str);
        }
        String str2 = personDetails.name;
        if (str2 != null) {
            bVar.f(str2);
        }
        String str3 = personDetails.uri;
        if (str3 != null) {
            bVar.g(str3);
        }
        return bVar.a();
    }

    private static long calculateNextNotificationTrigger(long j10, long j11) {
        while (j10 < System.currentTimeMillis()) {
            j10 += j11;
        }
        return j10;
    }

    private static long calculateRepeatIntervalMilliseconds(NotificationDetails notificationDetails) {
        int i10 = c.f4846a[notificationDetails.repeatInterval.ordinal()];
        if (i10 == 1) {
            return 60000;
        }
        if (i10 == 2) {
            return 3600000;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 604800000;
        }
        return 86400000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r3.channelAction;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean canCreateNotificationChannel(android.content.Context r2, com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x002e
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            java.lang.String r0 = r3.id
            android.app.NotificationChannel r2 = r2.getNotificationChannel(r0)
            if (r2 != 0) goto L_0x001e
            com.dexterous.flutterlocalnotifications.models.NotificationChannelAction r0 = r3.channelAction
            if (r0 == 0) goto L_0x0026
            com.dexterous.flutterlocalnotifications.models.NotificationChannelAction r1 = com.dexterous.flutterlocalnotifications.models.NotificationChannelAction.CreateIfNotExists
            if (r0 == r1) goto L_0x0026
        L_0x001e:
            if (r2 == 0) goto L_0x0028
            com.dexterous.flutterlocalnotifications.models.NotificationChannelAction r2 = r3.channelAction
            com.dexterous.flutterlocalnotifications.models.NotificationChannelAction r3 = com.dexterous.flutterlocalnotifications.models.NotificationChannelAction.Update
            if (r2 != r3) goto L_0x0028
        L_0x0026:
            r2 = 1
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L_0x002e:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin.canCreateNotificationChannel(android.content.Context, com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails):java.lang.Boolean");
    }

    private void cancel(j jVar, k.d dVar) {
        Map map = (Map) jVar.b();
        cancelNotification((Integer) map.get(CANCEL_ID), (String) map.get(CANCEL_TAG));
        dVar.a((Object) null);
    }

    private void cancelAllNotifications(k.d dVar) {
        getNotificationManager(this.applicationContext).d();
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (loadScheduledNotifications == null || loadScheduledNotifications.isEmpty()) {
            dVar.a((Object) null);
            return;
        }
        Intent intent = new Intent(this.applicationContext, ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, it.next().id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        dVar.a((Object) null);
    }

    private void cancelNotification(Integer num, String str) {
        getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, num.intValue(), new Intent(this.applicationContext, ScheduledNotificationReceiver.class)));
        o notificationManager = getNotificationManager(this.applicationContext);
        if (str == null) {
            notificationManager.b(num.intValue());
        } else {
            notificationManager.c(str, num.intValue());
        }
        removeNotificationFromCache(this.applicationContext, num);
    }

    private static byte[] castObjectToByteArray(Object obj) {
        if (!(obj instanceof ArrayList)) {
            return (byte[]) obj;
        }
        ArrayList arrayList = (ArrayList) obj;
        byte[] bArr = new byte[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            bArr[i10] = (byte) ((Double) arrayList.get(i10)).intValue();
        }
        return bArr;
    }

    private static void checkCanScheduleExactAlarms(AlarmManager alarmManager) {
        if (Build.VERSION.SDK_INT >= 31 && !alarmManager.canScheduleExactAlarms()) {
            throw new d();
        }
    }

    private static l.i.e createMessage(Context context, MessageDetails messageDetails) {
        String str;
        l.i.e eVar = new l.i.e(messageDetails.text, messageDetails.timestamp.longValue(), buildPerson(context, messageDetails.person));
        String str2 = messageDetails.dataUri;
        if (!(str2 == null || (str = messageDetails.dataMimeType) == null)) {
            eVar.j(str, Uri.parse(str2));
        }
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static android.app.Notification createNotification(android.content.Context r16, com.dexterous.flutterlocalnotifications.models.NotificationDetails r17) {
        /*
            r0 = r16
            r1 = r17
            com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails r2 = com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails.fromNotificationDetails(r17)
            java.lang.Boolean r3 = canCreateNotificationChannel(r0, r2)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0015
            setupNotificationChannel(r0, r2)
        L_0x0015:
            android.content.Intent r2 = getLaunchIntent(r16)
            java.lang.String r3 = "SELECT_NOTIFICATION"
            r2.setAction(r3)
            java.lang.Integer r3 = r1.id
            java.lang.String r4 = "notificationId"
            r2.putExtra(r4, r3)
            java.lang.String r3 = r1.payload
            java.lang.String r5 = "payload"
            r2.putExtra(r5, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r7 = 23
            if (r3 < r7) goto L_0x0035
            r3 = 201326592(0xc000000, float:9.8607613E-32)
            goto L_0x0037
        L_0x0035:
            r3 = 134217728(0x8000000, float:3.85186E-34)
        L_0x0037:
            java.lang.Integer r9 = r1.id
            int r9 = r9.intValue()
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r0, r9, r2, r3)
            com.dexterous.flutterlocalnotifications.models.styles.StyleInformation r3 = r1.styleInformation
            com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation r3 = (com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation) r3
            androidx.core.app.l$e r9 = new androidx.core.app.l$e
            java.lang.String r10 = r1.channelId
            r9.<init>(r0, r10)
            java.lang.Boolean r10 = r3.htmlFormatTitle
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x005b
            java.lang.String r10 = r1.title
            android.text.Spanned r10 = fromHtml(r10)
            goto L_0x005d
        L_0x005b:
            java.lang.String r10 = r1.title
        L_0x005d:
            androidx.core.app.l$e r9 = r9.u(r10)
            java.lang.Boolean r3 = r3.htmlFormatBody
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0070
            java.lang.String r3 = r1.body
            android.text.Spanned r3 = fromHtml(r3)
            goto L_0x0072
        L_0x0070:
            java.lang.String r3 = r1.body
        L_0x0072:
            androidx.core.app.l$e r3 = r9.t(r3)
            java.lang.String r9 = r1.ticker
            androidx.core.app.l$e r3 = r3.O(r9)
            java.lang.Boolean r9 = r1.autoCancel
            boolean r9 = com.dexterous.flutterlocalnotifications.utils.BooleanUtils.getValue(r9)
            androidx.core.app.l$e r3 = r3.m(r9)
            androidx.core.app.l$e r3 = r3.s(r2)
            java.lang.Integer r9 = r1.priority
            int r9 = r9.intValue()
            androidx.core.app.l$e r3 = r3.G(r9)
            java.lang.Boolean r9 = r1.ongoing
            boolean r9 = com.dexterous.flutterlocalnotifications.utils.BooleanUtils.getValue(r9)
            androidx.core.app.l$e r3 = r3.E(r9)
            java.lang.Boolean r9 = r1.onlyAlertOnce
            boolean r9 = com.dexterous.flutterlocalnotifications.utils.BooleanUtils.getValue(r9)
            androidx.core.app.l$e r3 = r3.F(r9)
            java.util.List<com.dexterous.flutterlocalnotifications.models.NotificationAction> r9 = r1.actions
            r10 = 0
            if (r9 == 0) goto L_0x01f5
            java.lang.Integer r9 = r1.id
            int r9 = r9.intValue()
            int r9 = r9 * 16
            java.util.List<com.dexterous.flutterlocalnotifications.models.NotificationAction> r12 = r1.actions
            java.util.Iterator r12 = r12.iterator()
        L_0x00bb:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01f5
            java.lang.Object r13 = r12.next()
            com.dexterous.flutterlocalnotifications.models.NotificationAction r13 = (com.dexterous.flutterlocalnotifications.models.NotificationAction) r13
            r14 = 0
            java.lang.String r15 = r13.icon
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 != 0) goto L_0x00da
            com.dexterous.flutterlocalnotifications.models.IconSource r15 = r13.iconSource
            if (r15 == 0) goto L_0x00da
            java.lang.String r14 = r13.icon
            androidx.core.graphics.drawable.IconCompat r14 = getIconFromSource(r0, r14, r15)
        L_0x00da:
            java.lang.Boolean r15 = r13.showsUserInterface
            if (r15 == 0) goto L_0x00eb
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x00eb
            android.content.Intent r15 = getLaunchIntent(r16)
            java.lang.String r6 = "SELECT_FOREGROUND_NOTIFICATION"
            goto L_0x00f4
        L_0x00eb:
            android.content.Intent r15 = new android.content.Intent
            java.lang.Class<com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver> r6 = com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.class
            r15.<init>(r0, r6)
            java.lang.String r6 = "com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED"
        L_0x00f4:
            r15.setAction(r6)
            java.lang.Integer r6 = r1.id
            android.content.Intent r6 = r15.putExtra(r4, r6)
            java.lang.String r8 = r13.id
            java.lang.String r11 = "actionId"
            android.content.Intent r6 = r6.putExtra(r11, r8)
            java.lang.Boolean r8 = r13.cancelNotification
            java.lang.String r11 = "cancelNotification"
            android.content.Intent r6 = r6.putExtra(r11, r8)
            java.lang.String r8 = r1.payload
            r6.putExtra(r5, r8)
            java.util.List<com.dexterous.flutterlocalnotifications.models.NotificationAction$a> r6 = r13.actionInputs
            if (r6 == 0) goto L_0x0126
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x011d
            goto L_0x0126
        L_0x011d:
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 31
            if (r6 < r8) goto L_0x012d
            r6 = 167772160(0xa000000, float:6.162976E-33)
            goto L_0x012f
        L_0x0126:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r7) goto L_0x012d
            r6 = 201326592(0xc000000, float:9.8607613E-32)
            goto L_0x012f
        L_0x012d:
            r6 = 134217728(0x8000000, float:3.85186E-34)
        L_0x012f:
            java.lang.Boolean r8 = r13.showsUserInterface
            if (r8 == 0) goto L_0x0140
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0140
            int r8 = r9 + 1
            android.app.PendingIntent r6 = android.app.PendingIntent.getActivity(r0, r9, r15, r6)
            goto L_0x0146
        L_0x0140:
            int r8 = r9 + 1
            android.app.PendingIntent r6 = android.app.PendingIntent.getBroadcast(r0, r9, r15, r6)
        L_0x0146:
            r9 = r8
            android.text.SpannableString r8 = new android.text.SpannableString
            java.lang.String r11 = r13.title
            r8.<init>(r11)
            java.lang.Integer r11 = r13.titleColor
            if (r11 == 0) goto L_0x0164
            android.text.style.ForegroundColorSpan r11 = new android.text.style.ForegroundColorSpan
            java.lang.Integer r15 = r13.titleColor
            int r15 = r15.intValue()
            r11.<init>(r15)
            int r15 = r8.length()
            r8.setSpan(r11, r10, r15, r10)
        L_0x0164:
            androidx.core.app.l$a$a r11 = new androidx.core.app.l$a$a
            r11.<init>(r14, r8, r6)
            java.lang.Boolean r6 = r13.contextual
            if (r6 == 0) goto L_0x0174
            boolean r6 = r6.booleanValue()
            r11.e(r6)
        L_0x0174:
            java.lang.Boolean r6 = r13.showsUserInterface
            if (r6 == 0) goto L_0x017f
            boolean r6 = r6.booleanValue()
            r11.f(r6)
        L_0x017f:
            java.lang.Boolean r6 = r13.allowGeneratedReplies
            if (r6 == 0) goto L_0x018a
            boolean r6 = r6.booleanValue()
            r11.d(r6)
        L_0x018a:
            java.util.List<com.dexterous.flutterlocalnotifications.models.NotificationAction$a> r6 = r13.actionInputs
            if (r6 == 0) goto L_0x01ea
            java.util.Iterator r6 = r6.iterator()
        L_0x0192:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x01ea
            java.lang.Object r8 = r6.next()
            com.dexterous.flutterlocalnotifications.models.NotificationAction$a r8 = (com.dexterous.flutterlocalnotifications.models.NotificationAction.a) r8
            androidx.core.app.r$d r13 = new androidx.core.app.r$d
            java.lang.String r14 = "FlutterLocalNotificationsPluginInputResult"
            r13.<init>(r14)
            java.lang.String r14 = r8.f4859o
            androidx.core.app.r$d r13 = r13.e(r14)
            java.lang.Boolean r14 = r8.f4858n
            if (r14 == 0) goto L_0x01b6
            boolean r14 = r14.booleanValue()
            r13.c(r14)
        L_0x01b6:
            java.util.List<java.lang.String> r14 = r8.f4860p
            if (r14 == 0) goto L_0x01d1
            java.util.Iterator r14 = r14.iterator()
        L_0x01be:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x01d1
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            r7 = 1
            r13.b(r15, r7)
            r7 = 23
            goto L_0x01be
        L_0x01d1:
            java.util.List<java.lang.String> r7 = r8.f4857m
            if (r7 == 0) goto L_0x01e0
            java.lang.CharSequence[] r8 = new java.lang.CharSequence[r10]
            java.lang.Object[] r7 = r7.toArray(r8)
            java.lang.CharSequence[] r7 = (java.lang.CharSequence[]) r7
            r13.d(r7)
        L_0x01e0:
            androidx.core.app.r r7 = r13.a()
            r11.a(r7)
            r7 = 23
            goto L_0x0192
        L_0x01ea:
            androidx.core.app.l$a r6 = r11.b()
            r3.b(r6)
            r7 = 23
            goto L_0x00bb
        L_0x01f5:
            setSmallIcon(r0, r1, r3)
            java.lang.Object r4 = r1.largeIcon
            com.dexterous.flutterlocalnotifications.models.BitmapSource r5 = r1.largeIconBitmapSource
            android.graphics.Bitmap r4 = getBitmapFromSource(r0, r4, r5)
            r3.A(r4)
            java.lang.Integer r4 = r1.color
            if (r4 == 0) goto L_0x020e
            int r4 = r4.intValue()
            r3.q(r4)
        L_0x020e:
            java.lang.Boolean r4 = r1.colorized
            if (r4 == 0) goto L_0x0219
            boolean r4 = r4.booleanValue()
            r3.r(r4)
        L_0x0219:
            java.lang.Boolean r4 = r1.showWhen
            if (r4 == 0) goto L_0x0224
            boolean r4 = com.dexterous.flutterlocalnotifications.utils.BooleanUtils.getValue(r4)
            r3.J(r4)
        L_0x0224:
            java.lang.Long r4 = r1.when
            if (r4 == 0) goto L_0x022f
            long r4 = r4.longValue()
            r3.T(r4)
        L_0x022f:
            java.lang.Boolean r4 = r1.usesChronometer
            if (r4 == 0) goto L_0x023a
            boolean r4 = r4.booleanValue()
            r3.Q(r4)
        L_0x023a:
            java.lang.Boolean r4 = r1.chronometerCountDown
            if (r4 == 0) goto L_0x024b
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r5 < r6) goto L_0x024b
            boolean r4 = r4.booleanValue()
            r3.p(r4)
        L_0x024b:
            java.lang.Boolean r4 = r1.fullScreenIntent
            boolean r4 = com.dexterous.flutterlocalnotifications.utils.BooleanUtils.getValue(r4)
            if (r4 == 0) goto L_0x0257
            r4 = 1
            r3.w(r2, r4)
        L_0x0257:
            java.lang.String r2 = r1.shortcutId
            java.lang.Boolean r2 = com.dexterous.flutterlocalnotifications.utils.StringUtils.isNullOrEmpty(r2)
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0268
            java.lang.String r2 = r1.shortcutId
            r3.I(r2)
        L_0x0268:
            java.lang.String r2 = r1.subText
            java.lang.Boolean r2 = com.dexterous.flutterlocalnotifications.utils.StringUtils.isNullOrEmpty(r2)
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0279
            java.lang.String r2 = r1.subText
            r3.N(r2)
        L_0x0279:
            java.lang.Integer r2 = r1.number
            if (r2 == 0) goto L_0x0284
            int r2 = r2.intValue()
            r3.D(r2)
        L_0x0284:
            setVisibility(r1, r3)
            applyGrouping(r1, r3)
            setSound(r0, r1, r3)
            setVibrationPattern(r1, r3)
            setLights(r1, r3)
            setStyle(r0, r1, r3)
            setProgress(r1, r3)
            setCategory(r1, r3)
            setTimeoutAfter(r1, r3)
            android.app.Notification r0 = r3.c()
            int[] r1 = r1.additionalFlags
            if (r1 == 0) goto L_0x02b7
            int r2 = r1.length
            if (r2 <= 0) goto L_0x02b7
            int r2 = r1.length
        L_0x02ab:
            if (r10 >= r2) goto L_0x02b7
            r3 = r1[r10]
            int r4 = r0.flags
            r3 = r3 | r4
            r0.flags = r3
            int r10 = r10 + 1
            goto L_0x02ab
        L_0x02b7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin.createNotification(android.content.Context, com.dexterous.flutterlocalnotifications.models.NotificationDetails):android.app.Notification");
    }

    private void createNotificationChannel(j jVar, k.d dVar) {
        setupNotificationChannel(this.applicationContext, NotificationChannelDetails.from((Map) jVar.b()));
        dVar.a((Object) null);
    }

    private void createNotificationChannelGroup(j jVar, k.d dVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            NotificationChannelGroupDetails from = NotificationChannelGroupDetails.from((Map) jVar.b());
            NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
            NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(from.id, from.name);
            if (i10 >= 28) {
                notificationChannelGroup.setDescription(from.description);
            }
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
        dVar.a((Object) null);
    }

    private void deleteNotificationChannel(j jVar, k.d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannel((String) jVar.b());
        }
        dVar.a((Object) null);
    }

    private void deleteNotificationChannelGroup(j jVar, k.d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannelGroup((String) jVar.b());
        }
        dVar.a((Object) null);
    }

    private Map<String, Object> describeIcon(IconCompat iconCompat) {
        String str;
        IconSource iconSource;
        if (iconCompat == null) {
            return null;
        }
        int q9 = iconCompat.q();
        if (q9 == 2) {
            iconSource = IconSource.DrawableResource;
            str = this.applicationContext.getResources().getResourceEntryName(iconCompat.n());
        } else if (q9 != 4) {
            return null;
        } else {
            iconSource = IconSource.ContentUri;
            str = iconCompat.r().toString();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("source", Integer.valueOf(iconSource.ordinal()));
        hashMap.put("data", str);
        return hashMap;
    }

    private Map<String, Object> describePerson(androidx.core.app.p pVar) {
        if (pVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("key", pVar.d());
        hashMap.put("name", pVar.e());
        hashMap.put("uri", pVar.f());
        hashMap.put("bot", Boolean.valueOf(pVar.g()));
        hashMap.put("important", Boolean.valueOf(pVar.h()));
        hashMap.put("icon", describeIcon(pVar.c()));
        return hashMap;
    }

    private NotificationDetails extractNotificationDetails(k.d dVar, Map<String, Object> map) {
        NotificationDetails from = NotificationDetails.from(map);
        if (hasInvalidIcon(dVar, from.icon) || hasInvalidLargeIcon(dVar, from.largeIcon, from.largeIconBitmapSource) || hasInvalidBigPictureResources(dVar, from) || hasInvalidRawSoundResource(dVar, from) || hasInvalidLedDetails(dVar, from)) {
            return null;
        }
        return from;
    }

    static Map<String, Object> extractNotificationResponseMap(Intent intent) {
        int intExtra = intent.getIntExtra(NOTIFICATION_ID, 0);
        HashMap hashMap = new HashMap();
        hashMap.put(NOTIFICATION_ID, Integer.valueOf(intExtra));
        hashMap.put(ACTION_ID, intent.getStringExtra(ACTION_ID));
        hashMap.put(PAYLOAD, intent.getStringExtra(PAYLOAD));
        Bundle j10 = r.j(intent);
        if (j10 != null) {
            hashMap.put(INPUT, j10.getString(INPUT_RESULT));
        }
        if (SELECT_NOTIFICATION.equals(intent.getAction())) {
            hashMap.put(NOTIFICATION_RESPONSE_TYPE, 0);
        }
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            hashMap.put(NOTIFICATION_RESPONSE_TYPE, 1);
        }
        return hashMap;
    }

    private static Spanned fromHtml(String str) {
        if (str == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }

    private void getActiveNotificationMessagingStyle(j jVar, k.d dVar) {
        Notification notification;
        StatusBarNotification statusBarNotification;
        if (Build.VERSION.SDK_INT < 23) {
            dVar.b(UNSUPPORTED_OS_VERSION_ERROR_CODE, "Android version must be 6.0 or newer to use getActiveNotificationMessagingStyle", (Object) null);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        try {
            Map map = (Map) jVar.b();
            int intValue = ((Integer) map.get(CANCEL_ID)).intValue();
            String str = (String) map.get(CANCEL_TAG);
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            int length = activeNotifications.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    notification = null;
                    break;
                }
                statusBarNotification = activeNotifications[i10];
                if (statusBarNotification.getId() != intValue || (str != null && !str.equals(statusBarNotification.getTag()))) {
                    i10++;
                }
            }
            notification = statusBarNotification.getNotification();
            if (notification == null) {
                dVar.a((Object) null);
                return;
            }
            l.i x9 = l.i.x(notification);
            if (x9 == null) {
                dVar.a((Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("groupConversation", Boolean.valueOf(x9.D()));
            hashMap.put("person", describePerson(x9.B()));
            hashMap.put("conversationTitle", x9.z());
            ArrayList arrayList = new ArrayList();
            for (l.i.e next : x9.A()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("text", next.h());
                hashMap2.put("timestamp", Long.valueOf(next.i()));
                hashMap2.put("person", describePerson(next.g()));
                arrayList.add(hashMap2);
            }
            hashMap.put("messages", arrayList);
            dVar.a(hashMap);
        } catch (Throwable th) {
            dVar.b(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE, th.getMessage(), th.getStackTrace());
        }
    }

    private void getActiveNotifications(k.d dVar) {
        if (Build.VERSION.SDK_INT < 23) {
            dVar.b(UNSUPPORTED_OS_VERSION_ERROR_CODE, GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE, (Object) null);
            return;
        }
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.applicationContext.getSystemService("notification")).getActiveNotifications();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                HashMap hashMap = new HashMap();
                hashMap.put(CANCEL_ID, Integer.valueOf(statusBarNotification.getId()));
                Notification notification = statusBarNotification.getNotification();
                if (Build.VERSION.SDK_INT >= 26) {
                    hashMap.put("channelId", notification.getChannelId());
                }
                hashMap.put(CANCEL_TAG, statusBarNotification.getTag());
                hashMap.put("groupKey", notification.getGroup());
                hashMap.put("title", notification.extras.getCharSequence("android.title"));
                hashMap.put("body", notification.extras.getCharSequence("android.text"));
                arrayList.add(hashMap);
            }
            dVar.a(arrayList);
        } catch (Throwable th) {
            dVar.b(UNSUPPORTED_OS_VERSION_ERROR_CODE, th.getMessage(), th.getStackTrace());
        }
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    private static Bitmap getBitmapFromSource(Context context, Object obj, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), getDrawableResourceId(context, (String) obj));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile((String) obj);
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return null;
        }
        byte[] castObjectToByteArray = castObjectToByteArray(obj);
        return BitmapFactory.decodeByteArray(castObjectToByteArray, 0, castObjectToByteArray.length);
    }

    private static PendingIntent getBroadcastPendingIntent(Context context, int i10, Intent intent) {
        return PendingIntent.getBroadcast(context, i10, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
    }

    private void getCallbackHandle(k.d dVar) {
        dVar.a(new l1.a(this.applicationContext).c());
    }

    private static int getDrawableResourceId(Context context, String str) {
        return context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName());
    }

    private static IconCompat getIconFromSource(Context context, Object obj, IconSource iconSource) {
        int i10 = c.f4847b[iconSource.ordinal()];
        if (i10 == 1) {
            return IconCompat.k(context, getDrawableResourceId(context, (String) obj));
        }
        if (i10 == 2) {
            return IconCompat.g(BitmapFactory.decodeFile((String) obj));
        }
        if (i10 == 3) {
            return IconCompat.i((String) obj);
        }
        if (i10 == 4) {
            try {
                AssetFileDescriptor openFd = context.getAssets().openFd(x6.a.e().c().h((String) obj));
                FileInputStream createInputStream = openFd.createInputStream();
                IconCompat g10 = IconCompat.g(BitmapFactory.decodeStream(createInputStream));
                createInputStream.close();
                openFd.close();
                return g10;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } else if (i10 != 5) {
            return null;
        } else {
            byte[] castObjectToByteArray = castObjectToByteArray(obj);
            return IconCompat.j(castObjectToByteArray, 0, castObjectToByteArray.length);
        }
    }

    private static Intent getLaunchIntent(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private HashMap<String, Object> getMappedNotificationChannel(NotificationChannel notificationChannel) {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>();
        if (Build.VERSION.SDK_INT >= 26) {
            hashMap.put(CANCEL_ID, notificationChannel.getId());
            hashMap.put("name", notificationChannel.getName());
            hashMap.put("description", notificationChannel.getDescription());
            hashMap.put("groupId", notificationChannel.getGroup());
            hashMap.put("showBadge", Boolean.valueOf(notificationChannel.canShowBadge()));
            hashMap.put("importance", Integer.valueOf(notificationChannel.getImportance()));
            Uri sound = notificationChannel.getSound();
            if (sound == null) {
                hashMap.put("sound", (Object) null);
                hashMap.put("playSound", Boolean.FALSE);
            } else {
                hashMap.put("playSound", Boolean.TRUE);
                List asList = Arrays.asList(SoundSource.values());
                if (sound.getScheme().equals("android.resource")) {
                    String[] split = sound.toString().split("/");
                    str = split[split.length - 1];
                    Integer tryParseInt = tryParseInt(str);
                    if (tryParseInt == null || (str = this.applicationContext.getResources().getResourceEntryName(tryParseInt.intValue())) != null) {
                        hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.RawResource)));
                    }
                } else {
                    hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.Uri)));
                    str = sound.toString();
                }
                hashMap.put("sound", str);
            }
            hashMap.put("enableVibration", Boolean.valueOf(notificationChannel.shouldVibrate()));
            hashMap.put("vibrationPattern", notificationChannel.getVibrationPattern());
            hashMap.put("enableLights", Boolean.valueOf(notificationChannel.shouldShowLights()));
            hashMap.put("ledColor", Integer.valueOf(notificationChannel.getLightColor()));
        }
        return hashMap;
    }

    private static String getNextFireDate(NotificationDetails notificationDetails) {
        LocalDateTime plusWeeks;
        ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency = notificationDetails.scheduledNotificationRepeatFrequency;
        if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Daily) {
            plusWeeks = LocalDateTime.parse(notificationDetails.scheduledDateTime).plusDays(1);
        } else if (scheduledNotificationRepeatFrequency != ScheduledNotificationRepeatFrequency.Weekly) {
            return null;
        } else {
            plusWeeks = LocalDateTime.parse(notificationDetails.scheduledDateTime).plusWeeks(1);
        }
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(plusWeeks);
    }

    private static String getNextFireDateMatchingDateTimeComponents(NotificationDetails notificationDetails) {
        ZoneId of = ZoneId.of(notificationDetails.timeZoneName);
        ZonedDateTime of2 = ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), of);
        ZonedDateTime now = ZonedDateTime.now(of);
        ZonedDateTime of3 = ZonedDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), of2.getHour(), of2.getMinute(), of2.getSecond(), of2.getNano(), of);
        while (of3.isBefore(now)) {
            of3 = of3.plusDays(1);
        }
        DateTimeComponents dateTimeComponents = notificationDetails.matchDateTimeComponents;
        if (dateTimeComponents != DateTimeComponents.Time) {
            if (dateTimeComponents == DateTimeComponents.DayOfWeekAndTime) {
                while (of3.getDayOfWeek() != of2.getDayOfWeek()) {
                    of3 = of3.plusDays(1);
                }
            } else if (dateTimeComponents == DateTimeComponents.DayOfMonthAndTime) {
                while (of3.getDayOfMonth() != of2.getDayOfMonth()) {
                    of3 = of3.plusDays(1);
                }
            } else if (dateTimeComponents == DateTimeComponents.DateAndTime) {
                while (true) {
                    if (of3.getMonthValue() == of2.getMonthValue() && of3.getDayOfMonth() == of2.getDayOfMonth()) {
                        break;
                    }
                    of3 = of3.plusDays(1);
                }
            } else {
                return null;
            }
        }
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
    }

    private void getNotificationAppLaunchDetails(k.d dVar) {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        Activity activity = this.mainActivity;
        if (activity != null) {
            Intent intent = activity.getIntent();
            Boolean valueOf = Boolean.valueOf(intent != null && (SELECT_NOTIFICATION.equals(intent.getAction()) || SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) && !launchedActivityFromHistory(intent));
            if (valueOf.booleanValue()) {
                hashMap.put("notificationResponse", extractNotificationResponseMap(intent));
            }
            bool = valueOf;
        }
        hashMap.put(NOTIFICATION_LAUNCHED_APP, bool);
        dVar.a(hashMap);
    }

    private void getNotificationChannels(k.d dVar) {
        try {
            List<NotificationChannel> h10 = getNotificationManager(this.applicationContext).h();
            ArrayList arrayList = new ArrayList();
            for (NotificationChannel mappedNotificationChannel : h10) {
                arrayList.add(getMappedNotificationChannel(mappedNotificationChannel));
            }
            dVar.a(arrayList);
        } catch (Throwable th) {
            dVar.b(GET_NOTIFICATION_CHANNELS_ERROR_CODE, th.getMessage(), th.getStackTrace());
        }
    }

    private static o getNotificationManager(Context context) {
        return o.f(context);
    }

    private boolean hasInvalidBigPictureResources(k.d dVar, NotificationDetails notificationDetails) {
        if (notificationDetails.style != NotificationStyle.BigPicture) {
            return false;
        }
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        if (hasInvalidLargeIcon(dVar, bigPictureStyleInformation.largeIcon, bigPictureStyleInformation.largeIconBitmapSource)) {
            return true;
        }
        BitmapSource bitmapSource = bigPictureStyleInformation.bigPictureBitmapSource;
        if (bitmapSource == BitmapSource.DrawableResource) {
            String str = (String) bigPictureStyleInformation.bigPicture;
            return StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, dVar, INVALID_BIG_PICTURE_ERROR_CODE);
        } else if (bitmapSource == BitmapSource.FilePath) {
            return StringUtils.isNullOrEmpty((String) bigPictureStyleInformation.bigPicture).booleanValue();
        } else {
            if (bitmapSource != BitmapSource.ByteArray) {
                return false;
            }
            byte[] bArr = (byte[]) bigPictureStyleInformation.bigPicture;
            return bArr == null || bArr.length == 0;
        }
    }

    private boolean hasInvalidIcon(k.d dVar, String str) {
        return !StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, dVar, INVALID_ICON_ERROR_CODE);
    }

    private boolean hasInvalidLargeIcon(k.d dVar, Object obj, BitmapSource bitmapSource) {
        BitmapSource bitmapSource2 = BitmapSource.DrawableResource;
        if (bitmapSource != bitmapSource2 && bitmapSource != BitmapSource.FilePath) {
            return bitmapSource == BitmapSource.ByteArray && ((byte[]) obj).length == 0;
        }
        String str = (String) obj;
        return !StringUtils.isNullOrEmpty(str).booleanValue() && bitmapSource == bitmapSource2 && !isValidDrawableResource(this.applicationContext, str, dVar, INVALID_LARGE_ICON_ERROR_CODE);
    }

    private boolean hasInvalidLedDetails(k.d dVar, NotificationDetails notificationDetails) {
        if (notificationDetails.ledColor == null) {
            return false;
        }
        if (notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            return false;
        }
        dVar.b(INVALID_LED_DETAILS_ERROR_CODE, INVALID_LED_DETAILS_ERROR_MESSAGE, (Object) null);
        return true;
    }

    private boolean hasInvalidRawSoundResource(k.d dVar, NotificationDetails notificationDetails) {
        SoundSource soundSource;
        if (StringUtils.isNullOrEmpty(notificationDetails.sound).booleanValue() || (((soundSource = notificationDetails.soundSource) != null && soundSource != SoundSource.RawResource) || this.applicationContext.getResources().getIdentifier(notificationDetails.sound, "raw", this.applicationContext.getPackageName()) != 0)) {
            return false;
        }
        dVar.b(INVALID_SOUND_ERROR_CODE, String.format(INVALID_RAW_RESOURCE_ERROR_MESSAGE, new Object[]{notificationDetails.sound}), (Object) null);
        return true;
    }

    private void initialize(j jVar, k.d dVar) {
        String str = (String) ((Map) jVar.b()).get(DEFAULT_ICON);
        if (isValidDrawableResource(this.applicationContext, str, dVar, INVALID_ICON_ERROR_CODE)) {
            Long a10 = m1.a.a(jVar.a(DISPATCHER_HANDLE));
            Long a11 = m1.a.a(jVar.a(CALLBACK_HANDLE));
            if (!(a10 == null || a11 == null)) {
                new l1.a(this.applicationContext).e(a10, a11);
            }
            this.applicationContext.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).edit().putString(DEFAULT_ICON, str).apply();
            dVar.a(Boolean.TRUE);
        }
    }

    private static boolean isValidDrawableResource(Context context, String str, k.d dVar, String str2) {
        if (context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName()) != 0) {
            return true;
        }
        dVar.b(str2, String.format(INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE, new Object[]{str}), (Object) null);
        return false;
    }

    private static boolean launchedActivityFromHistory(Intent intent) {
        return intent != null && (intent.getFlags() & 1048576) == 1048576;
    }

    private static ArrayList<NotificationDetails> loadScheduledNotifications(Context context) {
        ArrayList<NotificationDetails> arrayList = new ArrayList<>();
        String string = context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).getString(SCHEDULED_NOTIFICATIONS, (String) null);
        return string != null ? (ArrayList) buildGson().i(string, new a().e()) : arrayList;
    }

    private void pendingNotificationRequests(k.d dVar) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            HashMap hashMap = new HashMap();
            hashMap.put(CANCEL_ID, next.id);
            hashMap.put("title", next.title);
            hashMap.put("body", next.body);
            hashMap.put(PAYLOAD, next.payload);
            arrayList.add(hashMap);
        }
        dVar.a(arrayList);
    }

    private void processForegroundNotificationAction(Intent intent, Map<String, Object> map) {
        if (intent.getBooleanExtra(CANCEL_NOTIFICATION, false)) {
            o.f(this.applicationContext).b(((Integer) map.get(NOTIFICATION_ID)).intValue());
        }
    }

    static void removeNotificationFromCache(Context context, Integer num) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().id.equals(num)) {
                    it.remove();
                    break;
                }
            } else {
                break;
            }
        }
        saveScheduledNotifications(context, loadScheduledNotifications);
    }

    private void repeat(j jVar, k.d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) jVar.b());
        if (extractNotificationDetails != null) {
            try {
                repeatNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
                dVar.a((Object) null);
            } catch (e e10) {
                dVar.b(e10.f4849m, e10.getMessage(), (Object) null);
            }
        }
    }

    private static void repeatNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        long calculateRepeatIntervalMilliseconds = calculateRepeatIntervalMilliseconds(notificationDetails);
        long longValue = notificationDetails.calledAt.longValue();
        if (notificationDetails.repeatTime != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            instance.set(11, notificationDetails.repeatTime.hour.intValue());
            instance.set(12, notificationDetails.repeatTime.minute.intValue());
            instance.set(13, notificationDetails.repeatTime.second.intValue());
            Integer num = notificationDetails.day;
            if (num != null) {
                instance.set(7, num.intValue());
            }
            longValue = instance.getTimeInMillis();
        }
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(longValue, calculateRepeatIntervalMilliseconds);
        String r9 = buildGson().r(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, r9);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.inexact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, calculateNextNotificationTrigger, broadcastPendingIntent);
        } else {
            alarmManager.setInexactRepeating(0, calculateNextNotificationTrigger, calculateRepeatIntervalMilliseconds, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    static void rescheduleNotifications(Context context) {
        Iterator<NotificationDetails> it = loadScheduledNotifications(context).iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            try {
                if (next.repeatInterval != null) {
                    repeatNotification(context, next, Boolean.FALSE);
                } else if (next.timeZoneName != null) {
                    zonedScheduleNotification(context, next, Boolean.FALSE);
                } else {
                    scheduleNotification(context, next, Boolean.FALSE);
                }
            } catch (d e10) {
                Log.e(TAG, e10.getMessage());
                removeNotificationFromCache(context, next.id);
            }
        }
    }

    private static Uri retrieveSoundResourceUri(Context context, String str, SoundSource soundSource) {
        if (StringUtils.isNullOrEmpty(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource == null || soundSource == SoundSource.RawResource) {
            return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
        } else if (soundSource == SoundSource.Uri) {
            return Uri.parse(str);
        } else {
            return null;
        }
    }

    private static void saveScheduledNotification(Context context, NotificationDetails notificationDetails) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            if (!next.id.equals(notificationDetails.id)) {
                arrayList.add(next);
            }
        }
        arrayList.add(notificationDetails);
        saveScheduledNotifications(context, arrayList);
    }

    private static void saveScheduledNotifications(Context context, ArrayList<NotificationDetails> arrayList) {
        context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).edit().putString(SCHEDULED_NOTIFICATIONS, buildGson().r(arrayList)).apply();
    }

    static void scheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        try {
            if (notificationDetails.scheduledNotificationRepeatFrequency != null) {
                zonedScheduleNextNotification(context, notificationDetails);
            } else if (notificationDetails.matchDateTimeComponents != null) {
                zonedScheduleNextNotificationMatchingDateComponents(context, notificationDetails);
            } else if (notificationDetails.repeatInterval != null) {
                scheduleNextRepeatingNotification(context, notificationDetails);
            } else {
                removeNotificationFromCache(context, notificationDetails.id);
            }
        } catch (d e10) {
            Log.e(TAG, e10.getMessage());
            removeNotificationFromCache(context, notificationDetails.id);
        }
    }

    private static void scheduleNextRepeatingNotification(Context context, NotificationDetails notificationDetails) {
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(notificationDetails.calledAt.longValue(), calculateRepeatIntervalMilliseconds(notificationDetails));
        String r9 = buildGson().r(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, r9);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exactAllowWhileIdle;
        }
        setupAllowWhileIdleAlarm(notificationDetails, alarmManager, calculateNextNotificationTrigger, broadcastPendingIntent);
        saveScheduledNotification(context, notificationDetails);
    }

    private static void scheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String r9 = buildGson().r(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, r9);
        setupAlarm(notificationDetails, getAlarmManager(context), notificationDetails.millisecondsSinceEpoch.longValue(), getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    private Boolean sendNotificationPayloadMessage(Intent intent) {
        if (!SELECT_NOTIFICATION.equals(intent.getAction()) && !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        Map<String, Object> extractNotificationResponseMap = extractNotificationResponseMap(intent);
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            processForegroundNotificationAction(intent, extractNotificationResponseMap);
        }
        this.channel.c("didReceiveNotificationResponse", extractNotificationResponseMap);
        return Boolean.TRUE;
    }

    private void setActivity(Activity activity) {
        this.mainActivity = activity;
    }

    private static void setBigPictureStyle(Context context, NotificationDetails notificationDetails, l.e eVar) {
        Bitmap bitmapFromSource;
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        l.b bVar = new l.b();
        if (bigPictureStyleInformation.contentTitle != null) {
            bVar.A(bigPictureStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigPictureStyleInformation.contentTitle) : bigPictureStyleInformation.contentTitle);
        }
        if (bigPictureStyleInformation.summaryText != null) {
            bVar.B(bigPictureStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigPictureStyleInformation.summaryText) : bigPictureStyleInformation.summaryText);
        }
        if (bigPictureStyleInformation.hideExpandedLargeIcon.booleanValue()) {
            bitmapFromSource = null;
        } else {
            Object obj = bigPictureStyleInformation.largeIcon;
            if (obj != null) {
                bitmapFromSource = getBitmapFromSource(context, obj, bigPictureStyleInformation.largeIconBitmapSource);
            }
            bVar.y(getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource));
            eVar.M(bVar);
        }
        bVar.x(bitmapFromSource);
        bVar.y(getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource));
        eVar.M(bVar);
    }

    private static void setBigTextStyle(NotificationDetails notificationDetails, l.e eVar) {
        BigTextStyleInformation bigTextStyleInformation = (BigTextStyleInformation) notificationDetails.styleInformation;
        l.c cVar = new l.c();
        if (bigTextStyleInformation.bigText != null) {
            cVar.w(bigTextStyleInformation.htmlFormatBigText.booleanValue() ? fromHtml(bigTextStyleInformation.bigText) : bigTextStyleInformation.bigText);
        }
        if (bigTextStyleInformation.contentTitle != null) {
            cVar.x(bigTextStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigTextStyleInformation.contentTitle) : bigTextStyleInformation.contentTitle);
        }
        if (bigTextStyleInformation.summaryText != null) {
            boolean booleanValue = bigTextStyleInformation.htmlFormatSummaryText.booleanValue();
            String str = bigTextStyleInformation.summaryText;
            CharSequence charSequence = str;
            if (booleanValue) {
                charSequence = fromHtml(str);
            }
            cVar.y(charSequence);
        }
        eVar.M(cVar);
    }

    private void setCanScheduleExactNotifications(k.d dVar) {
        dVar.a(Build.VERSION.SDK_INT < 31 ? Boolean.TRUE : Boolean.valueOf(getAlarmManager(this.applicationContext).canScheduleExactAlarms()));
    }

    private static void setCategory(NotificationDetails notificationDetails, l.e eVar) {
        String str = notificationDetails.category;
        if (str != null) {
            eVar.n(str);
        }
    }

    private static void setInboxStyle(NotificationDetails notificationDetails, l.e eVar) {
        InboxStyleInformation inboxStyleInformation = (InboxStyleInformation) notificationDetails.styleInformation;
        l.h hVar = new l.h();
        if (inboxStyleInformation.contentTitle != null) {
            hVar.x(inboxStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(inboxStyleInformation.contentTitle) : inboxStyleInformation.contentTitle);
        }
        if (inboxStyleInformation.summaryText != null) {
            hVar.y(inboxStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(inboxStyleInformation.summaryText) : inboxStyleInformation.summaryText);
        }
        ArrayList<String> arrayList = inboxStyleInformation.lines;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                hVar.w(inboxStyleInformation.htmlFormatLines.booleanValue() ? fromHtml(next) : next);
            }
        }
        eVar.M(hVar);
    }

    private static void setLights(NotificationDetails notificationDetails, l.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.enableLights) && notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            eVar.B(notificationDetails.ledColor.intValue(), notificationDetails.ledOnMs.intValue(), notificationDetails.ledOffMs.intValue());
        }
    }

    private static void setMediaStyle(l.e eVar) {
        eVar.M(new m0.a());
    }

    private static void setMessagingStyle(Context context, NotificationDetails notificationDetails, l.e eVar) {
        MessagingStyleInformation messagingStyleInformation = (MessagingStyleInformation) notificationDetails.styleInformation;
        l.i iVar = new l.i(buildPerson(context, messagingStyleInformation.person));
        iVar.H(BooleanUtils.getValue(messagingStyleInformation.groupConversation));
        String str = messagingStyleInformation.conversationTitle;
        if (str != null) {
            iVar.G(str);
        }
        ArrayList<MessageDetails> arrayList = messagingStyleInformation.messages;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MessageDetails> it = messagingStyleInformation.messages.iterator();
            while (it.hasNext()) {
                iVar.w(createMessage(context, it.next()));
            }
        }
        eVar.M(iVar);
    }

    private static void setProgress(NotificationDetails notificationDetails, l.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.showProgress)) {
            eVar.H(notificationDetails.maxProgress.intValue(), notificationDetails.progress.intValue(), notificationDetails.indeterminate.booleanValue());
        }
    }

    private static void setSmallIcon(Context context, NotificationDetails notificationDetails, l.e eVar) {
        int intValue;
        if (!StringUtils.isNullOrEmpty(notificationDetails.icon).booleanValue()) {
            intValue = getDrawableResourceId(context, notificationDetails.icon);
        } else {
            String string = context.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).getString(DEFAULT_ICON, (String) null);
            intValue = StringUtils.isNullOrEmpty(string).booleanValue() ? notificationDetails.iconResourceId.intValue() : getDrawableResourceId(context, string);
        }
        eVar.K(intValue);
    }

    private static void setSound(Context context, NotificationDetails notificationDetails, l.e eVar) {
        eVar.L(BooleanUtils.getValue(notificationDetails.playSound) ? retrieveSoundResourceUri(context, notificationDetails.sound, notificationDetails.soundSource) : null);
    }

    private static void setStyle(Context context, NotificationDetails notificationDetails, l.e eVar) {
        int i10 = c.f4848c[notificationDetails.style.ordinal()];
        if (i10 == 1) {
            setBigPictureStyle(context, notificationDetails, eVar);
        } else if (i10 == 2) {
            setBigTextStyle(notificationDetails, eVar);
        } else if (i10 == 3) {
            setInboxStyle(notificationDetails, eVar);
        } else if (i10 == 4) {
            setMessagingStyle(context, notificationDetails, eVar);
        } else if (i10 == 5) {
            setMediaStyle(eVar);
        }
    }

    private static void setTimeoutAfter(NotificationDetails notificationDetails, l.e eVar) {
        Long l10 = notificationDetails.timeoutAfter;
        if (l10 != null) {
            eVar.P(l10.longValue());
        }
    }

    private static void setVibrationPattern(NotificationDetails notificationDetails, l.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.enableVibration)) {
            long[] jArr = notificationDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                eVar.R(jArr);
                return;
            }
            return;
        }
        eVar.R(new long[]{0});
    }

    private static void setVisibility(NotificationDetails notificationDetails, l.e eVar) {
        Integer num = notificationDetails.visibility;
        if (num != null) {
            int intValue = num.intValue();
            int i10 = 1;
            if (intValue == 0) {
                i10 = 0;
            } else if (intValue != 1) {
                if (intValue == 2) {
                    i10 = -1;
                } else {
                    throw new IllegalArgumentException("Unknown index: " + notificationDetails.visibility);
                }
            }
            eVar.S(i10);
        }
    }

    private static void setupAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j10, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, j10, pendingIntent);
        } else if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            androidx.core.app.e.c(alarmManager, 0, j10, pendingIntent);
        } else if (notificationDetails.scheduleMode.useAlarmClock()) {
            androidx.core.app.e.a(alarmManager, j10, pendingIntent, pendingIntent);
        } else {
            alarmManager.set(0, j10, pendingIntent);
        }
    }

    private static void setupAllowWhileIdleAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j10, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            androidx.core.app.e.d(alarmManager, 0, j10, pendingIntent);
        } else if (notificationDetails.scheduleMode.useAlarmClock()) {
            androidx.core.app.e.a(alarmManager, j10, pendingIntent, pendingIntent);
        } else {
            androidx.core.app.e.b(alarmManager, 0, j10, pendingIntent);
        }
    }

    private static void setupNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        Integer num;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel(notificationChannelDetails.id, notificationChannelDetails.name, notificationChannelDetails.importance.intValue());
            notificationChannel.setDescription(notificationChannelDetails.description);
            notificationChannel.setGroup(notificationChannelDetails.groupId);
            if (notificationChannelDetails.playSound.booleanValue()) {
                Integer num2 = notificationChannelDetails.audioAttributesUsage;
                notificationChannel.setSound(retrieveSoundResourceUri(context, notificationChannelDetails.sound, notificationChannelDetails.soundSource), new AudioAttributes.Builder().setUsage(Integer.valueOf(num2 != null ? num2.intValue() : 5).intValue()).build());
            } else {
                notificationChannel.setSound((Uri) null, (AudioAttributes) null);
            }
            notificationChannel.enableVibration(BooleanUtils.getValue(notificationChannelDetails.enableVibration));
            long[] jArr = notificationChannelDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                notificationChannel.setVibrationPattern(jArr);
            }
            boolean value = BooleanUtils.getValue(notificationChannelDetails.enableLights);
            notificationChannel.enableLights(value);
            if (value && (num = notificationChannelDetails.ledColor) != null) {
                notificationChannel.setLightColor(num.intValue());
            }
            notificationChannel.setShowBadge(BooleanUtils.getValue(notificationChannelDetails.showBadge));
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private void show(j jVar, k.d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) jVar.b());
        if (extractNotificationDetails != null) {
            showNotification(this.applicationContext, extractNotificationDetails);
            dVar.a((Object) null);
        }
    }

    static void showNotification(Context context, NotificationDetails notificationDetails) {
        Notification createNotification = createNotification(context, notificationDetails);
        o notificationManager = getNotificationManager(context);
        String str = notificationDetails.tag;
        int intValue = notificationDetails.id.intValue();
        if (str != null) {
            notificationManager.j(str, intValue, createNotification);
        } else {
            notificationManager.i(intValue, createNotification);
        }
    }

    private void startForegroundService(j jVar, k.d dVar) {
        String str;
        Map map = (Map) jVar.a("notificationData");
        Integer num = (Integer) jVar.a("startType");
        ArrayList arrayList = (ArrayList) jVar.a("foregroundServiceTypes");
        if (arrayList != null && arrayList.size() == 0) {
            str = "If foregroundServiceTypes is non-null it must not be empty!";
        } else if (map == null || num == null) {
            str = "An argument passed to startForegroundService was null!";
        } else {
            NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, map);
            if (extractNotificationDetails == null) {
                return;
            }
            if (extractNotificationDetails.id.intValue() != 0) {
                b bVar = new b(extractNotificationDetails, num.intValue(), arrayList);
                Intent intent = new Intent(this.applicationContext, a.class);
                intent.putExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", bVar);
                androidx.core.content.a.n(this.applicationContext, intent);
                dVar.a((Object) null);
                return;
            }
            str = "The id of the notification for a foreground service must not be 0!";
        }
        dVar.b("ARGUMENT_ERROR", str, (Object) null);
    }

    private void stopForegroundService(k.d dVar) {
        this.applicationContext.stopService(new Intent(this.applicationContext, a.class));
        dVar.a((Object) null);
    }

    private Integer tryParseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void zonedSchedule(j jVar, k.d dVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(dVar, (Map) jVar.b());
        if (extractNotificationDetails != null) {
            if (extractNotificationDetails.matchDateTimeComponents != null) {
                extractNotificationDetails.scheduledDateTime = getNextFireDateMatchingDateTimeComponents(extractNotificationDetails);
            }
            try {
                zonedScheduleNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
                dVar.a((Object) null);
            } catch (e e10) {
                dVar.b(e10.f4849m, e10.getMessage(), (Object) null);
            }
        }
    }

    private static void zonedScheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        String nextFireDate = getNextFireDate(notificationDetails);
        if (nextFireDate != null) {
            notificationDetails.scheduledDateTime = nextFireDate;
            zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
        }
    }

    private static void zonedScheduleNextNotificationMatchingDateComponents(Context context, NotificationDetails notificationDetails) {
        String nextFireDateMatchingDateTimeComponents = getNextFireDateMatchingDateTimeComponents(notificationDetails);
        if (nextFireDateMatchingDateTimeComponents != null) {
            notificationDetails.scheduledDateTime = nextFireDateMatchingDateTimeComponents;
            zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
        }
    }

    private static void zonedScheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String r9 = buildGson().r(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, r9);
        setupAlarm(notificationDetails, getAlarmManager(context), ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), ZoneId.of(notificationDetails.timeZoneName)).toInstant().toEpochMilli(), getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public void onAttachedToActivity(d7.c cVar) {
        cVar.e(this);
        cVar.b(this);
        Activity d10 = cVar.d();
        this.mainActivity = d10;
        Intent intent = d10.getIntent();
        if (!launchedActivityFromHistory(intent) && SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            processForegroundNotificationAction(intent, extractNotificationResponseMap(intent));
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        this.applicationContext = bVar.a();
        k kVar = new k(bVar.b(), METHOD_CHANNEL);
        this.channel = kVar;
        kVar.e(this);
    }

    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.channel.e((k.c) null);
        this.channel = null;
        this.applicationContext = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f10996a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2096263152:
                if (str.equals(STOP_FOREGROUND_SERVICE)) {
                    c10 = 0;
                    break;
                }
                break;
            case -2041662895:
                if (str.equals(GET_NOTIFICATION_CHANNELS_METHOD)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1873731438:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1367724422:
                if (str.equals(CANCEL_METHOD)) {
                    c10 = 3;
                    break;
                }
                break;
            case -799130106:
                if (str.equals(PENDING_NOTIFICATION_REQUESTS_METHOD)) {
                    c10 = 4;
                    break;
                }
                break;
            case -208611345:
                if (str.equals(GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD)) {
                    c10 = 5;
                    break;
                }
                break;
            case 3529469:
                if (str.equals(SHOW_METHOD)) {
                    c10 = 6;
                    break;
                }
                break;
            case 6625712:
                if (str.equals(PERIODICALLY_SHOW_METHOD)) {
                    c10 = 7;
                    break;
                }
                break;
            case 116003316:
                if (str.equals(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD)) {
                    c10 = 8;
                    break;
                }
                break;
            case 476547271:
                if (str.equals(CANCEL_ALL_METHOD)) {
                    c10 = 9;
                    break;
                }
                break;
            case 548573423:
                if (str.equals(ZONED_SCHEDULE_METHOD)) {
                    c10 = 10;
                    break;
                }
                break;
            case 746581438:
                if (str.equals(REQUEST_PERMISSION_METHOD)) {
                    c10 = 11;
                    break;
                }
                break;
            case 767006947:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c10 = 12;
                    break;
                }
                break;
            case 825311171:
                if (str.equals(GET_CALLBACK_HANDLE_METHOD)) {
                    c10 = 13;
                    break;
                }
                break;
            case 871091088:
                if (str.equals(INITIALIZE_METHOD)) {
                    c10 = 14;
                    break;
                }
                break;
            case 891942317:
                if (str.equals(ARE_NOTIFICATIONS_ENABLED_METHOD)) {
                    c10 = 15;
                    break;
                }
                break;
            case 972029712:
                if (str.equals(CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD)) {
                    c10 = 16;
                    break;
                }
                break;
            case 1008472557:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_METHOD)) {
                    c10 = 17;
                    break;
                }
                break;
            case 1207771056:
                if (str.equals(START_FOREGROUND_SERVICE)) {
                    c10 = 18;
                    break;
                }
                break;
            case 1594833996:
                if (str.equals(GET_ACTIVE_NOTIFICATIONS_METHOD)) {
                    c10 = 19;
                    break;
                }
                break;
            case 1653467900:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_METHOD)) {
                    c10 = 20;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                stopForegroundService(dVar);
                return;
            case 1:
                getNotificationChannels(dVar);
                return;
            case 2:
                deleteNotificationChannelGroup(jVar, dVar);
                return;
            case 3:
                cancel(jVar, dVar);
                return;
            case 4:
                pendingNotificationRequests(dVar);
                return;
            case 5:
                getNotificationAppLaunchDetails(dVar);
                return;
            case 6:
                show(jVar, dVar);
                return;
            case 7:
                repeat(jVar, dVar);
                return;
            case 8:
                getActiveNotificationMessagingStyle(jVar, dVar);
                return;
            case 9:
                cancelAllNotifications(dVar);
                return;
            case 10:
                zonedSchedule(jVar, dVar);
                return;
            case 11:
                requestPermission(new b(dVar));
                return;
            case 12:
                createNotificationChannelGroup(jVar, dVar);
                return;
            case 13:
                getCallbackHandle(dVar);
                return;
            case 14:
                initialize(jVar, dVar);
                return;
            case 15:
                areNotificationsEnabled(dVar);
                return;
            case 16:
                setCanScheduleExactNotifications(dVar);
                return;
            case 17:
                deleteNotificationChannel(jVar, dVar);
                return;
            case 18:
                startForegroundService(jVar, dVar);
                return;
            case 19:
                getActiveNotifications(dVar);
                return;
            case 20:
                createNotificationChannel(jVar, dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }

    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean booleanValue = sendNotificationPayloadMessage(intent).booleanValue();
        if (booleanValue && (activity = this.mainActivity) != null) {
            activity.setIntent(intent);
        }
        return booleanValue;
    }

    public void onReattachedToActivityForConfigChanges(d7.c cVar) {
        cVar.e(this);
        cVar.b(this);
        this.mainActivity = cVar.d();
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.permissionRequestInProgress) {
            boolean z9 = true;
            if (i10 == 1) {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    z9 = false;
                }
                this.callback.b(z9);
                this.permissionRequestInProgress = false;
                return z9;
            }
        }
        return false;
    }

    public void requestPermission(c cVar) {
        if (this.permissionRequestInProgress) {
            cVar.a(PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE);
            return;
        }
        this.callback = cVar;
        if (Build.VERSION.SDK_INT >= 33) {
            if (!(androidx.core.content.a.a(this.mainActivity, "android.permission.POST_NOTIFICATIONS") == 0)) {
                this.permissionRequestInProgress = true;
                androidx.core.app.b.s(this.mainActivity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                return;
            }
            this.callback.b(true);
            this.permissionRequestInProgress = false;
            return;
        }
        this.callback.b(o.f(this.mainActivity).a());
    }
}
