package com.example.android_fitness_app.ui.workout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_fitness_app.Model.Workout;
import com.example.android_fitness_app.R;
import com.example.android_fitness_app.databinding.FragmentWorkoutBinding;

import java.util.ArrayList;

public class WorkoutFragment extends Fragment {

    private FragmentWorkoutBinding binding;
    private Button addWorkoutButton;
    private RecyclerView workoutRecyclerView;
    private WorkoutRecyclerViewAdapter adapter;
    private ArrayList<WorkoutRecyclerViewAdapter.WorkoutListItem> workoutListItems;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        WorkoutViewModel workoutViewModel =
                new ViewModelProvider(this).get(WorkoutViewModel.class);

        binding = FragmentWorkoutBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        addWorkoutButton = view.findViewById(R.id.addWorkoutButton);
        workoutRecyclerView = view.findViewById(R.id.workoutRecyclerView);

        workoutRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        workoutListItems = getWorkoutListItems();
        adapter = new WorkoutRecyclerViewAdapter(getActivity(), workoutListItems);
        workoutRecyclerView.setAdapter(adapter);

        addWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchActivities();
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private ArrayList<WorkoutRecyclerViewAdapter.WorkoutListItem> getWorkoutListItems() {
        ArrayList<Workout> workouts = Workout.getWorkouts();
        ArrayList<WorkoutRecyclerViewAdapter.WorkoutListItem> listItems = new ArrayList<>();
        for (Workout workout : workouts) {
            listItems.add(new WorkoutRecyclerViewAdapter.WorkoutListItem(workout));
        }
        return listItems;
    }

    private void switchActivities() {
        Intent switchActivityIntent = new Intent(getActivity(), AddWorkoutActivity.class);
        startActivity(switchActivityIntent);
    }

    @SuppressLint("NotifyDataSetChanged")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onResume() {
        super.onResume();
        workoutListItems.clear();
        workoutListItems.addAll(getWorkoutListItems());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}