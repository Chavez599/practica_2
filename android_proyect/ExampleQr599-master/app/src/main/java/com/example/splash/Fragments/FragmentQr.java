package com.example.splash.Fragments;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.splash.R;
import com.example.splash.Validar;
import com.example.splash.home;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentQr.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentQr#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentQr extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    /**  this @param (view) */
    View view;
    Button verifyQr;
    TextView textRecived;
    ImageView check;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public FragmentQr() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentQr.
     */


    // TODO: Rename and change types and number of parameters
    public static FragmentQr newInstance(String param1, String param2) {
        FragmentQr fragment = new FragmentQr();
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
        view = inflater.inflate(R.layout.fragment_fragment_qr, container, false);
        verifyQr = view.findViewById(R.id.btnqr);
        textRecived = view.findViewById(R.id.tvreceived);
        check = view.findViewById(R.id.imgMuestra);

        verifyQr.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder terminos = new AlertDialog.Builder( getActivity() );
                terminos.setTitle( "Terminos y condiciones" )
                        .setMessage( getString( R.string.terminos ) )
                        .setPositiveButton( "Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IntentIntegrator.forSupportFragment( FragmentQr.this ).initiateScan();
                            }
                        } )

                        .setNegativeButton( "Cancelar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                home add = new home();
                                add.closs();
                                /* add.finish(); */
                         }
});
                AlertDialog alertDialog = terminos.create();
                alertDialog.show();
            }


        } );

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        /*super.onActivityResult( requestCode, resultCode, data );*/
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result.getContents() == null) {
                /*Toast.makeText( this, "Cancelled", Toast.LENGTH_LONG ).show();*/
        } else {
            Validar key = new Validar();
            String verificacion [] = result.getContents().split( "/" );
            String rKey = verificacion[0];
            if (key.ValidarContenido( rKey ).equals( "valida" )) {
               // textRecived.setText( verificacion[1] + "\n" + verificacion[2] + "\n" + verificacion[3] + "\n");
                for (int i = 1; i < 4; i++) {
                textRecived.setText( verificacion[i]); }
            } else{
                Toast.makeText(getContext(), "Esto es una falsificacion", Toast.LENGTH_SHORT ).show();
            }
               // textRecived.setText( result.getContents() );
                /*Toast.makeText( this, "Scanned: " + result.getContents(), Toast.LENGTH_LONG ).show();*/
        }
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
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
