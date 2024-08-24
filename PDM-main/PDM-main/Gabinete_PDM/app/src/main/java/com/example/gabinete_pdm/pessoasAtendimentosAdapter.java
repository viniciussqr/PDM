package com.example.gabinete_pdm;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class pessoasAtendimentosAdapter extends BaseAdapter {

    ArrayList pessoas;
    Context context;

    public pessoasAtendimentosAdapter(ArrayList<pessoasAtendimento> pessoas, Context context){
        this.pessoas = pessoas;
        this.context = context;
    }

    @Override
    public int getCount(){
        return pessoas.size();
    }

    @Override
    public pessoasAtendimento getItem(int position){
        return (pessoasAtendimento) pessoas.get(position);
    }

    @Override
    public long getItemId(int position){
        return ((pessoasAtendimento) pessoas.get(position)).getCodigo();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        pessoasAtendimento pessoa = (pessoasAtendimento) pessoas.get(position);
        View v = LayoutInflater.from(context).inflate(R.layout.activity_fragmento_atendimentos, parent, false);
        //TextView codigo = v.findViewById(R.id.img_atendimento);


        return v;
    }

}
