package com.halil.ozel.recyclerviewsample

/**
 * Created by halilozel1903 on 11.05.2025.
 */

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomItem(person: Person) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
    ) {
        Text(
            text = person.age.toString(),
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .weight(1f)
                .padding(8.dp),
            maxLines = 2
        )
        HorizontalDivider(
            modifier = Modifier
                .fillMaxHeight()
                .width(1.dp),
            color = Color.Gray
        )
        Text(
            text = "${person.firstName} ${person.lastName}",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .weight(3f)
                .padding(8.dp),
            maxLines = 2
        )
        HorizontalDivider(
            modifier = Modifier
                .fillMaxHeight()
                .width(1.dp),
            color = Color.Gray
        )
        Text(
            text = person.nation,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .weight(2f)
                .padding(8.dp),
            maxLines = 2
        )
        HorizontalDivider(
            modifier = Modifier
                .fillMaxHeight()
                .width(1.dp),
            color = Color.Gray
        )
        Text(
            text = person.musicType,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .weight(3f)
                .padding(8.dp),
            maxLines = 2
        )
    }
}

@Composable
@Preview(showBackground = true)
fun CustomItemPreview() {
    CustomItem(
        person = Person(
            firstName = "Baby",
            lastName = "K",
            age = 42,
            nation = "Italy",
            musicType = "Pop / Rap"
        )
    )
}