package com.example.midtermbush;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static final int Activity3Accnt_REQUEST_CODE = 3;

    EditText editOutput;

    int accnt = 123456789;
    double balance= 1000;
    String bankName = "Chase";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editOutput = findViewById(R.id.editTextdisplay);

        Button btnActivity2Dice = findViewById(R.id.btnOpenDice);
        btnActivity2Dice.setOnClickListener(this);



        Button btnActivity3Accnt = findViewById(R.id.btnOpenAccntData);
        btnActivity3Accnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Activity3Accnt.class);

                startActivityForResult(intent,Activity3Accnt_REQUEST_CODE);


                Bundle bundle = new Bundle();
                bundle.putInt("accnt",accnt);
                bundle.putDouble("balance",balance);
                bundle.putString("bankname",bankName);
                intent.putExtra("mybundle",bundle);

                startActivity(intent);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

//        switch (requestCode){
//            case Activity3Accnt_REQUEST_CODE:
//                if(resultCode==RESULT_OK){
//                    Bundle bundle = data.getBundleExtra("act3bundle");
//                   int dep = bundle.getInt("valueDep");
//                    int with = bundle.getInt("valueWith");
//
//                    editOutput.setText("deposit: "+ dep+"\n" + "withdraw: "+with);
//                }
//                break;
       // }
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        if(R.id.btnOpenDice==id){
            Intent intent = new Intent(this,Activity2Dice.class);
            startActivity(intent);

        }else if(R.id.btnOpenAccntData==id){
            Intent intent = new Intent(this,Activity3Accnt.class);
            startActivity(intent);

        }



    }
}
