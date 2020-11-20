package com.example.scienctificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button one, two, three, four, five, six, seven, eight, nine, zero, dot, pi, equal, plus, minus, mul, div, inv, root, sqr, fact, ln, log, tan, cos, sin, brac1, brac2, ac;
    TextView input, output;
    String PI = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        one = findViewById(R.id.btn_1);
        two = findViewById(R.id.btn_2);
        three = findViewById(R.id.btn_3);
        four = findViewById(R.id.btn_4);
        five = findViewById(R.id.btn_5);
        six = findViewById(R.id.btn_6);
        seven = findViewById(R.id.btn_7);
        eight = findViewById(R.id.btn_8);
        nine = findViewById(R.id.btn_9);
        zero = findViewById(R.id.btn_0);
        dot = findViewById(R.id.btn_dot);
        pi = findViewById(R.id.btn_pi);
        equal = findViewById(R.id.btn_equal);
        plus = findViewById(R.id.btn_plus);
        minus = findViewById(R.id.btn_min);
        mul = findViewById(R.id.btn_mul);
        div = findViewById(R.id.btn_div);
        inv = findViewById(R.id.btn_inv);
        root = findViewById(R.id.btn_root);
        sqr = findViewById(R.id.btn_sqr);
        fact = findViewById(R.id.btn_fact);
        ln = findViewById(R.id.btn_ln);
        log = findViewById(R.id.btn_log);
        tan = findViewById(R.id.btn_tan);
        cos = findViewById(R.id.btn_cos);
        sin = findViewById(R.id.btn_sin);
        brac1 = findViewById(R.id.btn_brac1);
        brac2 = findViewById(R.id.btn_brac2);
        ac = findViewById(R.id.btn_ac);
        input = findViewById(R.id.tv_input);
        output = findViewById(R.id.tv_output);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + ".");
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("");
                input.setText("");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "-");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "×");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "÷");
            }
        });

        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = output.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                output.setText(String.valueOf(r));
            }
        });

        brac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "(");
            }
        });
        brac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + ")");
            }
        });
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(pi.getText());
                output.setText(output.getText() + PI);
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "sin");
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "cos");
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "tan");
            }
        });

        inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText() + "^"+"(-1)");
            }
        });
        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(output.getText().toString());
                int fact = factorial(val);
                output.setText(String.valueOf(fact));
                input.setText(val + "!");
            }
        });
        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(output.getText().toString());
                double square = (d * d);
                output.setText(String.valueOf(square));
                input.setText(d + "²");
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"ln");
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(output.getText()+"log");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String val = output.getText().toString();
                String replacedstr = val.replace('÷', '/').replace('×', '*');
                double result = eval(replacedstr);
                output.setText(String.valueOf(result));
                input.setText(val);
            }
        });

    }

    int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }


    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }
            double parse () {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }
            double parseExpression () {
                double x = parseTerm();
                for (;;) {
                    if (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm () {
                double x = parseFactor();
                for (;;) {
                    if (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor () {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();
                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                        x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknow function; " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                if (eat('^')) x = Math.pow(x, parseFactor());
                return x;

            }

        }.parse();

    }
}
