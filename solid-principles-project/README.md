# 🧪 Proyecto Final

Bienvenido al proyecto final del curso. Aquí vas a poner en práctica todo lo que has aprendido.

Antes de que empieces, avisarte de que este proyecto está lleno de clases **mal diseñadas a "propósito"**, y que te va a tocar **detectar los errores y refactorizar usando los principios SOLID**. 

También decirte que no es ninguna misión obligatoria que te haya dado un NPC de por ahí, sino que aproveches este proyecto para trastear y repasar todo lo que has visto en el curso, a tu ritmo y con tus normas, no te voy a estar vigilando.

Y a continuación te explico un poco el proyecto para que te hagas una idea de lo que hay.

## 🧱 Estructura del proyecto

```
- /model
- /payment
- /repository
- /service
- Application.java
```

## 🎯 Objetivo

Refactorizar el código para que cumpla con los 5 principios SOLID:

- **S**: Single Responsibility Principle (SRP)
- **O**: Open/Closed Principle (OCP)
- **L**: Liskov Substitution Principle (LSP)
- **I**: Interface Segregation Principle (ISP)
- **D**: Dependency Inversion Principle (DIP)

## 🔍 Clases que debes revisar (todas!)

### ✅ SRP – Single Responsibility
> Una clase debe tener una única funcionalidad.

- `InvoiceManager.java`: genera la factura, la guarda y la "envía" a un cliente.
- `OrderService.java`: procesa la orden: la valida, almacena en base de datos, la envía al cliente y calcula el total.

### ✅ OCP – Open/Closed
> Una clase debería de poder extender funcionalidades sin modificar código existente.

- `PaymentProcessor.java`: usa `if` para decidir qué método de pago usar. Refactorízalo usando polimorfismo e interfaces (`PaymentMethod`...).

### ✅ LSP – Liskov Substitution
> Una subclase debe poder sustituir a su superclase sin romper la lógica.

- `Customer.java` y `PremiumCustomer.java`: revisa si se rompe el principio de Liskov y mira si hay que solucionarlo.

### ✅ ISP – Interface Segregation
> No fuerces a las clases a depender de métodos que no usan.

- Revisa `OrderSQLRepository.java` si tienes código que no necesita.

### ✅ DIP – Dependency Inversion
> Las clases de alto nivel deben depender de abstracciones, no de clases concretas.

- `OrderService.java`: está usando correctamente el repositorio?


## 🧠 ¿Qué debes entregar?

- Un proyecto refactorizado con código limpio y respetando los principios SOLID.
- Puedes subirlo a GitHub y compartirlo para recibir feedback.

## 💡 Consejos

- No intentes aplicar todos los principios a la vez. Ve uno por uno, lo dicho tu ritmo tus normas.
- Haz pequeños commits si usas Git, para documentar cada refactor.
- El objetivo es que el código sea extensible, legible y mantenible, no solo “correcto”.
