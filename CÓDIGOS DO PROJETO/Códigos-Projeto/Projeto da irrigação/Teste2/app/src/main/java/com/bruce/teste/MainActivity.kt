import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PumpControl()
        }
    }
}

@Composable
fun PumpControl() {
    var isPumpOn by remember { mutableStateOf(false) }
    var pumpState by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Column(
        modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Controle da Bomba Hidráulica")

        Button(
            onClick = {

                isPumpOn = !isPumpOn,

                      },
            modifier = Modifier.padding(vertical = 16.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isPumpOn) Color.Red else Color.Green
            )
        ) {
            Text(text = if (isPumpOn) "Desligar Bomba" else "Ligar Bomba")
        }

        Text(
            text = if (isPumpOn) "A bomba está ligada" else  "A bomba está desligada",
            modifier = Modifier.padding(vertical = 16.dp)
        )
    }
}
@Preview
@Composable
fun PrimeiraTelaPreview(){
    PumpControl()
}