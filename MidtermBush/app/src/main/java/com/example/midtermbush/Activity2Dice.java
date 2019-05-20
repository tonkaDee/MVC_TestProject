package com.example.midtermbush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Activity2Dice extends AppCompatActivity {

    EditText entry;
    EditText entry2;
    public static final Random RANDOM = new Random();
    private Button player1Roll;
    private Button player2Roll;
    private ImageView imageV1,imageV2,imageV3,imageV4;
    private static double PLAYER1WAGER;
    private static double PLAYER2WAGER;
    private static double TOTALWAGER;
    private static double PLAYER1MONEY = 50;
    private static double PLAYER2MONEY = 50;
    private static int PLAYER1POINTS = 0;
    private static int PLAYER2POINTS = 0;
    TextView tvresult;
    TextView tvresult2;
    int total= 0;
    private static int PLAYER1TOTAL = 0;
    private static int PLAYER2TOTAL = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_dice);
        player1Roll = (Button) findViewById(R.id.player1Roll);
        player2Roll = (Button) findViewById(R.id.player2Roll);
        imageV1 = (ImageView) findViewById(R.id.imageV1);
        imageV2 = (ImageView) findViewById(R.id.imageV2);
        imageV3 = (ImageView) findViewById(R.id.imageV3);
        imageV4 = (ImageView) findViewById(R.id.imageV4);
        entry = findViewById(R.id.m5);
        entry2 = findViewById(R.id.editBalanceDeposit);
        tvresult = findViewById(R.id.tv4result);
        tvresult2 = findViewById(R.id.tv4result2);


        player1Roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               tvresult.setText("");
                entry = findViewById(R.id.m5);
                entry2 = findViewById(R.id.editBalanceDeposit);
                int value1 = randomValue();
                int value2 = randomValue();
                int value3 = randomValue();
                int value4 = randomValue();

                String Name="";

                int res1 = getResources().getIdentifier("die" + value1, "drawable", "com.example.midtermbush");
                int res2 = getResources().getIdentifier("die" + value2, "drawable", "com.example.midtermbush");
                int res3 = getResources().getIdentifier("die" + value3, "drawable", "com.example.midtermbush");
                int res4 = getResources().getIdentifier("die" + value4, "drawable", "com.example.midtermbush");

                imageV1.setImageResource(res1);
                imageV2.setImageResource(res2);
                imageV3.setImageResource(res3);
                imageV4.setImageResource(res4);

                if (PLAYER1TOTAL > 50){

                    String win = ("Player 1 Wins \n");
                    String player1Total = "Player 1 Total Winnings Are: ";

                    PLAYER2TOTAL = 0;
                    PLAYER1TOTAL = 0;
                    entry = findViewById(R.id.m5);
                    entry2 = findViewById(R.id.editBalanceDeposit);
                    final Double userInput = Double.parseDouble(entry.getText().toString());
                    final Double userInput2 = Double.parseDouble(entry2.getText().toString());

                    double p1AB = PLAYER1MONEY-userInput;
                    double totalBet = userInput+userInput2;
                    PLAYER1MONEY = p1AB + totalBet;

                    tvresult.append(win + player1Total + PLAYER1MONEY);
                }
                else {
                    Name = "Player 1 Roll Total ";
                    String p1Bet = "Player 1 Bet ";
                    String TotalBet = "Total Bet ";
                    PLAYER1POINTS = (value1 + value2 + value3 + value4);
                    PLAYER1TOTAL += PLAYER1POINTS;
                    entry = findViewById(R.id.m5);
                    entry2 = findViewById(R.id.editBalanceDeposit);
                    final Double userInput = Double.parseDouble(entry.getText().toString());
                    final Double userInput2 = Double.parseDouble(entry2.getText().toString());
                    double totalBet = userInput+userInput2;
                    tvresult.append(Name + PLAYER1TOTAL + "\n" + p1Bet+ userInput +"\n"+ TotalBet + totalBet);
                }

            }
        });

        player2Roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvresult2.setText("");
                entry = findViewById(R.id.m5);
                entry2 = findViewById(R.id.editBalanceDeposit);
                int value1 = randomValue();
                int value2 = randomValue();
                int value3 = randomValue();
                int value4 = randomValue();

                String Name="";

                int res1 = getResources().getIdentifier("die" + value1, "drawable", "com.example.midtermbush");
                int res2 = getResources().getIdentifier("die" + value2, "drawable", "com.example.midtermbush");
                int res3 = getResources().getIdentifier("die" + value3, "drawable", "com.example.midtermbush");
                int res4 = getResources().getIdentifier("die" + value4, "drawable", "com.example.midtermbush");

                imageV1.setImageResource(res1);
                imageV2.setImageResource(res2);
                imageV3.setImageResource(res3);
                imageV4.setImageResource(res4);


                if (PLAYER2TOTAL > 50){

                    String win = ("Player 2 Wins");
                    String player2Total = "Player 2 Total Winnings Are: ";

                    tvresult2.append(win);
                    PLAYER2TOTAL = 0;
                    PLAYER1TOTAL = 0;
                    entry = findViewById(R.id.m5);
                    entry2 = findViewById(R.id.editBalanceDeposit);
                    final Double userInput = Double.parseDouble(entry.getText().toString());
                    final Double userInput2 = Double.parseDouble(entry2.getText().toString());

                    double p2AB = PLAYER1MONEY-userInput;
                    double totalBet = userInput+userInput2;
                    PLAYER2MONEY = p2AB + totalBet;
                    tvresult2.append(win + player2Total + PLAYER2MONEY);
                }
                else {
                    Name = "Player 2 Total Score ";
                    String p2Bet = "Player 2 Bet ";
                    String TotalBet = "Total Bet To Win";
                    PLAYER2POINTS = (value1 + value2 + value3 + value4);
                    PLAYER2TOTAL += PLAYER2POINTS;
                    entry = findViewById(R.id.m5);
                    entry2 = findViewById(R.id.editBalanceDeposit);
                    final Double userInput = Double.parseDouble(entry.getText().toString());
                    final Double userInput2 = Double.parseDouble(entry2.getText().toString());
                    double totalBet = userInput+userInput2;
                    //PLAYER1TOTAL = total;
                    tvresult2.append(Name += PLAYER2TOTAL +"\n" + p2Bet+ userInput2 +"\n"+ TotalBet + totalBet);
                }
            }
        });
    }

    public static int randomValue(){
        return RANDOM.nextInt(6)+1;
    }
}
