package com.example.android.miwok;

/**
 * Created by Єгор Березанський on 13.07.2018.
 */

public class Word {


    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageId= NO_IMAGE_PROVAIDED;
    private int mAudioId;
    private static final int NO_IMAGE_PROVAIDED = -1;


    public Word(String defaultTranslation, String miwokTranslation, int audioID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioId = audioID;

    }

    public Word (String defaultTranslation, String miwokTranslation, int imageId, int audioId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageId = imageId;
        mAudioId = audioId;
    }

    public boolean hasImage() {
        return  mImageId != NO_IMAGE_PROVAIDED;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public int getmImageId() {
        return mImageId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmAudioId() {
        return mAudioId;
    }



    public void setMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;

    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageId=" + mImageId +
                ", mAudioId=" + mAudioId +
                '}';
    }


    }
