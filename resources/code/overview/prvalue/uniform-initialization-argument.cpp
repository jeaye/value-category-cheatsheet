void foo(my_string const &s);
foo("kitty"); // argument is a prvalue
foo(my_string{ "kitty" }); // exactly what's happening above
