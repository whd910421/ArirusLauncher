package com.arirus.ariruslauncher;

import android.util.Log;

/**
 * Created by whd910421 on 16/10/10.
 */

public class arirusLog {
    private static arirusLog sArirusLog;

    public static arirusLog get()
    {
        if (sArirusLog == null)
            sArirusLog = new arirusLog();
        return sArirusLog;
    }

    public void ShowLog(String TAG , String ... args)
    {
        String tmp = "";
        for (String arg:args)
        {
            tmp += arg + "   ";
        }
        Log.e("#ARIRUSLOG " + TAG, tmp);
    }



}
