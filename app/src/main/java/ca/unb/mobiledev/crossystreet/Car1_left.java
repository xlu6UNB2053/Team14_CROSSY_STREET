// get the bitmap of car1 from left side
package ca.unb.mobiledev.crossystreet;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import java.util.Random;

public class Car1_left {
    int x, y, width, height;
    Random ran =  new Random();
    int speed = ran.nextInt(35)+15;
    Bitmap car;

    Car1_left(Resources res){
        car = BitmapFactory.decodeResource(res, R.drawable.car1_left);

        width = car.getWidth();
        height = car.getHeight();
        width /= 3;
        height /= 3;
        x=-150;
        y=1255;

        car = Bitmap.createScaledBitmap(car, width, height, false);
    }

    Bitmap getCar(){
        return car;
    }

    Rect getCollision(){
        return new Rect(x, y, x+width, y+height);
    }
}
