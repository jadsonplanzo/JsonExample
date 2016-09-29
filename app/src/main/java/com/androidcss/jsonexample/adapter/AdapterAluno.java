package com.androidcss.jsonexample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidcss.jsonexample.R;
import com.androidcss.jsonexample.model.Aluno;

import java.util.Collections;
import java.util.List;

public class AdapterAluno extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    List<Aluno> data= Collections.emptyList();
    Aluno current;
    int currentPos=0;

    // create constructor to innitilize context and data sent from MainActivity
    public AdapterAluno(Context context, List<Aluno> data){
        this.context=context;
        inflater= LayoutInflater.from(context);
        this.data=data;
    }

    // Inflate the layout when viewholder created
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.container_fish, parent,false);
        MyHolder holder=new MyHolder(view);
        return holder;
    }

    // Bind data
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        // Get current position of item in recyclerview to bind data and assign values from list
        MyHolder myHolder= (MyHolder) holder;
        Aluno current=data.get(position);
        myHolder.textAluno.setText(current.aluno);
        myHolder.textTurma.setText("Turma: " + current.turma);
        myHolder.textSerie.setText("Serie " + current.serie+ "\\");
        myHolder.textDisciplina.setText("disciplina " + current.disciplina+ "\\");
        myHolder.textNota.setText("nota " + current.nota+ "\\");
        myHolder.textUnidade.setText("unidade " + current.unidade+ "\\");





    }

    // return total item from List
    @Override
    public int getItemCount() {
        return data.size();
    }


    class MyHolder extends RecyclerView.ViewHolder{

        TextView textAluno;
        TextView textTurma;
        TextView textSerie;
        TextView textDisciplina;
        TextView textNota;
        TextView textUnidade;

        // create constructor to get widget reference
        public MyHolder(View itemView) {
            super(itemView);
            textAluno= (TextView) itemView.findViewById(R.id.alunoTxt);
            textTurma = (TextView) itemView.findViewById(R.id.textTurma);
            textSerie = (TextView) itemView.findViewById(R.id.textSerie);
            textDisciplina = (TextView) itemView.findViewById(R.id.textDisciplina);
            textNota = (TextView) itemView.findViewById(R.id.textNotas);
            textUnidade = (TextView) itemView.findViewById(R.id.textUnidade);
        }

    }

}
