package com.example.midtermbush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3Accnt extends AppCompatActivity {


    TextView AccntOutput;
    EditText editBalanceDeposit;
    EditText editBalanceWithdraw;
    TextView finalBalance;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3_accnt);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getBundleExtra("mybundle");


        int accnt = bundle.getInt("accnt");
       double balance= bundle.getDouble("balance");
        String bankname = bundle.getString("bankname");

        AccntOutput = findViewById(R.id.AccntOutput);
        AccntOutput.append("Account Number is : "+accnt+ "\n"+ "Balance = " + balance+ "\n"+ "BankName is :" +bankname );

//
//        editBalanceDeposit=findViewById(R.id.editBalanceDeposit);
//        editBalanceWithdraw=findViewById(R.id.editBalanceWithdraw);

//        Button btnSendDataBack=findViewById(R.id.btnAct3SendDataBack);
//        btnSendDataBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {


//                int dep = Integer.parseInt(editBalanceDeposit.getText().toString());
//               int with = Integer.parseInt(editBalanceWithdraw.getText().toString());
//
//
//               //int depMoney = balance + dep;
//              // int withMoney = balance - with;
//
//
//                Intent intent = new Intent();
//                Bundle bundle = new Bundle();
////
//                //bundle.putInt("deposit",depMoney);
//               // bundle.putInt("withdraw",withMoney);
//                intent.putExtra("act3bundle", bundle);
//
//                setResult(RESULT_OK, intent);
//                finish();
//            }
//
//
//        });



    }
}
