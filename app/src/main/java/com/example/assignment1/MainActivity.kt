package com.example.assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Wallpaper from https://wallpapers.com/historical-background
    // retrieved on 22 March 2024
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtAge = findViewById<TextView>(R.id.edtAge) //* IIE (2024)
        val txtData =findViewById<TextView>(R.id.txtData) //* IIE (2024)
        val btnGenerateHistory = findViewById<Button>(R.id.btnGenerateHistory) //* IIE (2024)
        val btnClear = findViewById<Button>(R.id.btnClear) //* IIE (2024)

        btnGenerateHistory.setOnClickListener {
            var past = ""
            if (edtAge.text.isEmpty()) //* IIE (2024)
            {
                txtData.text = "Please enter age"
            }
            else
            {
                val age: Int? = edtAge.text.toString().toIntOrNull() //*IIE (2024)

                if (age == null)
                {
                    past = "Please enter a numeric value"
                }
                else if ((age < 20) || (age > 100))
                {
                    past = "This age is not in range"
                }
                else if (age == 20)
                {
                    past = "The rapper Pop Smoke, died at the age of 20"
                }
                else if (age == 21)
                {
                    past= "The German anti-Nazi, Sophie Scholl political activist died at the of 21"
                }
                else if (age ==22)
                {
                    past = "The R&B singer, Aaaliyah died at the age of 22"
                }
                else if (age == 23)
                {
                    past = "The historian Personality, Charles IX died at the age of 23"
                }
                else if (age == 24)
                {
                    past = "The rapper, Notorious B.I.G died at the age of 24"
                }
                else if (age == 25)
                {
                    past = "The english poet and Solider, Wilfred Owen died at the age of 25"
                }
                else if (age == 26)
                {
                    past = "The Rapper, Mac Miller died at the age of 26"
                }
                else if (age ==27)
                {
                    past = "The British Soul Singer, Amy Winehouse died at the age of 27"
                }
                else if (age ==28)
                {
                    past = "The United States Marine Corps Gunnery Sergant, John Basilone died at the age of 28"
                }
                else if (age ==29)
                {
                    past = "The reality Star, Nick Gordan died at the age 29"
                }
                else if (age == 30)
                {
                    past = "The poet, Sylvia Plath died at the age of 30"
                }
                else if (age == 31)
                {
                    past = "The soccer player, Christian Atsu died at the age of 31"
                }
                else if (age == 32)
                {
                    past = "The queen of England, Mary || of England died at the age of 32"
                }
                else if (age == 33)
                {
                    past = "The movie actor, Chris Farley died at the age of 33"
                }
                else if (age == 34)
                {
                    past = "The pilot, Bessie Coleman died at the age of 34"
                }
                else if (age ==35)
                {
                    past = "The queen of England, Anne Boylen died at the age of 35"
                }
                else if (age == 36)
                {
                    past = "The princess of England, Princess Diana died at the age of 36"
                }
                else if (age ==37)
                {
                    past = "The queen of Austria, Marie Antoinette died at the age of 37"
                }
                else if ( age == 38)
                {
                    past = "The runner, Florence Griffith Joyner died at the age of 38"
                }
                else if ( age == 39)
                {
                    past ="The religious leader, Malcom X died at the of 39"
                }
                else if (age == 40)
                {
                    past = "The actor, Paul Walker died at the age of 40"
                }
                else
                {
                    past = "No results found"
                }
                txtData.text = "History: $past"
            }

            }
       btnClear.setOnClickListener {
           edtAge.setText("")
           edtAge.hint = "Edit Age" //* IIE (2024)


           txtData.setText("")
        }
        }
    }
//*Reference List
//* The Independent Institute of Education (Pty) Ltd.2024. Introduction to Mobile Application Development Module Manual 1st ed. Johannesburg: The Independent Institute of Education.




