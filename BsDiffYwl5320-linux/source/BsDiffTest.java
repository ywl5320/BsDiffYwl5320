import com.ywl5320.bsdiff.BsDiffYwl5320Util;

/**
 * Created by ywl on 2017-10-23.
 */
public class BsDiffTest {

    private static String oldFile = "app_old1.apk";
    private static String newFile = "app_new1.apk";
    private static String patchFile = "app_patch1.patch";

    public static void main(String[] args)
    {
        int result = BsDiffYwl5320Util.getInstance().bsDiffFile(oldFile, newFile, patchFile);
        System.out.println("result:" + result);//0:success 1:wrong
    }

}

