package com.example.a27pr_vorobyevp_pr_21102;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Draw2D extends View {

    private Paint mPaint = new Paint();
    private Rect mRect = new Rect();
    private Bitmap mBitmap;
    private Bitmap mBitmap1;
    private Bitmap mBitmap2;
    private Bitmap mBitmap3;
    private Bitmap mBitmap4;

    public Draw2D(Context context) {
        super(context);

        // Выводим значок из ресурсов
        Resources res = this.getResources();
        mBitmap = BitmapFactory.decodeResource(res, R.drawable.ship);
        mBitmap1 = BitmapFactory.decodeResource(res, R.drawable.seas1);
        mBitmap2 = BitmapFactory.decodeResource(res, R.drawable.seas2);
        mBitmap3 = BitmapFactory.decodeResource(res, R.drawable.crab2);
        mBitmap4 = BitmapFactory.decodeResource(res, R.drawable.ship2);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        // стиль Заливка
        mPaint.setStyle(Paint.Style.FILL);

        // закрашиваем холст белым цветом
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        // Рисуем жёлтый круг
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        // canvas.drawCircle(950, 30, 25, mPaint);
        canvas.drawCircle(width -120, 130, 90, mPaint);

        // Рисуем blue прямоугольник
        mPaint.setColor(Color.CYAN);
        //  canvas.drawRect(20, 650, 950, 680, mPaint);
        //canvas.drawRect(0, canvas.getHeight() - 800, width, height + 500, mPaint); //норм экран
        canvas.drawRect(0, canvas.getHeight() - 400, width, height + 500, mPaint);

        // Рисуем blue прямоугольник темная сторона
        mPaint.setColor(Color.parseColor("#00BCD4"));
        //canvas.drawRect(0, 1200, 1100, 1050, mPaint);
        //canvas.drawRect(0, canvas.getHeight() - 800, width, height - 1000, mPaint); //норм экран
        canvas.drawRect(0, canvas.getHeight() - 300, width, height - 500, mPaint);

        // Рисуем текст
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(32);
        //  canvas.drawText("Лужайка только для котов", 30, 648, mPaint);
        //canvas.drawText("Вода только для кораблей", 30, height - 32, mPaint);

        // Текст под углом
        // int x = 810;
        int x = width - 360;
        int y = 350;

        mPaint.setColor(Color.YELLOW);
        mPaint.setTextSize(35);
        String beam = "Лучик солнца!";

        canvas.save();
        // Создаём ограничивающий прямоугольник для наклонного текста
        // поворачиваем холст по центру текста
        canvas.rotate(-45, x + mRect.exactCenterX(), y + mRect.exactCenterY());

        // Рисуем текст
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(beam, x, y, mPaint);

        int imageX = 600; // Начальная координата X изображения
        int imageY = 860; // Начальная координата Y изображения

        // восстанавливаем холст
        canvas.restore();

        // Выводим изображение
        //canvas.drawBitmap(mBitmap, width - mBitmap.getWidth(), height - mBitmap.getHeight() - 860, mPaint); //норм экран
        //canvas.drawBitmap(mBitmap, imageX, imageY, mPaint);
        canvas.drawBitmap(mBitmap, width - mBitmap.getWidth(), height - mBitmap.getHeight() - 400, mPaint);

        int imageX1 = 600; // Начальная координата X изображения
        int imageY1 = 1890; // Начальная координата Y изображения

        // Выводим изображение
        //canvas.drawBitmap(mBitmap1, imageX1, imageY1, mPaint);
        canvas.drawBitmap(mBitmap1, width - mBitmap1.getWidth() - 270, height - mBitmap1.getHeight() , mPaint);

        int imageX2 = 800; // Начальная координата X изображения
        int imageY2 = 1890; // Начальная координата Y изображения

        // Выводим изображение
        //canvas.drawBitmap(mBitmap2, imageX2, imageY2, mPaint);
        canvas.drawBitmap(mBitmap2, width - mBitmap2.getWidth() - 120, height - mBitmap2.getHeight(), mPaint);

        int imageX3 = 500; // Начальная координата X изображения
        int imageY3 = 1890; // Начальная координата Y изображения

        // Выводим изображение
        //canvas.drawBitmap(mBitmap1, imageX3, imageY3, mPaint);
        canvas.drawBitmap(mBitmap1, width - mBitmap1.getWidth() - 400, height - mBitmap1.getHeight(), mPaint);

        int imageX4 = 930; // Начальная координата X изображения
        int imageY4 = 1890; // Начальная координата Y изображения

        // Выводим изображение
        //canvas.drawBitmap(mBitmap1, imageX4, imageY4, mPaint);
        canvas.drawBitmap(mBitmap1, width - mBitmap1.getWidth() + 15, height - mBitmap1.getHeight(), mPaint);

        int imageX5 = 350; // Начальная координата X изображения
        int imageY5 = 1920; // Начальная координата Y изображения

        // Выводим изображение
        //canvas.drawBitmap(mBitmap3, imageX5, imageY5, mPaint);
        canvas.drawBitmap(mBitmap3, width - mBitmap3.getWidth() - 550, height - mBitmap3.getHeight() + 20, mPaint);

        int imageX6 = 50; // Начальная координата X изображения
        int imageY6 = 1800; // Начальная координата Y изображения

        // Выводим изображение
        //canvas.drawBitmap(mBitmap4, imageX6, imageY6, mPaint);
        canvas.drawBitmap(mBitmap4, width - mBitmap4.getWidth() - 750, height - mBitmap4.getHeight(), mPaint);


    }
}
