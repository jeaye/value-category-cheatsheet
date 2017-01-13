std::vector<int> get();

foo().at(0); // xvalue
int const &a{ foo().at(0) }; // undefined
