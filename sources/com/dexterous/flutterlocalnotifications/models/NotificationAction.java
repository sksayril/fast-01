package com.dexterous.flutterlocalnotifications.models;

import android.graphics.Color;
import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Keep
public class NotificationAction implements Serializable {
    private static final String ALLOW_GENERATED_REPLIES = "allowGeneratedReplies";
    private static final String CANCEL_NOTIFICATION = "cancelNotification";
    private static final String CONTEXTUAL = "contextual";
    private static final String ICON = "icon";
    private static final String ICON_SOURCE = "iconBitmapSource";
    private static final String ID = "id";
    private static final String INPUTS = "inputs";
    private static final String SHOWS_USER_INTERFACE = "showsUserInterface";
    private static final String TITLE = "title";
    private static final String TITLE_COLOR_ALPHA = "titleColorAlpha";
    private static final String TITLE_COLOR_BLUE = "titleColorBlue";
    private static final String TITLE_COLOR_GREEN = "titleColorGreen";
    private static final String TITLE_COLOR_RED = "titleColorRed";
    public final List<a> actionInputs = new ArrayList();
    public final Boolean allowGeneratedReplies;
    public final Boolean cancelNotification;
    public final Boolean contextual;
    public final String icon;
    public final IconSource iconSource;
    public final String id;
    public final Boolean showsUserInterface;
    public final String title;
    public final Integer titleColor;

    public static class a implements Serializable {

        /* renamed from: m  reason: collision with root package name */
        public final List<String> f4857m;

        /* renamed from: n  reason: collision with root package name */
        public final Boolean f4858n;

        /* renamed from: o  reason: collision with root package name */
        public final String f4859o;

        /* renamed from: p  reason: collision with root package name */
        public final List<String> f4860p;

        public a(List<String> list, Boolean bool, String str, List<String> list2) {
            this.f4857m = list;
            this.f4858n = bool;
            this.f4859o = str;
            this.f4860p = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            List<String> list = this.f4857m;
            if (list == null ? aVar.f4857m != null : !list.equals(aVar.f4857m)) {
                return false;
            }
            Boolean bool = this.f4858n;
            if (bool == null ? aVar.f4858n != null : !bool.equals(aVar.f4858n)) {
                return false;
            }
            String str = this.f4859o;
            if (str == null ? aVar.f4859o != null : !str.equals(aVar.f4859o)) {
                return false;
            }
            List<String> list2 = this.f4860p;
            List<String> list3 = aVar.f4860p;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            List<String> list = this.f4857m;
            int i10 = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            Boolean bool = this.f4858n;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            String str = this.f4859o;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            List<String> list2 = this.f4860p;
            if (list2 != null) {
                i10 = list2.hashCode();
            }
            return hashCode3 + i10;
        }
    }

    public NotificationAction(Map<String, Object> map) {
        List<Map> list;
        Class<String> cls = String.class;
        this.id = (String) map.get(ID);
        this.cancelNotification = (Boolean) map.get(CANCEL_NOTIFICATION);
        this.title = (String) map.get(TITLE);
        Integer num = (Integer) map.get(TITLE_COLOR_ALPHA);
        Integer num2 = (Integer) map.get(TITLE_COLOR_RED);
        Integer num3 = (Integer) map.get(TITLE_COLOR_GREEN);
        Integer num4 = (Integer) map.get(TITLE_COLOR_BLUE);
        if (num == null || num2 == null || num3 == null || num4 == null) {
            this.titleColor = null;
        } else {
            this.titleColor = Integer.valueOf(Color.argb(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue()));
        }
        this.icon = (String) map.get(ICON);
        this.contextual = (Boolean) map.get(CONTEXTUAL);
        this.showsUserInterface = (Boolean) map.get(SHOWS_USER_INTERFACE);
        this.allowGeneratedReplies = (Boolean) map.get(ALLOW_GENERATED_REPLIES);
        Integer num5 = (Integer) map.get(ICON_SOURCE);
        if (num5 != null) {
            this.iconSource = IconSource.values()[num5.intValue()];
        } else {
            this.iconSource = null;
        }
        if (map.get(INPUTS) != null && (list = (List) map.get(INPUTS)) != null) {
            for (Map map2 : list) {
                this.actionInputs.add(new a(castList(cls, (Collection) map2.get("choices")), (Boolean) map2.get("allowFreeFormInput"), (String) map2.get("label"), castList(cls, (Collection) map2.get("allowedMimeTypes"))));
            }
        }
    }

    public static <T> List<T> castList(Class<? extends T> cls, Collection<?> collection) {
        if (collection == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object cast : collection) {
            try {
                arrayList.add(cls.cast(cast));
            } catch (ClassCastException unused) {
            }
        }
        return arrayList;
    }
}
