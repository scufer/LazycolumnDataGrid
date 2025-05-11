package com.halil.ozel.recyclerviewsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.halil.ozel.recyclerviewsample.ui.theme.RecyclerViewSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecyclerViewSampleTheme  {
                PersonList()
            }
        }
    }

    @Composable
    fun PersonList() {
        val people = PersonRepository().getAllData()
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(12.dp)
                .border(1.dp, Color.Gray)
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                itemsIndexed(people) { index, person ->
                    if (index > 0) {
                        Divider(color = Color.Gray, thickness = 1.dp)
                    }
                    CustomItem(person)
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PersonListPreview() {
        RecyclerViewSampleTheme {
            PersonList()
        }
    }
}