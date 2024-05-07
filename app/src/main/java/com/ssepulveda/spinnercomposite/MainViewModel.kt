package com.ssepulveda.spinnercomposite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ssepulveda.spinnercomposite.ui.components.ItemDropdown
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val cities = getCities()

    private val _citiesFilter by lazy { MutableStateFlow(listOf<ItemDropdown>()) }
    val citiesFilter: StateFlow<List<ItemDropdown>> = _citiesFilter.asStateFlow()

    private val _selectedCity by lazy { MutableStateFlow<ItemDropdown?>(null) }
    val selectedCity: StateFlow<ItemDropdown?> = _selectedCity.asStateFlow()

    private val _departments by lazy {
        MutableStateFlow(getDepartments().map {
            ItemDropdown(
                it.id,
                it.name
            )
        })
    }
    val departments: StateFlow<List<ItemDropdown>> = _departments.asStateFlow()

    var selectedDepartment: ItemDropdown? = null

    fun setDepartment(item: ItemDropdown) {
        viewModelScope.launch {
            _citiesFilter.value = cities.filter { it.idDepartment == item.id }.map { ItemDropdown(it.id, it.name) }
            selectedDepartment = item
            _selectedCity.value = null
        }
    }

    fun setCity(item: ItemDropdown) {
        _selectedCity.value = item
    }

}
