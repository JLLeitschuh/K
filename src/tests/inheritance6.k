
-- This example does not solve. Too hard a problem for Z3. 
-- This due to true structural recursion (linked list problem).

class Person {
  father : Person
  child : Person
  req father.child = this
}

p1 : Person
p2 : Person

req p1 != p2

req p2.father = p1
req p1.child = p2

req p1.father = p2
req p2.child = p1

