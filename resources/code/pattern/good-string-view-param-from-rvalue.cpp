void foo(boost::string_view const &s) // s is an lvalue
{ }

foo("meow"); // From literal
foo(std::string{ "meow" }); // From prvalue
