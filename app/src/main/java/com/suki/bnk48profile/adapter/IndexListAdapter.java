package com.suki.bnk48profile.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.suki.bnk48profile.R;

/**
 * Created by KUK on 4/3/2560.
 */

public class IndexListAdapter extends ArrayAdapter<ProfileItem> {

    LayoutInflater inflater;

    public IndexListAdapter(Context context, int resource) {
        super(context, resource);

        inflater = LayoutInflater.from( context );
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v;

        if( convertView != null){
            v = convertView;
        }else{
            v = inflater.inflate(R.layout.activity_listview_index , parent , false );
        }

        TextView lbNickname= (TextView)v.findViewById( R.id.lbNickname );
        TextView lbName= (TextView)v.findViewById( R.id.lbName );
        TextView lbSur = (TextView)v.findViewById(R.id.lbSurname);
        ImageView imgProfile = (ImageView)v.findViewById(R.id.profile_pic);
        TextView lbBirthdate = (TextView)v.findViewById(R.id.lbBirthdate);
        TextView lbHeight = (TextView)v.findViewById(R.id.lbHeight);
        TextView lbBloodtype = (TextView)v.findViewById(R.id.lbBloodtype);
        TextView lbBirthplace = (TextView)v.findViewById(R.id.lbBirthplace);
        TextView lbLike = (TextView)v.findViewById(R.id.lbLike);
        TextView lbHobby = (TextView)v.findViewById(R.id.lbHobby);

        ProfileItem item = getItem(position);
        lbNickname.setText(item.getNickname());
        lbName.setText(item.getName());
        lbSur.setText(item.getSurname());
        Picasso.with(getContext()).load(item.getImage()).into(imgProfile);
        lbBirthdate.setText(item.getBirthdate());
        lbHeight.setText(item.getHeight()+"");
        lbBloodtype.setText(item.getBloodtype());
        lbBirthplace.setText(item.getBirthplace());
        lbLike.setText(item.getLike());
        lbHobby.setText(item.getHobby());


        return v;
    }
}
