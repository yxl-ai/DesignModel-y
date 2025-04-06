```mermaid
sequenceDiagram
participant Client
participant MyFruitStore
participant Apple
Client ->> MyFruitStore: Getfruitstore()
MyFruitStore -->> Client: MyFruitStore instance
Client ->> Apple: new Apple()
Apple -->> Client: Apple instance
Client ->> MyFruitStore: Add(key, Apple instance)
Client ->> MyFruitStore: Get(key)
MyFruitStore ->> Apple: clone()
Apple -->> MyFruitStore: Cloned Apple instance
MyFruitStore -->> Client: Cloned Apple instance