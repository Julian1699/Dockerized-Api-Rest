# DOCKERIZED API REST

# API REST de Productos

Esta API REST te permite interactuar con objetos de tipo Producto, realizando operaciones de creación, actualización, lectura y eliminación.

## Endpoints

Los siguientes endpoints están disponibles:

- `GET /api/producto`: Lista todos los productos existentes.
- `POST /api/producto`: Crea un nuevo producto.
- `PUT /api/producto/act/{id}`: Actualiza un producto existente por su ID.
- `DELETE /api/producto/{id}`: Elimina un producto existente por su ID.

## Cuerpo de la solicitud

El cuerpo de la solicitud para los endpoints de creación y actualización debe contener la siguiente información:

- `nombre`: El nombre del producto.
- `referencia`: La referencia del producto.
- `precio`: El precio del producto.
- `peso`: El peso del producto.
- `categoria`: La categoría del producto.
- `stock`: La cantidad en stock del producto.
- `fecha`: La fecha asociada al producto.

## Respuesta

La respuesta para todos los endpoints es un objeto JSON que contiene la siguiente información:

- `id`: El ID del producto.
- `nombre`: El nombre del producto.
- `referencia`: La referencia del producto.
- `precio`: El precio del producto.
- `peso`: El peso del producto.
- `categoria`: La categoría del producto.
- `stock`: La cantidad en stock del producto.
- `fecha`: La fecha asociada al producto.

## Ejemplos

### Consultar todos los productos presentes

Realiza una solicitud GET al endpoint `/api/producto`.

### Crear un nuevo producto

Realiza una solicitud POST al endpoint `/api/producto` con el siguiente cuerpo:

POST /api/producto
Content-Type: application/json

{
"nombre": "Producto Nuevo",
"referencia": "REF123",
"precio": 99.99,
"peso": 1.5,
"categoria": "Electrónica",
"stock": 50,
"fecha": "2023-08-20"
}


### Actualizar un producto existente

Realiza una solicitud PUT al endpoint `/api/producto/act/{id}` con el siguiente cuerpo:

PUT /api/producto/act/1
Content-Type: application/json

{
"nombre": "Producto Actualizado",
"referencia": "REF456",
"precio": 129.99,
"peso": 2.0,
"categoria": "Hogar",
"stock": 30,
"fecha": "2023-08-21"
}


### Eliminar un producto existente

Realiza una solicitud DELETE al endpoint `/api/producto/{id}`.

## Docker

![image](https://github.com/Julian1699/Dockerized-Api-Rest/assets/114323630/48a2f55c-011c-453d-a843-86413047b000)

Para ejecutar la aplicación en Docker, sigue estos pasos:

1. Abre una terminal con Git Bash.
2. Utiliza el comando `docker-compose up`. Esto levantará el contenedor y creará dos imágenes: una de la base de datos POSTGRES y otra de la API REST.

Espero que esta guía te sea útil. ¡Si tienes alguna otra pregunta, no dudes en preguntar!

