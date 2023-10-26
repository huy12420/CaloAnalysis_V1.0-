package com.bvtech.common;
import android.os.Environment;

public class Utils {
    private static final String TAG = Utils.class.getSimpleName();

    public static String getDCIMDirectory() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();
    }

}
