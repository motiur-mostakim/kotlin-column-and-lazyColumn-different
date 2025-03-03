package com.example.show_person_list.lazyColumnExample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.show_person_list.columnExample.dataClass.ColumnPerson
import com.example.show_person_list.columnExample.dataClass.columnPersonList

@Composable
fun PersonList(modifier: Modifier = Modifier) {
    PersonListWithColumn(columnPersonList = columnPersonList, modifier = modifier)
}


//@Composable
//fun PersonListWithLazyColumn(
//    personList: List<Person>,
//    modifier: Modifier = Modifier,
//) {
//    LazyColumn(
//        modifier = modifier,
//    ) {
//        items(items = personList) { person ->
//        PersonItem(person = person)
//        }
//    }
//}


@Composable
fun PersonListWithColumn(
    columnPersonList: List<ColumnPerson>,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
    ) {
        for (columnPerson in columnPersonList) {
            PersonItem(person = columnPerson)
        }
    }
}


@Composable
fun PersonItem(
    person: ColumnPerson,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(color = Color(0xFFEAEEF4))
    ) {
        Text(
            text = person.name,
            style = MaterialTheme.typography.titleLarge,
            modifier = modifier.padding(8.dp)
        )
        Text(
            text = person.email,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = modifier.padding(8.dp)
        )
    }
}


@Preview
@Composable
private fun PersonListPreview() {
    PersonList()
}