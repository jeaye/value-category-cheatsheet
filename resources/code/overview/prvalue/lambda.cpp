[](int const a)
{ return a * a; }; // prvalue

int a{}; // lvalue
[&]{ return a * a; }; // prvalue
