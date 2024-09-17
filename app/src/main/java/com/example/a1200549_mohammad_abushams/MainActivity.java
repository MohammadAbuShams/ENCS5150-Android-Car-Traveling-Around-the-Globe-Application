package com.example.a1200549_mohammad_abushams;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isFirstTime = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView trafficLightView = findViewById(R.id.imageView_trafficLight);
        ImageView imageViewSun = findViewById(R.id.imageView_sun);
        ImageView imageViewCloudAbove = findViewById(R.id.imageView_cloudAbove);
        ImageView imageViewCloudBehind = findViewById(R.id.imageView_cloudBehind);
        ImageView imageViewCar = findViewById(R.id.imageView_car);
        ImageView imageViewRock = findViewById(R.id.imageView_rock);

        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_sun);

        // Load the translate animations from XML files.
        Animation translateAnimation1 = AnimationUtils.loadAnimation(this, R.anim.translate_cloud1);
        Animation translateAnimation2 = AnimationUtils.loadAnimation(this, R.anim.translate_cloud2);


        // Start the animations.
        imageViewSun.startAnimation(rotateAnimation);
        imageViewCloudAbove.startAnimation(translateAnimation1);
        imageViewCloudBehind.startAnimation(translateAnimation2);
        rotateCar(imageViewCar);
        imageViewRock.startAnimation(AnimationUtils.loadAnimation(this, R.anim.translate_rock));
        startTrafficLightAnimation(trafficLightView);

    }

    // Function to rotate the car.
    private void rotateCar(ImageView imageViewCar) {
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            imageViewCar.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate_car_half));

        }, 5000);

        handler.postDelayed(() -> {
            imageViewCar.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate_car_complete));

        }, 10000);

        handler.postDelayed(() -> {
            imageViewCar.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate_car_full));

        }, 20000);

    }
     // Function to start the traffic light animation.
    private void startTrafficLightAnimation(ImageView trafficLightView) {
        Handler handler = new Handler();



        // After 0 seconds, switch to red light for 3 seconds.
        handler.postDelayed(() -> {
            trafficLightView.setImageResource(R.drawable.redlight);
        }, 0);

        // After 3 seconds, switch to orange light for 2 seconds.
        handler.postDelayed(() -> {
            trafficLightView.setImageResource(R.drawable.orangelight);
        }, 3000);

        // After 5 seconds, switch to green light.
        handler.postDelayed(() -> {
            trafficLightView.setImageResource(R.drawable.greenlight);
        }, 5000);

        // Repeat the animation cycle.
        if (isFirstTime) {
            isFirstTime = false;
            handler.postDelayed(() -> startTrafficLightAnimation(trafficLightView), 20000);
        }
        else {
            handler.postDelayed(() -> startTrafficLightAnimation(trafficLightView), 25000);
        }
    }
}