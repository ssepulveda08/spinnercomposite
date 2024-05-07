package com.ssepulveda.spinnercomposite

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ssepulveda.spinnercomposite.ui.components.DropdownCompose
import com.ssepulveda.spinnercomposite.ui.components.ItemDropdown
import com.ssepulveda.spinnercomposite.ui.theme.SpinnerCompositeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpinnerCompositeTheme {
                val viewModel = MainViewModel()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val departments = viewModel.departments.collectAsState().value
                    val cities = viewModel.citiesFilter.collectAsState().value
                    val selectedCity = viewModel.selectedCity.collectAsState().value
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.Center,
                    ) {

                        DropdownCompose(
                            items = departments,
                            label = "Departamento",
                            selectedItem = viewModel.selectedDepartment,
                            onSelected = {
                                viewModel.setDepartment(it)
                            }
                        )
                        Spacer(modifier = Modifier.padding(8.dp))
                        DropdownCompose(
                            items = cities,
                            label = "Ciudad",
                            selectedItem = selectedCity,
                            onSelected =
                            {
                                viewModel.setCity(it)
                            }
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SpinnerCompositeTheme {
    }
}