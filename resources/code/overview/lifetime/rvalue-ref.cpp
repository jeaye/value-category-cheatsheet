struct T{};
T foo();

T &&ref{ foo() }; // lvalue
