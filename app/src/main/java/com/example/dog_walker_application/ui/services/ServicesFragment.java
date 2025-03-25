package com.example.dog_walker_application.ui.services;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.dog_walker_application.databinding.FragmentServicesBinding;

public class ServicesFragment extends Fragment {

    private FragmentServicesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ServicesViewModel servicesViewModel =
                new ViewModelProvider(this).get(ServicesViewModel.class);

        binding = FragmentServicesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Set click listener for Terms and Conditions card
        binding.termsCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), TermsActivity.class);
            startActivity(intent);
        });

        //Click listener for Booking
        binding.bookingCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), BookingActivity.class);
            startActivity(intent);
        });

        //Click listener for FAQs
        binding.faqsCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), FaqsActivity.class);
            startActivity(intent);
        });

        //Click listener for Ratings
        binding.ratingsCard.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), RatingsActivity.class);
            startActivity(intent);
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
