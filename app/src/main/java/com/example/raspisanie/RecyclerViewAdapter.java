package com.example.raspisanie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder>
{
    private final LayoutInflater inflater;
    private final List<Model> movies;

    public RecyclerViewAdapter(Context context, List<Model> movies) {
        this.movies = movies;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model model = movies.get(position);
        holder.day.setText(model.getDay());
        holder.lesson1.setText(model.getLesson1());
        holder.teacher1.setText(model.getTeacher1());
        holder.lesson2.setText(model.getLesson2());
        holder.teacher2.setText(model.getTeacher2());
        holder.lesson3.setText(model.getLesson3());
        holder.teacher3.setText(model.getTeacher3());
        holder.lesson4.setText(model.getLesson4());
        holder.teacher4.setText(model.getTeacher4());
        holder.lesson5.setText(model.getLesson5());
        holder.teacher5.setText(model.getTeacher5());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView day;
        final TextView lesson1;
        final TextView teacher1;
        final TextView lesson2;
        final TextView teacher2;
        final TextView lesson3;
        final TextView teacher3;
        final TextView lesson4;
        final TextView teacher4;
        final TextView lesson5;
        final TextView teacher5;

        ViewHolder (View view) {
            super (view);
            day = view.findViewById(R.id.day);
            lesson1 = view.findViewById(R.id.lesson1);
            teacher1 = view.findViewById(R.id.teacher1);
            lesson2 = view.findViewById(R.id.lesson2);
            teacher2 = view.findViewById(R.id.teacher2);
            lesson3 = view.findViewById(R.id.lesson3);
            teacher3 = view.findViewById(R.id.teacher3);
            lesson4 = view.findViewById(R.id.lesson4);
            teacher4 = view.findViewById(R.id.teacher4);
            lesson5 = view.findViewById(R.id.lesson5);
            teacher5 = view.findViewById(R.id.teacher5);
        }
    }
}
