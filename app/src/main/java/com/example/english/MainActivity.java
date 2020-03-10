package com.example.english;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView inputField, outputField;
    String str;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputField = findViewById(R.id.inputField);
        outputField = findViewById(R.id.outputField);

    }


    public void decrypt(View view) {
        str = inputField.getText().toString();
        String out = "";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++){
            switch(chars[i]){
                case 'a': out += "x"; break;
                case 'b' : out += "y"; break;
                case 'c' : out += "z"; break;
                case 'd' : out += "a"; break;
                case 'e' : out += "b"; break;
                case 'f' : out += "c"; break;
                case 'g' : out += "d"; break;
                case 'h' : out += "e"; break;
                case 'i' : out += "f"; break;
                case 'j' : out += "g"; break;
                case 'k' : out += "h"; break;
                case 'l' : out += "i"; break;
                case 'm' : out += "j"; break;
                case 'n' : out += "k"; break;
                case 'o' : out += "l"; break;
                case 'p' : out += "m"; break;
                case 'q' : out += "n"; break;
                case 'r' : out += "o"; break;
                case 's' : out += "p"; break;
                case 't' : out += "q"; break;
                case 'u' : out += "r"; break;
                case 'v' : out += "s"; break;
                case 'w' : out += "t"; break;
                case 'x' : out += "u"; break;
                case 'y' : out += "v"; break;
                case 'z' : out += "w"; break;
                case 'A': out += "X"; break;
                case 'B' : out += "Y"; break;
                case 'C' : out += "Z"; break;
                case 'D' : out += "A"; break;
                case 'E' : out += "B"; break;
                case 'F' : out += "C"; break;
                case 'G' : out += "D"; break;
                case 'H' : out += "E"; break;
                case 'I' : out += "F"; break;
                case 'J' : out += "G"; break;
                case 'K' : out += "H"; break;
                case 'L' : out += "I"; break;
                case 'M' : out += "J"; break;
                case 'N' : out += "K"; break;
                case 'O' : out += "L"; break;
                case 'P' : out += "M"; break;
                case 'Q' : out += "N"; break;
                case 'R' : out += "O"; break;
                case 'S' : out += "P"; break;
                case 'T' : out += "Q"; break;
                case 'U' : out += "R"; break;
                case 'V' : out += "S"; break;
                case 'W' : out += "T"; break;
                case 'X' : out += "U"; break;
                case 'Y' : out += "V"; break;
                case 'Z' : out += "W"; break;
                default : ;
            }
        }

        outputField.setText(out);
    }

    public void encrypt(View view) {

        str = inputField.getText().toString();
        String out = "";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++){
            switch(chars[i]){
                case 'a' : out += "d"; break;
                case 'b' : out += "e"; break;
                case 'c' : out += "f"; break;
                case 'd' : out += "g"; break;
                case 'e' : out += "h"; break;
                case 'f' : out += "i"; break;
                case 'g' : out += "j"; break;
                case 'h' : out += "k"; break;
                case 'i' : out += "l"; break;
                case 'j' : out += "m"; break;
                case 'k' : out += "n"; break;
                case 'l' : out += "o"; break;
                case 'm' : out += "p"; break;
                case 'n' : out += "q"; break;
                case 'o' : out += "r"; break;
                case 'p' : out += "s"; break;
                case 'q' : out += "t"; break;
                case 'r' : out += "u"; break;
                case 's' : out += "v"; break;
                case 't' : out += "w"; break;
                case 'u' : out += "x"; break;
                case 'v' : out += "y"; break;
                case 'w' : out += "z"; break;
                case 'x' : out += "a"; break;
                case 'y' : out += "b"; break;
                case 'z' : out += "c"; break;
                case 'A': out  += "D"; break;
                case 'B' : out += "E"; break;
                case 'C' : out += "F"; break;
                case 'D' : out += "G"; break;
                case 'E' : out += "H"; break;
                case 'F' : out += "I"; break;
                case 'G' : out += "J"; break;
                case 'H' : out += "K"; break;
                case 'I' : out += "L"; break;
                case 'J' : out += "M"; break;
                case 'K' : out += "N"; break;
                case 'L' : out += "O"; break;
                case 'M' : out += "P"; break;
                case 'N' : out += "Q"; break;
                case 'O' : out += "R"; break;
                case 'P' : out += "S"; break;
                case 'Q' : out += "T"; break;
                case 'R' : out += "U"; break;
                case 'S' : out += "V"; break;
                case 'T' : out += "W"; break;
                case 'U' : out += "X"; break;
                case 'V' : out += "Y"; break;
                case 'W' : out += "Z"; break;
                case 'X' : out += "A"; break;
                case 'Y' : out += "B"; break;
                case 'Z' : out += "C"; break;
                default : ;
            }
        }

        outputField.setText(out);


    }
}
