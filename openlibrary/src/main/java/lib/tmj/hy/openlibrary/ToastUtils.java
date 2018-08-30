package lib.tmj.hy.openlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2018-08-30.
 */

public class ToastUtils  {

    /**
     * 弹出长时间Toast
     * @param context
     * @param str
     */
    public static void ToastL(Context context, String str)
    {
        Toast.makeText(context,str,Toast.LENGTH_LONG).show();
    }

    /**
     * 弹出短时间Toast
     * @param context
     * @param str
     */
    public static void ToastS(Context context, String str)
    {
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
    }
}
