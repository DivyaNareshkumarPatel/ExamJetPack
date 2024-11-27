package com.example.examjetpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.Style
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Preview(showBackground = true)
@Composable
fun MainLayout(modifier: Modifier=Modifier){
    Title()
}

@Preview(showBackground = true)
@Composable
fun Title(
    backgroundColor: Color = Color(0xFF6200EE),
    titleColor: Color = Color.White,
    modifier: Modifier= Modifier
        .width(200.dp)
        .padding(20.dp)
) {
    Column {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically){
            Text(text = " ", fontSize = 18.sp)
            Text(text = "Event Ease", fontSize = 18.sp, modifier = Modifier
                .weight(1f)
                .padding(start = 10.dp))
        }
        Column(Modifier.verticalScroll(rememberScrollState())) {
            Image(painter = painterResource(id = R.drawable.main),
                contentDescription = "this is main image",
                Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .width(400.dp)
                    .height(200.dp)
                    .padding(top = 10.dp, bottom = 20.dp)
            )
            Text(text = "Tech Conference 2024",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .padding(start = 10.dp))
            Text(text = "Mehsana, Gujarat | 2.5 km away",
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .padding(start = 20.dp))
            Text(text = "This is detailed description of an event",
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .padding(start = 10.dp))
            Text(text = "Event Schedule",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .padding(start = 10.dp))
            Row(Modifier.horizontalScroll(rememberScrollState())) {
                card()
                card()
                card()
            }
            Text(text = "Reviews",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .padding(start = 10.dp))
            reviews()
            reviews()
            reviews()
        }
    }
//    Row {
//        Button(onClick = { /*TODO*/ }, te) {
//
//        }
//    }
}

@Composable
fun card(){
    Card(Modifier.padding(20.dp)){
        Card(elevation = CardDefaults.cardElevation(20.dp)) {
            Column(
                Modifier
                    .width(200.dp)
                    .height(130.dp)) {
                Text(text = "10:AM",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .padding(start = 10.dp))
                Text(text = "Keyote Speech",
                    fontSize = 30.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .padding(start = 10.dp))
                Text(text = "Keyote By our estimated",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .padding(start = 10.dp))
            }
        }
    }
}
@Composable
fun reviews(){
    Card(
        Modifier
            .padding(10.dp)
            .fillMaxSize()) {
        Card(elevation = CardDefaults.cardElevation(20.dp)) {
            Row() {
                Image(painter = painterResource(id = R.drawable.profile),
                    contentDescription = "this is main image",
                    Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .padding(top = 10.dp, bottom = 20.dp)
                )
                Column(Modifier.fillMaxWidth()) {
                    Row(Modifier.fillMaxWidth()) {
                        Text(text = "Alice Johson")
                    }
                    Text(text = "Good event overall but some event too small",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .padding(start = 10.dp))
                }
            }
        }
    }
}
