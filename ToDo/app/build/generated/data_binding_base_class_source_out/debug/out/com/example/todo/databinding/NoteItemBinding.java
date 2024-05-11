// Generated by view binder compiler. Do not edit!
package com.example.todo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NoteItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView TVContent;

  @NonNull
  public final TextView TVTitle;

  @NonNull
  public final ImageView deleteButton;

  @NonNull
  public final ImageView updateButton;

  private NoteItemBinding(@NonNull CardView rootView, @NonNull TextView TVContent,
      @NonNull TextView TVTitle, @NonNull ImageView deleteButton, @NonNull ImageView updateButton) {
    this.rootView = rootView;
    this.TVContent = TVContent;
    this.TVTitle = TVTitle;
    this.deleteButton = deleteButton;
    this.updateButton = updateButton;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static NoteItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NoteItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.note_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NoteItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.TV_content;
      TextView TVContent = ViewBindings.findChildViewById(rootView, id);
      if (TVContent == null) {
        break missingId;
      }

      id = R.id.TV_title;
      TextView TVTitle = ViewBindings.findChildViewById(rootView, id);
      if (TVTitle == null) {
        break missingId;
      }

      id = R.id.deleteButton;
      ImageView deleteButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteButton == null) {
        break missingId;
      }

      id = R.id.updateButton;
      ImageView updateButton = ViewBindings.findChildViewById(rootView, id);
      if (updateButton == null) {
        break missingId;
      }

      return new NoteItemBinding((CardView) rootView, TVContent, TVTitle, deleteButton,
          updateButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}