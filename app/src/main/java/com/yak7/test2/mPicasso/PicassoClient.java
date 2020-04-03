package com.yak7.test2.mPicasso;


import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.yak7.test2.R;


public class PicassoClient {

    public static void loadImage(Context c, String url, ImageView img)
    {
        if(url != null && url.length()>0)
        {
            Picasso.with(c).load(url).placeholder(R.drawable.placeholder).into(img);
        }else
        {
            Picasso.with(c).load(R.drawable.placeholder).into(img);
        }
    }

}
