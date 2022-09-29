package com.example.myapplication;

import static com.example.myapplication.SolverFragment.ARG_PARAM_EDIT_TEXT_CONTENT;
import static com.example.myapplication.SolverFragment.ARG_PARAM_IS_DIRECT_TASK;
import static com.example.myapplication.SolverFragment.RESULT_STRING_BUNDLE_KEY;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity  {

    static final String KEY_REQUEST = "requestKey";

    private EditText taskEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button directTaskButton = findViewById(R.id.directTaskButton);
        Button reverseTaskButton = findViewById(R.id.reverseTaskButton);
        taskEditText = findViewById(R.id.taskEditText);
        directTaskButton.setOnClickListener(view -> startTask(true));
        reverseTaskButton.setOnClickListener(view -> startTask(false));
    }

    private void startTask(boolean isDirectTask) {
        int editTextContent = Integer.parseInt(Objects.requireNonNull(taskEditText.getText()).toString());
        Bundle taskBundle = new Bundle();
        taskBundle.putBoolean(ARG_PARAM_IS_DIRECT_TASK, isDirectTask);
        taskBundle.putInt(ARG_PARAM_EDIT_TEXT_CONTENT, editTextContent);
        manageSolverFragment(taskBundle);
    }

    private void manageSolverFragment(Bundle taskBundle) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager
                .setFragmentResultListener(KEY_REQUEST, this, this::showResultDialog);
        startSolverFragment(supportFragmentManager, taskBundle);
        stopSolverFragment(supportFragmentManager);
    }

    private void startSolverFragment(FragmentManager supportFragmentManager, Bundle taskBundle) {
        supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, SolverFragment.class, taskBundle)
                .addToBackStack(null)
                .commit();
    }

    private void stopSolverFragment(FragmentManager supportFragmentManager) {
    supportFragmentManager.popBackStackImmediate();
    }

    private void showResultDialog(String requestKey, Bundle bundle) {
        String solverFragmentResult = String.valueOf(bundle.getString(RESULT_STRING_BUNDLE_KEY));
        new AlertDialog.Builder(this)
                .setMessage(solverFragmentResult)
                .setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) (dialog, which) -> {})
                .show();
    }
}