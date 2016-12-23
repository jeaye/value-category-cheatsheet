void foo(std::string const &s);
foo("kitty"); // argument is a prvalue
foo(std::string{ "kitty" }); // same
