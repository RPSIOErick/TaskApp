package telas

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "asdasda")
        Text("Texto da main screen")

        Row(){
            Button(onClick = {
                Log.i("###", "Botão1 Clicado")
            }) {
                Text(text = "Btn1")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Btn2")
            }
            Button(onClick = { /*TODO*/ }) {
                Text("Navegador para TaskScreen")
            }
        }

    }
}