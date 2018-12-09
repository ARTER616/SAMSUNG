package com.example.student5.mysuperdoopercoolmegaproject;


import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class KnopkaSmerti implements View.OnClickListener {
    MainActivity v;

    KnopkaSmerti(MainActivity result) {
        this.v = result;
    }

    @Override
    public void onClick(View v2) {
        double a = Double.parseDouble(((EditText)
                v.findViewById(R.id.coefficient_a)).getText().toString());
        double b = Double.parseDouble(((EditText)
                v.findViewById(R.id.coefficient_b)).getText().toString());
        double c = Double.parseDouble(((EditText)
                v.findViewById(R.id.coefficient_c)).getText().toString());
        TextView result = (TextView) v.findViewById(R.id.result);
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D > 0) {
            if (a != 0) {
                double x1 = (-b + Math.sqrt(D)) / 2 * a;
                double x2 = (-b - Math.sqrt(D)) / 2 * a;
                result.setText("" + String.valueOf(x1) + " " + String.valueOf(x2));
            } else {
                double x = -c / b;
                result.setText("" + String.valueOf(x));
            }
        } else if(D<0){
            result.setText("" + "ЛОХ");
        }
        else if(D==0){
            double x12 = -b/2*a;
            result.setText("" + String.valueOf(x12));
        }
    }
}

