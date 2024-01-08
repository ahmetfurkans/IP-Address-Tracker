package com.galataapplab.ipadresstracker.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.galataapplab.ipadresstracker.R

val rubikFamily = FontFamily(
    Font(R.font.rubik, FontWeight.Light),
    Font(R.font.rubik_medium, FontWeight.Normal),
    Font(R.font.rubik_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    titleLarge = TextStyle(
        fontSize = 26.sp, fontWeight = FontWeight.Normal, fontFamily = rubikFamily
    ),
    bodyLarge = TextStyle(
        fontSize = 20.sp, fontWeight = FontWeight.Normal, fontFamily = rubikFamily
    ),
    bodyMedium = TextStyle(
        fontSize = 18.sp, fontWeight = FontWeight.Light, fontFamily = rubikFamily
    ),
    labelMedium = TextStyle(
        fontSize = 10.sp, fontWeight = FontWeight.Bold, fontFamily = rubikFamily
    ),
)