package tlx.khomahi.com.khomahi;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by PHA on 5/19/2018.
 */

public class ThoatApp extends AppCompatActivity {


    TextView tvThoat;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        tvThoat=(TextView)findViewById(R.id.tvThoat) ;
        tvThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(getApplicationContext(),MyService.class));
                finish();
            }
        });
    }
}
