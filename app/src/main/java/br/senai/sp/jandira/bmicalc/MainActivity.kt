package br.senai.sp.jandira.bmicalc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmicalc.ui.theme.BMICalcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BMICalcTheme {

                CalculatorScreen()

            }
        }
    }

    @Preview(showSystemUi = true)
    @Composable
    fun CalculatorScreen() {
        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween


            ) {
                //Header
                Column(
                    modifier = Modifier
                        .background(
                            colorResource(id = R.color.white)
                        )
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bmi),
                        contentDescription = "",
                        modifier = Modifier.size(120.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.title),
                        fontSize = 30.sp,
                        color = Color.Blue,
                        letterSpacing = 8.sp
                    )
                }
                //Form
                Column(
                    modifier = Modifier
                        .background(colorResource(id = R.color.white))
                        .fillMaxWidth()
                        .padding(
                            32.dp,
                            0.dp
                        ),
                    horizontalAlignment = Alignment.CenterHorizontally,

                ) {
                    Text(
                        text = stringResource(id = R.string.height_label),
                        modifier = Modifier.padding(0.dp, 5.dp),
                        color = Color.Black
                    )

                    OutlinedTextField(value = "",
                        onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(2.dp, colorResource(id = R.color.black), shape = RoundedCornerShape(16.dp)),
                        shape = RoundedCornerShape(16.dp)

                    )

                    Text(
                        text = stringResource(id = R.string.weight_label),
                        modifier = Modifier.padding(0.dp, 5.dp),
                        color = Color.Black
                    )

                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                    modifier = Modifier.fillMaxWidth()
                        .border(2.dp, colorResource(id = R.color.black), shape = RoundedCornerShape(16.dp)),
                        shape = RoundedCornerShape(16.dp)
                    )

                    Spacer(modifier = Modifier.height(32.dp))
                    Button(
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(
                            text = stringResource(id = R.string.button_text),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp),
                            textAlign = TextAlign.Center,

                        )

                    }

                }
                //Footer
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp),
                    color = Color.Blue,
                    shape = RoundedCornerShape(
                        topStart = 32.dp,
                        topEnd = 32.dp
                    )
                ) {

                }

                }
            }
        }
    }
}

