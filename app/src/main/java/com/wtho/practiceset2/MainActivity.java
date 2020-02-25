package com.wtho.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      display1("This is Box 1.");
      display2("And this is Box 2.");
      display3("And look! Box 3!");
   }

   public void display(String text) {
      TextView t = (TextView) findViewById(R.id.display_text_view);
      t.setText(text);
   }

   public void display(int text) {
      TextView t = (TextView) findViewById(R.id.display_text_view);
      t.setText(text + "");
   }

   public void display1(String text) {
      display(text);
   }

   public void display2(String text) {
      TextView t = (TextView) findViewById(R.id.display_text_view_2);
      t.setText(text);
   }

   public void display3(String text) {
      TextView t = (TextView) findViewById(R.id.display_text_view_3);
      t.setText(text);
   }
}
