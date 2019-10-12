package com.example.splash.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.splash.Fragments.Adapter.Adapter;
import com.example.splash.Fragments.Models.contact;
import com.example.splash.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment2.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment2 extends Fragment {

    RecyclerView rcv;
    Adapter adapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    View v;

    private OnFragmentInteractionListener mListener;

    public Fragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();
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
        //v=inflater.inflate(R.layout.fragment_fragment2, container, false);
        v=inflater.inflate(R.layout.fragment_fragment2, container, false);
        rcv = v.findViewById (R.id.rcv);
        rcv.setHasFixedSize( true );
        rcv.setLayoutManager( new LinearLayoutManager( getContext() ) );
        adapter = new Adapter( getData() );
        rcv.setAdapter( adapter );
        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public List<contact> getData () {
        List<contact> usuarios = new ArrayList<>();
        usuarios.add( new contact( "Rogelio", R.drawable.boy ) );
        usuarios.add( new contact( "Azamir", R.drawable.boy ) );
        usuarios.add( new contact( "Juan", R.drawable.boy ) );
        usuarios.add( new contact( "Edwin", R.drawable.boy ) );
        usuarios.add( new contact( "Arturo", R.drawable.boy ) );
        usuarios.add( new contact( "Jaime", R.drawable.boy ) );
        usuarios.add( new contact( "Daniel", R.drawable.boy ) );
        usuarios.add( new contact( "Isaac", R.drawable.boy ) );
        usuarios.add( new contact( "Teacher", R.drawable.boy ) );
        usuarios.add( new contact( "Rogelio", R.drawable.boy ) );
        usuarios.add( new contact( "Azamir", R.drawable.boy ) );
        usuarios.add( new contact( "Juan", R.drawable.boy ) );
        usuarios.add( new contact( "Edwin", R.drawable.boy ) );
        usuarios.add( new contact( "Arturo", R.drawable.boy ) );
        usuarios.add( new contact( "Jaime", R.drawable.boy ) );
        usuarios.add( new contact( "Daniel", R.drawable.boy ) );
        usuarios.add( new contact( "Isaac", R.drawable.boy ) );
        usuarios.add( new contact( "Teacher", R.drawable.boy ) );
        usuarios.add( new contact( "Rogelio", R.drawable.boy ) );
        usuarios.add( new contact( "Azamir", R.drawable.boy ) );
        usuarios.add( new contact( "Juan", R.drawable.boy ) );
        usuarios.add( new contact( "Edwin", R.drawable.boy ) );
        usuarios.add( new contact( "Arturo", R.drawable.boy ) );
        usuarios.add( new contact( "Jaime", R.drawable.boy ) );
        usuarios.add( new contact( "Daniel", R.drawable.boy ) );
        usuarios.add( new contact( "Isaac", R.drawable.boy ) );
        usuarios.add( new contact( "Teacher", R.drawable.boy ) );
        return  usuarios;
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
