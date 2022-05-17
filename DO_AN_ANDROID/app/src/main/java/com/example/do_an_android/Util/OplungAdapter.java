package com.example.do_an_android.Util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.do_an_android.Model.Oplung;
import com.example.do_an_android.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class OplungAdapter extends BaseAdapter {
    Context context;
    ArrayList<Oplung> arrayoplung;

    public OplungAdapter(Context context, ArrayList<Oplung> arrayoplung) {
        this.context = context;
        this.arrayoplung = arrayoplung;
    }

    @Override
    public int getCount() {
        return arrayoplung.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayoplung.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    public class ViewHolder{
        public TextView title,subtitle,motasanpham,soluong;
        public ImageView hinh;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;

        if (view==null){
            viewHolder =new ViewHolder();
            LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.dong_sanpham_oplung,null);
            viewHolder.title=view.findViewById(R.id.title);
            viewHolder.subtitle = view.findViewById(R.id.subtitle);
            viewHolder.soluong = view.findViewById(R.id.soluongton_sanpham);
            viewHolder.motasanpham = view.findViewById(R.id.mota_sanpham);
            viewHolder.hinh = view.findViewById(R.id.hinhOpLung);

            view.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Oplung sanpham=(Oplung) getItem(i);
        viewHolder.title.setText(sanpham.getNameproduct()+"");

        DecimalFormat formatter = new DecimalFormat("###,###,###");
        viewHolder.subtitle.setText(formatter.format(sanpham.getPrice())+""+" VNĐ");
        viewHolder.soluong.setText("Số lượng còn lại : "+formatter.format( +sanpham.getSum()));
        viewHolder.motasanpham.setText(sanpham.getBnt());
        Glide.with(context).load(sanpham.getHinh()).into(viewHolder.hinh);
        return null;
    }
}
