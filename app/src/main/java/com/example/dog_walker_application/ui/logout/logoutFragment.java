package com.example.dog_walker_application.ui.logout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dog_walker_application.R;
import com.example.dog_walker_application.databinding.FragmentLogoutBinding;
import com.example.dog_walker_application.LoginActivity;

public class logoutFragment extends Fragment {

    private FragmentLogoutBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Initialize ViewModel (if needed)
        logoutViewModel logoutViewModel =
                new ViewModelProvider(this).get(logoutViewModel.class);

        // Inflate layout
        binding = FragmentLogoutBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Set up the logout message
        binding.buttonExit.setText("Signout and close app");  // Ensure textLogout exists

        // Set up onClickListener for logout (simulate logout click)
        binding.buttonExit.setOnClickListener(v -> {
            // Close the app
            getActivity().finish();  // Finish the current activity
            System.exit(0);  // Forcefully close the app (if necessary)
        });

        // Set up onClickListener for login again
        binding.buttonLogin.setOnClickListener(v -> {
            // Navigate to the LoginActivity
            Intent intent = new Intent(getActivity(), LoginActivity.class);
            startActivity(intent);
            getActivity().finish();  // Finish the current activity
        });

        return root;
    }
}
