package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Salary:EditText=findViewById(R.id.Salary)
        var Ok:Button=findViewById(R.id.Ok)
        var Total:TextView=findViewById(R.id.Total)
        var Interest:TextView=findViewById(R.id.Interest)
        var Clear:Button=findViewById(R.id.Clear)
        Ok.setOnClickListener(){
            var Salary=Salary.text.toString().toDouble()
            var a=0.00
            var b=0.00
            var c=0.00

            for(i in 1..3){
                var a=(Salary*3)/100
                a=a+c
                Salary=c+Salary

            }
            for(i in 1..4){
                var a=(Salary*5)/100
                a=a+c
                Salary=c+Salary
            }
            for(i in 1..3){
                var c=(Salary*7)/100
                a=a+c
                Salary=c+Salary
            }


            if(Salary>0){
                Interest.setText(a.toString())
                Total.setText(Salary.toString())
            }
        }
        Clear.setOnClickListener(){
            Salary.setText("")
            Total.setText("")
            Interest.setText("")
        }
    }
}