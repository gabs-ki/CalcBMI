package br.senai.sp.jandira.bmicalc.calcs

import android.content.Context
import androidx.compose.ui.graphics.Color
import br.senai.sp.jandira.bmicalc.R
import kotlin.math.pow

fun bmiCalculate(weight: Double, height: Double): Double  {
    return weight / (height / 100).pow(2)
}

fun getBmiClassification(bmi: Double, context: Context): String {
    return if (bmi <= 18.5)
        context.getString(R.string.under_weight)
     else if (bmi > 18.5 && bmi < 25.0)
        context.getString(R.string.normal_weight)
     else if (bmi >= 25.0 && bmi < 30.0)
        context.getString(R.string.over_weight)
     else if (bmi >= 30.0 && bmi < 40.0)
        context.getString(R.string.obesity)
     else
        context.getString(R.string.morbid_obesity)
}

fun colorClassification (bmi: Double): Color {

    return if (bmi <= 18.5)
         Color(248, 137, 6)
    else if (bmi > 18.5 && bmi < 25.0)
        Color(38, 181, 53)
    else if (bmi >= 25.0 && bmi < 30.0)
         Color(248, 137, 6)
    else if (bmi >= 30.0 && bmi < 40.0)
         Color(181, 55, 38)
    else
        Color(181, 55, 38)
}