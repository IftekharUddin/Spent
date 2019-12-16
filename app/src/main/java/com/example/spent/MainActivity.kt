package com.example.spent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moneyLeft = findViewById<TextView>(R.id.moneyLeft);
        val spendDollars = findViewById<TextView>(R.id.spendDollars);
        val spend = findViewById<Button>(R.id.spend);

        fun sub() {
            val totalMoney = moneyLeft.text.toString().toDouble();
            val gonnaSpend = spendDollars.text.toString().toDouble();

            if(totalMoney != null && gonnaSpend != null){
                val moneyRemaining = totalMoney-gonnaSpend;
                moneyLeft.text = moneyRemaining.toString();
            }
        }

        spend.setOnClickListener {
            sub();
        }

        moneyLeft.setOnClickListener {
            moneyLeft.text = moneyLeft.text.toString();
        }

        spendDollars.setOnClickListener {
            sub();
        }


    }
}
