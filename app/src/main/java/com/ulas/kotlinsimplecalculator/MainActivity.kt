package com.ulas.kotlinsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ulas.kotlinsimplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var  myString: String
    var number1 : Double? = null
    var number2 : Double? = null
    var result : Double? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun mySum(view: View){
        number1 = binding.number1Edit.text.toString().toDoubleOrNull()
        number2 = binding.number2Edit.text.toString().toDoubleOrNull()
        if (number1 == null || number2 == null){
            binding.textView.text = "Enter Number !"
        }else{
            result = number1!!+number2!!
            binding.textView.text ="Result : $result"
        }
    }
    fun mySub(view: View){
        number1 = binding.number1Edit.text.toString().toDoubleOrNull()
        number2 = binding.number2Edit.text.toString().toDoubleOrNull()
        if (number1 == null || number2 == null){
            binding.textView.text = "Enter Number !"
        }else{
            result = number1!!-number2!!
            binding.textView.text ="Result : $result"
        }
    }

    fun myMulti(view: View){
        number1 = binding.number1Edit.text.toString().toDoubleOrNull()
        number2 = binding.number2Edit.text.toString().toDoubleOrNull()
        if (number1 == null || number2 == null){
            binding.textView.text = "Enter Number !"
        }else{
            result = number1!!*number2!!
            binding.textView.text ="Result : $result"
        }
    }
    fun myDiv(view: View){
        number1 = binding.number1Edit.text.toString().toDoubleOrNull()
        number2 = binding.number2Edit.text.toString().toDoubleOrNull()
        if (number1 == null || number2 == null){
            binding.textView.text = "Enter Number !"
        }else{
            if (number2 == 0.0){
                binding.textView.text = "Number 2 cannot be 0 !!"
            }else{
                result = number1!!/number2!!
                binding.textView.text ="Result : $result"
            }


        }
    }



}