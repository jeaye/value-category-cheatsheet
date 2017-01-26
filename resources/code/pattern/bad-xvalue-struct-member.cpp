struct foo
{ int a; };

foo get();

int const &b{ foo().a }; // a is an xvalue
