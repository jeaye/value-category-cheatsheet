struct T{};

T &&ref{ std::move(T{}) }; // lvalue
T const &ref{ std::move(T{}) }; // lvalue
