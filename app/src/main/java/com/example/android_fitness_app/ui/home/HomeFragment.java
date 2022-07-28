package com.example.android_fitness_app.ui.home;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_fitness_app.Model.User;
import com.example.android_fitness_app.Model.Workout;
import com.example.android_fitness_app.R;
import com.example.android_fitness_app.databinding.FragmentHomeBinding;
import com.example.android_fitness_app.ui.workout.WorkoutRecyclerViewAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private TextView usernameTextView;
    private TextView weightTextView;
    private TextView workoutCountTextView;
    private RecyclerView lastWorkoutRecyclerView;
    private WorkoutRecyclerViewAdapter adapter;
    private ArrayList<WorkoutRecyclerViewAdapter.WorkoutListItem> lastWorkoutListItem;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        usernameTextView = view.findViewById(R.id.usernameTextView);
        weightTextView = view.findViewById(R.id.weightTextView);
        workoutCountTextView = view.findViewById(R.id.workoutCountTextView);
        lastWorkoutRecyclerView = view.findViewById(R.id.lastWorkoutRecyclerView);

        lastWorkoutRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        lastWorkoutListItem = getLastWorkoutListItem();
        adapter = new WorkoutRecyclerViewAdapter(getActivity(), lastWorkoutListItem);
        lastWorkoutRecyclerView.setAdapter(adapter);

        User user = User.getInstance();
        usernameTextView.setText(user.getName());
        weightTextView.setText("weight = " + user.getWeight() + " kg");
        workoutCountTextView.setText(Workout.getWorkoutCount() + " workouts");
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private ArrayList<WorkoutRecyclerViewAdapter.WorkoutListItem> getLastWorkoutListItem() {
        Workout workout = Workout.getLastWorkout();
        ArrayList<WorkoutRecyclerViewAdapter.WorkoutListItem> lastWorkoutListItem = new ArrayList<>();
        if (workout != null) {
            lastWorkoutListItem.add(new WorkoutRecyclerViewAdapter.WorkoutListItem(workout));
        }
        return lastWorkoutListItem;
    }

    @SuppressLint("NotifyDataSetChanged")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onResume() {
        super.onResume();
        lastWorkoutListItem.clear();
        lastWorkoutListItem.addAll(getLastWorkoutListItem());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}