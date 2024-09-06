Para ejecutarolo>

1. Subir micro-eureka
2. subir micro-articulo y miro-carrito
3. subir micro-gateway

Validar que todo subio correctamente>
- http://localhost:9099/
  ![image](https://github.com/user-attachments/assets/cf899963-256a-4d51-9272-fef26fa3a98e)

- Listar los articulos a traves del gateway>
```curl --location 'localhost:9100/api1/articulo'```


- Ahora, para agregar al carrito a traves del gateway>
```curl --location --request POST 'localhost:9100/api2/carrito/3'```


- Consultar carrito>
```curl --location 'localhost:9100/api2/carrito/3'```
