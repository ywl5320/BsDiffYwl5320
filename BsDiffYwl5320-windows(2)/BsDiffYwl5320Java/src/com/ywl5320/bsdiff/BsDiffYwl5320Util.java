package com.ywl5320.bsdiff;

/**
 * Created by ywl on 2017-10-23.
 */
public class BsDiffYwl5320Util {

    private static BsDiffYwl5320Util instance = new BsDiffYwl5320Util();

    public BsDiffYwl5320Util(){}

    public static BsDiffYwl5320Util getInstance()
    {
        return instance;
    }

    static
    {
        System.loadLibrary("BsDiffYwl5320");
    }


    public native int bsDiffFile(String oldFile, String newFile, String patchFile);

}
