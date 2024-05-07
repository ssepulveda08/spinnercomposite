package com.ssepulveda.spinnercomposite

fun getDepartments(): List<Department> {
    return listOf(
        Department(1, "Amazonas"),
        Department(2, "Antioquia"),
        Department(3, "Arauca"),
        Department(4, "Atlántico"),
        Department(5, "Bolívar"),
        Department(6, "Boyacá"),
        Department(7, "Caldas"),
        Department(8, "Caquetá"),
        Department(9, "Casanare"),
        Department(10, "Cauca"),
        Department(11, "Cesar"),
        Department(12, "Chocó"),
        Department(13, "Córdoba"),
        Department(14, "Cundinamarca"),
        Department(15, "Guainía"),
        Department(16, "Guaviare"),
        Department(17, "Huila"),
        Department(18, "La Guajira"),
        Department(19, "Magdalena"),
        Department(20, "Meta"),
        Department(21, "Nariño"),
        Department(22, "Norte de Santander"),
        Department(23, "Putumayo"),
        Department(24, "Quindío"),
        Department(25, "Risaralda"),
        Department(26, "San Andrés y Providencia"),
        Department(27, "Santander"),
        Department(28, "Sucre"),
        Department(29, "Tolima"),
        Department(30, "Valle del Cauca"),
        Department(31, "Vaupés"),
        Department(32, "Vichada")
    )
}

fun getCities(): List<City> {
    return listOf(
        City(1, "Leticia", 1),
        City(2, "Medellín", 2),
        City(3, "Arauca", 3),
        City(4, "Barranquilla", 4),
        City(5, "Cartagena", 4),
        City(6, "Tunja", 6),
        City(7, "Manizales", 7),
        City(8, "Florencia", 8),
        City(9, "Yopal", 9),
        City(10, "Popayán", 10),
        City(11, "Valledupar", 11),
        City(12, "Quibdó", 12),
        City(13, "Montería", 13),
        City(14, "Bogotá", 14),
        City(15, "Inírida", 15),
        City(16, "San José del Guaviare", 16),
        City(17, "Neiva", 17),
        City(18, "Riohacha", 18),
        City(19, "Santa Marta", 19),
        City(20, "Villavicencio", 20),
        City(21, "Pasto", 21),
        City(22, "Cúcuta", 22),
        City(23, "Mocoa", 23),
        City(24, "Armenia", 24),
        City(25, "Pereira", 25),
        City(26, "San Andrés", 26),
        City(27, "Bucaramanga", 27),
        City(28, "Sincelejo", 28),
        City(29, "Ibagué", 29),
        City(30, "Cali", 30),
        City(31, "Mitú", 31),
        City(32, "Puerto Carreño", 32)
    )
}

data class Department(
    val id: Int,
    val name: String,
)

data class City(
    val id: Int,
    val name: String,
    val idDepartment: Int,
)