package com.example.act4musicplayermila;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
//MI ADAPTADOR CUSTOMIZADO PARA GESTIONAR LA MUSICA
public class CustomMusicAdapter extends BaseAdapter {

    private Context contextMAR;
    private int layoutMAR;
    private ArrayList<Music> arrayListMAR;
    private MediaPlayer mediaPlayerMAR;
    private Boolean flagMAR = true;

    public CustomMusicAdapter(Context context, int layout, ArrayList<Music> arrayList) {
        this.contextMAR = context;
        this.layoutMAR = layout;
        this.arrayListMAR = arrayList;
    }

    @Override
    public int getCount() {
        return arrayListMAR.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        TextView txtName, txtSinger;
        ImageView ivPlay, ivStop;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) contextMAR.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInflater.inflate(layoutMAR, null);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.txtName);
            viewHolder.txtSinger = (TextView) convertView.findViewById(R.id.txtSinger);
            viewHolder.ivPlay = (ImageView) convertView.findViewById(R.id.ivPlay);
            viewHolder.ivStop = (ImageView) convertView.findViewById(R.id.ivStop);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final Music music = arrayListMAR.get(position);

        viewHolder.txtName.setText(music.getName());
        viewHolder.txtSinger.setText(music.getSinger());

        // DARLE AL PLAY PARA QUE SUENE LA CANCION
        viewHolder.ivPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flagMAR){
                    mediaPlayerMAR = MediaPlayer.create(contextMAR, music.getSong());
                    flagMAR = false;
                }
                if(mediaPlayerMAR.isPlaying()) {
                    mediaPlayerMAR.pause();
                    viewHolder.ivPlay.setImageResource(R.drawable.ic_play);
                } else {
                    mediaPlayerMAR.start();
                    viewHolder.ivPlay.setImageResource(R.drawable.ic_pause);
                }
            }
        });

        // DARLE AL STOP PARA PARAR LA CANCION
        viewHolder.ivStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!flagMAR) {
                    mediaPlayerMAR.stop();
                    mediaPlayerMAR.release();
                    flagMAR = true;
                }
                viewHolder.ivPlay.setImageResource(R.drawable.ic_play);
            }
        });

        return convertView;
    }
}
