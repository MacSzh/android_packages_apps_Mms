/*
 * Copyright (C) 2012 The CyanogenMod Project (DvTonder)
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

package com.android.mms.quickmessage;

import android.content.Intent;
import android.net.Uri;
import android.widget.EditText;

import com.android.mms.transaction.MessagingNotification.NotificationInfo;

public class QuickMessage {
    private String mFromName;
    private String[] mFromNumbers;
    private NotificationInfo mContent;
    private String mReplyText;
    private long mTimestamp;
    private String mFromNumber;
    private EditText mEditText = null;

    public QuickMessage(String fromName, String fromNumber, NotificationInfo nInfo) {
        mFromName = fromName;
        mFromNumbers = new String[1];
        mFromNumbers[0] = fromNumber;
        mFromNumber = fromNumber;
        mContent = nInfo;
        mReplyText = "";
        mTimestamp = nInfo.mTimeMillis;
    }

    public void setEditText(EditText object) {
        mEditText = object;
    }

    public EditText getEditText() {
        return mEditText;
    }

    public String getFromName() {
        return mFromName;
    }

    public String[] getFromNumber() {
        return mFromNumbers;
    }
    
    public String getFromNumberm(){
    	return mFromNumber;
    }

    public String getMessageBody() {
        return mContent.mMessage;
    }

    public String getReplyText() {
        return mReplyText;
    }

    public void setReplyText(String reply) {
        mReplyText = reply;
    }

    public void saveReplyText() {
        if (mEditText != null) {
            mReplyText = mEditText.getText().toString();
        }
    }

    public long getTimestamp() {
        return mTimestamp;
    }

    public Intent getViewIntent() {
        return mContent.mClickIntent;
    }

    public long getThreadId() {
        return mContent.mThreadId;
    }
    
    public boolean getMIsSms(){
    	return mContent.mIsSms;
    }
    
    public long getMegId(){
    	return mContent.mSmsId;
    }

}
