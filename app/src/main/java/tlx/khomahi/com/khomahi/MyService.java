package tlx.khomahi.com.khomahi;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by PHA on 5/19/2018.
 */

public class MyService extends Service {

    View popupView;
    WindowManager mWindowManager;
    TextView tvThoat;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        popupView = layoutInflater.inflate(R.layout.windown_manager, null);

        mWindowManager = (WindowManager) getSystemService(WINDOW_SERVICE);

        final WindowManager.LayoutParams mParams = new WindowManager.LayoutParams(-1, -1, 2010, 6817152, -2);

        mWindowManager.addView(popupView, mParams);



    }
}
