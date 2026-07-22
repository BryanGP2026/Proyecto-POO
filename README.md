\#  Sistema de Gestión y Ventas para Minimarket



!\[Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=java\&logoColor=white)

!\[MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge\&logo=mysql\&logoColor=white)

!\[NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge\&logo=apache-netbeans\&logoColor=white)



Un sistema de escritorio desarrollado en Java enfocado en automatizar los procesos de un minimarket. El proyecto implementa una arquitectura \*\*Modelo-Vista-Controlador (MVC)\*\*, conexión a bases de datos relacionales y buenas prácticas de Programación Orientada a Objetos (POO).



\## Características Principales



\* \*\*Módulo de Inventario (CRUD):\*\* Registro, modificación, eliminación y búsqueda de productos.

\* \*\*Módulo de Punto de Venta (Caja):\*\* Interfaz para buscar productos, agregarlos a un carrito y procesar la venta.

\* \*\*Actualización en Tiempo Real:\*\* Las ventas descuentan automáticamente el stock disponible en la base de datos.

\* \*\*Validaciones Estrictas:\*\* Manejo de excepciones, prevención de campos vacíos y control de tipos de datos.

\* \*\*Alta Eficiencia:\*\* Uso de colecciones `HashMap` para búsquedas con complejidad O(1) y `Streams`/`Lambdas` para ordenamiento de datos.



\## Tecnologías y Herramientas



\* \*\*Lenguaje:\*\* Java (JDK 8+)

\* \*\*Interfaz Gráfica:\*\* Java Swing

\* \*\*Base de Datos:\*\* MySQL

\* \*\*Conectividad:\*\* Controlador JDBC

\* \*\*IDE Recomendado:\*\* Apache NetBeans



\## Arquitectura del Proyecto



El código está estructurado bajo el patrón de diseño \*\*MVC\*\*:

\* `modelo/`: Contiene las clases entidad (ej. `Producto`), clases abstractas e interfaces.

\* `vista/`: Contiene los formularios `.java` (JFrames) para las interfaces gráficas.

\* `controlador/`: Contiene la lógica de negocio (`GestorInventario`) y la conexión a la base de datos (`ConexionDB`).





