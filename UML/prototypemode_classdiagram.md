```mermaid
classDiagram
class MyFruit {
- String kind
+ void Display()
+ Object clone()
}
class Apple {
+ Apple()
}
class Banana {
+ Banana()
}
class MyFruitStore {
- static Hashtable fruittable
- static MyFruitStore fruitStore
+ static MyFruitStore Getfruitstore()
+ void Add(Integer key, MyFruit fruit)
+ MyFruit Get(Integer key)
+ MyFruit get(int i)
}
Apple --|> MyFruit
Banana --|> MyFruit
MyFruitStore "1" *-- "*" MyFruit : contains