package nefersky.animationapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DoSunRise();
        DoTurnClock();
    }

    public void onClickSun(View view) {
        DoSunRise();
    }

    private void DoSunRise(){
        ImageView sun = (ImageView)findViewById(R.id.sun);
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
        sun.startAnimation(sunRiseAnimation);
    }

    private void DoTurnClock(){
        ImageView clock = (ImageView)findViewById(R.id.clock);
        Animation clockAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        clock.startAnimation(clockAnimation);

        ImageView hourHand = (ImageView)findViewById(R.id.hour_hand);
        Animation hourAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
        hourHand.startAnimation(hourAnimation);
    }

    public void onClickClock(View view) {
        DoTurnClock();
    }
}
