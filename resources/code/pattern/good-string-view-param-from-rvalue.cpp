void foo(boost::string_view const &s) // s is an lvalue
{ }

foo("meow"); // From lvalue literal
foo(std::string{ "meow" }); // From prvalue
