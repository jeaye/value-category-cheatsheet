int &&a{ 5 }; // lvalue
int &&b{ std::move(a) }; // lvalue
