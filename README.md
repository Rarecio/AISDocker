
## Installing
Для начала работы клонируйте себе проект

```shell
git clone https://github.com/Rarecio/AISDocker.git
cd AISDocker/
```

Для развёртывания у себя приложения воспользуйтесь командой:

```shell
docker compose up
```

### Services
+ Spring 
+ PostgreSQL
+ RabbitMq

### Backend
```shell
localhost:8080
```
### Database
```shell
localhost:5432
```

## Usage
> После запуска можно отправить get запрос на получение всех заказов
> ```shell
> http://localhost:8080/api/order/all
> ```
> или на получение конкретного заказа по id
> ```shell
> http://localhost:8080/api/order/10249
> ```
> Есть возможность удалить заказ по id
> ```shell
> http://localhost:8080/api/order/delete/11079
> ```
> Также можно отправить запрос на добалвение заказа с помощью запроса
> ```shell
> http://localhost:8081/api/order/save
> ```
> для чего в Body запроса указать orderDate, requiredDate, employee_id и customer_id, например
> ```shell
> {
>   "orderDate": "1999-03-01",
>   "requiredDate": "1999-03-03,
>   "employee_id": "3",
>   "customer_id": "SAVEA"
> }
> ```
> Если отправить запрос по адресу\
> ```shell
> http://localhost:8080/emit
> ```
> то в консоли будет информация по добавлению сообщения и взятию его из очереди сервиса RabbitMq
