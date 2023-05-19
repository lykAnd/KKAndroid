package com.lyk.kkandroid.ui.test

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lyk.kkandroid.R

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name")
}

@Composable
fun PositionItem() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .shadow(
                elevation = 10.dp,
                shape = RoundedCornerShape(8.dp),
            )
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(start = 11.dp, top = 12.5.dp, 15.dp, 11.dp)
        ) {
            Text(
                text = "前端工程师",
                color = Color(0xFF333333),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "百威科技网络有限公…",
                color = Color(0xFF525252),
                fontSize = 13.sp,
                modifier = Modifier
                    .padding(top = 10.5.dp)
            )
            Row(modifier = Modifier.padding(top = 10.5.dp)) {
                Text(
                    text = "3-5年",
                    modifier = Modifier
                        .background(
                            color = Color(0xFFF5F5F5),
                            shape = RoundedCornerShape(5.dp)
                        )
                        .padding(start = 4.5.dp, top = 2.dp, end = 4.5.dp, bottom = 2.dp),
                    fontSize = 12.sp, color = Color(0xFF555555), textAlign = TextAlign.Center
                )
                Text(
                    text = "大专",
                    modifier = Modifier
                        .padding(start = 7.dp)
                        .background(
                            color = Color(0xFFF5F5F5),
                            shape = RoundedCornerShape(5.dp)
                        )
                        .padding(start = 4.5.dp, top = 2.dp, end = 4.5.dp, bottom = 2.dp),
                    fontSize = 12.sp, color = Color(0xFF555555), textAlign = TextAlign.Center
                )
                Text(
                    text = "结算",
                    modifier = Modifier
                        .padding(start = 7.dp)
                        .background(
                            color = Color(0xFFF5F5F5),
                            shape = RoundedCornerShape(5.dp)
                        )
                        .padding(start = 4.5.dp, top = 2.dp, end = 4.5.dp, bottom = 2.dp),
                    fontSize = 12.sp, color = Color(0xFF555555), textAlign = TextAlign.Center
                )
            }
            Row(modifier = Modifier.padding(top = 15.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null, modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewPositionItem() {
    PositionItem()
}
