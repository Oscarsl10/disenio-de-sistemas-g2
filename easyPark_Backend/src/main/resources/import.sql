INSERT INTO usuario (nombre, correo, contrasenia) VALUES ("Oscar", "ogseirar@gmail.com", "Oscar123")
INSERT INTO usuario (nombre, correo, contrasenia) VALUES ("Karen", "kare@gmail.com", "Karen123")
INSERT INTO cliente (nombre, telefono, nit, usuario_id) VALUES ("Oscar", "31254656", "13241", 1)
INSERT INTO empleado (nombre_empleado, telefono_empleado, nit, usuario_id) VALUES ("Pepe", "2134154", "1234", 2)
INSERT INTO tarifa (precio, fecha, tipo_vehiculo, lapso) VALUES (1000, "2025-03-18", "Camioneta", "1")
INSERT INTO vehiculo (placa, tipo_vehiculo, cliente_id) VALUES ("DUK-608", "Camioneta", 1)
INSERT INTO pago (entrada, salida, tarifa_id, vehiculo_id) VALUES ("2025-03-18 08:00:00", "2025-03-18 12:00:00", 1, 1)
INSERT INTO factura (numero_factura	, fecha_emision, pago_id, empleado_id) VALUES (135, '2025-03-18', 1, 1);