####
when a function call itself is called Recursion


###
1. Base Condition (mandatory)
2. Recursive Relation/ Recursive call (mandatory)
3. Processing (optional -- depends on question)


### Observation:
* Most of the time in base case we need to write return keyword


### HEAD RECURSION
* BaseCase -> Recursive relation -> Processing

### Tail Recursion
* BaseCase-> Processing -> Recursive relation


-----------Recursion------

1. What is Recursion?
When a function call itselfs (Bookish language)

eg:-

int solve(int n){
    solve(n-1);
}


---

solve one case---> rest recusrsion will take care

Recursion steps:

1.BaseCase(mandatory)
why infinite->memory(stack overflow)
2.Recursive relation (mandatory)
3.operation/processing--> not mandatory

Eg:
fibonacci Series

-----------
2. Recursive Tree

F(5)->F(4)->F(3)->F(2)->F(1)

3. Call Stack 

Keep track of function calls

------Tail recursion------

At the end of closed curly braces

PrintDecreasing---> tail recursion



--------------Recursion on Arrays---------


Recursion in linked list



------------------

Trees

Node 
data 
Left
Child

------------
Leaf Node




------------------------------

Subsequence of String
maintain relative oredering



When to apply recursion?
Bigger probblem depends on solution of subproblems




















