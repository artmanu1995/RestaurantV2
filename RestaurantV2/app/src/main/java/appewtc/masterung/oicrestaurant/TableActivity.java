package appewtc.masterung.oicrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;

/**
 * Created by AloneBOY on 03/09/2017.
 */

public class TableActivity extends ActionBarActivity {

    private TextView txtShowOfficer;
    private String strOfficer, strTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        showDate();
        bindWidget();
        showOfficer();
    }
    private void showOfficer() {
        strOfficer = getIntent().getExtras().getString("Officer");
        txtShowOfficer.setText(strOfficer);
    }

    private void bindWidget() {
        txtShowOfficer = (TextView) findViewById(R.id.txtShowOfficer);
    }

    private void showDate() {
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView time = (TextView) findViewById(R.id.txtShowDateTime);
                                long date = System.currentTimeMillis();
                                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH : mm : ss");
                                String dateString = sdf.format(date);
                                time.setText(dateString);
                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };
        t.start();
    }

    public void btn1Click(View view){
        strTable = "01";
        Button btn_ok = (Button)findViewById(R.id.button1);
        Intent intent = new Intent(TableActivity.this, OrderActivity.class);
        intent.putExtra("Officer", strOfficer);
        intent.putExtra("Table", strTable);
        startActivity(intent);
    }

    public void btn2Click(View view) {
        strTable = "02";
        Button btn_ok = (Button)findViewById(R.id.button2);
        Intent intent = new Intent(TableActivity.this, OrderActivity.class);
        intent.putExtra("Officer", strOfficer);
        intent.putExtra("Table", strTable);
        startActivity(intent);
    }

    public void btn3Click(View view) {
        strTable = "03";
        Button btn_ok = (Button)findViewById(R.id.button3);
        Intent intent = new Intent(TableActivity.this, OrderActivity.class);
        intent.putExtra("Officer", strOfficer);
        intent.putExtra("Table", strTable);
        startActivity(intent);
    }

    public void btn4Click(View view) {
        strTable = "04";
        Button btn_ok = (Button)findViewById(R.id.button4);
        Intent intent = new Intent(TableActivity.this, OrderActivity.class);
        intent.putExtra("Officer", strOfficer);
        intent.putExtra("Table", strTable);
        startActivity(intent);
    }

    public void btn5Click(View view) {
        strTable = "05";
        Button btn_ok = (Button)findViewById(R.id.button5);
        Intent intent = new Intent(TableActivity.this, OrderActivity.class);
        intent.putExtra("Officer", strOfficer);
        intent.putExtra("Table", strTable);
        startActivity(intent);
    }

    public void btn6Click(View view) {
        strTable = "06";
        Button btn_ok = (Button)findViewById(R.id.button6);
        Intent intent = new Intent(TableActivity.this, OrderActivity.class);
        intent.putExtra("Officer", strOfficer);
        intent.putExtra("Table", strTable);
        startActivity(intent);
    }

    public void btn7Click(View view) {
        strTable = "07";
        Button btn_ok = (Button)findViewById(R.id.button7);
        Intent intent = new Intent(TableActivity.this, OrderActivity.class);
        intent.putExtra("Officer", strOfficer);
        intent.putExtra("Table", strTable);
        startActivity(intent);
    }

    public void btn8Click(View view) {
        strTable = "08";
        Button btn_ok = (Button)findViewById(R.id.button8);
        Intent intent = new Intent(TableActivity.this, OrderActivity.class);
        intent.putExtra("Officer", strOfficer);
        intent.putExtra("Table", strTable);
        startActivity(intent);
    }

    public void btn9Click(View view) {
        strTable = "09";
        Button btn_ok = (Button)findViewById(R.id.button9);
        Intent intent = new Intent(TableActivity.this, OrderActivity.class);
        intent.putExtra("Officer", strOfficer);
        intent.putExtra("Table", strTable);
        startActivity(intent);
    }
}
