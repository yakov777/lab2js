package com.yak7.test2.mListView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yak7.test2.R;


public class MyHolder {

    TextView nameTxt;
    ImageView img;

    public MyHolder(View v) {

        this.nameTxt= (TextView) v.findViewById(R.id.nameTxt);
        this.img= (ImageView) v.findViewById(R.id.movieImage);

    }
}
