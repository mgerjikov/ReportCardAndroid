package com.example.android.reportcardandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /**
     * String tag variable that is used to identify the source of a log message
     */
    static final private String LOG = "ReportCard";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Create an ArrayList of ReportCardObject objects:
         */
        ArrayList<ReportCardObject> report = new ArrayList<ReportCardObject>();
        report.add(new ReportCardObject("English", "Jack Davis", 75));
        report.add(new ReportCardObject("Mathematics", "Olivia Jones ", 81));
        report.add(new ReportCardObject("Algorithms", "Audrey Smith ", 69));
        report.add(new ReportCardObject("Physics", "Michael Baker", 90));
        /**
         * Constructs a new object of the ReportCard class
         */
        ReportCard reportCard = new ReportCard("Adam Anderson", report);
        /**
         * Declaring String variable humanReadaleText that stores the output of the
         * overridden toStrring() method in ReportCard class
         */
        String humanReadableText = reportCard.toString();
        /**
         * Using public final class Log with public method v that takes two
         * parameters String tag and String message
         */
        Log.v(LOG, humanReadableText);
        /**
         * TextView in activity_main.xml used to print out the information on the screen
         */
        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText(humanReadableText);


    }


}
