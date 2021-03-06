// Copyright 2018-2020 Twitter, Inc.
// Licensed under the MoPub SDK License Agreement
// http://www.mopub.com/legal/sdk-license-agreement/

package com.mopub.mobileads.factories;

import androidx.annotation.NonNull;

import com.mopub.common.AdReport;
import com.mopub.mobileads.CustomEventBannerAdapter;
import com.mopub.mobileads.MoPubView;

import java.util.Map;

public class CustomEventBannerAdapterFactory {
    protected static CustomEventBannerAdapterFactory instance = new CustomEventBannerAdapterFactory();

    @Deprecated // for testing
    public static void setInstance(CustomEventBannerAdapterFactory factory) {
        instance = factory;
    }

    public static CustomEventBannerAdapter create(@NonNull MoPubView moPubView,
            @NonNull String className,
            @NonNull Map<String, String> serverExtras,
            long broadcastIdentifier,
            @NonNull AdReport adReport) {
        return instance.internalCreate(moPubView, className, serverExtras, broadcastIdentifier, adReport);
    }

    protected CustomEventBannerAdapter internalCreate(@NonNull MoPubView moPubView,
            @NonNull String className,
            @NonNull Map<String, String> serverExtras,
            long broadcastIdentifier,
            @NonNull AdReport adReport) {
        return new CustomEventBannerAdapter(moPubView, className, serverExtras, broadcastIdentifier, adReport);
    }
}
