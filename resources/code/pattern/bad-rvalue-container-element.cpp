std::vector<int> get();

get().at(0); // lvalue
int const &a{ get().at(0) }; // undefined
