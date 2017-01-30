std::vector<int> get();

int const a{ get().at(0) }; // copy
int const b{ std::move(get().at(0)) }; // move
