package com.example.beatbox;

import androidx.annotation.NonNull;

public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;
    private Float mRate;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }
    public String getAssetPath() {
        return mAssetPath;
    }
    public String getName() {
        return mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }
    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }

    public Float getRate() {
        return mRate;
    }
    public void setRate(Float mRate) {
        this.mRate = mRate;
    }

    @NonNull
    @Override
    public String toString() {
        return String.valueOf(mRate);
    }
}
