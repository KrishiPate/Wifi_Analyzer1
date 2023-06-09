// Generated by view binder compiler. Do not edit!
package com.vrem.wifianalyzer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vrem.wifianalyzer.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AccessPointViewPopupBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView capabilitiesLong;

  @NonNull
  public final TextView flag80211mc;

  @NonNull
  public final TextView timestamp;

  @NonNull
  public final TextView wiFiBand;

  @NonNull
  public final TextView wiFiStandard;

  private AccessPointViewPopupBinding(@NonNull LinearLayout rootView,
      @NonNull TextView capabilitiesLong, @NonNull TextView flag80211mc,
      @NonNull TextView timestamp, @NonNull TextView wiFiBand, @NonNull TextView wiFiStandard) {
    this.rootView = rootView;
    this.capabilitiesLong = capabilitiesLong;
    this.flag80211mc = flag80211mc;
    this.timestamp = timestamp;
    this.wiFiBand = wiFiBand;
    this.wiFiStandard = wiFiStandard;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AccessPointViewPopupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AccessPointViewPopupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.access_point_view_popup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AccessPointViewPopupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.capabilitiesLong;
      TextView capabilitiesLong = ViewBindings.findChildViewById(rootView, id);
      if (capabilitiesLong == null) {
        break missingId;
      }

      id = R.id.flag80211mc;
      TextView flag80211mc = ViewBindings.findChildViewById(rootView, id);
      if (flag80211mc == null) {
        break missingId;
      }

      id = R.id.timestamp;
      TextView timestamp = ViewBindings.findChildViewById(rootView, id);
      if (timestamp == null) {
        break missingId;
      }

      id = R.id.wiFiBand;
      TextView wiFiBand = ViewBindings.findChildViewById(rootView, id);
      if (wiFiBand == null) {
        break missingId;
      }

      id = R.id.wiFiStandard;
      TextView wiFiStandard = ViewBindings.findChildViewById(rootView, id);
      if (wiFiStandard == null) {
        break missingId;
      }

      return new AccessPointViewPopupBinding((LinearLayout) rootView, capabilitiesLong, flag80211mc,
          timestamp, wiFiBand, wiFiStandard);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
