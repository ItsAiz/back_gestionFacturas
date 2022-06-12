insert into cliente (id_cliente, nombre, apellido, direccion, fecha_nacimiento, telefono, email) values (1,"ivan","sierra","la playita", '2001-08-17', 3213, "ivan@gmail.com");
insert into cliente (id_cliente, nombre, apellido, direccion, fecha_nacimiento, telefono, email) values (2,"andrés","espinel","resbalon", '1967-09-29', 32113, "andres@gmail.com");
insert into producto (id_producto, nombre, precio, stock) values (1, "Pan", 2500, 5);
insert into producto (id_producto, nombre, precio, stock) values (2, "Arroz", 5000, 6);
insert into producto (id_producto, nombre, precio, stock) values (3, "Papas", 3000, 5);
insert into factura (id_factura, id_cliente, fecha) values (1, 1, '2020-02-05');
insert into detalle (num_detalle, num_factura, id_producto, cantidad, precio) values (1,1,1,2,5000);