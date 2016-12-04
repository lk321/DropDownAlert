package io.quickcoding.dropdownalert;

/**
 * Created by ajelet on 12/3/16.
 */

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.app.ActionBar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by ajelet on 7/29/16.
 */
public class DropDownAlert {

    private Activity context;
    private Context c;
    private String title;
    private String content;
    private Bitmap bitmap;
    public View view;
    private Timer timer;


    public DropDownAlert(Activity context,Context c)
    {
        this.context=context;
        this.c=c;

    }
    public DropDownAlert(Bitmap bitmap, Activity context, String title, String content)
    {
        this.context=context;
        this.title=title;
        this.content=content;
        this.bitmap=bitmap;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void show()
    {


        if (view==null) {
            LayoutInflater factory = LayoutInflater.from(c);

            if (bitmap != null) {
                view = factory.inflate(R.layout.message_alert, null);

            } else {
                view = factory.inflate(R.layout.message_alert_no_image, null);
            }
        }
        else
        {
            if (timer!=null)
            {
                timer.cancel();
                dismiss();
                LayoutInflater factory = LayoutInflater.from(context);

                if (bitmap != null) {
                    view = factory.inflate(R.layout.message_alert, null);

                } else {
                    view = factory.inflate(R.layout.message_alert_no_image, null);
                }

            }
        }

        ActionBar.LayoutParams lp =new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT);
        ImageView message_alert_image=(ImageView)view.findViewById(R.id.image_message_alert);
        TextView message_alert_title=(TextView)view.findViewById(R.id.text_message_alert_tittle);
        TextView  message_alert_content=(TextView)view.findViewById(R.id.text_message_alert_content);
        LinearLayout l=(LinearLayout)view.findViewById(R.id.linear_message_alert);
        if (bitmap!=null)
        {
            message_alert_image.setImageBitmap(bitmap);
            message_alert_content.setGravity(Gravity.LEFT);
            message_alert_title.setGravity(Gravity.LEFT);

        }
        else
        {
            message_alert_image.setImageResource(android.R.color.transparent);
            message_alert_image.getLayoutParams().height=0;
            message_alert_image.getLayoutParams().width=0;
            message_alert_content.setGravity(Gravity.CENTER_VERTICAL| Gravity.CENTER_HORIZONTAL);
            message_alert_title.setGravity(Gravity.CENTER_VERTICAL| Gravity.CENTER_HORIZONTAL);

        }



        message_alert_content.setText(content);
        message_alert_title.setText(title);
        lp.gravity= Gravity.TOP;

        if (view.getParent()==null)
        {
            Animation down = AnimationUtils.loadAnimation(context,
                    R.anim.anim_down);
            view.startAnimation(down);
            context.addContentView(view,lp);

        }else
        {
            Animation down = AnimationUtils.loadAnimation(context,
                    R.anim.anim_down);
            view.startAnimation(down);
        }




        timer= new Timer();
        timer.schedule(new dismissTimerTask(), 3000);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer!=null)
                {
                    timer.cancel();
                    dismiss();

                }
            }
        });

    }


    public void dismiss()
    {
        Animation up = AnimationUtils.loadAnimation(context,
                R.anim.anim_up);
        view.startAnimation(up);
        if (view.getParent()!=null)
        {
            ((ViewManager) view.getParent()).removeView(view);
            view=null;
        }

    }



    class dismissTimerTask extends TimerTask {
        public void run() {

            context.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    dismiss();

                }
            });
        }
    }




}
