package com.example.navigationdrawer;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class ModalFragment extends DialogFragment {
    //set private message
    private String message;
    public ModalFragment() {

    }

    public ModalFragment(String message) {
        this.message = message;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(requireContext())
                .setMessage("You selected " + this.message)
                .setTitle(this.message)
                .setPositiveButton("ok", (dialog, which) -> {} )
                .create();
    }

    public static String TAG = "ConfirmDialog";
}
