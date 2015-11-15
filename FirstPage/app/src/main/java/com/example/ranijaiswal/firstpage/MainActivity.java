package com.example.ranijaiswal.firstpage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonPrev, buttonNext;
    ViewFlipper viewFlipper;
    TextView rejection;
    Button url;
    Button share;
    Button join;
    Button nextTime;

    String[] urlArray = {"https://secure2.convio.net/jnf/site/SPageServer/?pagename=donationprojects&_ga=1.187139752.1842736701.1447546847",
            "https://donatenow.networkforgood.org/nycrescue?code=WEBS",
            "https://www.unbound.org/Sponsor",
            "https://donate.water.org/?a=A00000&utm_campaign=button_hero&c=Stripe&utm_medium=web&utm_content=%2F&utm_source=water_org",
            "http://www.fallenheroesfund.org/Donate.aspx",
            "https://secure2.convio.net/nmha/site/Donation2;jsessionid=3D08BA8580B956CCE2A46C64C59C5D31.app272a?df_id=2421&2421.donation=form1",
            "https://www.kintera.org/AutoGen/Simple/Donor.asp?ievent=1108450&en=esKLKUMFLfIKKUMKLqKQL2PRJqKUKXMBKgKVJ4PFLiK3LjK",
            "https://give.bcrfcure.org/checkout/donation?eid=31404&_ga=1.45631335.2126328817.1447541853",
            "https://secure.savethechildren.org/site/c.8rKLIXMGIpI4E/b.8102415/k.1377/Please_Give_Monthly_to_Save_the_Children/apps/ka/sd/donor.asp",
            "https://secure3.convio.net/ra/site/Donation2?df_id=4360&4360.donation=form1&_ga=1.124720393.269264045.1447546179"};
    Animation slide_in_left, slide_out_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPrev = (Button) findViewById(R.id.prev);
        buttonNext = (Button) findViewById(R.id.next);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);

        slide_in_left = AnimationUtils.loadAnimation(this,
                android.R.anim.slide_in_left);
        slide_out_right = AnimationUtils.loadAnimation(this,
                android.R.anim.slide_out_right);

        viewFlipper.setInAnimation(slide_in_left);
        viewFlipper.setOutAnimation(slide_out_right);

        buttonPrev.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                url = (Button) findViewById(R.id.button3);
                url.setVisibility(View.INVISIBLE);
                share = (Button) findViewById(R.id.button4);
                share.setVisibility(View.INVISIBLE);
                join = (Button) findViewById(R.id.button5);
                join.setVisibility(View.INVISIBLE);

                nextTime = (Button) findViewById(R.id.button7);
                nextTime.setVisibility(View.INVISIBLE);
                viewFlipper.showPrevious();

            }
        });

        buttonNext.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                url = (Button) findViewById(R.id.button3);
                url.setVisibility(View.INVISIBLE);
                share = (Button) findViewById(R.id.button4);
                share.setVisibility(View.INVISIBLE);
                join = (Button) findViewById(R.id.button5);
                join.setVisibility(View.INVISIBLE);

                nextTime = (Button) findViewById(R.id.button7);
                nextTime.setVisibility(View.INVISIBLE);

                viewFlipper.showNext();

            }
        });

    }

    public void getURL(View view){
        int urlIndex = viewFlipper.getDisplayedChild();
        Uri uri = Uri.parse(urlArray[urlIndex]);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void MoreButtons(View view) {
        //when play is clicked show stop button and hide play button
        url = (Button) findViewById(R.id.button3);
        if(url.getVisibility() == View.VISIBLE)
            url.setVisibility(View.INVISIBLE);
        else
            url.setVisibility(View.VISIBLE);
        share = (Button) findViewById(R.id.button4);
        if(share.getVisibility() == View.VISIBLE)
            share.setVisibility(View.INVISIBLE);
        else
            share.setVisibility(View.VISIBLE);
        join = (Button) findViewById(R.id.button5);
        if(join.getVisibility() == View.VISIBLE)
            join.setVisibility(View.INVISIBLE);
        else
            join.setVisibility(View.VISIBLE);
    }

    public void LessButtons(View view) {
        url = (Button) findViewById(R.id.button3);
        url.setVisibility(View.INVISIBLE);
        share = (Button) findViewById(R.id.button4);
        share.setVisibility(View.INVISIBLE);
        join = (Button) findViewById(R.id.button5);
        join.setVisibility(View.INVISIBLE);

    }

    public void MoreText(View view) {
        nextTime = (Button) findViewById(R.id.button7);
        nextTime.setVisibility(View.VISIBLE);


    }

}

