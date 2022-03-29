package com.aksingh.android.firebase;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VerifyPhone#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VerifyPhone extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View rootView;
    LinearLayout layoutPhone;
    LinearLayout verify;
    Button sendVerification;

    public VerifyPhone() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VerifyPhone.
     */
    // TODO: Rename and change types and number of parameters
    public static VerifyPhone newInstance(String param1, String param2) {
        VerifyPhone fragment = new VerifyPhone();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_verify_phone, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        layoutPhone = rootView.findViewById(R.id.layoutPhone);
        layoutPhone.setVisibility(View.VISIBLE);

        verify = rootView.findViewById(R.id.layoutVerification);
        verify.setVisibility(View.GONE);

        sendVerification = rootView.findViewById(R.id.button_send_verification);

        sendVerification.setOnClickListener(view1 -> {
            layoutPhone.setVisibility(View.GONE);
            verify.setVisibility(View.INVISIBLE);
        });

    }
}