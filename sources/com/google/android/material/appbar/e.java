package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import e3.b;
import e3.f;

class e {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f6871a = {16843848};

    static void a(View view, float f10) {
        int integer = view.getResources().getInteger(f.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = (long) integer;
        stateListAnimator.addState(new int[]{16842766, b.state_liftable, -b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j10));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f10}).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}