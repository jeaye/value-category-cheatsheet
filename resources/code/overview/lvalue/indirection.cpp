int a{}; // lvalue
int *p{ &a }; // lvalue
(p + 1); // prvalue
*(p + 1); // lvalue
