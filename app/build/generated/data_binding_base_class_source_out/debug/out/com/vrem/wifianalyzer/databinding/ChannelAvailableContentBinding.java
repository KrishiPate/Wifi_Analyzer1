// Generated by view binder compiler. Do not edit!
package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vrem.wifianalyzer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ChannelAvailableContentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ListView list;

  private ChannelAvailableContentBinding(@NonNull LinearLayout rootView, @NonNull ListView list) {
    this.rootView = rootView;
    this.list = list;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChannelAvailableContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChannelAvailableContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.channel_available_content, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChannelAvailableContentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = android.R.id.list;
      ListView list = ViewBindings.findChildViewById(rootView, id);
      if (list == null) {
        break missingId;
      }

      return new ChannelAvailableContentBinding((LinearLayout) rootView, list);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
