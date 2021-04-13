//set Level 1 background to the apprapriate background from res.drawable
package ca.unb.mobiledev.crossystreet;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class L3_Background {
    int x=0, y=0;
    Bitmap background;

    L3_Background(int screenx, int screeny, Resources res){
        background = BitmapFactory.decodeResource(res, R.drawable.background3);
        background = Bitmap.createScaledBitmap(background, screenx, screeny, false);
    }
}
