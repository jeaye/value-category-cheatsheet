std::vector<int> get();

int const a{ foo().at(0) }; // copy
int const b{ std::move(foo().at(0)) }; // move
