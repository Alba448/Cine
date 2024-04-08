package org.example.models.butacas

/**
 * Data class que representa las butacas del cine.
 *
 * @property id identificador único de la butaca.
 * @property estado variable que llama a la enum class Estado.
 * @property ocupacion variable que llama a la enum class Ocupacion.
 * @property tipo variable que llama a la enum class Tipo.
 * @author Natalia González.
 * @since 1.0
 */
data class Butacas(
    private val id : String = "",
    private val estado : Estado = Estado.ACTIVA,
    private val ocupacion : Ocupacion = Ocupacion.LIBRE,
    private val tipo : Tipo = Tipo.NORMAL
)