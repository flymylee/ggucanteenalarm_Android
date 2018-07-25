package cf.sahayana.canteenalarm.ggu.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cf.sahayana.canteenalarm.ggu.R;

public class MainActivity extends AppCompatActivity {
  public final static String TAG = MainActivity.class.getSimpleName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}
