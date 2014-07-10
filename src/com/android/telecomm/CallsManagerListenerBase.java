/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.telecomm;

import android.net.Uri;
import android.telecomm.CallAudioState;
import android.telecomm.CallServiceDescriptor;
import android.telecomm.CallState;
import android.telecomm.StatusHints;

/**
 * Provides a default implementation for listeners of CallsManager.
 */
class CallsManagerListenerBase implements CallsManager.CallsManagerListener {
    @Override
    public void onCallAdded(Call call) {
    }

    @Override
    public void onCallRemoved(Call call) {
    }

    @Override
    public void onCallStateChanged(Call call, CallState oldState, CallState newState) {
    }

    @Override
    public void onConnectionServiceChanged(
            Call call,
            ConnectionServiceWrapper oldService,
            ConnectionServiceWrapper newService) {
    }

    @Override
    public void onIncomingCallAnswered(Call call) {
    }

    @Override
    public void onIncomingCallRejected(Call call, boolean rejectWithMessage, String textMessage) {
    }

    @Override
    public void onForegroundCallChanged(Call oldForegroundCall, Call newForegroundCall) {
    }

    @Override
    public void onAudioStateChanged(CallAudioState oldAudioState, CallAudioState newAudioState) {
    }

    @Override
    public void onRequestingRingback(Call call, boolean ringback) {
    }

    @Override
    public void onCallCapabilitiesChanged(Call call) {
    }

    @Override
    public void onIsConferencedChanged(Call call) {
    }

    @Override
    public void onCannedSmsResponsesLoaded(Call call) {
    }

    @Override
    public void onCallVideoProviderChanged(Call call) {
    }

    @Override
    public void onFeaturesChanged(Call call) {
    }

    @Override
    public void onAudioModeIsVoipChanged(Call call) {
    }

    @Override
    public void onStatusHintsChanged(Call call) {
    }
}
