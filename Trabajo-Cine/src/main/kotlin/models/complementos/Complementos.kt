package org.example.models.complementos

/**
 * Data class que representa los complementos a elegir.
 *
 * @property bebida variable que llama a la enum class Bebida.
 * @property comida variable que llama a la enum class Comida.
 * @property otros variable que llama a la enum class Otros.
 * @author Natalia González.
 * @since 1.0
 */
data class Complementos(
    private val bebida: Bebida = Bebida.AGUA,
    private val comida: Comida = Comida.PALOMITAS,
    private val otros: Otros = Otros.OTROS
)