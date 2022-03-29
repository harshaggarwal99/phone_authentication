package com.aksingh.android.firebase;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.aksingh.android.firebase.databinding.ActivityVerifyPhoneBinding;

public class VerifyPhoneActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityVerifyPhoneBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_verify_phone);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.phoneContainer);
        if (fragment == null)
        {
            fragment = new VerifyPhone();
            fm.beginTransaction().add(R.id.phoneContainer, fragment).commit();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_verify_phone);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}