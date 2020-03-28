package jp.ac.seiko.yabe.newminatosimplecalculator;

//参考サイト
// https://sites.google.com/a/gclue.jp/android-docs-2009/dian-zhuono-zuo-cheng
//その他Qiita記事

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonMinus, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    TextView ShikiText;
    TextView answer;
    TextView shisoku;

    boolean zerostop;
    boolean zerogo;

    float mValueOne, mValueTwo;

    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.Button0);
        button1 = findViewById(R.id.Button1);
        button2 = findViewById(R.id.Button2);
        button3 = findViewById(R.id.Button3);
        button4 = findViewById(R.id.Button4);
        button5 = findViewById(R.id.Button5);
        button6 = findViewById(R.id.Button6);
        button7 = findViewById(R.id.Button7);
        button8 = findViewById(R.id.Button8);
        button9 = findViewById(R.id.Button9);
        buttonAdd = findViewById(R.id.ButtonPlus);
        buttonMinus = findViewById(R.id.ButtonMinus);
        buttonMul = findViewById(R.id.ButtonMultiply);
        buttonDivision = findViewById(R.id.Buttonwaru);
        buttonC = findViewById(R.id.ButtonClear);
        buttonEqual = findViewById(R.id.ButtonEqual);
        ShikiText = findViewById(R.id.Loading);
        answer = findViewById(R.id.Answer);
        shisoku = findViewById(R.id.NowText);

        zerostop = true;
        zerogo = true;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    ShikiText.setText("");
                    zerostop = true;

                }
                ShikiText.setText(ShikiText.getText() + "1");
                zerogo = false;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    ShikiText.setText("");
                    zerostop = true;

                }
                ShikiText.setText(ShikiText.getText() + "2");
                zerogo = false;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    ShikiText.setText("");
                    zerostop = true;

                }
                ShikiText.setText(ShikiText.getText() + "3");
                zerogo = false;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    ShikiText.setText("");
                    zerostop = true;

                }
                ShikiText.setText(ShikiText.getText() + "4");
                zerogo = false;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    ShikiText.setText("");
                    zerostop = true;

                }
                ShikiText.setText(ShikiText.getText() + "5");
                zerogo = false;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    ShikiText.setText("");
                    zerostop = true;

                }
                ShikiText.setText(ShikiText.getText() + "6");
                zerogo = false;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    ShikiText.setText("");
                    zerostop = true;

                }
                ShikiText.setText(ShikiText.getText() + "7");
                zerogo = false;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    ShikiText.setText("");
                    zerostop = true;

                }
                ShikiText.setText(ShikiText.getText() + "8");
                zerogo = false;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (zerostop == false) {
                    ShikiText.setText("");
                    zerostop = true;

                }
                ShikiText.setText(ShikiText.getText() + "9");
                zerogo = false;
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShikiText.setText(ShikiText.getText() + "0");
                if (zerostop == false) {
                    ShikiText.setText("");
                    zerostop = true;

                }
                if (zerogo == false){

                } else  {
                    zerostop = false;
                }


            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ShikiText == null) {
                    ShikiText.setText("");
                } else {
                    mValueOne = Float.parseFloat(ShikiText.getText() + "");
                    Addition = true;
                    ShikiText.setText(null);
                }
                zerostop = true;
                zerogo = true;
                shisoku.setText("＋");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(ShikiText.getText() + "");
                Subtract = true;
                ShikiText.setText(null);
                zerostop = true;
                zerogo = true;
                shisoku.setText("－");
            }

        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(ShikiText.getText() + "");
                Multiplication = true;
                ShikiText.setText(null);
                zerostop = true;
                zerogo = true;
                shisoku.setText("×");
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(ShikiText.getText() + "");
                Division = true;
                ShikiText.setText(null);
                zerostop = true;
                zerogo = true;
                shisoku.setText("÷");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(ShikiText.getText() + "");

                if (Addition == true) {
                    answer.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }

                if (Subtract == true) {
                    answer.setText(mValueOne - mValueTwo + "");
                    Subtract = false;
                }

                if (Multiplication == true) {
                    answer.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    answer.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShikiText.setText("");
                answer.setText("");
                zerostop = true;
                zerogo = true;
                shisoku.setText("");
            }
        });


    }
}

