package tlx.khomahi.com.khomahi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import tlx.khomahi.com.khomahi.face.MainActivity2;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent serviceIntent = new Intent(this, MyService.class);
        startService(serviceIntent);
       TextView tvThoat=(TextView)findViewById(R.id.tvThoat) ;
        tvThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent it = new Intent(MainActivity.this,MainActivity2.class);
               startActivity(it);
            }
        });

    }
}
