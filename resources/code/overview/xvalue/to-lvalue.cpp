int &&a{ 5 }; // lvalue
std::move(a); // xvalue
int &&b{ std::move(a) }; // lvalue
int const &c{ std::move(b) }; // lvalue
