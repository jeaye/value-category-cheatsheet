struct foo
{ int a; };

foo get();

int const a{ foo().a }; // copy the xvalue
