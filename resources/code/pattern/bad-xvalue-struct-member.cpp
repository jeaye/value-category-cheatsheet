struct foo
{ int a; };

foo get();

int const &a{ foo().a }; // a is an xvalue
