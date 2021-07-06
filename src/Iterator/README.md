### Intent
* provide a way to access a list's elements without exposing the list's implementation

### Motivation
* You often need to go through lists ("aggregates") when programming 
* You may wnat to go through them in different ways
* There are many types of aggregate object in programming such as Array, List, Set, Map
* To iterate over all of these aggregate types you would need to write a different loop for each of them
* Iterators represent an aggregate traversal as an object - you can have each aggregate type able to generate an Iterator, then use that iterator in the Client
* This way, if the Client needs to use a different type of aggregate, or a more complicated loop, they don't have to edit any loop code
* This way, if the Client needs to use a different type of aggregate, or a more complicated loop, they don't have to edit any loop code

### Applicability
* To access an aggregate object's contents without exposing representation
* To support multiple traveral types of aggregate objects
* To provide a uniform interface for traversing different aggregate structures
