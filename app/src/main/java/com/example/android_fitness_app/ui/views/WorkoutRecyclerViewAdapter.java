package com.example.android_fitness_app.ui.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_fitness_app.Model.Workout;
import com.example.android_fitness_app.R;

import java.util.List;

public class WorkoutRecyclerViewAdapter extends RecyclerView.Adapter<WorkoutRecyclerViewAdapter.ViewHolder> {
    private Context context;
    private List<ExerciseListItem> list;

    public WorkoutRecyclerViewAdapter(Context context, List<ExerciseListItem> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(
                R.layout.workout_recyclerview_row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.workoutTextView.setText(list.get(position).getWorkoutName());
        holder.dateTextView.setText(list.get(position).getDate());
        holder.volumeTextView.setText(list.get(position).getVolume());
        // Todo: set exercises in exercisesLinearLayout
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView workoutTextView, dateTextView, volumeTextView;
        LinearLayoutCompat exercisesLinearLayout;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            workoutTextView = itemView.findViewById(R.id.workoutNameTextView);
            dateTextView = itemView.findViewById(R.id.dateTextView);
            volumeTextView = itemView.findViewById(R.id.volumeTextView);
            exercisesLinearLayout = itemView.findViewById(R.id.exercisesLinearLayout);
            cardView = itemView.findViewById(R.id.mainContainerCardView);
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ExerciseListItem {
        private final Workout workout;
        private final String workoutName;
        private final String date;
        private final String volume;

        public ExerciseListItem(Workout workout) {
            this.workout = workout;
            this.workoutName = workout.getName();
            this.date = workout.getDateString();
            this.volume = workout.getVolume() + " kg";
        }

        public String getWorkoutName() {
            return workoutName;
        }

        public String getDate() {
            return date;
        }

        public String getVolume() {
            return volume;
        }
    }
}
