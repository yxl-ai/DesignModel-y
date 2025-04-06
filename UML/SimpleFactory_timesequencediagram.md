```mermaid
sequenceDiagram
participant Client
participant AFactory
participant Apple
Client ->> AFactory: CreateFruit()
AFactory ->> Apple: new Apple()
AFactory -->> Client: return Apple
Client ->> Apple: eat()
Apple -->> Client: "eat apple"