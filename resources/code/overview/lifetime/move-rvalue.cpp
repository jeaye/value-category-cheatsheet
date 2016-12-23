struct T{};
T foo();

T &&ref{ std::move(foo()) }; // lvalue
T const &ref{ std::move(foo()) }; // lvalue
