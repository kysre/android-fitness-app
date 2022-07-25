package com.example.android_fitness_app.ui.workout;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android_fitness_app.R;
import com.example.android_fitness_app.databinding.ActivityAddWorkoutBinding;

public class AddWorkoutActivity extends AppCompatActivity {

    private ActivityAddWorkoutBinding binding;
    private TextView workoutNameTextView;
    private LinearLayout exercisesLinearLayout;
    private Button addExerciseButton;
    private Button finishWorkoutButton;
    private Button cancelWorkoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddWorkoutBinding.inflate(getLayoutInflater());
        setTitle("New Workout");
        setContentView(binding.getRoot());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {

        // don't know what the fuck is going on

        return super.onCreateView(name, context, attrs);
    }
}
