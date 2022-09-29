package com.example.myapplication;

import static com.example.myapplication.MainActivity.KEY_REQUEST;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SolverFragment extends Fragment {

    static final String ARG_PARAM_IS_DIRECT_TASK = "isDirectTask";
    static final String ARG_PARAM_EDIT_TEXT_CONTENT = "editTextContent";
    static final String RESULT_STRING_BUNDLE_KEY = "resultIntBundleKey";


    private boolean isDirectTask;
    private int editTextContent;
    public SolverFragment() {}

    public static SolverFragment newInstance(String isDirectTask, String editTextContent) {
        SolverFragment fragment = new SolverFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM_IS_DIRECT_TASK, isDirectTask);
        args.putString(ARG_PARAM_EDIT_TEXT_CONTENT, editTextContent);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            isDirectTask = getArguments().getBoolean(ARG_PARAM_IS_DIRECT_TASK);
            editTextContent = getArguments().getInt(ARG_PARAM_EDIT_TEXT_CONTENT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_solver, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Bundle resultBundle = new Bundle();
        resultBundle.putString(RESULT_STRING_BUNDLE_KEY, getResult());
        getParentFragmentManager().setFragmentResult(KEY_REQUEST, resultBundle);
        super.onViewCreated(view, savedInstanceState);
    }

    private String getResult() {
    Triangle triangle = new Triangle();
    triangle.setTaskContent(editTextContent);
    triangle.setTaskDirection(isDirectTask);
     return triangle.getResult();
    }


}