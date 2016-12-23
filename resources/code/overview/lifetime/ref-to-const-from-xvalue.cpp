int &&a{ 5 }; // lvalue
int const &b{ std::move(a) }; // lvalue
