package com.example.android_fitness_app.ui.diet;
//package com.example.piechart;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.android_fitness_app.Model.Food;
import com.example.android_fitness_app.R;
import com.example.android_fitness_app.databinding.FragmentDietBinding;


// Import the required libraries
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;


public class DietFragment extends Fragment {

    private FragmentDietBinding binding;
    TextView tvR, tvPython, tvCPP, tvJava;
    PieChart pieChart;
    EditText txt;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DietViewModel dietViewModel =
                new ViewModelProvider(this).get(DietViewModel.class);

        binding = FragmentDietBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textDiet;
//        dietViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        tvR = root.findViewById(R.id.tvR);
        tvPython = root.findViewById(R.id.tvPython);
        tvCPP = root.findViewById(R.id.tvCPP);
        tvJava = root.findViewById(R.id.tvJava);
        pieChart = root.findViewById(R.id.piechart);
        txt = root.findViewById(R.id.txt);



        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                 Food f = Food.getFoodByName(txt.getText().toString());
//                 String carb_percent = f.getPercentOfCarbohydrate();
//                 String fat_percent = f.getPercentOfFat();
//                 String prot_percent = f.getPercentOfProtein();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tvR.setText(f.getPercentOfCarbohydrate());
                        tvPython.setText(f.getPercentOfFat());
                        tvCPP.setText(f.getPercentOfProtein());
                        tvJava.setText(f.getAmountOfCalories());

                    }
                });
            }
        });


//        tvR.setText(Integer.toString(40));
//        tvPython.setText(Integer.toString(30));
//        tvCPP.setText(Integer.toString(5));
//        tvJava.setText(Integer.toString(25));

        pieChart.addPieSlice(
                new PieModel(
                        "R",
                        Integer.parseInt(tvR.getText().toString()),
                        Color.parseColor("#FFA726")));
        pieChart.addPieSlice(
                new PieModel(
                        "Python",
                        Integer.parseInt(tvPython.getText().toString()),
                        Color.parseColor("#66BB6A")));
        pieChart.addPieSlice(
                new PieModel(
                        "C++",
                        Integer.parseInt(tvCPP.getText().toString()),
                        Color.parseColor("#EF5350")));
        pieChart.addPieSlice(
                new PieModel(
                        "Java",
                        Integer.parseInt(tvJava.getText().toString()),
                        Color.parseColor("#29B6F6")));

        pieChart.startAnimation();

        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }




}