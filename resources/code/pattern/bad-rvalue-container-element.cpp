std::vector<int> get();

foo().at(0); // lvalue
int const &a{ foo().at(0) }; // undefined
