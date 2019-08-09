package com.github.techisfun.android.topsheet;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialogFragment;

/**
 * Created by andrea on 23/08/16.
 */
public class TopSheetDialogFragment extends AppCompatDialogFragment {

    @Override @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new TopSheetDialog(requireContext(), getTheme());
    }
}
