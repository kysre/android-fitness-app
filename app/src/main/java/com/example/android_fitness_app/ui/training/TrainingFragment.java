package com.example.android_fitness_app.ui.training;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.android_fitness_app.databinding.FragmentTrainingBinding;

public class TrainingFragment extends Fragment {

    private FragmentTrainingBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TrainingViewModel trainingViewModel =
                new ViewModelProvider(this).get(TrainingViewModel.class);

        binding = FragmentTrainingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textTraining;
        trainingViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}