package com.amazonaws.services.s3.model;

public class EmailAddressGrantee implements Grantee {

    /* renamed from: m  reason: collision with root package name */
    private String f4412m = null;

    public EmailAddressGrantee(String str) {
        setIdentifier(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.f4412m;
        String str2 = ((EmailAddressGrantee) obj).f4412m;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public String getIdentifier() {
        return this.f4412m;
    }

    public String getTypeIdentifier() {
        return "emailAddress";
    }

    public int hashCode() {
        String str = this.f4412m;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public void setIdentifier(String str) {
        this.f4412m = str;
    }

    public String toString() {
        return this.f4412m;
    }
}
