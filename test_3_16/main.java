package com.voidsong.mytestapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

class TestSurfaceView extends SurfaceView implements SurfaceHolder.Callback{

    private MyTask task;

    public TestSurfaceView(Context context) {
        super(context);
        getHolder().addCallback(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        task.setX((int)event.getX());
        task.setY((int)event.getY());
        return false;
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        task = new MyTask(getContext(), getHolder());
        task.start();
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        task.mystop();
    }
}

class MyTask extends Thread {
    private SurfaceHolder surfaceHolder;

    private boolean flag = true;

    private Paint paint = new Paint();

    private int x = -1;
    private int y = -1;
    private int radius = 0;

    public void setX(int x) {this.x = x; radius = 0;}
    public void setY(int y) {this.y = y;}

    public MyTask(Context context, SurfaceHolder surfaceHolder) {
        this.surfaceHolder = surfaceHolder;
    }

    public void mystop() {
        flag = false;
    }

    @Override
    public void run() {
        while (flag) {
            Canvas canvas = surfaceHolder.lockCanvas();
            if (canvas != null) {
                try {
                    paint.setColor(Color.BLUE);
                    canvas.drawRect(0, 0, canvas.getWidth(), canvas.getHeight(), paint);
                    if (x != -1) {
                        paint.setColor(Color.YELLOW);
                        canvas.drawCircle(x, y, radius, paint);
                        radius += 5;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                        }
                    }
                } finally {
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
        }
    }
}