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
2.Recursion relation (mandatory)
3.processing--> not mandatory

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


Recursion on Arrays





