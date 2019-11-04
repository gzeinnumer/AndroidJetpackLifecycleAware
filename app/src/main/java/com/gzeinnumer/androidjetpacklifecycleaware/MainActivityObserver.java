package com.gzeinnumer.androidjetpacklifecycleaware;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivityObserver implements LifecycleObserver {
    private static final String TAG = "MainActivity";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateEvent() {
        Log.i(TAG, "onCreateEvent: Observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartEvent() {
        Log.i(TAG, "onStartEvent: Observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResumeEvent() {
        Log.i(TAG, "onResumeEvent: Observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPauseEvent() {
        Log.i(TAG, "onPauseEvent: Observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopEvent() {
        Log.i(TAG, "onStopEvent: Observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroyEvent() {
        Log.i(TAG, "onDestroyEvent: Observer");
    }

}
