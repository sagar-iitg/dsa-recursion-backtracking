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


* function is calling another function
* function calls go into stack memory
* how function calls work in programming languages
*  main function -> 
* while the function is not finished executing it will remain in stack
* main is the first function which one will go into stack
* primitives also stored in stack memory
* when a function finishes executing it is removed from the stack and flow of program is restored from where it was called
* function that call itself -- recursion
* recursion will stop at -base condition
* why do we need recursion - makes our life easier (solve complex problem very easily)
* we can convert recursion problem in iteration and vice versa
* directly solving to iteration is difficult
* space complexity is not constant ---- bcz of the recursion calls
* breaking down bigger problem into small problems
* visualizing recursion
* Recursion Tree --- Recursive Tree
* recurrence relation
* the base condition is represented by answer we already have
* last function call -- tail recursion
* breakdown the problem statement in smaller problem
* write the recurrence relation. if needed
* draw the recursive tree
* see the flow of functions
* identify and focus on left tree calls and right tree calls
* see how the values are returned at each step
* in the end you will come out of the main function
* 
















