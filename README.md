# Cine
Esta práctica consiste en hacerla en parejas, usando Git y GitHub como método para colaborar en base a Pull Request y aplicando GitFlow.

Tenemos nuestro cine que tiene una estructura de butacas agrupadas en 5 filas y 7 columnas. Las filas están numeradas de la A a la E y las columnas de 1 la 7. Por lo tanto, una butaca queda identificada como A4 (fila 1, columna 4).

Además, las butacas pueden ser normales, cuyo precio es de 5€ la entrada o VIP, cuyo precio es 8€. Y una butaca puede estar activa, en mantenimiento o fuera de servicio. Además, obviamente puede estar libre, en reserva y ocupada.

Por otro lado tenemos complementos, que pueden ser de las categorías bebida, comida y otros. Como bebida tenemos agua (2€) y refrescos (3€) y como comida tenemos palomitas (3€), frutos secos (2€) y patatas (2,5€).

Queremos realizar un programa para gestionar nuestro cine usando bases de datos con SQLite y ficheros.

Nuestra aplicación hará uso de un menú para:

Comprar entrada, si hay butacas libres reservará una butaca con el número de socio. Se podrá añadir un máximo de 3 complementos. El número de socio es LLLNNN (L es letra y N es número). Se obtiene un fichero llamado entrada_Butaca_NSocio_Fecha.txt (entrada, más el identificador de la butaca, más el identificador del socio, más la fecha de la compra).
Devolver entrada, devuelve una entrada liberando los recursos asociados.
Estado del cine. Muestra el estado del cine
Obtener recaudación, se obtiene la recaudación dada una fecha válida dada en formato AAAA/MM/DD.
Importar complementos. Importa complementos en base a un fichero CSV dado.
Exportar estado del cine, exporta el estado del cine dada una fecha válida AAAA/MM/DD en un fichero json dado.
Configurar butacas. Configura las butacas en base a un fichero CSV dado.
Actualizar butaca. Cambia la información de una butaca dado su identificador: LN.

Tablas a tener en cuenta:

Butacas
Complementos
Reservas
Otras que tú puedas considerar.
No olvides la integridad de claves primaria y referencial donde sea necesario.

Se debe entregar:

Diagrama de casos de uso
Caso de usos de Comprar entrada y Actualizar Butaca
Diagrama de clases
Presentación en Youtube en modo oculto (adjuntando el link)
Presentación en PowerPoint explicando los elementos más importantes para la resolución del mismo
GitHub del proyecto
