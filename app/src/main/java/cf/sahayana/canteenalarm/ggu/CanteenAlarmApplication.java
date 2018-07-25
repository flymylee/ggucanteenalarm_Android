package cf.sahayana.canteenalarm.ggu;

import android.app.Application;

import com.tsengvn.typekit.Typekit;

public class CanteenAlarmApplication extends Application {
  public final static String TAG = CanteenAlarmApplication.class.getSimpleName();

  @Override
  public void onCreate() {
    super.onCreate();

    //font all set
    Typekit.getInstance()
        .addNormal(Typekit.createFromAsset(this, "fonts/NanumBarunGothic.ttf"));
  }
}
