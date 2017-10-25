package com.ywl5320.bspatchywl5320;

/**
 * Created by ywl5320 on 2017/10/25.
 */

public class BsPatchYwl5320Util {

    private static BsPatchYwl5320Util instance = new BsPatchYwl5320Util();

    private BsPatchYwl5320Util(){}

    public static BsPatchYwl5320Util getInstance()
    {
        return instance;
    }

    static
    {
        System.loadLibrary("BsPatchYwl5320");
    }

    public native int bsPatch(String oldfile, String newfile, String patchfile);

}
