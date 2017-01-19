std::string s{ "meow" }; // lvalue

std::string get();
std::string const &s{ get() }; // lvalue
