package niraj.com.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq;
    EditText et;
    EditText e1,e2;
    double val1;
            double val2;
    boolean add,sub,div,mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        bdot=(Button) findViewById(R.id.button10);
        badd=(Button) findViewById(R.id.button11);
        bsub=(Button) findViewById(R.id.button12);
        bmul=(Button) findViewById(R.id.button13);
        bdiv=(Button) findViewById(R.id.button14);
        beq=(Button)  findViewById(R.id.button15);
        et=(EditText) findViewById(R.id.edittext);

    }
    public void one(View view)
    {
        et.setText(et.getText()+"1");
    }

    public void two(View view)
    {
        et.setText(et.getText()+"2");
    }

    public void three(View view)
    {
        et.setText(et.getText()+"3");
    }

    public void four(View view)
    {
        et.setText(et.getText()+"4");
    }

    public void five(View view)
    {
        et.setText(et.getText()+"5");
    }

    public void six(View view)
    {
        et.setText(et.getText()+"6");
    }

    public void seven(View view)
    {
        et.setText(et.getText()+"7");
    }

    public void eight(View view)
    {
        et.setText(et.getText()+"8");
    }

    public void nine(View view)
    {
        et.setText(et.getText()+"9");
    }

    public void zero(View view)
    {
        et.setText(et.getText()+"0");
    }

    public void dot(View view)
    {
        et.setText(et.getText()+".");
    }


    public void add(View view)
    {

            val1=Double.parseDouble(et.getText()+"");
            add=true;
        et.setText(null);
    }

    public void subs(View view)
    {
        val1=Double.parseDouble(et.getText()+"");
        sub=true;
        et.setText(null);
    }

    public void mul(View view)
    {
        val1=Double.parseDouble(et.getText()+"");
        mul=true;
        et.setText(null);
    }

    public void divide(View view)
    {
        val1=Double.parseDouble(et.getText()+"");
        div=true;
        et.setText(null);
    }

    public void equal(View view)
    {
        val2=Double.parseDouble(e2.getText()+"");
        if (add==true) {
            et.setText(val1+val2+"");
            add=false;
        }
        if (sub==true) {
            et.setText(val1-val2+"");
            sub=false;
        }
        if (mul==true) {
            et.setText(val1*val2+"");
            mul=false;
        }
        if (div==true) {
            et.setText(val1/val2+"");
            div=false;
        }
    }

    public void clear(View view)
    {
        et.setText(null);

    }
}
