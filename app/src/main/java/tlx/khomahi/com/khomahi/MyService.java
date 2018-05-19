package tlx.khomahi.com.khomahi;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
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
        final WindowManager.LayoutParams mParams2 = new WindowManager.LayoutParams(0, 0, 0, 0, 0);

        mWindowManager.addView(popupView, mParams);

//        Switch w = (Switch)popupView.findViewById(R.id.sw_lock);
//        w.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked==true){
//                    mWindowManager.removeView(popupView);
//                }
//            }
//        });

        Button thoat = (Button)popupView.findViewById(R.id.btThoat);
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWindowManager.removeView(popupView);
            }
        });

    }
}
