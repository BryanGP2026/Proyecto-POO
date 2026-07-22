CREATE DATABASE minimarket_poo;
USE minimarket_poo;

CREATE TABLE productos (
    codigo_barras VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    stock INT NOT NULL
);

INSERT INTO productos VALUES ('77512345', 'Galletas Oreo', 2.50, 50);
INSERT INTO productos VALUES ('77598765', 'Gaseosa Inka Kola 1L', 5.00, 30);
INSERT INTO productos VALUES ('77555555', 'Leche Gloria', 3.80, 40);

-- Tabla para registrar el ticket general de la venta
CREATE TABLE ventas (
    id_venta INT AUTO_INCREMENT PRIMARY KEY,
    cliente VARCHAR(100) DEFAULT 'Público General',
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10,2) NOT NULL
);

-- Tabla para guardar los productos específicos de cada venta
CREATE TABLE detalle_ventas (
    id_detalle INT AUTO_INCREMENT PRIMARY KEY,
    id_venta INT,
    codigo_producto VARCHAR(20),
    cantidad INT NOT NULL,
    subtotal DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (id_venta) REFERENCES ventas(id_venta),
    FOREIGN KEY (codigo_producto) REFERENCES productos(codigo_barras)
);




SELECT * FROM productos;