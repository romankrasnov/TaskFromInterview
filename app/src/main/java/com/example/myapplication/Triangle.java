package com.example.myapplication;

public class Triangle {

    private boolean isDirectTask;
    private int taskContent;
    public static final String REVERSE_TASK_RESULT_TRUE = "it can be triangle";
    public static final String REVERSE_TASK_RESULT_FALSE = "it can`t be triangle";


    public String getResult() {
        if(isDirectTask)
        {
            return String.valueOf(getDirectTaskResult());
        } else {
            return getReverseTaskResult();
        }
    }


    public String getReverseTaskResult() {
        if (Math.sqrt(taskContent * 8 + 1) % 1 == 0) {
            return REVERSE_TASK_RESULT_TRUE;
        } else {
            return REVERSE_TASK_RESULT_FALSE;
        }
    }

    public int getDirectTaskResult() {
        return (taskContent*(taskContent + 1)) / 2;
    }

    void setTaskContent(int taskContent) {
        this.taskContent = taskContent;
    }

    void setTaskDirection(boolean isDirectTask) {
        this.isDirectTask = isDirectTask;
    }
    boolean isDirectTask() {
        return isDirectTask;
    }

    int getTaskContent() {
        return taskContent;
    }
}
