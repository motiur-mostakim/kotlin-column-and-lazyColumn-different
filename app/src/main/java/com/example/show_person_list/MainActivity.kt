package com.example.show_person_list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.show_person_list.lazyColumnExample.PersonList
import com.example.show_person_list.ui.theme.Show_person_listTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    Show_person_listTheme {
       Surface(
           color = MaterialTheme.colorScheme.background,
           modifier = Modifier.fillMaxSize()
       ) {
           PersonList()
       }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp()
}