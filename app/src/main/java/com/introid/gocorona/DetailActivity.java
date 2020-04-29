package com.introid.gocorona;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {

    TextView tvCountry,tvCases,tvTodayCases,tvDeaths,tvTodayDeaths,tvRecovered,tvActive,tvCritical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail );

        Intent intent = getIntent();
        int positionCountry = intent.getIntExtra( "position", 0 );

        Objects.requireNonNull( getSupportActionBar() ).setTitle( "Details of " +  AffectedCountries.countryModelList.get( positionCountry ).getCountry() );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        getSupportActionBar().setDisplayShowHomeEnabled( true );



        tvCountry= findViewById( R.id.tv_country_detail );
        tvCases= findViewById( R.id.tv_cases_detail );
        tvTodayCases= findViewById( R.id.tv_todayCases_detail );
        tvDeaths= findViewById( R.id.tv_deaths_detail );
        tvTodayDeaths= findViewById( R.id.tv_today_deaths);
        tvRecovered= findViewById( R.id.tv_recovered_detail );
        tvActive= findViewById( R.id.tv_active_detail );
        tvCritical = findViewById( R.id.tv_critical_detail );

        tvCountry.setText( AffectedCountries.countryModelList.get( positionCountry ).getCountry() );
        tvCases.setText( AffectedCountries.countryModelList.get( positionCountry ).getCases() );
        tvTodayCases.setText( AffectedCountries.countryModelList.get( positionCountry ).getTodayCases() );
        tvDeaths.setText( AffectedCountries.countryModelList.get( positionCountry ).getDeaths() );
        tvTodayDeaths.setText( AffectedCountries.countryModelList.get( positionCountry ).getTodayDeaths() );
        tvRecovered.setText( AffectedCountries.countryModelList.get( positionCountry ).getRecovered() );
        tvActive.setText( AffectedCountries.countryModelList.get( positionCountry ).getActive() );
        tvCritical.setText( AffectedCountries.countryModelList.get( positionCountry ).getCritical() );

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()== android.R.id.home)
            finish();
        return super.onOptionsItemSelected( item );
    }
}
