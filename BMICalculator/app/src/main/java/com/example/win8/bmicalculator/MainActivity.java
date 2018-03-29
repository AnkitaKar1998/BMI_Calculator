package com.example.win8.bmicalculator;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText e1,e2,e3;
    TextView t;
    Float f,in,w,h,bmi;
    LinearLayout a;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.edittext1);
        e2 = (EditText)findViewById(R.id.edittext2);
        e3 = (EditText)findViewById((R.id.edittext3));
        t = (TextView) findViewById(R.id.textview);
        t.setText("?");
        e1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void afterTextChanged(Editable editable)
            {
                if(!e1.getText().toString().equals("")&&!e2.getText().toString().equals("")&&!e3.getText().toString().equals(""))
                {
                    f = Float.parseFloat(e1.getText().toString());
                    in = Float.parseFloat(e2.getText().toString());
                    w = Float.parseFloat(e3.getText().toString());
                    h = (f*0.3048f)+(in*0.0254f);
                    bmi = w / (h * h);
                    t.setText(bmi.toString());
                    /*if(bmi<17)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout1);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=17&&bmi<18.5)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout2);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=18.5&&bmi<25)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout3);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=25&&bmi<30)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout4);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=30&&bmi<35)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout5);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=35&&bmi<40)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout6);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout7);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }*/
                }
                else
                {
                    t.setText("?");
                    a = (LinearLayout)findViewById(R.id.linear_layout1);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout2);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout3);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout4);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout5);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout6);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout7);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }
        });
        e2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void afterTextChanged(Editable editable)
            {
                if(!e1.getText().toString().equals("")&&!e2.getText().toString().equals("")&&!e3.getText().toString().equals(""))
                {
                    f = Float.parseFloat(e1.getText().toString());
                    in = Float.parseFloat(e2.getText().toString());
                    w = Float.parseFloat(e3.getText().toString());
                    h = (f*0.3048f)+(in*0.0254f);
                    bmi = w / (h * h);
                    t.setText(bmi.toString());
                    /*if(bmi<17)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout1);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=17&&bmi<18.5)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout2);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=18.5&&bmi<25)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout3);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=25&&bmi<30)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout4);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=30&&bmi<35)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout5);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=35&&bmi<40)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout6);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout7);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }*/
                }
                else
                {
                    t.setText("?");
                    a = (LinearLayout)findViewById(R.id.linear_layout1);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout2);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout3);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout4);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout5);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout6);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout7);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }
        });
        e3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void afterTextChanged(Editable editable)
            {
                if(!e1.getText().toString().equals("")&&!e2.getText().toString().equals("")&&!e3.getText().toString().equals(""))
                {
                    f = Float.parseFloat(e1.getText().toString());
                    in = Float.parseFloat(e2.getText().toString());
                    w = Float.parseFloat(e3.getText().toString());
                    h = (f*0.3048f)+(in*0.0254f);
                    bmi = w / (h * h);
                    t.setText(bmi.toString());
                    /*if(bmi<17)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout1);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=17&&bmi<18.5)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout2);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=18.5&&bmi<25)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout3);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=25&&bmi<30)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout4);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=30&&bmi<35)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout5);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else if(bmi>=35&&bmi<40)
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout6);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }
                    else
                    {
                        a = (LinearLayout)findViewById(R.id.linear_layout7);
                        a.setBackgroundColor(Color.parseColor("#f4b9f4"));
                    }*/
                }
                else
                {
                    t.setText("?");
                    a = (LinearLayout)findViewById(R.id.linear_layout1);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout2);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout3);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout4);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout5);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout6);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                    a = (LinearLayout)findViewById(R.id.linear_layout7);
                    a.setBackgroundColor(Color.parseColor("#ffffff"));
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        switch (id)
        {
            case R.id.healthtips:
                //Toast.makeText(this, "Tips clicked", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this,HealthTips.class);
                startActivity(i);
                break;

            case R.id.healthfacts:
                Toast.makeText(this, "Facts clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
