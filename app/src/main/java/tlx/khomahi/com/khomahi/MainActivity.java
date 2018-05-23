package tlx.khomahi.com.khomahi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import tlx.khomahi.com.khomahi.face.MainActivity2;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            Intent intent = new Intent(MainActivity.this, MyService.class);
            startService(intent);


       TextView tvThoat=(TextView)findViewById(R.id.tvThoat) ;
        tvThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent it = new Intent(MainActivity.this,MainActivity2.class);
               startActivity(it);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==1234){
            Intent intent = new Intent(MainActivity.this, MyService.class);
            startService(intent);
        }
    }
}
