package com.google.gson;

public enum t {
    DEFAULT {
        public k serialize(Long l10) {
            return l10 == null ? m.f7529a : new p((Number) l10);
        }
    },
    STRING {
        public k serialize(Long l10) {
            return l10 == null ? m.f7529a : new p(l10.toString());
        }
    };

    public abstract k serialize(Long l10);
}
