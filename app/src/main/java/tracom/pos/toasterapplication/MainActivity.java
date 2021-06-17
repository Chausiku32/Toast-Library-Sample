package tracom.pos.toasterapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

//import tracom.pos.toastermessage.ToastMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ToastMessage.s(getApplicationContext(), "Android sample library");
    }
}