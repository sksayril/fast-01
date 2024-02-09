package com.dexterous.flutterlocalnotifications.models.styles;

import androidx.annotation.Keep;

@Keep
public class DefaultStyleInformation extends StyleInformation {
    public Boolean htmlFormatBody;
    public Boolean htmlFormatTitle;

    public DefaultStyleInformation(Boolean bool, Boolean bool2) {
        this.htmlFormatTitle = bool;
        this.htmlFormatBody = bool2;
    }
}
