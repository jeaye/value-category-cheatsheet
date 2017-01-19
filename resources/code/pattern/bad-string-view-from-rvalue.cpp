boost::string_view s{ std::string{ "meow" } }; // undefined

std::string get();
boost::string_view s{ get() }; // undefined
