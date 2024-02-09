package j;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class i implements Window.Callback {

    /* renamed from: m  reason: collision with root package name */
    final Window.Callback f10786m;

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f10786m = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.f10786m;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f10786m.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f10786m.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f10786m.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f10786m.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f10786m.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f10786m.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f10786m.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f10786m.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f10786m.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f10786m.onCreatePanelMenu(i10, menu);
    }

    public View onCreatePanelView(int i10) {
        return this.f10786m.onCreatePanelView(i10);
    }

    public void onDetachedFromWindow() {
        this.f10786m.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f10786m.onMenuItemSelected(i10, menuItem);
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return this.f10786m.onMenuOpened(i10, menu);
    }

    public void onPanelClosed(int i10, Menu menu) {
        this.f10786m.onPanelClosed(i10, menu);
    }

    public void onPointerCaptureChanged(boolean z9) {
        this.f10786m.onPointerCaptureChanged(z9);
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f10786m.onPreparePanel(i10, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        this.f10786m.onProvideKeyboardShortcuts(list, menu, i10);
    }

    public boolean onSearchRequested() {
        return this.f10786m.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f10786m.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f10786m.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z9) {
        this.f10786m.onWindowFocusChanged(z9);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f10786m.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f10786m.onWindowStartingActionMode(callback, i10);
    }
}
