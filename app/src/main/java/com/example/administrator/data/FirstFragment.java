package com.example.administrator.data;

import android.os.Bundle;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;



import androidx.fragment.app.Fragment;



    public class FirstFragment extends Fragment {

        public FirstFramgment(){



        }



        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

            return inflater.inflate(R.layout.frame_first,container);

        }

    }


