// Generated by view binder compiler. Do not edit!
package com.techextensor.rxkotlin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.techextensor.rxkotlin.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class TaskItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView taskDescriptionTextView;

  @NonNull
  public final TextView taskNameTextView;

  private TaskItemBinding(@NonNull LinearLayout rootView, @NonNull TextView taskDescriptionTextView,
      @NonNull TextView taskNameTextView) {
    this.rootView = rootView;
    this.taskDescriptionTextView = taskDescriptionTextView;
    this.taskNameTextView = taskNameTextView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TaskItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TaskItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.task_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TaskItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.taskDescriptionTextView;
      TextView taskDescriptionTextView = ViewBindings.findChildViewById(rootView, id);
      if (taskDescriptionTextView == null) {
        break missingId;
      }

      id = R.id.taskNameTextView;
      TextView taskNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (taskNameTextView == null) {
        break missingId;
      }

      return new TaskItemBinding((LinearLayout) rootView, taskDescriptionTextView,
          taskNameTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
