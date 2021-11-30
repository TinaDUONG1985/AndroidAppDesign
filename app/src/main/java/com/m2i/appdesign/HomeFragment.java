package com.m2i.appdesign;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private EditText n1,n2,rs;
    private Button btnAdd,btnReset;



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {


    }
    private void createView(View view){

        n1=view.findViewById(R.id.nb1);
        n2=view.findViewById(R.id.nb2);
        rs=view.findViewById(R.id.result);
        btnAdd=view.findViewById(R.id.btnAdd);
        btnReset=view.findViewById(R.id.btnReset);

    }


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        /*n1=view.findViewById(R.id.nb1);
        n2=view.findViewById(R.id.nb2);
        rs=view.findViewById(R.id.result);
        btnAdd=view.findViewById(R.id.btnAdd);
        btnReset=view.findViewById(R.id.btnReset);*/
        createView(view);
        btnReset.setOnClickListener((evt)->{
            n1.setText("");n2.setText("");rs.setText("");
        });
        btnAdd.setOnClickListener((evt)->{
            int nb1=Integer.parseInt(n1.getText().toString());
            int nb2=Integer.parseInt(n2.getText().toString());
            rs.setText(String.valueOf(nb1+nb2));
        });

        return view;
    }
}


