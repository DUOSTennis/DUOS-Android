// Generated by view binder compiler. Do not edit!
package com.example.duos.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.duos.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMyProfileBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ConstraintLayout bottomLikeAndChatCl;

  @NonNull
  public final ImageView buttonBottomLikeIv;

  @NonNull
  public final TextView careerGameTv;

  @NonNull
  public final View careerLine1;

  @NonNull
  public final View careerLine2;

  @NonNull
  public final View careerLine3;

  @NonNull
  public final TextView careerPlayedNumTv;

  @NonNull
  public final TextView careerTv;

  @NonNull
  public final TextView careerYearNumTv;

  @NonNull
  public final TextView careerYearUnderMoreThanTv;

  @NonNull
  public final View dividerWithAgeAndSex;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView myGenerationTv;

  @NonNull
  public final LinearLayout myGradeLl;

  @NonNull
  public final TextView myGradeNumTv;

  @NonNull
  public final TextView myIntroductionTv;

  @NonNull
  public final TextView myNicknameTv;

  @NonNull
  public final LinearLayout myPlaceLl;

  @NonNull
  public final CardView myProfileImgCv;

  @NonNull
  public final TextView mySexTv;

  @NonNull
  public final RecyclerView playingReviewContentRv;

  @NonNull
  public final ImageView playingReviewIv;

  @NonNull
  public final TextView playingReviewTv;

  @NonNull
  public final TextView textView;

  private FragmentMyProfileBinding(@NonNull NestedScrollView rootView,
      @NonNull ConstraintLayout bottomLikeAndChatCl, @NonNull ImageView buttonBottomLikeIv,
      @NonNull TextView careerGameTv, @NonNull View careerLine1, @NonNull View careerLine2,
      @NonNull View careerLine3, @NonNull TextView careerPlayedNumTv, @NonNull TextView careerTv,
      @NonNull TextView careerYearNumTv, @NonNull TextView careerYearUnderMoreThanTv,
      @NonNull View dividerWithAgeAndSex, @NonNull ImageView imageView,
      @NonNull TextView myGenerationTv, @NonNull LinearLayout myGradeLl,
      @NonNull TextView myGradeNumTv, @NonNull TextView myIntroductionTv,
      @NonNull TextView myNicknameTv, @NonNull LinearLayout myPlaceLl,
      @NonNull CardView myProfileImgCv, @NonNull TextView mySexTv,
      @NonNull RecyclerView playingReviewContentRv, @NonNull ImageView playingReviewIv,
      @NonNull TextView playingReviewTv, @NonNull TextView textView) {
    this.rootView = rootView;
    this.bottomLikeAndChatCl = bottomLikeAndChatCl;
    this.buttonBottomLikeIv = buttonBottomLikeIv;
    this.careerGameTv = careerGameTv;
    this.careerLine1 = careerLine1;
    this.careerLine2 = careerLine2;
    this.careerLine3 = careerLine3;
    this.careerPlayedNumTv = careerPlayedNumTv;
    this.careerTv = careerTv;
    this.careerYearNumTv = careerYearNumTv;
    this.careerYearUnderMoreThanTv = careerYearUnderMoreThanTv;
    this.dividerWithAgeAndSex = dividerWithAgeAndSex;
    this.imageView = imageView;
    this.myGenerationTv = myGenerationTv;
    this.myGradeLl = myGradeLl;
    this.myGradeNumTv = myGradeNumTv;
    this.myIntroductionTv = myIntroductionTv;
    this.myNicknameTv = myNicknameTv;
    this.myPlaceLl = myPlaceLl;
    this.myProfileImgCv = myProfileImgCv;
    this.mySexTv = mySexTv;
    this.playingReviewContentRv = playingReviewContentRv;
    this.playingReviewIv = playingReviewIv;
    this.playingReviewTv = playingReviewTv;
    this.textView = textView;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMyProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMyProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_my_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMyProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_like_and_chat_cl;
      ConstraintLayout bottomLikeAndChatCl = ViewBindings.findChildViewById(rootView, id);
      if (bottomLikeAndChatCl == null) {
        break missingId;
      }

      id = R.id.button_bottom_like_iv;
      ImageView buttonBottomLikeIv = ViewBindings.findChildViewById(rootView, id);
      if (buttonBottomLikeIv == null) {
        break missingId;
      }

      id = R.id.career_game_tv;
      TextView careerGameTv = ViewBindings.findChildViewById(rootView, id);
      if (careerGameTv == null) {
        break missingId;
      }

      id = R.id.career_line1;
      View careerLine1 = ViewBindings.findChildViewById(rootView, id);
      if (careerLine1 == null) {
        break missingId;
      }

      id = R.id.career_line2;
      View careerLine2 = ViewBindings.findChildViewById(rootView, id);
      if (careerLine2 == null) {
        break missingId;
      }

      id = R.id.career_line3;
      View careerLine3 = ViewBindings.findChildViewById(rootView, id);
      if (careerLine3 == null) {
        break missingId;
      }

      id = R.id.career_played_num_tv;
      TextView careerPlayedNumTv = ViewBindings.findChildViewById(rootView, id);
      if (careerPlayedNumTv == null) {
        break missingId;
      }

      id = R.id.career_tv;
      TextView careerTv = ViewBindings.findChildViewById(rootView, id);
      if (careerTv == null) {
        break missingId;
      }

      id = R.id.career_year_num_tv;
      TextView careerYearNumTv = ViewBindings.findChildViewById(rootView, id);
      if (careerYearNumTv == null) {
        break missingId;
      }

      id = R.id.career_year_under_more_than_tv;
      TextView careerYearUnderMoreThanTv = ViewBindings.findChildViewById(rootView, id);
      if (careerYearUnderMoreThanTv == null) {
        break missingId;
      }

      id = R.id.divider_with_age_and_sex;
      View dividerWithAgeAndSex = ViewBindings.findChildViewById(rootView, id);
      if (dividerWithAgeAndSex == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.my_generation_tv;
      TextView myGenerationTv = ViewBindings.findChildViewById(rootView, id);
      if (myGenerationTv == null) {
        break missingId;
      }

      id = R.id.my_grade_ll;
      LinearLayout myGradeLl = ViewBindings.findChildViewById(rootView, id);
      if (myGradeLl == null) {
        break missingId;
      }

      id = R.id.my_grade_num_tv;
      TextView myGradeNumTv = ViewBindings.findChildViewById(rootView, id);
      if (myGradeNumTv == null) {
        break missingId;
      }

      id = R.id.my_introduction_tv;
      TextView myIntroductionTv = ViewBindings.findChildViewById(rootView, id);
      if (myIntroductionTv == null) {
        break missingId;
      }

      id = R.id.my_nickname_tv;
      TextView myNicknameTv = ViewBindings.findChildViewById(rootView, id);
      if (myNicknameTv == null) {
        break missingId;
      }

      id = R.id.my_place_ll;
      LinearLayout myPlaceLl = ViewBindings.findChildViewById(rootView, id);
      if (myPlaceLl == null) {
        break missingId;
      }

      id = R.id.myProfile_img_cv;
      CardView myProfileImgCv = ViewBindings.findChildViewById(rootView, id);
      if (myProfileImgCv == null) {
        break missingId;
      }

      id = R.id.my_sex_tv;
      TextView mySexTv = ViewBindings.findChildViewById(rootView, id);
      if (mySexTv == null) {
        break missingId;
      }

      id = R.id.playing_review_content_rv;
      RecyclerView playingReviewContentRv = ViewBindings.findChildViewById(rootView, id);
      if (playingReviewContentRv == null) {
        break missingId;
      }

      id = R.id.playing_review_iv;
      ImageView playingReviewIv = ViewBindings.findChildViewById(rootView, id);
      if (playingReviewIv == null) {
        break missingId;
      }

      id = R.id.playing_review_tv;
      TextView playingReviewTv = ViewBindings.findChildViewById(rootView, id);
      if (playingReviewTv == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new FragmentMyProfileBinding((NestedScrollView) rootView, bottomLikeAndChatCl,
          buttonBottomLikeIv, careerGameTv, careerLine1, careerLine2, careerLine3,
          careerPlayedNumTv, careerTv, careerYearNumTv, careerYearUnderMoreThanTv,
          dividerWithAgeAndSex, imageView, myGenerationTv, myGradeLl, myGradeNumTv,
          myIntroductionTv, myNicknameTv, myPlaceLl, myProfileImgCv, mySexTv,
          playingReviewContentRv, playingReviewIv, playingReviewTv, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}