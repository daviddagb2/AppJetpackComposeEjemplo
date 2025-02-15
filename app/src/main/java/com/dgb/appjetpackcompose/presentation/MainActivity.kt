package com.dgb.appjetpackcompose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.dgb.appjetpackcompose.presentation.ui.navigation.AppNavigation
import com.dgb.appjetpackcompose.presentation.ui.theme.AppJetpackComposeTheme
import com.dgb.appjetpackcompose.presentation.ui.view.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppJetpackComposeTheme {
                Scaffold { paddingInner ->
                    Surface(modifier = Modifier.padding(paddingInner)){
                        AppNavigation()
                    }
                }
            }
        }
    }
}

