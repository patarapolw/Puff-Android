package sun.bob.leela.ui.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import fr.ganfra.materialspinner.MaterialSpinner;
import sun.bob.leela.R;
import sun.bob.leela.adapters.TypeSpinnerAdapter;

public class AddAccountActivity extends AppCompatActivity {

    MaterialSpinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spinner = (MaterialSpinner) findViewById(R.id.spinner_category);
        spinner.setAdapter(new TypeSpinnerAdapter(this,android.R.layout.simple_dropdown_item_1line));


    }

}
