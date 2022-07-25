package com.example.android_fitness_app.ui.workout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.android_fitness_app.R;
import com.example.android_fitness_app.databinding.FragmentExerciseBinding;

public class ExerciseFragment extends Fragment {

    private FragmentExerciseBinding binding;
    private TextView exerciseNameTextView;
    private TableLayout exerciseTableLayout;
    private Button addSetButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentExerciseBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        exerciseNameTextView = view.findViewById(R.id.exerciseNameTextView);
        exerciseTableLayout = view.findViewById(R.id.exerciseTableLayout);
        addSetButton = view.findViewById(R.id.addSetButton);

        View tableRow = getLayoutInflater().inflate(R.layout.set_tablerow, binding.getRoot(), false);
        exerciseTableLayout.addView(tableRow);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
