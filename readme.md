## Estudo Caso Generics

Este repositório contém um estudo de caso prático que aborda a utilização de Generics em um projeto de DataAccess.

### Problema

O problema apresentado consiste uma com uma interface chamada DataAccess, que possui os seguintes métodos:

```java
public interface DataAcess {
    void save(Object obj)
    void update(Object obj, int id)
    Object getById(int id)
    void delete(int id)
}
```
O objetivo é mostrar como essa implementação pode ser ruim, pois a necessidade de realizar casts do tipo Object para o tipo específico de classe que está sendo implementada essa interface.

### Resolucao

A solução proposta neste estudo de caso é a utilização de Generics. Através da utilização de Generics, podemos generalizar a implementação da interface DataAccess, permitindo o uso de um tipo específico de classe em tempo de compilação, eliminando a necessidade de casting.

```java
public interface DataAcess<T> {
    void save(T entity)
    void update(T entity, int id)
    T getById(int id)
    void delete(int id)
}
```

O projeto de DataAccess é reestruturado usando Generics para permitir a utilização de diferentes tipos de classes em sua implementação. Isso faz com que a interface DataAccess seja mais flexível e facilita a abstração e manipulação de objetos de diferentes tipos. O resultado final é um código mais limpo, seguro e de fácil manutenção.
