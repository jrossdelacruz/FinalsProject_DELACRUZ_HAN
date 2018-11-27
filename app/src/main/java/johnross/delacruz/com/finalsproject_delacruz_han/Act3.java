package johnross.delacruz.com.finalsproject_delacruz_han;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class Act3 extends AppCompatActivity {

    float x1, y1, x2, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                y1 = event.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                y2 = event.getY();
                if(x1 < x2) {
                    Intent i = new Intent(Act3.this, Act2.class);
                    startActivity(i);
                }
                else if(x1 > x2) {
                    Intent i = new Intent(Act3.this, Act4.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }
}
