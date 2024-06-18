package com.bruce.teste.componentes

import android.widget.Button
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GradientButton(
    onClick: () -> Unit
){
    Button(
        onClick,
        modifier = Modifier.fillMaxWidth().padding(20.dp)
    )
    {

    }
}

@Composable
@Preview
private fun GradientButtonPreview(){
    GradientButton(onClick = {})
}