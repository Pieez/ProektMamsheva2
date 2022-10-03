package com.example.proektmamsheva;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;



import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MainActivity extends AppCompatActivity {

    Connection connect;
    String ConnectionResult="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GetTextFromSQL(View v)
    {
        TextView tx1 = (TextView) findViewById(R.id.etName);
        TextView tx2 = (TextView) findViewById(R.id.etEmail);

        try {
            ConnectionClass connectionClass = new ConnectionClass();
            connect =connectionClass.connectionClass();
            if(connect!=null)
            {
                String query = "Select * from Table_1";
                Statement st = connect.createStatement();
                ResultSet rs = st.executeQuery(query);

                while (rs.next())
                {
                    tx1.setText(rs.getString(1));
                    tx2.setText(rs.getString(2));
                }

            }
            else
            {
                ConnectionResult = "Check Connection";
            }
        }
        catch (Exception ex)
        {

        }

    }



}
