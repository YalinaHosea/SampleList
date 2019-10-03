package com.example.samplelist.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.samplelist.Model.Mahasiswa;
import com.example.samplelist.R;

import java.util.ArrayList;

public class MahasiswaAdapter extends ArrayAdapter<Mahasiswa> implements View.OnClickListener{

    private ArrayList<Mahasiswa> dataSet;
    Context mContext;

    @Override
    public void onClick(View view) {

    }

    // View lookup cache
    private static class ViewHolder {
        TextView txtNama;
        TextView txtNim;
        TextView txtGender;
        TextView txtHobi;
        TextView txtCita_cita;
        TextView txtMoto;
        ImageView foto;
    }

    public MahasiswaAdapter(ArrayList<Mahasiswa> data, Context context) {
        super(context, R.layout.listlayout, data);
        this.dataSet = data;
        this.mContext=context;

    }



    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Mahasiswa mhs = getItem(position);
        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.listlayout, parent, false);
            viewHolder.txtNama = (TextView) convertView.findViewById(R.id.Nama);
            viewHolder.txtNim = (TextView) convertView.findViewById(R.id.Nim);
            viewHolder.txtGender = (TextView) convertView.findViewById(R.id.Gender);
            viewHolder.txtCita_cita = (TextView) convertView.findViewById(R.id.Cita_cita);
            viewHolder.txtMoto = (TextView) convertView.findViewById(R.id.moto);
            viewHolder.txtHobi = (TextView) convertView.findViewById(R.id.Hobi);
            viewHolder.foto = (ImageView) convertView.findViewById(R.id.foto);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }


        lastPosition = position;

        viewHolder.txtNama.setText(mhs.getNama());
        viewHolder.txtNim.setText(mhs.getNim());
        viewHolder.txtGender.setText(mhs.getGender());
        viewHolder.txtHobi.setText(mhs.getHobi());
        viewHolder.txtCita_cita.setText(mhs.getCita_cita());
        viewHolder.txtMoto.setText(mhs.getMoto());
        viewHolder.foto.setImageResource(mhs.getFoto());

        return convertView;
    }
}

