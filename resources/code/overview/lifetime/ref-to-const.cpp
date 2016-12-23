struct T{};
T foo();

T const &ref{ foo() }; // lvalue
