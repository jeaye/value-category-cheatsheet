boost::string_view s{ std::string{ "foo" } }; // undefined

std::string get();
boost::string_view s{ get() }; // undefined
