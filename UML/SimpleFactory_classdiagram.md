```mermaid
classDiagram
class Factory {
<<abstract>>
+CreateFruit() Fruit
}
class AFactory {
+CreateFruit() Apple
}
class BFactory {
+CreateFruit() Banana
}
class Fruit {
<<abstract>>
+eat()
}
class Apple {
+eat()
}
class Banana {
+eat()
}

    Factory <|-- AFactory
    Factory <|-- BFactory
    Fruit <|-- Apple
    Fruit <|-- Banana
    AFactory --> Apple : creates
    BFactory --> Banana : creates