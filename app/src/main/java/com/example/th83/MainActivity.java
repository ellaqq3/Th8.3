package com.example.th83;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView näkymä;
    TextView teksti;
    SeekBar seekBar;
    int money = 0;
    BottleDispenser bot = BottleDispenser.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        näkymä = (TextView) findViewById(R.id.textView);
        teksti = (TextView) findViewById(R.id.pullomaatti);
        seekBar=(SeekBar)findViewById(R.id.seekBar);
        teksti.setText("Bottle Dispenser");


/////////////////// seekbar //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                Toast.makeText(getApplicationContext(), "Money: " + progress +"€", Toast.LENGTH_SHORT).show();
                money = progress;
            }

            @Override
          public void onStartTrackingTouch(SeekBar seekBar) {
           }

           @Override
          public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void AddMoney(View v) {
        String moneyStr = new Float(money).toString();
        bot.addMoney(money);
        näkymä.setText("Money added, " +moneyStr + "€");
        seekBar.setProgress(0);
        }

    public void BuyBottle(View v){
        int num = bot.buyBottle();
        if (num == 11) {
            näkymä.setText("Bottle came out of dispenser");
        }
        else if (num == 0) {
            näkymä.setText("Add more money first");
        }
    }

    public void ReturnMoney(View v){
        float money;
        money = bot.returnMoney();
        String moneyString = new Float(money).toString();
        näkymä.setText("Money came out! You got " + moneyString+ "€ back\n");
    }
}

