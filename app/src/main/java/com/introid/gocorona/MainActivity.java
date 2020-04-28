package com.introid.gocorona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.leo.simplearcloader.SimpleArcDialog;
import com.leo.simplearcloader.SimpleArcLoader;

import org.eazegraph.lib.charts.PieChart;

public class MainActivity extends AppCompatActivity {
    TextView tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTodayDeaths,tvTotalDeaths,tvAffectedCountries;
    SimpleArcLoader simpleArcLoader;
    ScrollView scrollView;
    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        tvCases= findViewById( R.id.tv_cases );
        tvRecovered= findViewById( R.id.tv_recovered );
        tvCritical= findViewById( R.id.tv_critical );
        tvActive= findViewById( R.id.tv_active );
        tvTodayCases= findViewById( R.id.tv_todayCases );
        tvTodayDeaths= findViewById( R.id.tv_todayDeaths );
        tvTotalDeaths= findViewById( R.id.tv_totalDeaths );
        tvAffectedCountries= findViewById( R.id.tv_affectedCountries );

        simpleArcLoader= findViewById( R.id.loader );
        scrollView= findViewById( R.id.scroll_stats );
        pieChart= findViewById( R.id.piechart );

        fetchData();
    }

    private void fetchData() {
        String url= "https://corona.lmao.ninja/v2/all/";
        simpleArcLoader.start();

        StringRequest request= new StringRequest( Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        } );
    }

    public void goTrackCountries(View view) {
    }
}
